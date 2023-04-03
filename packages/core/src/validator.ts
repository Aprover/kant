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
