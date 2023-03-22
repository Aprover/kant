import type { MaybePromise, ValidationAcceptor, ValidationChecks } from "langium"
import type { KantAstType, Protocol, AuthenticationCheck } from "./generated/ast"
import { isFunctionDef } from "./generated/ast"
import type { KantServices } from "./module"

/**
 * Register custom validation checks.
 */
export function registerValidationChecks(services: KantServices): void {
    const registry = services.validation.ValidationRegistry
    const validator = services.validation.KantValidator
    const checks: ValidationChecks<KantAstType> = {
        Protocol: [KantValidator.checkUniqueFunctionName],
        AuthenticationCheck: [KantValidator.checkAuthenticationPrincipalIsNotDuplicate]
    }
    registry.register(checks, validator)
}

/**
 * Implementation of custom validations.
 */
export const KantValidator = {
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
    }
}
export type KantValidator = typeof KantValidator
