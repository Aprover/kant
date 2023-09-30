import { ValidationAcceptor } from "langium";
import { Protocol } from "../../generated/ast";
import { KnowledgeClass } from "../../KnowledgeClass";

export const printBool = {
    printBool: (knowledgeClass: KnowledgeClass, protocol: Protocol, accept: ValidationAcceptor): void => {
        //accept('info', `Valore desc in print-bool: ${obj.get()}`, { node: protocol })
    }
}