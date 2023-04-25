import { MaybePromise, ValidationAcceptor, ValidationChecks } from "langium"
import { KantAstType, Protocol, AuthenticationCheck, Communication, isPrincipal, isCommunication, isCheck, isAuthenticationCheck, isScenarioBranching, ScenarioBranching, isKnowledgeBase, isKnowledgeDef, isKnowledgeDefCustom, isKnowledgeDefCustomName, isKnowledgeRef, isKnowledgeList, isKnowledgeSet, isKnowledge, isKnowledgeValue, isKnowledgeDefBuiltin, isKnowledgeDefDestructuring, isKnowledgeDefListDestructuring, isKnowledgeDefListDestructuringAssignment, isKnowledgeDefSetDestructuring, isEqualityCheck, isFreshnessCheck, isLinkabilityCheck, isKnowledgeFromFunction, isKnowledgeFromFunctionArgsElements, KnowledgeBase } from "./generated/ast"
import { isFunctionDef, isKnowledgeCheck } from "./generated/ast"
import type { KantServices } from "./module"

/**
 * Register custom validation checks.
 */
export function registerValidationChecks(services: KantServices): void {
    const registry = services.validation.ValidationRegistry
    const validator = services.validation.KantValidator
    const checks: ValidationChecks<KantAstType> = {
        Protocol: [
            KantValidator.checkUniqueFunctionName, 
            KantValidator.checkPrincipalIsKnown,
            KantValidator.checkNonSetNestedKnowledgeAccess,
            KantValidator.checkKnowledgeUsage,
            KantValidator.checkUnknownFunctionUsage,
            KantValidator.checkCommunicationAttemptOfKnowledgeUnknownToSender,
            KantValidator.checkInversionFunctionIsCorrect,
            KantValidator.checkKnowledgeIsNotDuplicateInSameScope
        ],
        AuthenticationCheck: [
            KantValidator.checkAuthenticationPrincipalIsNotDuplicate
        ],
        Communication: [
            KantValidator.checkCommunicationPrincipalIsNotDuplicate
        ]
    }
    registry.register(checks, validator)
}

/**
 * Implementation of custom validations.
 */
export const KantValidator = {
    /**
     * 
     * @param protocol 
     * @param accept 
     */
    checkUniqueFunctionName: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void> => {
        const functionDefs = protocol.elements.filter(isFunctionDef)
        const alreadyDefinedNames = new Set<string>()
        for (const fd of functionDefs) {
            if (alreadyDefinedNames.has(fd.name)) {
                accept(`error`, `Function definition already exists with same name "${fd.name}"`, { node: fd })
                break
            }
            alreadyDefinedNames.add(fd.name)
        }
    },
    /**
     * 
     * @param authenticationCheck 
     * @param accept 
     */
    checkAuthenticationPrincipalIsNotDuplicate: (authenticationCheck: AuthenticationCheck, accept: ValidationAcceptor): MaybePromise<void> => {
        if (authenticationCheck.principal === authenticationCheck.target) {
            accept(`warning`, `Authentication check is redundant`, { node: authenticationCheck })
        }
    },
    /**
     * 
     * @param communication 
     * @param accept 
     */
    checkCommunicationPrincipalIsNotDuplicate: (communication: Communication, accept: ValidationAcceptor): MaybePromise<void> => {
        communication.from.forEach(principal => {
            if (communication.to.includes(principal)) {
                accept(`warning`, `Communication is redundant: "${principal}" already knows this knowledge`, {node: communication})
            }
        })
    },
    /**
     * 
     * @param protocol 
     * @param accept 
     */
    checkPrincipalIsKnown: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void> => {
        const knownPrincipals = new Set<string>()
        protocol.elements.filter(isPrincipal).forEach(principal => {
            principal.name.forEach(name => {
                knownPrincipals.add(name)
            })
        })

        // check principals used in communications are known
        const communications = protocol.elements.filter(isCommunication)
        communications.forEach(communication => {
            const senders = communication.from
            const receivers = communication.to
            const partners = senders.concat(receivers)
            partners.forEach(principal => {
                if (!knownPrincipals.has(principal)) {
                    accept(`error`, `Unknown principal "${principal}"`, {node: communication})
                }
            })
        })

        // check principals used in authentication checks are known 
        const checks = protocol.elements.filter(isCheck)
        const authenticationChecks = checks.filter(isAuthenticationCheck)
        authenticationChecks.forEach(authCheck => {
            if (!knownPrincipals.has(authCheck.principal)) {
                accept(`error`, `Unknown principal "${authCheck.principal}"`, {node: authCheck})
            }
            if (!knownPrincipals.has(authCheck.target)) {
                accept(`error`, `Unknown principal "${authCheck.target}"`, {node: authCheck})
            }
        })

        // check principals used in knowledge checks are known
        const knowledgeChecks = checks.filter(isKnowledgeCheck)
        knowledgeChecks.forEach(knowCheck => {
            knowCheck.target.forEach(principal => {
                if (!knownPrincipals.has(principal)) {
                    accept(`error`, `Unknown principal "${principal}"`, {node: knowCheck})
                }
            })
        })

        // call check first level scenarios, then call recursively if needed
        const scenarios = protocol.elements.filter(isScenarioBranching)
        scenarios.forEach(sc => {
            checkScenarioPrincipal(sc, knownPrincipals, accept)
        })
    }
    ,
    checkNonSetNestedKnowledgeAccess: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void> => {
        const setKnowledge = new Set<string>()

        // fill set with the names of knowledge sets
        const knowledgeBases = protocol.elements.filter(isKnowledgeBase)

        knowledgeBases.forEach(knowledgeBase => {
            if (isKnowledgeDefCustom(knowledgeBase.knowledge)) {
                if (isKnowledgeDefCustomName(knowledgeBase.knowledge.left)) {
                    setKnowledge.add(knowledgeBase.knowledge.left.name)
                }
            }
        })

        knowledgeBases.forEach(knowledgeBase => {
                if (isKnowledgeDefCustom(knowledgeBase.knowledge)) {
                    // knowledge otherKnowledge = a.other -> IMPOSSIBLE if a is not a set
                    if (isKnowledgeRef(knowledgeBase.knowledge.value)) {
                        if (knowledgeBase.knowledge.value.access.length !== 0) {
                            if (!setKnowledge.has(knowledgeBase.knowledge.value.ref)) {
                                accept(`error`, `Cannot perform nested access on non set knowledge, ${knowledgeBase.knowledge.value.ref} is not a set knowledge`, { node: knowledgeBase.knowledge })
                            }
                        }
                    }
                    // knowledge otherKnowledge = [a.other, b] -> IMPOSSIBle if a is not a set
                    if (isKnowledgeList(knowledgeBase.knowledge.value)) {
                        const values = knowledgeBase.knowledge.value.values
                        values.forEach(v => {
                            if (isKnowledgeRef(v) && v.access.length !== 0) {
                                if (!setKnowledge.has(v.ref)) {
                                    accept(`error`, `Cannot perform nested access on non set knowledge, ${v.ref} is not a set knowledge`, { node: v })
                                }
                            }
                        })
                    }
                    // knowledge otherKnowledge = { fresh k, a.other } -> IMPOSSIBLE if a is not a set
                    if (isKnowledgeSet(knowledgeBase.knowledge.value)) {
                        const content = knowledgeBase.knowledge.value.content
                        content.forEach(c => {
                            if (isKnowledge(c) && isKnowledgeValue(c) && isKnowledgeRef(c) && c.access.length !== 0) {
                                
                                    if (!setKnowledge.has(c.ref)) {
                                        accept(`error`, `Cannot perform nested access on non set knowledge, ${c.ref} is not a set knowledge`, { node: c })
                                    }
                                
                            }
                        })
                    }
                }
            
        })

        const scenarios = protocol.elements.filter(isScenarioBranching)
        if (scenarios.length !== 0) {
            scenarios.forEach(s => {
                checkNonSetKnowledgeAccessingScenario(s, setKnowledge, accept)
            })
        }
    },
    /**
     * 
     */
    checkKnowledgeUsage: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void> => {
        const knowledge = new Set<string>()
        
        const knowledgeBases = protocol.elements.filter(isKnowledgeBase)
        knowledgeBases.forEach(knowledgeBase => {
            if (isKnowledgeDef(knowledgeBase.knowledge)) {
                if (isKnowledgeDefBuiltin(knowledgeBase.knowledge)) {
                    
                    knowledgeBase.knowledge.name.forEach(n => {
                        knowledge.add(n)
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

        // communications
        const communications = protocol.elements.filter(isCommunication)
        communications.forEach(communication => {
            const communicationKnowledge = communication.knowledge
            if (isKnowledgeValue(communicationKnowledge)) {
                if (isKnowledgeRef(communicationKnowledge)) {
                    if (!knowledge.has(communicationKnowledge.ref)) {
                        accept(`error`, `Unknown knowledge as communication payload`, { node: communicationKnowledge })
                    }
                }
            }
        })

        // checks
        const checks = protocol.elements.filter(isCheck)
        checks.forEach(check => {
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

        // assignments
        knowledgeBases.forEach(knowledgeBase => {
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

        // functions
        knowledgeBases.forEach(kb => {
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
    },
    /**
     * 
     * @param protocol 
     * @param accept 
     */
    checkUnknownFunctionUsage: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void> => {
        const functionNames = new Set<string>()
        protocol.elements.filter(isFunctionDef).forEach(functionDef => {
            functionNames.add(functionDef.name)
        })

        const knowledgeBases = protocol.elements.filter(isKnowledgeBase)
        knowledgeBases.forEach(kb => {
            if (isKnowledgeDef(kb.knowledge)) {
                if (isKnowledgeDefCustom(kb.knowledge)) {
                    if (isKnowledgeFromFunction(kb.knowledge.value)) {
                        const name = kb.knowledge.value.name
                        if (!functionNames.has(name)) {
                            accept(`error`, `Unknown function usage`, { node: kb.knowledge.value })
                        }
                    }
                }
            }
            if (isKnowledgeFromFunction(kb.knowledge)) {
                const name = kb.knowledge.name
                        if (!functionNames.has(name)) {
                            accept(`error`, `Unknown function usage`, { node: kb.knowledge })
                        }
            }
        })
    },
    /**
     * 
     * @param protocol 
     * @param accept 
     */
    checkCommunicationAttemptOfKnowledgeUnknownToSender: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void> => {
        const principalSet = new Set<string>()
        const principalMap = new Map<string, Set<string>>()
        const principals = protocol.elements.filter(isPrincipal)
        principals.forEach(principal => {
            principal.name.forEach(name => {
                if (!principalSet.has(name)) {
                    principalSet.add(name)
                    principalMap.set(name, new Set<string>())
                }
            })
        })

        principals.forEach(principal => {
            if (principal.knowledge !== undefined) {
                if (isKnowledgeDef(principal.knowledge)) {
                    if (isKnowledgeDefBuiltin(principal.knowledge)) {
                        const knowledgeToInsert = principal.knowledge.name
                        principal.name.forEach(name => {
                            knowledgeToInsert.forEach(k => {
                                principalMap.get(name)?.add(k)
                            })
                        })
                    }
                    if (isKnowledgeDefCustom(principal.knowledge)) {
                        if (isKnowledgeDefCustomName(principal.knowledge.left)) {
                            const knowledgeToInsert = principal.knowledge.left.name
                            principal.name.forEach(name => {
                                principalMap.get(name)?.add(knowledgeToInsert)
                            })
                        }
                    }
                }
                if (isKnowledgeValue(principal.knowledge)) {
                    if (isKnowledgeList(principal.knowledge)) {
                        principal.knowledge.values.forEach(value => {
                            if (isKnowledgeRef(value)) {
                                const knowledgeToInsert = value.ref
                                principal.name.forEach(name => {
                                    principalMap.get(name)?.add(knowledgeToInsert)      
                                })
                            }
                        })
                    }
                    if (isKnowledgeRef(principal.knowledge)) {
                        const knowledgeToInsert = principal.knowledge.ref
                        principal.name.forEach(name => {
                            principalMap.get(name)?.add(knowledgeToInsert)
                            
                        })
                    }
                    if (isKnowledgeSet(principal.knowledge)) {
                        principal.knowledge.content.forEach(content => {
                            if (isKnowledgeDef(content)) {
                                if (isKnowledgeDefBuiltin(content)) {
                                    content.name.forEach(knowledgeName => {
                                        const knowledgeToInsert = knowledgeName    
                                        principal.name.forEach(name => {
                                            principalMap.get(name)?.add(knowledgeToInsert)
                                            
                                        })
                                    })
                                }
                                if (isKnowledgeDefCustom(content)) {
                                    if (isKnowledgeDefCustomName(content.left)) {
                                        const knowledgeToInsert = content.left.name
                                        principal.name.forEach(name => {
                                            principalMap.get(name)?.add(knowledgeToInsert)
                                        
                                        })
                                    }
                                }
                            }
                            if (isKnowledgeValue(content)) {
                                if (isKnowledgeRef(content)) {
                                    const knowledgeToInsert = content.ref
                                    principal.name.forEach(name => {
                                        principalMap.get(name)?.add(knowledgeToInsert)
                                    })
                                }
                            }
                        })
                    }
                }
            }
        })

        const knowledgeBases = new Set<KnowledgeBase>()
        protocol.elements.filter(isKnowledgeBase).forEach(kb => {
            if (kb.shared) {
                knowledgeBases.add(kb)
            }
        })

        knowledgeBases.forEach(kb => {
            if (isKnowledgeDef(kb.knowledge)) {
                if (isKnowledgeDefBuiltin(kb.knowledge)) {
                    const knowledgeToInsert = kb.knowledge.name
                    knowledgeToInsert.forEach(kn => {
                        principalSet.forEach(principal => {
                            principalMap.get(principal)?.add(kn)
                        })
                    })
                }
                if (isKnowledgeDefCustom(kb.knowledge)) {
                    if (isKnowledgeDefCustomName(kb.knowledge.left)) {
                        const knowledgeToInsert = kb.knowledge.left.name
                        principalSet.forEach(principal => {
                            principalMap.get(principal)?.add(knowledgeToInsert)
                        })
                    }
                }
            }

            if (isKnowledgeValue(kb.knowledge)) {
                if (isKnowledgeList(kb.knowledge)) {
                    kb.knowledge.values.forEach(value => {
                        if (isKnowledgeRef(value)) {
                            const knowledgeToInsert = value.ref
                            principalSet.forEach(principal => {
                                principalMap.get(principal)?.add(knowledgeToInsert)
                            }) 
                        }
                    })
                }
                if (isKnowledgeRef(kb.knowledge)) {
                    const knowledgeToInsert = kb.knowledge.ref
                    principalSet.forEach(principal => {
                        principalMap.get(principal)?.add(knowledgeToInsert)
                    })
                }
                if (isKnowledgeSet(kb.knowledge)) {
                    kb.knowledge.content.forEach(content => {
                        if (isKnowledgeDef(content)) {
                            if (isKnowledgeDefBuiltin(content)) {
                                content.name.forEach(knowledgeName => {
                                    const knowledgeToInsert = knowledgeName    
                                    principalSet.forEach(principal => {
                                        principalMap.get(principal)?.add(knowledgeToInsert)
                                    })
                                })
                            }
                            if (isKnowledgeDefCustom(content)) {
                                if (isKnowledgeDefCustomName(content.left)) {
                                    const knowledgeToInsert = content.left.name
                                    principalSet.forEach(principal => {
                                        principalMap.get(principal)?.add(knowledgeToInsert)
                                    })
                                }
                            }
                        }
                        if (isKnowledgeValue(content)) {
                            if (isKnowledgeRef(content)) {
                                const knowledgeToInsert = content.ref
                                principalSet.forEach(principal => {
                                    principalMap.get(principal)?.add(knowledgeToInsert)
                                })
                            }
                        }
                    })
                }
            }
        })

        const communications = protocol.elements.filter(isCommunication)
        communications.forEach(communication => {
            const senders = communication.from
            const receivers = communication.to

            if (isKnowledgeDef(communication.knowledge)) {
                if (isKnowledgeDefCustom(communication.knowledge)) {
                    const value = communication.knowledge.value
                    if (isKnowledgeRef(value)) {
                        const ref = value.ref
                        senders.forEach(sender => {
                            const senderKnowledge = principalMap.get(sender)
                            if (!((senderKnowledge?.has(ref)) ?? false)) {
                                accept(`error`, `Sender ${sender} doesn't know this knowledge`, { node: communication })
                            } 
                                receivers.forEach(receiver => {
                                    principalMap.get(receiver)?.add(ref)
                                })
                            
                        })
                    } 
                    if (isKnowledgeList(value)) {
                        const listContent = value.values
                        listContent.forEach(content => {
                            if (isKnowledgeValue(content)) {
                                if (isKnowledgeRef(content)) {
                                    senders.forEach(sender => {
                                        const senderKnowledge = principalMap.get(sender)
                                        if (!((senderKnowledge?.has(content.ref)) ?? false)) {
                                            accept(`error`, `Sender ${sender} doesn't know this knowledge`, { node: communication })
                                        }
                                            receivers.forEach(receiver => {
                                                principalMap.get(receiver)?.add(content.ref)
                                            })
                                        
                                    })
                                }
                            }
                        })
                    }
                    
                }
            }

            if (isKnowledgeValue(communication.knowledge)) {
                if (isKnowledgeRef(communication.knowledge)) {
                    const ref = communication.knowledge.ref
                    senders.forEach(sender => {
                        const senderKnowledge = principalMap.get(sender)
                        if (!((senderKnowledge?.has(ref)) ?? false)) {
                            accept(`error`, `Sender ${sender} doesn't know this knowledge`, { node: communication })
                        }
                            receivers.forEach(receiver => {
                                principalMap.get(receiver)?.add(ref)
                            })
                    })
                }
            }
        })
    },
    /**
     * 
     * @param protocol 
     * @param accept 
     */
    checkInversionFunctionIsCorrect: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void> => {
        const functionDefs = protocol.elements.filter(isFunctionDef)

        const properties = protocol.elements.filter(isPropertyDef)
        properties.forEach(propertyDef => {
            if (isFunctionInversionDef(propertyDef.property)) {
                const inverter = propertyDef.property.inverter
                const inverted = propertyDef.property.function

                var invertedFunctionParamsCount = 0
                var inverterFunctionParamsCount = 0;
                
                functionDefs.forEach(functionDef => {
                    if (inverted.ref !== undefined) {
                        if (functionDef.name === inverted.ref.name) {
                            
                            invertedFunctionParamsCount = functionDef.params.length 
                        }
                    }
                    if (inverter.ref !== undefined) {
                        if (functionDef.name === inverter.ref.name) {
                            inverterFunctionParamsCount = functionDef.params.length
                        }
                    }
                })

                if (invertedFunctionParamsCount !== inverterFunctionParamsCount) {
                    if (inverter.ref !== undefined) {
                        accept(`error`, `Inversion function ${inverter.ref.name} has incompatible number of parameters compared to inverted function`, { node: propertyDef })

                    }
                }
            }
        })
    },
    /**
     * 
     * @param protocol 
     * @param accept 
     */
    checkKnowledgeIsNotDuplicateInSameScope: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void> => {
        const definedBuiltinKnowledge = new Set<string>()
        protocol.elements.filter(isKnowledgeBase).forEach(knowledgeBase => {
            if (isKnowledgeDef(knowledgeBase.knowledge)) {
                if (isKnowledgeDefBuiltin(knowledgeBase.knowledge)) {
                    knowledgeBase.knowledge.name.forEach(knowledgeName => {
                        if (definedBuiltinKnowledge.has(knowledgeName)) {
                            accept(`error`, `Duplicate knowledge definition`, { node: knowledgeBase.knowledge })
                        } else {
                            definedBuiltinKnowledge.add(knowledgeName)
                        }
                    })
                }
                if (isKnowledgeDefCustom(knowledgeBase.knowledge)) {
                    if (isKnowledgeSet(knowledgeBase.knowledge.value)) {
                        const setKnowledge = new Set<string>()
                        knowledgeBase.knowledge.value.content.forEach(setValue => {
                            if (isKnowledgeDefBuiltin(setValue)) {
                                setValue.name.forEach(n => {
                                    if (setKnowledge.has(n)) {
                                        accept(`error`, `Duplicate knowledge definition`, { node: knowledgeBase.knowledge })
                                    } else {
                                        setKnowledge.add(n)
                                    }
                                })
                            }
                            if (isKnowledgeRef(setValue)) {
                                if (setKnowledge.has(setValue.ref.concat(setValue.access.toString()))) {
                                    accept(`error`, `Duplicate knowledge definition`, { node: knowledgeBase.knowledge })
                                } else {
                                    setKnowledge.add(setValue.ref.concat(setValue.access.toString()))
                                }
                            }
                        })
                    }
                }
            }

            if (isKnowledgeValue(knowledgeBase.knowledge)) {
                if (isKnowledgeSet(knowledgeBase.knowledge)) {
                    knowledgeBase.knowledge.content.forEach(setContent => {
                        if (isKnowledgeDefBuiltin(setContent)) {
                            setContent.name.forEach(name => {
                                if (definedBuiltinKnowledge.has(name)) {
                                    accept(`error`, `Duplicate knowledge definition`, { node: knowledgeBase.knowledge })
                                } else {
                                    definedBuiltinKnowledge.add(name)
                                }
                            })   
                        }
                    })
                }
                if (isKnowledgeList(knowledgeBase.knowledge)) {
                    const listKnowledge = new Set<string>()
                    knowledgeBase.knowledge.values.forEach(listVal => {
                        if (ast.isKnowledgeRef(listVal)) {
                            if (listKnowledge.has(listVal.ref.concat(listVal.access.toString()))) {
                                accept(`error`, `Duplicate knowledge definition`, { node: knowledgeBase.knowledge })
                            } else {
                                listKnowledge.add(listVal.ref.concat(listVal.access.toString()))
                            }
                        }
                    })
                }
            }
        })
    }
}

function checkNonSetKnowledgeAccessingScenario(scenario: ScenarioBranching, setKnowledge: Set<string>, accept: ValidationAcceptor): void {
    scenario.scenario.forEach(s => {
        s.elements.filter(isKnowledgeBase).forEach(knowledgeBase => {
            if (isKnowledgeDefCustom(knowledgeBase.knowledge)) {
                if (isKnowledgeDefCustomName(knowledgeBase.knowledge.left)) {
                    setKnowledge.add(knowledgeBase.knowledge.left.name)
                }
            }
        })
    })

    scenario.scenario.forEach(s => {
        const knowledgeBases = s.elements.filter(isKnowledgeBase)
        knowledgeBases.forEach(knowledgeBase => {
                
            if (isKnowledgeDefCustom(knowledgeBase.knowledge)) {
                // knowledge otherKnowledge = a.other -> IMPOSSIBLE if a is not a set
                if (isKnowledgeRef(knowledgeBase.knowledge.value)) {
                    if (knowledgeBase.knowledge.value.access.length !== 0) {
                        if (!setKnowledge.has(knowledgeBase.knowledge.value.ref)) {
                            accept(`error`, `Cannot perform nested access on non set knowledge, ${knowledgeBase.knowledge.value.ref} is not a set knowledge`, { node: knowledgeBase.knowledge })
                        }
                    }
                }
                // knowledge otherKnowledge = [a.other, b] -> IMPOSSIBle if a is not a set
                if (isKnowledgeList(knowledgeBase.knowledge.value)) {
                    const values = knowledgeBase.knowledge.value.values
                    values.forEach(v => {
                        if (isKnowledgeRef(v) && v.access.length !== 0) {
                            if (!setKnowledge.has(v.ref)) {
                                accept(`error`, `Cannot perform nested access on non set knowledge, ${v.ref} is not a set knowledge`, { node: v })
                            }
                        }
                    })
                }
                // knowledge otherKnowledge = { fresh k, a.other } -> IMPOSSIBLE if a is not a set
                if (isKnowledgeSet(knowledgeBase.knowledge.value)) {
                    const content = knowledgeBase.knowledge.value.content
                    content.forEach(c => {
                        if (isKnowledge(c) && isKnowledgeValue(c) && isKnowledgeRef(c) && c.access.length !== 0) {
                            
                                if (!setKnowledge.has(c.ref)) {
                                    accept(`error`, `Cannot perform nested access on non set knowledge, ${c.ref} is not a set knowledge`, { node: c })
                                }
                            
                        }
                    })
                }
            }
        })


    })

    scenario.scenario.forEach(sc => {
        const nestedSc = sc.elements.filter(isScenarioBranching)
        if (nestedSc.length === 0) {
            return
        } else {
            nestedSc.forEach(ns => {
                checkNonSetKnowledgeAccessingScenario(ns, setKnowledge, accept)
            })
        }
    })

}

function checkScenarioPrincipal(scenario: ScenarioBranching, principals: Set<string>, accept: ValidationAcceptor): void {
    scenario.scenario.forEach(s => {
        s.elements.filter(isPrincipal).forEach(principal => {
            principal.name.forEach(n => {
                principals.add(n)
            })
        })
    })

    scenario.scenario.forEach(sc => {
        const communications = sc.elements.filter(isCommunication)
        communications.forEach(communication => {
            const senders = communication.from
            const receivers = communication.to
            const partners = senders.concat(receivers)

            partners.forEach(principal => {
                if (!principals.has(principal)) {
                    accept(`error`, `Unknown principal "${principal}"`, { node: communication })
                }
            })
        })
    })

    scenario.scenario.forEach(sc => {
        const authenticationChecks = sc.elements.filter(isCheck).filter(isAuthenticationCheck)
        authenticationChecks.forEach(authCheck => {
            if (!principals.has(authCheck.principal)) {
                accept(`error`, `Unknown principal "${authCheck.principal}"`, {node: authCheck})
            }
            if (!principals.has(authCheck.target)) {
                accept(`error`, `Unknown principal "${authCheck.target}"`, {node: authCheck})
            }
        })
    })

    scenario.scenario.forEach(sc => {
        const knowledgeChecks = sc.elements.filter(isCheck).filter(isKnowledgeCheck)
        knowledgeChecks.forEach(knowCheck => {
            knowCheck.target.forEach(principal => {
                if (!principals.has(principal)) {
                    accept(`error`, `Unknown principal "${principal}"`, {node: knowCheck})
                }
            })
        })
    })

    scenario.scenario.forEach(sc => {
        const nestedSc = sc.elements.filter(isScenarioBranching)
        if (nestedSc.length === 0) {
            return
        } else {
            nestedSc.forEach(ns => {
                checkScenarioPrincipal(ns, principals, accept)
            })
        }
    })
}

export type KantValidator = typeof KantValidator
