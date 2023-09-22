import { findRootNode, streamAllContents, type MaybePromise, type ValidationAcceptor } from "langium"
import {
    isKnowledgeDefCustom,
    isKnowledgeDefCustomName,
    isKnowledgeFromFunctionArgs,
    isKnowledgeList,
    isKnowledgeRef,
    isKnowledgeSet,
    isKnowledgeSpreading,
    type Protocol
} from "../../generated/ast"

export const referenceSpreadingFunctionParams = {
    referenceSpreadingFunctionParams: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void> => {
        // raccogliere tutti i riferimenti a set e list
        const setsOrLists = new Set<string>()
        streamAllContents(protocol)
            .filter(isKnowledgeDefCustom)
            .forEach(kdc => {
                if (isKnowledgeDefCustomName(kdc.left)) {
                    if (isKnowledgeSet(kdc.value)) {
                        setsOrLists.add(kdc.left.name)
                    }
                    if (isKnowledgeList(kdc.value)) {
                        setsOrLists.add(kdc.left.name)
                    }
                }
            })

        //accept(`info`, `sets or lists: ${Array.from(setsOrLists)}`, { node: protocol })

        // andiamo nei parametri delle invocazioni di funzione e in particolare cerchiamo gli spreading di riferimenti
        streamAllContents(protocol)
            .filter(isKnowledgeFromFunctionArgs)
            .forEach(kff => {
                if (
                    findRootNode(kff).$document?.uri.toString() !== `builtin:/prelude.kant` &&
                    !findRootNode(kff).$document?.uri.toString().includes(`prelude`)
                ) {
                    if (isKnowledgeSpreading(kff)) {
                        if (isKnowledgeRef(kff.ref)) {
                            if (!setsOrLists.has(kff.ref.ref)) {
                                accept(
                                    `error`,
                                    `${kff.ref.ref} does not point to a set or a list, it can't be spread.`,
                                    { node: kff }
                                )
                            }
                        }
                    }
                }
            })
    }
}
