import { MaybePromise, ValidationAcceptor, streamAllContents } from "langium";
import { KnowledgeClass } from "../../KnowledgeClass";
import { Protocol, isListAccess } from "../../generated/ast";

export const listAccesPointsToList = {
    listAccesPointsToList: (knowledgeClass: KnowledgeClass, protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void> => {
        streamAllContents(protocol)
            .filter(isListAccess)
            .forEach(la => {

                const listAccessReference = la.ref
                let isList = false;
                const firstIndex = knowledgeClass.getGlobalKnowledgeDescriptorMap().get(listAccessReference)?.getFirstIndex()
                const root = knowledgeClass.getGlobalKnowledge()[firstIndex!]?.get(0)

                for (const key of knowledgeClass.getListNodePointerKnowledge().keys()) {
                    if (root === key) {
                        if (knowledgeClass.getListNodePointerKnowledge().get(key)?.length! > 0) {
                            isList = true;
                        }
                    }
                }
                if (!isList) {
                    accept('error', `List access should point to a list, the '${listAccessReference}' reference is not a list`, { node: la })
                }
            })
    }
}