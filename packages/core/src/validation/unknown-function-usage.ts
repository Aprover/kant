import { MaybePromise, ValidationAcceptor, streamAllContents } from "langium";
import { Protocol, isFunctionDef, isKnowledgeFromFunction } from "../generated/ast";

export const unknownFunctionUsage = {
    /**
     * 
     * @param protocol 
     * @param accept 
     */
    unknownFunctionUsage: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void> => {

        const functions = new Set<string>()

        streamAllContents(protocol).filter(isFunctionDef).forEach(fd => {
            functions.add(fd.name)
        })

        streamAllContents(protocol).filter(isKnowledgeFromFunction).forEach(kff => {
            if (!functions.has(kff.name)) {
                accept(`error`, `Unknown function usage`, { node: kff })
            }
        })

        /* const functionNames = new Set<string>()
        protocol.elements.filter(isFunctionDef).forEach(functionDef => {
            functionNames.add(functionDef.name)
        })
        protocol.elements.filter(isKnowledgeBase).forEach(knowledgeBase => {
            if (isKnowledgeFromFunction(knowledgeBase.knowledge)) {
                if (!functionNames.has(knowledgeBase.knowledge.name)) {
                    accept(`error`, `Unknown function usage`, { node: knowledgeBase.knowledge })
                }
            }
            if (isKnowledgeDef(knowledgeBase.knowledge) && isKnowledgeDefCustom(knowledgeBase.knowledge)) {
                if (isKnowledgeFromFunction(knowledgeBase.knowledge.value)) {
                    if (!functionNames.has(knowledgeBase.knowledge.value.name)) {
                        accept(`error`, `Unknown function usage`, { node: knowledgeBase.knowledge.value })
                    }
                }
                if (isKnowledgeSet(knowledgeBase.knowledge.value)) {
                    const knowledgeSet = knowledgeBase.knowledge.value
                    knowledgeSet.content.filter(isKnowledgeFromFunction).forEach(fromFunction => {
                        if (!functionNames.has(fromFunction.name)) {
                            accept(`error`, `Unknown function usage`, { node: fromFunction })
                        }
                    })
                    knowledgeSet.content.filter(isKnowledgeDef).filter(isKnowledgeDefCustom).forEach(knowledgeDefCustom => {
                        if (isKnowledgeFromFunction(knowledgeDefCustom.value)) {
                            if (!functionNames.has(knowledgeDefCustom.value.name)) {
                                accept(`error`, `Unknown function usage`, { node: knowledgeDefCustom.value })
                            }   
                        }
                        if (isKnowledgeSet(knowledgeDefCustom.value)) {
                            checkInnerKnowledgeSet(knowledgeDefCustom.value, functionNames, accept)
                        }
                    })

                }
            }
            if (isKnowledgeSet(knowledgeBase.knowledge)) {
                knowledgeBase.knowledge.content.filter(isKnowledgeDefCustom).forEach(custom => {
                    if (isKnowledgeFromFunction(custom.value)) {
                        if (!functionNames.has(custom.value.name)) {
                            accept(`error`, `Unknown function usage`, { node: custom.value })
                        }   
                    }
                })
            }
        })
        protocol.elements.filter(isCommunication).forEach(communication => {
            if (isKnowledgeFromFunction(communication.knowledge)) {
                if (!functionNames.has(communication.knowledge.name)) {
                    accept(`error`, `Unknown function usage`, { node: communication.knowledge })
                }
            }
            if (isKnowledgeDef(communication.knowledge) && isKnowledgeDefCustom(communication.knowledge)) {
                if (isKnowledgeFromFunction(communication.knowledge.value)) {
                    if (!functionNames.has(communication.knowledge.value.name)) {
                        accept(`error`, `Unknown function usage`, { node: communication.knowledge.value })
                    }   
                }
                if (isKnowledgeSet(communication.knowledge.value)) {
                    checkInnerKnowledgeSet(communication.knowledge.value, functionNames, accept)
                }
            }
            if (isKnowledgeSet(communication.knowledge)) {
                checkInnerKnowledgeSet(communication.knowledge, functionNames, accept)
            }
        })
        protocol.elements.filter(isPrincipal).forEach(principal => {
            if (principal.knowledge !== undefined) {
                if (isKnowledgeFromFunction(principal.knowledge)) {
                    if (!functionNames.has(principal.knowledge.name)) {
                        accept(`error`, `Unknown function usage`, { node: principal.knowledge })
                    }
                }
                if (isKnowledgeDef(principal.knowledge) && isKnowledgeDefCustom(principal.knowledge)) {
                    if (isKnowledgeFromFunction(principal.knowledge.value)) {
                        if (!functionNames.has(principal.knowledge.value.name)) {
                            accept(`error`, `Unknown function usage`, { node: principal.knowledge.value })
                        }   
                    }
                }
                if (isKnowledgeSet(principal.knowledge)) {
                    const content = principal.knowledge.content
                    content.filter(isKnowledgeDef).filter(isKnowledgeDefCustom).forEach(defCustom => {
                        if (isKnowledgeFromFunction(defCustom.value)) {
                            if (!functionNames.has(defCustom.value.name)) {
                                accept(`error`, `Unknown function usage`, { node: defCustom.value })
                            }   
                        }
                        if (isKnowledgeSet(defCustom.value)) {
                            checkInnerKnowledgeSet(defCustom.value, functionNames, accept)
                        }
                    })
                }      
            }
        }) */
    }
}

/**
 * 
 * @param set 
 * @param functionNames 
 * @param accept 
 */
/* function checkInnerKnowledgeSet(set: KnowledgeSet, functionNames: Set<string>, accept: ValidationAcceptor): void {
    set.content.filter(isKnowledgeFromFunction).forEach(fromFunction => {
        if (!functionNames.has(fromFunction.name)) {
            accept(`error`, `Unknown function usage`, { node: fromFunction })
        }
    })

    set.content.filter(isKnowledgeDef).filter(isKnowledgeDefCustom).forEach(knowledgeDefCustom => {
        if (isKnowledgeFromFunction(knowledgeDefCustom.value)) {
            if (!functionNames.has(knowledgeDefCustom.value.name)) {
                accept(`error`, `Unknown function usage`, { node: knowledgeDefCustom.value })
            }   
        }
        if (isKnowledgeSet(knowledgeDefCustom.value)) {
            checkInnerKnowledgeSet(knowledgeDefCustom.value, functionNames, accept)
        }
    })

    set.content.filter(isKnowledgeSet).forEach(innerSet => {
        checkInnerKnowledgeSet(innerSet, functionNames, accept)
    })
} */