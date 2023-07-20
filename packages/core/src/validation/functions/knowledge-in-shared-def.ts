import type { MaybePromise, ValidationAcceptor } from "langium"
import { streamAllContents } from "langium"
import type { Protocol } from "../../generated/ast"
import { isKnowledgeValue, isSharedKnowledgeDef } from "../../generated/ast"

export const knowledgeInSharedDef = {
    knowledgeInSharedDef: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void> => {
        streamAllContents(protocol)
            .filter(isSharedKnowledgeDef)
            .forEach(skd => {
                if (isKnowledgeValue(skd.knowledge)) {
                    accept(
                        `error`,
                        `In a shared knowledge there should be a built-in knowledge definition or a custom knowledge definition`,
                        {
                            node: skd
                        }
                    )
                }
            })
    }
}
