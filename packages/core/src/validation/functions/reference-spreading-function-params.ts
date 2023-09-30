import { findRootNode, streamAllContents, type MaybePromise, type ValidationAcceptor } from "langium"
import {
    isFunctionDef,
    isKnowledgeDefCustom,
    isKnowledgeDefCustomName,
    isKnowledgeFromFunction,
    isKnowledgeFromFunctionArgs,
    isKnowledgeList,
    isKnowledgeRef,
    isKnowledgeSet,
    isKnowledgeSpreading,
    type Protocol
} from "../../generated/ast"

export const referenceSpreadingFunctionParams = {
    referenceSpreadingFunctionParams: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void> => {
        streamAllContents(protocol)
            .filter(isKnowledgeFromFunctionArgs)
            .forEach(kff => {
                if (
                    findRootNode(kff).$document?.uri.toString() !== `builtin:/prelude.kant` &&
                    !findRootNode(kff).$document?.uri.toString().includes(`prelude`)
                ) {
                    if (isKnowledgeSpreading(kff)) {
                        if (isKnowledgeRef(kff.ref)) {
                            let ref = kff.ref.ref
                            const fx = new Set<string>()
                            fx.add(`HKDF`)
                            fx.add(`SPLIT`)
                            streamAllContents(protocol)
                                .filter(isFunctionDef)
                                .forEach(f => {
                                    if (f.return.elements.length > 1) {
                                        fx.add(f.name)
                                    }
                                })
                            let found = false
                            streamAllContents(protocol)
                                .filter(isKnowledgeDefCustom)
                                .forEach(kdc => {
                                    if (isKnowledgeDefCustomName(kdc.left)) {
                                        if (kdc.left.name === ref) {
                                            found = true
                                            if (isKnowledgeFromFunction(kdc.value)) {
                                                const invoked = kdc.value.invoked.ref?.name
                                                if (invoked && !fx.has(invoked)) {
                                                    accept(
                                                        `error`,
                                                        `${ref} does not point to a set or a list, it can't be spread.`,
                                                        { node: kff }
                                                    )
                                                }
                                            } else {
                                                if (!(isKnowledgeList(kdc.value) || isKnowledgeSet(kdc.value))) {
                                                    accept(
                                                        `error`,
                                                        `${ref} does not point to a set or a list, it can't be spread.`,
                                                        { node: kff }
                                                    )
                                                }
                                            }
                                        }
                                    }
                                })
                            if (!found) {
                                accept(
                                    `error`,
                                    `${ref} is not a list/set or it might not be declared, it can't be spread.`,
                                    { node: kff }
                                )
                            }
                        }
                    }
                }
            })
    }
}
