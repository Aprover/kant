import { streamAllContents, type MaybePromise, type ValidationAcceptor } from "langium"
import {
    isKnowledgeDefBuiltin,
    isKnowledgeRef,
    isKnowledgeDefSetDestructuringAssignment,
    type Protocol
} from "../../generated/ast"

export const knowledgeShouldStartWithLowelcase = {
    knowledgeShouldStartWithLowelcase: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void> => {
        streamAllContents(protocol)
            .filter(isKnowledgeDefBuiltin)
            .forEach(kdb => {
                kdb.name.forEach(n => {
                    const lower = n.charAt(0).toLowerCase()
                    if (n.charAt(0) !== lower) {
                        accept(`warning`, `Knowledge name ${n} should start with a lower case letter.`, { node: kdb })
                    }
                })
            })

        streamAllContents(protocol)
            .filter(isKnowledgeRef)
            .forEach(cn => {
                const lower = cn.ref.charAt(0).toLowerCase()
                if (cn.ref.charAt(0) !== lower) {
                    accept(`warning`, `Knowledge name ${cn.ref} should start with a lower case letter.`, { node: cn })
                }
            })

        streamAllContents(protocol)
            .filter(isKnowledgeDefSetDestructuringAssignment)
            .forEach(ksd => {
                const lower = ksd.name.charAt(0).toLowerCase()
                if (ksd.name.charAt(0) !== lower) {
                    accept(`warning`, `Knowledge name ${ksd.name} should start with a lower case letter.`, {
                        node: ksd
                    })
                }
            })
    }
}
