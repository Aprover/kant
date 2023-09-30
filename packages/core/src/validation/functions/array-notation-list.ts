import type { MaybePromise, ValidationAcceptor } from "langium"
import { streamAllContents } from "langium"
import type { Protocol } from "../../generated/ast"
import {
    isFunctionDef,
    isKnowledgeDefCustom,
    isKnowledgeDefCustomName,
    isKnowledgeFromFunction,
    isKnowledgeList,
    isListAccess
} from "../../generated/ast"

export const indexAccessPointsToList = {
    indexAccessPointsToList: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void> => {
        streamAllContents(protocol)
            .filter(isListAccess)
            .forEach(la => {
                let ref = la.ref
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
                                            `${la.ref} is not a list, it can't be accessed using an index.`,
                                            { node: la }
                                        )
                                    }
                                } else {
                                    if (!isKnowledgeList(kdc.value)) {
                                        accept(
                                            `error`,
                                            `${la.ref} is not a list, it can't be accessed using an index.`,
                                            { node: la }
                                        )
                                    }
                                }
                            }
                        }
                    })
                if (!found) {
                    accept(
                        `error`,
                        `${la.ref} is not a list or it might not be declared, it can't be accessed using an index.`,
                        { node: la }
                    )
                }
            })
    }
}
