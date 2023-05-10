import { MaybePromise, ValidationAcceptor, ValidationChecks } from "langium"
import { KantAstType, Protocol, AuthenticationCheck, Communication, Principal } from "./generated/ast"
import type { KantServices } from "./module"
import { nonSetNestedKnowledgeAccess } from "./validation/non-set-nested-knowledge-access"
import { unknownPrincipalUsage } from "./validation/unknown-principal-usage"
import { duplicatePrincipalInCommunication } from "./validation/duplicate-principal-in-communication"
import { duplicatePrincipalInAuthenticationCheck } from "./validation/duplicate-principal-in-authentication-check"
import { uniqueFunctionName } from "./validation/unique-function-name"
import { unknownFunctionUsage } from "./validation/unknown-function-usage"
import { unknownKnowledgeUsage } from "./validation/unknown-knowledge-usage"
import { communicationAttemptOfKnowledgeUnknownToSender } from "./validation/communication-attempt-of-knowledge-unknown-to-sender"
import { invertionFunctionWithWrongNumberOfParameters } from "./validation/inversion-function-wrong-number-parameters"
import { duplicateKnowledgeNameInSameScope } from "./validation/duplicate-knowledge-name-in-same-scope"
import { knowledgeReferenceSpreadingOfNonSetNonListValues } from "./validation/knowledge-reference-spreading-not-set-non-list"
import { knowledgeReferenceSpreadingOfWrongValueForTargetValue } from "./validation/knowledge-reference-spreading-wrong-for-target"
import { invertedOneWayFunctions } from "./validation/inverted-one-way-function"
import { destructuringNonSetNonListValues } from "./validation/destructuring-non-set-non-list-values"
import { variadicParameterNotLast } from "./validation/variadic-parameter-not-last"
import { variadicParamsNotListInsideSet } from "./validation/variadic-params-not-list-inside-set"
import { freshConstInEqualityCheck } from "./validation/fresh-const-equality-check"
import { duplicatePrincipalInDeclaration } from "./validation/duplicate-principal-in-declaration"

/**
 * Register custom validation checks.
 */
export function registerValidationChecks(services: KantServices): void {
    const registry = services.validation.ValidationRegistry
    const validator = services.validation.KantValidator
    const checks: ValidationChecks<KantAstType> = {
        Protocol: [
            KantValidator.nonSetNestedKnowledgeAccess,
            KantValidator.unknownPrincipalUsage,
            KantValidator.uniqueFunctionName,
            KantValidator.unknownFunctionUsage,
            KantValidator.unknownKnowledgeUsage,
            KantValidator.inversionFunctionWithWrongNumberOfParameters,
            KantValidator.knowledgeReferenceSpreadingOfNonSetOrNonListValues,
            KantValidator.knowledgeReferenceSpreadingOfWrongValueForTargetValue,
            KantValidator.duplicateKnowledgeNameInSameScope,
            KantValidator.destructuringNonSetNonListValues,
            KantValidator.variadicParameterNotLast,
            KantValidator.freshConstEqualityCheck, 
            KantValidator.variadicParameterNotListInsideSet,
            KantValidator.communicationAttemptOfKnowledgeUnknownToSender,
            KantValidator.invertedOneWayFunctions
        ],
        Communication: [
            KantValidator.duplicatePrincipalInCommunication
        ],
        AuthenticationCheck: [
            KantValidator.duplicatePrincipalInAuthenticationCheck
        ],
        Principal: [
            KantValidator.duplicatePrincipalInDeclaration
        ]
    }
    registry.register(checks, validator)
}

/**
 * Implementation of custom validations.
 */
export const KantValidator = {
    nonSetNestedKnowledgeAccess: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void> => {
        nonSetNestedKnowledgeAccess.nonSetNestedKnowledgeAccess(protocol, accept)
    },
    unknownPrincipalUsage: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void> => {
        unknownPrincipalUsage.unknownPrincipalUsage(protocol, accept)
    },
    duplicatePrincipalInCommunication: (communication: Communication, accept: ValidationAcceptor): MaybePromise<void> => {
        duplicatePrincipalInCommunication.duplicatePrincipalInCommunication(communication, accept)
    }
    ,
    duplicatePrincipalInAuthenticationCheck: (authenticationCheck: AuthenticationCheck, accept: ValidationAcceptor): MaybePromise<void> => {
        duplicatePrincipalInAuthenticationCheck.duplicatePrincipalInAuthenticationCheck(authenticationCheck, accept)
    },
    uniqueFunctionName: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void> => {
        uniqueFunctionName.uniqueFunctionName(protocol, accept)
    }
    ,
    unknownFunctionUsage: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void> => {
        unknownFunctionUsage.unknownFunctionUsage(protocol, accept)
    }
    ,
    unknownKnowledgeUsage: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void> => {
        unknownKnowledgeUsage.unknownKnowledgeUsage(protocol, accept)
    }
    ,
    communicationAttemptOfKnowledgeUnknownToSender: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void> => {
        communicationAttemptOfKnowledgeUnknownToSender.communicationAttemptOfKnowledgeUnknownToSender(protocol, accept)
    }
    ,
    inversionFunctionWithWrongNumberOfParameters: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void> => {
        invertionFunctionWithWrongNumberOfParameters.invertionFunctionWithWrongNumberOfParameters(protocol, accept)
    }
    ,
    duplicateKnowledgeNameInSameScope: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void> => {
        duplicateKnowledgeNameInSameScope.duplicateKnowledgeNameInSameScope(protocol, accept)
    }
    ,
    knowledgeReferenceSpreadingOfNonSetOrNonListValues: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void> => {
        knowledgeReferenceSpreadingOfNonSetNonListValues.knowledgeReferenceSpreadingOfNonSetNonListValues(protocol, accept)
    }
    ,
    knowledgeReferenceSpreadingOfWrongValueForTargetValue: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void> => {
        knowledgeReferenceSpreadingOfWrongValueForTargetValue.knowledgeReferenceSpreadingOfWrongValueForTargetValue(protocol, accept)  
    },
    invertedOneWayFunctions: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void> => {
        invertedOneWayFunctions.invertedOneWayFunctions(protocol, accept)
    },
    destructuringNonSetNonListValues: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void> => {
        destructuringNonSetNonListValues.destructuringNonSetNonListValues(protocol, accept)
    },
    variadicParameterNotLast: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void> => {
        variadicParameterNotLast.variadicParameterNotLast(protocol, accept)
    },
    variadicParameterNotListInsideSet: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void> => {
        variadicParamsNotListInsideSet.variadicParamsNotListInsideSet(protocol, accept)
    },
    freshConstEqualityCheck: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void> => {
        freshConstInEqualityCheck.freshConstInEqualityCheck(protocol, accept)
    },
    duplicatePrincipalInDeclaration: (principal: Principal, accept: ValidationAcceptor): MaybePromise<void> => {
        duplicatePrincipalInDeclaration.duplicatePrincipalInDeclaration(principal, accept)
    }
}

export type KantValidator = typeof KantValidator
