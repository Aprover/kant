import { MaybePromise, ValidationAcceptor, ValidationChecks } from "langium"
import { KantAstType, Protocol, AuthenticationCheck, Communication, isPrincipal, isCommunication, isCheck, isAuthenticationCheck, isScenarioBranching, ScenarioBranching, isKnowledgeBase, isKnowledgeDef, isKnowledgeDefCustom, isKnowledgeDefCustomName, isKnowledgeRef, isKnowledgeList, isKnowledgeSet, isKnowledge, isKnowledgeValue } from "./generated/ast"
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
            KantValidator.checkCommunicationPrincipalIsKnown,
            KantValidator.checkAuthenticationCheckPrincipalIsKnown,
            KantValidator.checkKnownledgeCheckPrincipalIsKnown,
            KantValidator.checkScenarioPrincipalIsKnown,
            KantValidator.checkNonSetNestedKnowledgeAccess
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
    checkCommunicationPrincipalIsKnown: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void> => {
        const principals = new Set<string>() 
        protocol.elements.filter(isPrincipal).forEach(principal => {
            principal.name.forEach(name => {
                principals.add(name)
            })
        })

        const communications = protocol.elements.filter(isCommunication)
        communications.forEach(communication => {
            const partners = communication.from.concat(communication.to)
            partners.forEach(principal => {
                if (!principals.has(principal)) {
                    accept(`error`, `Unknown principal "${principal}"`, {node: communication} )
                }
            })
        })
    },
    /**
     * 
     * @param protocol 
     * @param accept 
     */
    checkAuthenticationCheckPrincipalIsKnown: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void> => {
        const principals = new Set<string>() 
        protocol.elements.filter(isPrincipal).forEach(principal => {
            principal.name.forEach(name => {
                principals.add(name)
            })
        })

        const checks = protocol.elements.filter(isCheck)
        const authenticationChecks = checks.filter(isAuthenticationCheck)
        authenticationChecks.forEach(authCheck => {
            if (!principals.has(authCheck.principal)) {
                accept(`error`, `Unknown principal "${authCheck.principal}"`, {node: authCheck})
            }
            if (!principals.has(authCheck.target)) {
                accept(`error`, `Unknown principal "${authCheck.target}"`, {node: authCheck})
            }
        })
    },
    /**
     * 
     * @param protocol 
     * @param accept 
     */
    checkKnownledgeCheckPrincipalIsKnown: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void> => {
        const principals = new Set<string>() 
        protocol.elements.filter(isPrincipal).forEach(principal => {
            principal.name.forEach(name => {
                principals.add(name)
            })
        })

        const checks = protocol.elements.filter(isCheck)
        const knowledgeChecks = checks.filter(isKnowledgeCheck)
        knowledgeChecks.forEach(knowledgeCheck => {
            knowledgeCheck.target.forEach(principal => {
                if (!principals.has(principal)) {
                    accept(`error`, `Unknown principal "${principal}"`, {node: knowledgeCheck})
                }
            })
        })
    },
    /**
     * 
     * @param protocol 
     * @param accept 
     */
    checkScenarioPrincipalIsKnown: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void> => {
        const principals = new Set<string>()
        protocol.elements.filter(isPrincipal).forEach(principal => {
            principal.name.forEach(name => {
                principals.add(name)
            })
        })

        protocol.elements.filter(isScenarioBranching).forEach(scenario => {
            checkScenarioPrincipal(scenario, principals, accept)
        })
    },
    checkNonSetNestedKnowledgeAccess: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void> => {
        const setKnowledge = new Set<string>()

        const knowledgeBases = protocol.elements.filter(isKnowledgeBase)
        knowledgeBases.forEach(knowledgeBase => {
            if (isKnowledgeDef(knowledgeBase.knowledge)) {
                if (isKnowledgeDefCustom(knowledgeBase.knowledge)) {
                    if (isKnowledgeDefCustomName(knowledgeBase.knowledge.left)) {
                        setKnowledge.add(knowledgeBase.knowledge.left.name)
                    }
                }
            }
        })

        knowledgeBases.forEach(knowledgeBase => {
            if (isKnowledgeDef(knowledgeBase.knowledge)) {
                if (isKnowledgeDefCustom(knowledgeBase.knowledge)) {
                    if (isKnowledgeRef(knowledgeBase.knowledge.value)) {
                        if (knowledgeBase.knowledge.value.access.length !== 0) {
                            if (!setKnowledge.has(knowledgeBase.knowledge.value.ref)) {
                                accept(`error`, `Cannot perform nested access on non set knowledge, ${knowledgeBase.knowledge.value.ref} is not a set knowledge`, { node: knowledgeBase.knowledge })
                            }
                        }
                    }
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
                    if (isKnowledgeSet(knowledgeBase.knowledge.value)) {
                        const content = knowledgeBase.knowledge.value.content
                        content.forEach(c => {
                            if (isKnowledge(c) && isKnowledgeValue(c) && isKnowledgeRef(c)) {
                                if (c.access.length !== 0) {
                                    if (!setKnowledge.has(c.ref)) {
                                        accept(`error`, `Cannot perform nested access on non set knowledge, ${c.ref} is not a set knowledge`, { node: c })
                                    }
                                }
                            }
                        })
                    }
                }
            }
        })
    }
}

function checkScenarioPrincipal(scenarioBranching: ScenarioBranching, principals: Set<string>, accept: ValidationAcceptor): void {
    // add principals defined in this scenario
    scenarioBranching.scenario.forEach(s => {
        s.elements.filter(isPrincipal).forEach(p => {
            p.name.forEach(n => {
                principals.add(n)
            })
        })
    })

    // check communications in this scenario
    scenarioBranching.scenario.forEach(s => {
        s.elements.filter(isCommunication).forEach(c => {
            const partners = (c.from).concat(c.to)
            partners.forEach(p => {
                if (!principals.has(p)) {
                    accept(`error`, `Unknown principal "${p}"`, { node: c })
                }
            })
        })
    })

    // check authentication checks in this scenario
    scenarioBranching.scenario.forEach(s => {
        s.elements.filter(isCheck).filter(isAuthenticationCheck).forEach(ac => {
            if (!principals.has(ac.principal)) {
                accept(`error`, `Unknown principal "${ac.principal}"`, {node: ac})
            }
            if (!principals.has(ac.target)) {
                accept(`error`, `Unknown principal "${ac.target}"`, {node: ac})
            }
        })
    })

    // check knowledge checks in this scenario
    scenarioBranching.scenario.forEach(s => {
        s.elements.filter(isCheck).filter(isKnowledgeCheck).forEach(kc => {
            kc.target.forEach(p => {
                if (!principals.has(p)) {
                    accept(`error`, `Unknown principal "${p}"`, {node: kc})
                }
            })
        })
    })

    // if this scenario has more scenario nested in it, call recursively
    scenarioBranching.scenario.forEach(s => {
        const nestedScenarios = s.elements.filter(isScenarioBranching)
        if (nestedScenarios.length === 0) {
            return
        } else {
            nestedScenarios.forEach(ns => {
                checkScenarioPrincipal(ns, principals, accept)
            })
        }
    })
}

export type KantValidator = typeof KantValidator
