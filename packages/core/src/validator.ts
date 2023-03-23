import { MaybePromise, ValidationAcceptor, ValidationChecks } from "langium"
import { KantAstType, Protocol, AuthenticationCheck, Communication, isPrincipal, isCommunication, isCheck, isAuthenticationCheck } from "./generated/ast"
import { isFunctionDef } from "./generated/ast"
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
            KantValidator.checkCommunicationPrincipalIsKnown
        ],
        AuthenticationCheck: [KantValidator.checkAuthenticationPrincipalIsNotDuplicate],
        Communication: [KantValidator.checkCommunicationPrincipalIsNotDuplicate]
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
    }
}
export type KantValidator = typeof KantValidator
