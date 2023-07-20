import type { MaybePromise, ValidationAcceptor } from "langium"
import { streamAllContents } from "langium"
import type { Protocol } from "../../generated/ast"
import { isAuthenticationCheck, isKnowledgeRef } from "../../generated/ast"

export const onlyRefInAuthenticationCheck = {
    onlyRefInAuthenticationCheck: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void> => {
        streamAllContents(protocol)
            .filter(isAuthenticationCheck)
            .forEach(ac => {
                if (!isKnowledgeRef(ac.knowledge)) {
                    accept(`error`, `Authentication check should target knowledge references.`, { node: ac })
                }
            })
    }
}
