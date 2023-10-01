import { ValidationAcceptor } from "langium";
import { Protocol } from "../../generated/ast";
import { KnowledgeClass } from "../../KnowledgeClass";

export const printBool = {
    printBool: (knowledgeClass: KnowledgeClass, protocol: Protocol, accept: ValidationAcceptor): void => {
        accept('info', `${knowledgeClass.print()}`, { node: protocol })
    }
}