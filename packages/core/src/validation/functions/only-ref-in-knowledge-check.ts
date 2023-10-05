import { streamAllContents, type MaybePromise, type ValidationAcceptor } from "langium"
import { isKnowledgeCheck, isKnowledgeRef, type Protocol } from "../../generated/ast"

export const onlyRefInKnowledgeCheck = {
    onlyRefInKnowledgeCheck: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void> => {
        streamAllContents(protocol)
            .filter(isKnowledgeCheck)
            .forEach(kc => {
                if (!isKnowledgeRef(kc.knowledge)) {
                    accept(`error`, `Knowledge check should target knowledge references.`, { node: kc })
                }
            })
    }
}
