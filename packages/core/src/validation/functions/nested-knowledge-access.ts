import { streamAllContents, type MaybePromise, type ValidationAcceptor } from "langium"
import {
    isKnowledgeDefCustom,
    isKnowledgeDefCustomName,
    isKnowledgeRef,
    isKnowledgeSet,
    type Protocol
} from "../../generated/ast"

export const nestedKnowledgeAccess = {
    nestedKnowledgeAccess: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void> => {
        // recuperare tutti i set
        const sets = new Set<string>()
        streamAllContents(protocol)
            .filter(isKnowledgeDefCustom)
            .forEach(kdc => {
                if (isKnowledgeDefCustomName(kdc.left)) {
                    if (isKnowledgeSet(kdc.value)) {
                        sets.add(kdc.left.name)
                    }
                }
            })
        //accept(`info`, `Knowledge Sets: ${Array.from(sets)}`, { node: protocol })

        streamAllContents(protocol)
            .filter(isKnowledgeRef)
            .forEach(kr => {
                if (kr.access.length > 0) {
                    if (!sets.has(kr.ref)) {
                        accept(`error`, `${kr.ref} is not a set, nested access can only be performed on sets.`, {
                            node: kr
                        })
                    }
                }
            })
    }
}
