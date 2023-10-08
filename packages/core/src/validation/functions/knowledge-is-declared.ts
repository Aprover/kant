import { MaybePromise, ValidationAcceptor, getContainerOfType, streamAllContents } from "langium";
import { KnowledgeClass } from "../../KnowledgeClass";
import { Protocol, isKnowledgeRef, isListAccess, isPropertyDef } from "../../generated/ast";

export const knowledgeIsDeclared = {
    knowledgeIsDeclared: (knowledgeClass: KnowledgeClass, protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void> => {
        
        streamAllContents(protocol)
            .filter(isKnowledgeRef)
            .forEach(kr => {
                if (getContainerOfType(kr, isPropertyDef) === undefined) {
                    if (!knowledgeClass.getGlobalKnowledgeDescriptorMap().get(kr.ref)) {
                        accept('error', `Knowledge "${kr.ref} is not declared.`, { node: kr })
                    }
                }
            })

        streamAllContents(protocol)
            .filter(isListAccess)
            .forEach(la => {
                if (getContainerOfType(la, isPropertyDef) === undefined)  {
                    if (!knowledgeClass.getGlobalKnowledgeDescriptorMap().get(la.ref.concat("[" + la.index + "]"))) {
                        accept('error', `Knowledge "${la.ref.concat("[" + la.index + "]")} is not declared.`, { node: la })
                    }
                }
            })
    }
}