import { MaybePromise, ValidationAcceptor, streamAllContents } from "langium";
import { KnowledgeSet, Protocol, ScenarioBranching, isCommunication, isKnowledge, isKnowledgeBase, isKnowledgeDef, isKnowledgeDefCustom, isKnowledgeDefCustomName, isKnowledgeList, isKnowledgeRef, isKnowledgeSet, isKnowledgeValue, isScenarioBranching } from "../generated/ast";

export const nonSetNestedKnowledgeAccess = {
    /**
     * 
     * @param protocol 
     * @param accept 
     */
    nonSetNestedKnowledgeAccess: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void> => {
        streamAllContents(protocol).filter(isKnowledgeDefCustom).forEach(defCustom => {
            if (isKnowledgeDefCustomName(defCustom.left) && isKnowledgeSet(defCustom.value)) {
                accept(`info`, ``, { node: defCustom })
            }
        })
    
        const setKnowledgeNames = new Set<string>()
    
        protocol.elements.filter(isKnowledgeBase).forEach(knowledgeBase => {
            if (isKnowledgeDef(knowledgeBase.knowledge) && isKnowledgeDefCustom(knowledgeBase.knowledge)) {
                if (isKnowledgeSet(knowledgeBase.knowledge.value)) {
                    if (isKnowledgeDefCustomName(knowledgeBase.knowledge.left)) {
                        setKnowledgeNames.add(knowledgeBase.knowledge.left.name)
                    }
                    checkSetHasInnerCustomDefinedSets(knowledgeBase.knowledge.value, setKnowledgeNames) 
                }
            }
        })

        protocol.elements.filter(isKnowledgeBase).forEach(knowledgeBase => {
            if (isKnowledgeDef(knowledgeBase.knowledge) && isKnowledgeDefCustom(knowledgeBase.knowledge)) {
                if (isKnowledgeRef(knowledgeBase.knowledge.value) && knowledgeBase.knowledge.value.access.length !== 0) {
                    if (!setKnowledgeNames.has(knowledgeBase.knowledge.value.ref)) {
                        accept(`error`, `Cannot perform nested access on non set knowledge, ${knowledgeBase.knowledge.value.ref} is not a set knowledge`, { node: knowledgeBase.knowledge })
                    }
                    const accessArray = knowledgeBase.knowledge.value.access.toString().split(",")
                    accessArray.pop()
                    accessArray.forEach(access => {
                        if (!setKnowledgeNames.has(access)) {
                            accept(`error`, `Cannot perform nested access on non set knowledge, ${access} is not a set knowledge`, { node: knowledgeBase.knowledge })
                        }
                    })
                }
                if (isKnowledgeList(knowledgeBase.knowledge.value)) {
                    const values = knowledgeBase.knowledge.value.values
                    values.forEach(value => {
                        if (isKnowledgeRef(value) && value.access.length !== 0) {
                            if (!setKnowledgeNames.has(value.ref)) {
                                accept(`error`, `Cannot perform nested access on non set knowledge, ${value.ref} is not a set knowledge`, { node: value })
                            }
                            const accessArray = value.access.toString().split(",")
                            accessArray.pop()
                            accessArray.forEach(access => {
                                if (!setKnowledgeNames.has(access)) {
                                    accept(`error`, `Cannot perform nested access on non set knowledge, ${access} is not a set knowledge`, { node: knowledgeBase.knowledge })
                                }   
                            })
                        }
                    })
                }
                if (isKnowledgeSet(knowledgeBase.knowledge.value)) {
                    const content = knowledgeBase.knowledge.value.content
                    content.forEach(con => {
                        if (isKnowledge(con) && isKnowledgeValue(con) && isKnowledgeRef(con) && con.access.length !== 0) {
                            if (!setKnowledgeNames.has(con.ref)) {
                                accept(`error`, `Cannot perform nested access on non set knowledge, ${con.ref} is not a set knowledge`, { node: con })
                            }
                            const accessArray = con.access.toString().split(",")
                            accessArray.pop()
                            accessArray.forEach(access => {
                                if (!setKnowledgeNames.has(access)) {
                                    accept(`error`, `Cannot perform nested access on non set knowledge, ${access} is not a set knowledge`, { node: knowledgeBase.knowledge })
                                }
                            })
                        }
                    })
                }
            }
        })

        protocol.elements.filter(isCommunication).forEach(communication => {
            if (isKnowledgeDef(communication.knowledge) && isKnowledgeDefCustom(communication.knowledge)) {
                
                if (isKnowledgeSet(communication.knowledge.value)) {
                    if (isKnowledgeDefCustomName(communication.knowledge.left)) {
                        setKnowledgeNames.add(communication.knowledge.left.name)
                    }
                    checkSetHasInnerCustomDefinedSets(communication.knowledge.value, setKnowledgeNames)

                    const content = communication.knowledge.value.content
                    content.forEach(con => {
                        if (isKnowledge(con) && isKnowledgeValue(con) && isKnowledgeRef(con) && con.access.length !== 0) {
                            if (!setKnowledgeNames.has(con.ref)) {
                                accept(`error`, `Cannot perform nested access on non set knowledge, ${con.ref} is not a set knowledge`, { node: con })
                            }
                            const accessArray = con.access.toString().split(",")
                            accessArray.pop()
                            accessArray.forEach(access => {
                                if (!setKnowledgeNames.has(access)) {
                                    accept(`error`, `Cannot perform nested access on non set knowledge, ${access} is not a set knowledge`, { node: communication.knowledge })
                                }
                            })
                        }
                    })
                }

                if (isKnowledgeList(communication.knowledge.value)) {
                    const values = communication.knowledge.value.values
                    values.forEach(value => {
                        if (isKnowledgeRef(value) && value.access.length !== 0) {
                            if (!setKnowledgeNames.has(value.ref)) {
                                accept(`error`, `Cannot perform nested access on non set knowledge, ${value.ref} is not a set knowledge`, { node: value })
                            }
                            const accessArray = value.access.toString().split(",")
                            accessArray.pop()
                            accessArray.forEach(access => {
                                if (!setKnowledgeNames.has(access)) {
                                    accept(`error`, `Cannot perform nested access on non set knowledge, ${access} is not a set knowledge`, { node: communication.knowledge })
                                }   
                            })
                        }
                    })
                }

                if (isKnowledgeRef(communication.knowledge.value)) {
                    if (!setKnowledgeNames.has(communication.knowledge.value.ref)) {
                        accept(`error`, `Cannot perform nested access on non set knowledge, ${communication.knowledge.value.ref} is not a set knowledge`, { node: communication.knowledge })
                    }
                    const accessArray = communication.knowledge.value.access.toString().split(",")
                    accessArray.pop()
                    accessArray.forEach(access => {
                        if (!setKnowledgeNames.has(access)) {
                            accept(`error`, `Cannot perform nested access on non set knowledge, ${access} is not a set knowledge`, { node: communication.knowledge })
                        }
                    })
                }
            }



            if (isKnowledgeValue(communication.knowledge)) {
                if (isKnowledgeRef(communication.knowledge)) {
                    // if (!setKnowledgeNames.has(communication.knowledge.ref)) {
                    //    accept(`error`, `Cannot perform nested access on non set knowledge, ${communication.knowledge.ref} is not a set knowledge`, { node: communication.knowledge })
                    //}
                    if (communication.knowledge.access.length !== 0) {
                        if (!setKnowledgeNames.has(communication.knowledge.ref)) {
                            accept(`error`, `Cannot perform nested access on non set knowledge, ${communication.knowledge.ref} is not a set knowledge`, { node: communication.knowledge })
                        }
                    }
                    const accessArray = communication.knowledge.access.toString().split(",")
                    accessArray.pop()
                    accessArray.forEach(access => {
                        if (!setKnowledgeNames.has(access)) {
                            accept(`error`, `Cannot perform nested access on non set knowledge, ${access} is not a set knowledge`, { node: communication.knowledge })
                        }
                    })
                }
                if (isKnowledgeList(communication.knowledge)) {
                    const values = communication.knowledge.values
                    values.forEach(value => {
                        if (isKnowledgeRef(value) && value.access.length !== 0) {
                            if (!setKnowledgeNames.has(value.ref)) {
                                accept(`error`, `Cannot perform nested access on non set knowledge, ${value.ref} is not a set knowledge`, { node: value })
                            }
                            const accessArray = value.access.toString().split(",")
                            accessArray.pop()
                            accessArray.forEach(access => {
                                if (!setKnowledgeNames.has(access)) {
                                    accept(`error`, `Cannot perform nested access on non set knowledge, ${access} is not a set knowledge`, { node: communication.knowledge })
                                }   
                            })
                        }
                    })
                }
                if (isKnowledgeSet(communication.knowledge)) {
                    const content = communication.knowledge.content
                    content.forEach(con => {
                        if (isKnowledge(con) && isKnowledgeValue(con) && isKnowledgeRef(con) && con.access.length !== 0) {
                            if (!setKnowledgeNames.has(con.ref)) {
                                accept(`error`, `Cannot perform nested access on non set knowledge, ${con.ref} is not a set knowledge`, { node: con })
                            }
                            const accessArray = con.access.toString().split(",")
                            accessArray.pop()
                            accessArray.forEach(access => {
                                if (!setKnowledgeNames.has(access)) {
                                    accept(`error`, `Cannot perform nested access on non set knowledge, ${access} is not a set knowledge`, { node: communication.knowledge })
                                }
                            })
                        }
                    })
                }
            }
        })

        protocol.elements.filter(isScenarioBranching).forEach(scenario => {
            checkNonSetKnowledgeAccessingScenario(scenario, setKnowledgeNames, accept)
        })
    }
    
}

// recursive function to find set names inside other blocks
/**
 * 
 * @param knowledgeSet 
 * @param setKnowledgeNames 
 */

function checkSetHasInnerCustomDefinedSets(knowledgeSet: KnowledgeSet, setKnowledgeNames: Set<string>) {
    const innerKnowledgeDefCustom = knowledgeSet.content.filter(isKnowledgeDef).filter(isKnowledgeDefCustom)
    innerKnowledgeDefCustom.forEach(knowledgeDefCustom => {
        if (isKnowledgeSet(knowledgeDefCustom.value)) {
            if (isKnowledgeDefCustomName(knowledgeDefCustom.left)) {
                setKnowledgeNames.add(knowledgeDefCustom.left.name)
            }
            checkSetHasInnerCustomDefinedSets(knowledgeDefCustom.value, setKnowledgeNames)
        }
    })
}

// recursive function to check scenarios 
/**
 * 
 * @param scenario 
 * @param setKnowledgeNames 
 * @param accept 
 */

function checkNonSetKnowledgeAccessingScenario(scenario: ScenarioBranching, setKnowledgeNames: Set<string>, accept: ValidationAcceptor): void {
    scenario.scenario.forEach(s => {
        s.elements.filter(isKnowledgeBase).forEach(knowledgeBase => {
            if (isKnowledgeDef(knowledgeBase.knowledge) && isKnowledgeDefCustom(knowledgeBase.knowledge)) {
                if (isKnowledgeSet(knowledgeBase.knowledge.value)) {
                    if (isKnowledgeDefCustomName(knowledgeBase.knowledge.left)) {
                        setKnowledgeNames.add(knowledgeBase.knowledge.left.name)
                    }
                    checkSetHasInnerCustomDefinedSets(knowledgeBase.knowledge.value, setKnowledgeNames)
                }
            }
        })
    })

    scenario.scenario.forEach(s => {
        s.elements.filter(isKnowledgeBase).forEach(knowledgeBase => {        
            if (isKnowledgeDef(knowledgeBase.knowledge) && isKnowledgeDefCustom(knowledgeBase.knowledge)) {
                if (isKnowledgeRef(knowledgeBase.knowledge.value) && knowledgeBase.knowledge.value.access.length !== 0) {
                        if (!setKnowledgeNames.has(knowledgeBase.knowledge.value.ref)) {
                            accept(`error`, `Cannot perform nested access on non set knowledge, ${knowledgeBase.knowledge.value.ref} is not a set knowledge`, { node: knowledgeBase.knowledge })
                        }
                        const accessArray = knowledgeBase.knowledge.value.access.toString().split(",")
                        accessArray.pop()
                        accessArray.forEach(access => {
                            if (!setKnowledgeNames.has(access)) {
                                accept(`error`, `Cannot perform nested access on non set knowledge, ${access} is not a set knowledge`, { node: knowledgeBase.knowledge })
                            }
                        })
                }
                if (isKnowledgeList(knowledgeBase.knowledge.value)) {
                    const values = knowledgeBase.knowledge.value.values
                    values.forEach(value => {
                        if (isKnowledgeRef(value) && value.access.length !== 0) {
                            if (!setKnowledgeNames.has(value.ref)) {
                                accept(`error`, `Cannot perform nested access on non set knowledge, ${value.ref} is not a set knowledge`, { node: value })
                            }
                            const accessArray = value.access.toString().split(",")
                            accessArray.pop()
                            accessArray.forEach(access => {
                                if (!setKnowledgeNames.has(access)) {
                                    accept(`error`, `Cannot perform nested access on non set knowledge, ${access} is not a set knowledge`, { node: knowledgeBase.knowledge })
                                }   
                            })
                        }
                    })
                }
                if (isKnowledgeSet(knowledgeBase.knowledge.value)) {
                    const content = knowledgeBase.knowledge.value.content
                    content.forEach(con => {
                        if (isKnowledge(con) && isKnowledgeValue(con) && isKnowledgeRef(con) && con.access.length !== 0) {
                            if (!setKnowledgeNames.has(con.ref)) {
                                accept(`error`, `Cannot perform nested access on non set knowledge, ${con.ref} is not a set knowledge`, { node: con })
                            }
                            const accessArray = con.access.toString().split(",")
                            accessArray.pop()
                            accessArray.forEach(access => {
                                if (!setKnowledgeNames.has(access)) {
                                    accept(`error`, `Cannot perform nested access on non set knowledge, ${access} is not a set knowledge`, { node: knowledgeBase.knowledge })
                                }
                            })
                        }
                    })
                }
            }
        })
        s.elements.filter(isCommunication).forEach(communication => {
            if (isKnowledgeDef(communication.knowledge) && isKnowledgeDefCustom(communication.knowledge)) {
                
                if (isKnowledgeSet(communication.knowledge.value)) {
                    if (isKnowledgeDefCustomName(communication.knowledge.left)) {
                        setKnowledgeNames.add(communication.knowledge.left.name)
                    }
                    checkSetHasInnerCustomDefinedSets(communication.knowledge.value, setKnowledgeNames)

                    const content = communication.knowledge.value.content
                    content.forEach(con => {
                        if (isKnowledge(con) && isKnowledgeValue(con) && isKnowledgeRef(con) && con.access.length !== 0) {
                            if (!setKnowledgeNames.has(con.ref)) {
                                accept(`error`, `Cannot perform nested access on non set knowledge, ${con.ref} is not a set knowledge`, { node: con })
                            }
                            const accessArray = con.access.toString().split(",")
                            accessArray.pop()
                            accessArray.forEach(access => {
                                if (!setKnowledgeNames.has(access)) {
                                    accept(`error`, `Cannot perform nested access on non set knowledge, ${access} is not a set knowledge`, { node: communication.knowledge })
                                }
                            })
                        }
                    })
                }

                if (isKnowledgeList(communication.knowledge.value)) {
                    const values = communication.knowledge.value.values
                    values.forEach(value => {
                        if (isKnowledgeRef(value) && value.access.length !== 0) {
                            if (!setKnowledgeNames.has(value.ref)) {
                                accept(`error`, `Cannot perform nested access on non set knowledge, ${value.ref} is not a set knowledge`, { node: value })
                            }
                            const accessArray = value.access.toString().split(",")
                            accessArray.pop()
                            accessArray.forEach(access => {
                                if (!setKnowledgeNames.has(access)) {
                                    accept(`error`, `Cannot perform nested access on non set knowledge, ${access} is not a set knowledge`, { node: communication.knowledge })
                                }   
                            })
                        }
                    })
                }

                if (isKnowledgeRef(communication.knowledge.value)) {
                    if (!setKnowledgeNames.has(communication.knowledge.value.ref)) {
                        accept(`error`, `Cannot perform nested access on non set knowledge, ${communication.knowledge.value.ref} is not a set knowledge`, { node: communication.knowledge })
                    }
                    const accessArray = communication.knowledge.value.access.toString().split(",")
                    accessArray.pop()
                    accessArray.forEach(access => {
                        if (!setKnowledgeNames.has(access)) {
                            accept(`error`, `Cannot perform nested access on non set knowledge, ${access} is not a set knowledge`, { node: communication.knowledge })
                        }
                    })
                }



            }

            if (isKnowledgeValue(communication.knowledge)) {
                if (isKnowledgeRef(communication.knowledge)) {
                    ///* if (!setKnowledgeNames.has(communication.knowledge.ref)) {
                    //    accept(`error`, `Cannot perform nested access on non set knowledge, ${communication.knowledge.ref} is not a set knowledge`, { node: communication.knowledge })
                    //} 
                    if (communication.knowledge.access.length !== 0) {
                        if (!setKnowledgeNames.has(communication.knowledge.ref)) {
                            accept(`error`, `Cannot perform nested access on non set knowledge, ${communication.knowledge.ref} is not a set knowledge`, { node: communication.knowledge })
                        }
                    }
                    const accessArray = communication.knowledge.access.toString().split(",")
                    accessArray.pop()
                    accessArray.forEach(access => {
                        if (!setKnowledgeNames.has(access)) {
                            accept(`error`, `Cannot perform nested access on non set knowledge, ${access} is not a set knowledge`, { node: communication.knowledge })
                        }
                    })
                }
                if (isKnowledgeList(communication.knowledge)) {
                    const values = communication.knowledge.values
                    values.forEach(value => {
                        if (isKnowledgeRef(value) && value.access.length !== 0) {
                            if (!setKnowledgeNames.has(value.ref)) {
                                accept(`error`, `Cannot perform nested access on non set knowledge, ${value.ref} is not a set knowledge`, { node: value })
                            }
                            const accessArray = value.access.toString().split(",")
                            accessArray.pop()
                            accessArray.forEach(access => {
                                if (!setKnowledgeNames.has(access)) {
                                    accept(`error`, `Cannot perform nested access on non set knowledge, ${access} is not a set knowledge`, { node: communication.knowledge })
                                }   
                            })
                        }
                    })
                }
                if (isKnowledgeSet(communication.knowledge)) {
                    const content = communication.knowledge.content
                    content.forEach(con => {
                        if (isKnowledge(con) && isKnowledgeValue(con) && isKnowledgeRef(con) && con.access.length !== 0) {
                            if (!setKnowledgeNames.has(con.ref)) {
                                accept(`error`, `Cannot perform nested access on non set knowledge, ${con.ref} is not a set knowledge`, { node: con })
                            }
                            const accessArray = con.access.toString().split(",")
                            accessArray.pop()
                            accessArray.forEach(access => {
                                if (!setKnowledgeNames.has(access)) {
                                    accept(`error`, `Cannot perform nested access on non set knowledge, ${access} is not a set knowledge`, { node: communication.knowledge })
                                }
                            })
                        }
                    })
                }
            }
        })
    })
    scenario.scenario.forEach(scen => {
        const nestedScenario = scen.elements.filter(isScenarioBranching)
        if (nestedScenario.length === 0) {
            return
        } else {
            nestedScenario.forEach(nested => {
                checkNonSetKnowledgeAccessingScenario(nested, setKnowledgeNames, accept)
            })
        }
    })
}
