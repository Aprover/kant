import type { MaybePromise, ValidationAcceptor } from "langium"
import { streamAllContents } from "langium"
import {
    isKnowledge,
    isKnowledgeDef,
    isKnowledgeDefBuiltin,
    isKnowledgeDefCustom,
    isKnowledgeDefCustomName,
    isKnowledgeFromFunction,
    type Protocol
} from "../../generated/ast"

export const uniqueKnowledgeNames = {
    uniqueKnowledgeNames: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void> => {
        const knowledgeNames = new Set<string>()
        streamAllContents(protocol)
            .filter(isKnowledge)
            .filter(isKnowledgeDef)
            .forEach(kd => {
                if (isKnowledgeDefBuiltin(kd)) {
                    kd.name.forEach(n => {
                        if (knowledgeNames.has(n)) {
                            accept(`error`, `Knowledge name "${n}" already used.`, { node: kd })
                        }
                        knowledgeNames.add(n)
                    })
                } else if (
                    isKnowledgeDefCustom(kd) &&
                    !isKnowledgeFromFunction(kd.$container.$container)
                ) {
                    if (isKnowledgeDefCustomName(kd.left)) {
                        if (knowledgeNames.has(kd.left.name)) {
                            accept(`error`, `Knowledge name "${kd.left.name}" already used.`, { node: kd })
                        }
                        knowledgeNames.add(kd.left.name)
                    }
                }
            })
    }
}
