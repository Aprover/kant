import { MaybePromise, ValidationAcceptor, streamAllContents } from "langium";
import { Protocol, isKnowledgeRef, isPrincipalKnowledgeDef } from "../../generated/ast";

export const identifierWithNoValue = {
    identifierWithNoValue: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void> => {
        streamAllContents(protocol)
            .filter(isPrincipalKnowledgeDef)
            .forEach(pkd => {
                pkd.knowledge.filter(isKnowledgeRef)
                    .forEach(kr => {
                        if (kr.$container.$type === 'PrincipalKnowledgeDef') {
                            accept(`error`, `Cannot declare an identifier without assign it to a value.`, { node: kr })
                        }
                    })
            })
    }
}