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
                knowledgeClass.getGlobalKnowledge()

                for (const key of knowledgeClass.getListNodePointerKnowledge().keys()) {
                    if (listAccessReference === key) {
                        if (knowledgeClass.getListNodePointerKnowledge().get(key)?.length! > 0) {
                            isList = true;
                        }
                    }
                }
                if (!isList) {
                    accept('error', `List access should point to a list, ${listAccessReference} does not.`, { node: la })
                }
            })
    }
}