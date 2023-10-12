import { ValidationAcceptor } from "langium";
import { Protocol } from "../../generated/ast";
import { KnowledgeClass } from "../../KnowledgeClass";

export const printBool = {
    printBool: (knowledgeClass: KnowledgeClass, protocol: Protocol, accept: ValidationAcceptor): void => {
        accept('info', `globalKnowledge: ${knowledgeClass.printGlobalKnowledge()}`, { node: protocol })
        accept('info', `principals: ${knowledgeClass.printPrincipals()}`, { node: protocol })
        accept('info', `principals: ${knowledgeClass.printIndexMap()}`, { node: protocol })
        accept('info', `Keypair: ${knowledgeClass.printKeypair()}`, { node: protocol })
        accept('info', `ParmKeyPairing: ${knowledgeClass.printParmKeyPairing()}`, { node: protocol })
        accept('info', `ParmKeyPairing: ${knowledgeClass.printIndexesParmKeyPairing()}`, { node: protocol })
    }
}