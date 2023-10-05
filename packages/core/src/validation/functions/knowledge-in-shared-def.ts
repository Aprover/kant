import type { MaybePromise, ValidationAcceptor } from "langium"
import { streamAllContents } from "langium"
import type { Protocol } from "../../generated/ast"
import { isKnowledgeRef, isKnowledgeValue, isSharedKnowledgeDef } from "../../generated/ast"

// DEVE ESSERE POSSIBILE DICHIARE ANCHE CHIAMATE DI FUNZIONI

export const knowledgeInSharedDef = {
    knowledgeInSharedDef: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void> => {
        streamAllContents(protocol)
            .filter(isSharedKnowledgeDef)
            .forEach(skd => {
                if (isKnowledgeValue(skd.knowledge)) {
                    if (!isKnowledgeRef(skd.knowledge)) {
                        accept(
                            `error`,
                            `In a shared knowledge there should be a built-in knowledge definition or a custom knowledge definition`,
                            {
                                node: skd
                            }
                        )
                    }
                }
            })
    }
}
