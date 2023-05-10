import { MaybePromise, ValidationAcceptor, streamAllContents } from "langium";
import { Protocol, isKnowledgeDefCustom, isKnowledgeFromFunction, isKnowledgeList, isKnowledgeSet, isKnowledgeSpreading } from "../generated/ast";

export const variadicParamsNotListInsideSet = {
    /**
     * 
     * @param protocol 
     * @param accept 
     */
    variadicParamsNotListInsideSet: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void> => {
        streamAllContents(protocol).filter(isKnowledgeFromFunction).forEach(knowledgeFromFunc => {
            if (isKnowledgeSpreading(knowledgeFromFunc.args)) {
                if (isKnowledgeSet(knowledgeFromFunc.args.ref)) {
                    const set = knowledgeFromFunc.args.ref
                    if (set.content.length > 1) {
                        accept(`error`, `When a set is used to contain function params and is used together with the spread operator, it should have one content: a list or a definition of a list`, { node: set })
                    }
                    set.content.forEach(setContent => {
                        if (isKnowledgeList(setContent)) {
                            // everything ok
                        } else if (isKnowledgeDefCustom(setContent)) {
                            if (!isKnowledgeList(setContent.value)) {
                                accept(`error`, `When a set is used to contain function params and is used together with the spread operator, it should have one content: a list or a definition of a list`, { node: set })
                            }
                        } else {
                            accept(`error`, `When a set is used to contain function params and is used together with the spread operator, it should have one content: a list or a definition of a list`, { node: set })
                        }
                    })
                }
            }
            
        })
    }
}