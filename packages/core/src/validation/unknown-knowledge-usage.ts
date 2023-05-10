import { MaybePromise, ValidationAcceptor } from "langium";
import { Protocol, isAuthenticationCheck, isCheck, isCommunication, isEqualityCheck, isFreshnessCheck, isKnowledgeBase, isKnowledgeCheck, isKnowledgeDef, isKnowledgeDefBuiltin, isKnowledgeDefCustom, isKnowledgeDefCustomName, isKnowledgeDefDestructuring, isKnowledgeDefListDestructuring, isKnowledgeDefListDestructuringAssignment, isKnowledgeDefSetDestructuring, isKnowledgeFromFunction, isKnowledgeFromFunctionArgsElements, isKnowledgeList, isKnowledgeRef, isKnowledgeSet, isKnowledgeValue, isLinkabilityCheck } from "../generated/ast";

export const unknownKnowledgeUsage = {
    /**
     * 
     * @param protocol 
     * @param accept 
     */
    unknownKnowledgeUsage: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void> => {
        const knowledge = new Set<string>()
        protocol.elements.filter(isKnowledgeBase).forEach(knowledgeBase => {
                if (isKnowledgeDef(knowledgeBase.knowledge)) {
                    if (isKnowledgeDefBuiltin(knowledgeBase.knowledge)) {
                    knowledgeBase.knowledge.name.forEach(name => {
                        knowledge.add(name)
                    })
                }

                if (isKnowledgeDefCustom(knowledgeBase.knowledge)) {

                    if (isKnowledgeDefCustomName(knowledgeBase.knowledge.left)) {
                        knowledge.add(knowledgeBase.knowledge.left.name)
                    }
                    
                    if (isKnowledgeDefDestructuring(knowledgeBase.knowledge.left)) {
                        if (isKnowledgeDefListDestructuring(knowledgeBase.knowledge.left)) {
                            knowledgeBase.knowledge.left.elements.forEach(element => {
                                if (isKnowledgeDefListDestructuringAssignment(element)) {
                                    knowledge.add(element.name)
                                }
                            })
                        }
                        if (isKnowledgeDefSetDestructuring(knowledgeBase.knowledge.left)) {
                            knowledgeBase.knowledge.left.assignments.forEach(assignment => {
                                knowledge.add(assignment.name)
                            })
                        }
                    }
                }
            }
            if (isKnowledgeValue(knowledgeBase.knowledge)) {
                if (isKnowledgeRef(knowledgeBase.knowledge)) {
                    knowledge.add(knowledgeBase.knowledge.ref)
                }
            }
        })
        protocol.elements.filter(isCommunication).forEach(communication => {
            const communicationKnowledge = communication.knowledge
            if (isKnowledgeValue(communicationKnowledge)) {
                if (isKnowledgeRef(communicationKnowledge)) {
                    if (!knowledge.has(communicationKnowledge.ref)) {
                        accept(`error`, `Unknown knowledge as communication payload`, { node: communicationKnowledge })
                    }
                }
            }
        })

        protocol.elements.filter(isCheck).forEach(check => {
            if (isKnowledgeCheck(check)) {
                const checkKnowledgeValue = check.knowledge
                if (isKnowledgeRef(checkKnowledgeValue)) {
                    if (!knowledge.has(checkKnowledgeValue.ref)) {
                        accept(`error`, `Unknown knowledge in knowledge check`, { node: check })
                    }
                }
                if (isKnowledgeSet(checkKnowledgeValue)) {
                    const content = checkKnowledgeValue.content
                    content.forEach(cont => {
                        if (isKnowledgeValue(cont) && isKnowledgeRef(cont)) {
                            if (!knowledge.has(cont.ref)) {
                                accept(`error`, `Unknown knowledge in knowledge check`, { node: check })
                            }
                        }
                    })
                }
                if (isKnowledgeList(checkKnowledgeValue)) {
                    const values = checkKnowledgeValue.values
                    values.forEach(value => {
                        if (isKnowledgeRef(value)) {
                            if (!knowledge.has(value.ref)) {
                                accept(`error`, `Unknown knowledge in knowledge check`, { node: check })
                            }
                        }
                    })
                }
            }

            if (isEqualityCheck(check)) {
                const equalityCheckKnowledgeRefs = check.knowledge
                equalityCheckKnowledgeRefs.forEach(knowledgeRef => {
                    if (!knowledge.has(knowledgeRef.ref)) {
                        accept(`error`, `Unknown knowledge in equality check`, { node: check })
                    }
                })   
            }

            if (isFreshnessCheck(check)) {
                const freshnessCheckKnowledgeRefs = check.knowledge
                freshnessCheckKnowledgeRefs.forEach(knowledgeRef => {
                    if (!knowledge.has(knowledgeRef.ref)) {
                        accept(`error`, `Unknown knowledge in equality check`, { node: check })
                    }
                }) 
            }

            if (isLinkabilityCheck(check)) {
                const linkabilityCheckKnowledgeRefs = check.knowledge
                linkabilityCheckKnowledgeRefs.forEach(knowledgeRef => {
                    if (!knowledge.has(knowledgeRef.ref)) {
                        accept(`error`, `Unknown knowledge in equality check`, { node: check })
                    }
                }) 
            }

            if (isAuthenticationCheck(check)) {
                const authenticationCheckKnowledge = check.knowledge
                if (isKnowledgeRef(authenticationCheckKnowledge)) {
                    if (!knowledge.has(authenticationCheckKnowledge.ref)) {
                        accept(`error`, `Unknown knowledge in authentication check`, { node: check })
                    }
                }
            }
        })

        protocol.elements.filter(isKnowledgeBase).forEach(knowledgeBase => {
            if (isKnowledgeDef(knowledgeBase.knowledge)) {
                if (isKnowledgeDefCustom(knowledgeBase.knowledge)) {
                    if (isKnowledgeRef(knowledgeBase.knowledge.value)) {
                        if (!knowledge.has(knowledgeBase.knowledge.value.ref)) {
                            accept(`error`, `Unknown knowledge in custom knowledge definition`, { node: knowledgeBase.knowledge.value })
                            
                        }
                    } 
                }
            }
        })

        protocol.elements.filter(isKnowledgeBase).forEach(kb => {
            if (isKnowledgeDef(kb.knowledge)) {
                if (isKnowledgeDefCustom(kb.knowledge)) {
                    if (isKnowledgeFromFunction(kb.knowledge.value)) {
                        const args = kb.knowledge.value.args
                        if (isKnowledgeFromFunctionArgsElements(args)) {
                            const argsElements = args.args
                            argsElements.forEach(arg => {
                                if (isKnowledgeRef(arg)) {
                                    if (!knowledge.has(arg.ref)) {
                                        accept(`error`, `Unknown knowledge in function parameters`, { node: arg })
                                    }
                                }
                            })
                        }
                        const key = kb.knowledge.value.key
                        if (isKnowledgeRef(key)) {
                            if (!knowledge.has(key.ref)) {
                                accept(`error`, `Unknown knowledge as key`, { node: key })
                            }
                        }
                    }
                }
            }
        })
    }
}