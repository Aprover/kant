import { MaybePromise, ValidationAcceptor } from "langium";
import { Protocol, isKnowledge, isKnowledgeBase, isKnowledgeDef, isKnowledgeDefCustom, isKnowledgeDefCustomName, isKnowledgeList, isKnowledgeRef, isKnowledgeSet, isKnowledgeSpreading, isKnowledgeValue, isPrincipal } from "../generated/ast";

export const knowledgeReferenceSpreadingOfWrongValueForTargetValue = {
    /**
     * 
     * @param protocol 
     * @param accept 
     */
    knowledgeReferenceSpreadingOfWrongValueForTargetValue: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void> => {
        const setNames = new Set<string>()
        const listNames = new Set<string>()
        
        const knowledgeBases = protocol.elements.filter(isKnowledgeBase)
        knowledgeBases.forEach(knowledgeBase => {
            if (isKnowledgeDef(knowledgeBase.knowledge) && isKnowledgeDefCustom(knowledgeBase.knowledge)) {
                    const value = knowledgeBase.knowledge.value
                    if (isKnowledgeSet(value)) {
                        let prefix: string
                        if (isKnowledgeDefCustomName(knowledgeBase.knowledge.left)) {
                            prefix = knowledgeBase.knowledge.left.name
                            setNames.add(knowledgeBase.knowledge.left.name) 
                        }
                        
                        value.content.forEach(setContent => {
                            
                            if (isKnowledge(setContent) && isKnowledgeDef(setContent) && isKnowledgeDefCustom(setContent)) {
                                        const innerValue = setContent.value
                                        if (isKnowledgeSet(innerValue)) {
                                            if (isKnowledgeDefCustomName(setContent.left)) {
                                                setNames.add(prefix.concat(setContent.left.name))
                                            }
                                        } else if (isKnowledgeList(innerValue)) {
                                            if (isKnowledgeDefCustomName(setContent.left)) {
                                                listNames.add(prefix.concat(setContent.left.name))
                                            }
                                        }
                            }
                        })
                    } else if (isKnowledgeList(value)) {
                        if (isKnowledgeDefCustomName(knowledgeBase.knowledge.left)) {
                            listNames.add(knowledgeBase.knowledge.left.name) 
                        }
                        
                    }
                const principals = protocol.elements.filter(isPrincipal)
                principals.forEach(principal => {
                    if (principal.knowledge !== undefined) {
                        if (isKnowledgeDef(principal.knowledge)) {
                            if (isKnowledgeDefCustom(principal.knowledge)) {
                                if (isKnowledgeSet(principal.knowledge.value)) {
                                    const principalKnowledgeSet = principal.knowledge.value
                                    let prefix: string
                                    if (isKnowledgeDefCustomName(principal.knowledge.left)) {
                                        prefix = principal.knowledge.left.name
                                        setNames.add(principal.knowledge.left.name)
                                    }
                                    principalKnowledgeSet.content.forEach(setContent => {
                                        if (isKnowledge(setContent) && isKnowledgeDef(setContent) && isKnowledgeDefCustom(setContent)) {
                                            const innerValue = setContent.value
                                            if (isKnowledgeSet(innerValue)) {
                                                if (isKnowledgeDefCustomName(setContent.left)) {
                                                    setNames.add(prefix.concat(setContent.left.name))
                                                }
                                            } else if (isKnowledgeList(innerValue)) {
                                                if (isKnowledgeDefCustomName(setContent.left)) {
                                                    listNames.add(prefix.concat(setContent.left.name))
                                                }
                                            }
                                        }  
                                    })
                                }
                                if (isKnowledgeList(principal.knowledge.value)) {
                                    if (isKnowledgeDefCustomName(principal.knowledge.left)) {
                                        listNames.add(principal.knowledge.left.name)
                                    }
                                }
                            }
                        }

                        if (isKnowledgeSet(principal.knowledge)) {
                            principal.knowledge.content.forEach(setContent => {
                                if (isKnowledge(setContent) && isKnowledgeDef(setContent) && isKnowledgeDefCustom(setContent)) {
                                    const innerValue = setContent.value
                                    if (isKnowledgeSet(innerValue)) {
                                        if (isKnowledgeDefCustomName(setContent.left)) {
                                            setNames.add(setContent.left.name)
                                        }
                                    } else if (isKnowledgeList(innerValue)) {
                                        if (isKnowledgeDefCustomName(setContent.left)) {
                                            listNames.add(setContent.left.name)
                                        }
                                    }
                                }  
                            })
                        }
                    }
                })
            }
        })

        protocol.elements.filter(isKnowledgeBase).forEach(knowledgeBase => {
            if (isKnowledgeValue(knowledgeBase.knowledge)) {
                if (isKnowledgeSet(knowledgeBase.knowledge)) {
                    knowledgeBase.knowledge.content.filter(isKnowledgeSpreading).forEach(setKnowledgeSpreading => {
                        if (isKnowledgeList(setKnowledgeSpreading.ref)) {
                            accept(`info`, `Knowledge spreading of wrong value for target`, { node: setKnowledgeSpreading.ref })
                        } else if (isKnowledgeRef(setKnowledgeSpreading.ref)) {
                            const fullRef = setKnowledgeSpreading.ref.ref.concat(setKnowledgeSpreading.ref.access.toString())
                            if (!setNames.has(fullRef)) {
                                accept(`info`, `Knowledge spreading of wrong value for target`, { node: setKnowledgeSpreading.ref })
                            }
                        }
                    })
                    knowledgeBase.knowledge.content.filter(isKnowledge).forEach(setKnowledge => {
                        if (isKnowledgeDef(setKnowledge)) {
                            if (isKnowledgeDefCustom(setKnowledge)) {
                                if (isKnowledgeSet(setKnowledge.value)) {
                                    setKnowledge.value.content.filter(isKnowledgeSpreading).forEach(innerSetKnowledgeSpreading => {
                                        if (isKnowledgeList(innerSetKnowledgeSpreading.ref)) {
                                            accept(`info`, `Knowledge spreading of wrong value for target`, { node: innerSetKnowledgeSpreading.ref })
                                        } else if (isKnowledgeRef(innerSetKnowledgeSpreading.ref)) {
                                            const fullRef = innerSetKnowledgeSpreading.ref.ref.concat(innerSetKnowledgeSpreading.ref.access.toString())
                                            if (!setNames.has(fullRef)) {
                                                accept(`info`, `Knowledge spreading of wrong value for target`, { node: innerSetKnowledgeSpreading.ref })
                                            }
                                        }
                                    })
                                }
                                if (isKnowledgeList(setKnowledge.value)) {
                                    setKnowledge.value.values.filter(isKnowledgeSpreading).forEach(innerListKnowledgeSpreading => {
                                        if (isKnowledgeRef(innerListKnowledgeSpreading.ref)) {
                                            const fullRef = innerListKnowledgeSpreading.ref.ref.concat(innerListKnowledgeSpreading.ref.access.toString())
                                            if (!listNames.has(fullRef)) {
                                                accept(`info`, `Knowledge spreading of wrong value for target`, { node: innerListKnowledgeSpreading.ref })                
                                            }
                                        }
                                    })
                                }
                            }
                        }
                    })
                }
                if (isKnowledgeList(knowledgeBase.knowledge)) {
                    knowledgeBase.knowledge.values.filter(isKnowledgeSpreading).forEach(listKnowledgeSpreading => {
                        if (isKnowledgeSet(listKnowledgeSpreading.ref)) {
                            accept(`info`, `Knowledge spreading of wrong value for target`, { node: listKnowledgeSpreading.ref })
                        } else if (isKnowledgeRef(listKnowledgeSpreading.ref)) {
                            const fullRef = listKnowledgeSpreading.ref.ref.concat(listKnowledgeSpreading.ref.access.toString())
                            if (!listNames.has(fullRef)) {
                                accept(`info`, `Knowledge spreading of wrong value for target`, { node: listKnowledgeSpreading.ref })
                            }
                        }
                    })
                }
            }
        })
    }
}
