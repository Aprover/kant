import { MaybePromise, ValidationAcceptor, streamAllContents } from "langium";
import { Protocol, isAuthenticationCheck, isCommunication, isKnowledgeCheck, isPrincipal } from "../generated/ast";

export const unknownPrincipalUsage = {
    /**
     * 
     * @param protocol 
     * @param accept 
     */
    unknownPrincipalUsage: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void> => {

        const principals = new Set<string>()

        streamAllContents(protocol).filter(isPrincipal).forEach(p => {
            p.name.forEach(pname => {
                principals.add(pname)
            })
        })

        streamAllContents(protocol).filter(isCommunication).forEach(c => {
            c.from.concat(c.to).forEach(n => {
                if (!principals.has(n)) {
                    accept(`error`, `Unknown principal "${n}"`, { node: c })
                }
            })
        })

        streamAllContents(protocol).filter(isAuthenticationCheck).forEach(ac => {
            if (!principals.has(ac.principal)) {
                accept(`error`, `Unknown principal "${ac.principal}"`, { node: ac })
            }
            if (!principals.has(ac.target)) {
                accept(`error`, `Unknown principal "${ac.target}"`, { node: ac })
            }
        })

        streamAllContents(protocol).filter(isKnowledgeCheck).forEach(kc => {
            kc.target.forEach(principal => {
                if (!principals.has(principal)) {
                    accept(`error`, `Unknown principal "${principal}"`, { node: kc })
                }
            })
        })

        /* 
        const knownPrincipals = new Set<string>()
        protocol.elements.filter(isPrincipal).forEach(principal => {
            principal.name.forEach(name => {
                knownPrincipals.add(name)
            })
        })
        protocol.elements.filter(isCommunication).forEach(communication => {
            communication.from.concat(communication.to).forEach(principal => {
                if (!knownPrincipals.has(principal)) {
                    accept(`error`, `Unknown principal "${principal}"`, {node: communication})
                }
            })
        })
        const checks = protocol.elements.filter(isCheck)
        checks.filter(isAuthenticationCheck).forEach(authCheck => {
            if (!knownPrincipals.has(authCheck.principal)) {
                accept(`error`, `Unknown principal "${authCheck.principal}"`, {node: authCheck})
            }
            if (!knownPrincipals.has(authCheck.target)) {
                accept(`error`, `Unknown principal "${authCheck.target}"`, {node: authCheck})
            }
        })
        checks.filter(isKnowledgeCheck).forEach(knowCheck => {
            knowCheck.target.forEach(principal => {
                if (!knownPrincipals.has(principal)) {
                    accept(`error`, `Unknown principal "${principal}"`, {node: knowCheck})
                }
            })
        })
        protocol.elements.filter(isScenarioBranching).forEach(scenario => {
            checkScenarioPrincipal(scenario, knownPrincipals, accept)
        }) */
    }
}

/**
 * 
 * @param scenario 
 * @param principals 
 * @param accept 
 *//* 
function checkScenarioPrincipal(scenario: ScenarioBranching, principals: Set<string>, accept: ValidationAcceptor): void {
    scenario.scenario.forEach(scen => {
        scen.elements.filter(isPrincipal).forEach(principal => {
            principal.name.forEach(principalName => {
                principals.add(principalName)
            })
        })
    })

    scenario.scenario.forEach(scen => {
        scen.elements.filter(isCommunication).forEach(communication => {
            communication.from.concat(communication.to).forEach(principal => {
                if (!principals.has(principal)) {
                    accept(`error`, `Unknown principal "${principal}"`, { node: communication })
                }
            })
        })
    })

    scenario.scenario.forEach(scen => {
        scen.elements.filter(isCheck).filter(isAuthenticationCheck).forEach(authCheck => {
            if (!principals.has(authCheck.principal)) {
                accept(`error`, `Unknown principal "${authCheck.principal}"`, {node: authCheck})
            }
            if (!principals.has(authCheck.target)) {
                accept(`error`, `Unknown principal "${authCheck.target}"`, {node: authCheck})
            }
        })
    })

    scenario.scenario.forEach(scen => {
        scen.elements.filter(isCheck).filter(isKnowledgeCheck).forEach(knowCheck => {
            knowCheck.target.forEach(principal => {
                if (!principals.has(principal)) {
                    accept(`error`, `Unknown principal "${principal}"`, {node: knowCheck})
                }
            })
        })
    })

    scenario.scenario.forEach(scen => {
        const nestedScenario = scen.elements.filter(isScenarioBranching)
        if (nestedScenario.length === 0) {
            return
        } else {
            nestedScenario.forEach(ns => {
                checkScenarioPrincipal(ns, principals, accept)
            })
        }
    })
} */