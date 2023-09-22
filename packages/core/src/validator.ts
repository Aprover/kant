import type { MaybePromise, ValidationAcceptor, ValidationChecks } from "langium"
import type { Protocol } from "./generated/ast"
import { type KantAstType } from "./generated/ast"
import type { KantServices } from "./module"
import { noSelfCommunication } from "./validation/functions/no-self-communication"
import { arrayNotationList } from "./validation/functions/array-notation-list"
import { asymmetricEncryptionValidation } from "./validation/functions/asymmetric-encryption"
import { consecutiveCommunications } from "./validation/functions/consecutive-communication"
import { debug } from "./validation/functions/debug"
import { decParams } from "./validation/functions/dec-params"
import { encParams } from "./validation/functions/enc-params"
import { functionsAllCaps } from "./validation/functions/functions-all-caps"
import { inversionFunctionWithWrongNumberOfParameters } from "./validation/functions/inversion-function-wrong-parameters"
import { invertedOneWay } from "./validation/functions/inverted-one-way"
import { knowledgeDeclarationBeforeUsage } from "./validation/functions/knowledge-declaration-before-usage"
import { knowledgeInSharedDef } from "./validation/functions/knowledge-in-shared-def"
import { checkKnowledgeKnownToSender } from "./validation/functions/knowledge-known-to-sender"
import { knowledgeShouldStartWithLowelcase } from "./validation/functions/knowledge-should-start-with-lowercase"
import { minimumPrincipalsPerProtocol } from "./validation/functions/minimum-principal-per-protocol"
import { nestedKnowledgeAccess } from "./validation/functions/nested-knowledge-access"
import { noDuplicationInCommunicationReceivers } from "./validation/functions/no-duplication-communication-receivers"
import { noFreshConstEquality } from "./validation/functions/no-fresh-const-equality"
import { noSelfAuthentication } from "./validation/functions/no-self-authentication"
import { noUnusedPrincipals } from "./validation/functions/no-unused-principals"
import { onlyRefInAuthenticationCheck } from "./validation/functions/only-ref-in-authentication-check"
import { onlyRefInKnowledgeCheck } from "./validation/functions/only-ref-in-knowledge-check"
import { pkeDecParamsKeys } from "./validation/functions/pke-dec-params-keys"
import { pkeEncParamsKeys } from "./validation/functions/pke-enc-params-keys"
import { principalShoudlStartWithCapitalLetter } from "./validation/functions/principal-should-start-with-capital-letter"
import { pubGenParams } from "./validation/functions/pub-gen-params"
import { referenceSpreadingFunctionParams } from "./validation/functions/reference-spreading-function-params"
import { symmetricEncryption } from "./validation/functions/symmetric-encryption"
import { uniqueCommunicationNames } from "./validation/functions/unique-communication-names"
import { uniqueFunctionNames } from "./validation/functions/unique-function-names"
import { uniqueKnowledgeNames } from "./validation/functions/unique-knowledge-names"
import { uniquePrincipalNames } from "./validation/functions/unique-principal-names"
import { uniqueScenarioNames } from "./validation/functions/unique-scenario-names"
import { variadicParameterNotLast } from "./validation/functions/variadic-parameter-not-last"


/**
 * Register custom validation checks.
 */
export function registerValidationChecks(services: KantServices): void {
    const registry = services.validation.ValidationRegistry
    const validator = services.validation.KantValidator
    const checks: ValidationChecks<KantAstType> = {
        Protocol: [
            //KantValidator.debug,
            KantValidator.uniqueKnowledgeNames,
            KantValidator.uniquePrincipalNames,
            KantValidator.noSelfCommunication,
            KantValidator.principalShouldStartWithCapitalLetter,
            KantValidator.noUnusedPrincipals,
            KantValidator.noSelfAuthentication,
            KantValidator.noDuplicationInCommunicationReceivers,
            KantValidator.minimumPrincipalsPerProtocol,
            KantValidator.knowledgeShouldStartWithLowercase,
            KantValidator.onlyRefInKnowledgeCheck,
            KantValidator.onlyRefInAuthenticationCheck,
            KantValidator.noFreshConstEquality,
            KantValidator.uniqueCommunicationNames,
            KantValidator.uniqueScenarioNames,
            KantValidator.uniqueFunctionNames,
            KantValidator.functionsAllCaps,
            KantValidator.knowledgeKnownToSender,
            KantValidator.knowledgeInSharedDef,
            KantValidator.invertedOneWay,
            KantValidator.consecutiveCommunication,
            KantValidator.arrayNotationList,
            KantValidator.nestedKnowledgeAccess,
            KantValidator.knowledgeDeclarationBeforeUsage,
            KantValidator.inversionFunctionWithWrongNumberOfParameters,
            KantValidator.variadicParameterNotLast,
            KantValidator.referenceSpreadingFunctionParams,
            KantValidator.pubGenParams,
            KantValidator.asymmetricEncryption,
            KantValidator.pkeEncParamsKeys,
            KantValidator.pkeDecParamsKeys,
            KantValidator.symmetricEncryption,
            KantValidator.encParams,
            KantValidator.decParams
        ]
    }
    registry.register(checks, validator)
}

/**
 * Implementation of custom validations.
 */
export const KantValidator = {
    debug: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void> => {
        debug.debug(protocol, accept)
    },
    uniqueKnowledgeNames: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void> => {
        uniqueKnowledgeNames.uniqueKnowledgeNames(protocol, accept)
    },
    uniquePrincipalNames: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void> => {
        uniquePrincipalNames.uniquePrincipalNames(protocol, accept)
    },
    noSelfCommunication: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void> => {
        noSelfCommunication.noSelfCommunication(protocol, accept)
    },
    principalShouldStartWithCapitalLetter: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void> => {
        principalShoudlStartWithCapitalLetter.principalShoudlStartWithCapitalLetter(protocol, accept)
    },
    noUnusedPrincipals: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void> => {
        noUnusedPrincipals.noUnusedPrincipals(protocol, accept)
    },
    noSelfAuthentication: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void> => {
        noSelfAuthentication.noSelfAuthentication(protocol, accept)
    },
    noDuplicationInCommunicationReceivers: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void> => {
        noDuplicationInCommunicationReceivers.noDuplicationInCommunicationReceivers(protocol, accept)
    },
    minimumPrincipalsPerProtocol: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void> => {
        minimumPrincipalsPerProtocol.minimumPrincipalsPerProtocol(protocol, accept)
    },
    knowledgeShouldStartWithLowercase: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void> => {
        knowledgeShouldStartWithLowelcase.knowledgeShouldStartWithLowelcase(protocol, accept)
    },
    onlyRefInKnowledgeCheck: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void> => {
        onlyRefInKnowledgeCheck.onlyRefInKnowledgeCheck(protocol, accept)
    },
    onlyRefInAuthenticationCheck: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void> => {
        onlyRefInAuthenticationCheck.onlyRefInAuthenticationCheck(protocol, accept)
    },
    noFreshConstEquality: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void> => {
        noFreshConstEquality.noFreshConstEquality(protocol, accept)
    },
    uniqueCommunicationNames: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void> => {
        uniqueCommunicationNames.uniqueCommunicationNames(protocol, accept)
    },
    uniqueScenarioNames: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void> => {
        uniqueScenarioNames.uniqueScenarioNames(protocol, accept)
    },
    uniqueFunctionNames: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void> => {
        uniqueFunctionNames.uniqueFunctionNames(protocol, accept)
    },
    functionsAllCaps: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void> => {
        functionsAllCaps.functionsAllCaps(protocol, accept)
    },
    knowledgeKnownToSender: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void> => {
        checkKnowledgeKnownToSender.checkKnowledgeKnownToSender(protocol, accept)
    },
    knowledgeInSharedDef: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void> => {
        knowledgeInSharedDef.knowledgeInSharedDef(protocol, accept)
    },
    invertedOneWay: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void> => {
        invertedOneWay.invertedOneWay(protocol, accept)
    },
    consecutiveCommunication: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void> => {
        consecutiveCommunications.consecutiveCommunications(protocol, accept)
    },
    arrayNotationList: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void> => {
        arrayNotationList.arrayNotationList(protocol, accept)
    },
    nestedKnowledgeAccess: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void> => {
        nestedKnowledgeAccess.nestedKnowledgeAccess(protocol, accept)
    },
    knowledgeDeclarationBeforeUsage: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void> => {
        knowledgeDeclarationBeforeUsage.knowledgeDeclarationBeforeUsage(protocol, accept)
    },
    referenceSpreadingFunctionParams: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void> => {
        referenceSpreadingFunctionParams.referenceSpreadingFunctionParams(protocol, accept)
    },
    inversionFunctionWithWrongNumberOfParameters: (
        protocol: Protocol,
        accept: ValidationAcceptor
    ): MaybePromise<void> => {
        inversionFunctionWithWrongNumberOfParameters.inversionFunctionWithWrongNumberOfParameters(protocol, accept)
    },
    variadicParameterNotLast: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void> => {
        variadicParameterNotLast.variadicParameterNotLast(protocol, accept)
    },
    pubGenParams: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void> => {
        pubGenParams.pubGenParams(protocol, accept)
    },
    asymmetricEncryption: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void> => {
        asymmetricEncryptionValidation.asymmetricEncryptionValidation(protocol, accept)
    },
    pkeEncParamsKeys: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void> => {
        pkeEncParamsKeys.pkeEncParamsKeys(protocol, accept)
    },
    pkeDecParamsKeys: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void> => {
        pkeDecParamsKeys.pkeDecParamsKeys(protocol, accept)
    },
    symmetricEncryption: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void> => {
        symmetricEncryption.symmetricEncryption(protocol, accept)
    },
    encParams: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void> => {
        encParams.encParams(protocol, accept)
    },
    decParams: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void> => {
        decParams.decParams(protocol, accept)
    }
}

export type KantValidator = typeof KantValidator
