import { streamAllContents, type MaybePromise, type ValidationAcceptor } from "langium"
import { isConfidentialityCheck, isKnowledgeRef, isListAccess, type Protocol } from "../../generated/ast"

export const onlyRefInKnowledgeCheck = {
    onlyRefInKnowledgeCheck: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void> => {
        streamAllContents(protocol)
            .filter(isConfidentialityCheck)
            .forEach(kc => {
                if (!(isKnowledgeRef(kc.knowledge) || isListAccess(kc.knowledge))) {
                    accept(`error`, `Knowledge check should target only knowledge references and list access.`, { node: kc })
                }
            })
    }
}


