import type { ValidationChecks } from "langium"
import type { KantAstType } from "./generated/ast"
import type { KantServices } from "./kant-module"

/**
 * Register custom validation checks.
 */
export function registerValidationChecks(services: KantServices): void {
    const registry = services.validation.ValidationRegistry
    const validator = services.validation.KantValidator
    const checks: ValidationChecks<KantAstType> = {}
    registry.register(checks, validator)
}

/**
 * Implementation of custom validations.
 */
export const KantValidator = {}
export type KantValidator = typeof KantValidator
