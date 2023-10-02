import { MaybePromise, type ValidationAcceptor, type ValidationChecks } from "langium"
import { Protocol } from "./generated/ast"
import { type KantAstType } from "./generated/ast"
import type { KantServices } from "./module"
import { consecutiveCommunications } from "./validation/functions/consecutive-communication"
import { debug } from "./validation/functions/debug"
import { functionsAllCaps } from "./validation/functions/functions-all-caps"
import { inversionFunctionWithWrongNumberOfParameters } from "./validation/functions/inversion-function-wrong-parameters"
import { invertedOneWay } from "./validation/functions/inverted-one-way"
import { knowledgeDeclarationBeforeUsage } from "./validation/functions/knowledge-declaration-before-usage"
import { knowledgeInSharedDef } from "./validation/functions/knowledge-in-shared-def"
import { knowledgeShouldStartWithLowelcase } from "./validation/functions/knowledge-should-start-with-lowercase"
import { minimumPrincipalsPerProtocol } from "./validation/functions/minimum-principal-per-protocol"
import { nestedKnowledgeAccess } from "./validation/functions/nested-knowledge-access"
import { noDuplicationInCommunicationReceivers } from "./validation/functions/no-duplication-communication-receivers"
import { noFreshConstEquality } from "./validation/functions/no-fresh-const-equality"
import { noSelfAuthentication } from "./validation/functions/no-self-authentication"
import { noSelfCommunication } from "./validation/functions/no-self-communication"
import { noUnusedPrincipals } from "./validation/functions/no-unused-principals"
import { onlyRefInAuthenticationCheck } from "./validation/functions/only-ref-in-authentication-check"
import { onlyRefInKnowledgeCheck } from "./validation/functions/only-ref-in-knowledge-check"
import { pkeDecParamsKeys } from "./validation/functions/pke-dec-params-keys"
import { pkeEncParamsKeys } from "./validation/functions/pke-enc-params-keys"
import { principalShoudlStartWithCapitalLetter } from "./validation/functions/principal-should-start-with-capital-letter"
import { pubGenParams } from "./validation/functions/pub-gen-params"
import { referenceSpreadingFunctionParams } from "./validation/functions/reference-spreading-function-params"
import { uniqueCommunicationNames } from "./validation/functions/unique-communication-names"
import { uniqueFunctionNames } from "./validation/functions/unique-function-names"
import { uniqueKnowledgeNames } from "./validation/functions/unique-knowledge-names"
import { uniquePrincipalNames } from "./validation/functions/unique-principal-names"
import { uniqueScenarioNames } from "./validation/functions/unique-scenario-names"
import { variadicParameterNotLast } from "./validation/functions/variadic-parameter-not-last"
import { symmetricEncryption } from "./validation/functions/symmetric-encryption"
import { encParams } from "./validation/functions/enc-params"
import { decParams } from "./validation/functions/dec-params"
import { checkKnowledgeKnownToSender } from "./validation/functions/knowledge-known-to-sender"
import { asymmetricEncryptionValidation } from "./validation/functions/asymmetric-encryption"
import { emptyList } from "./validation/functions/empty-lists"
import { identifierWithNoValue } from "./validation/functions/identifier-with-no-value"
import { keysAreDeclared } from "./validation/functions/keys-are-declared"
import { emptySet } from "./validation/functions/empty-set"
import { knowledgeKnownToPrincipal } from "./validation/functions/knowledge-known-to-principal"
import { test } from "./validation/functions/test"
import { printBool } from "./validation/functions/print-bool"
import { KnowledgeClass } from "./KnowledgeClass"
//import { knowledgeRetrieve } from "./validation/functions/knowledge-retrieve"

// QUI STRUTTURE DATI CONDIVISE DALLE FUNZIONI
let globalDescription = new KnowledgeClass();

/**
 * Register custom validation checks.
 */
export function registerValidationChecks(services: KantServices): void {
    const registry = services.validation.ValidationRegistry
    const validator = services.validation.KantValidator

    const checks: ValidationChecks<KantAstType> = {
        Protocol: [
            KantValidator.test,
            KantValidator.printBool,
            /* KantValidator.debug,
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
            KantValidator.decParams,
            KantValidator.emptyList,
            KantValidator.identifierWithNoValue,
            KantValidator.keysAreDeclared,
            KantValidator.emtpySet,
            KantValidator.knowledgeKnownToPrincipal, */
        ]
    }
    registry.register(checks, validator)
}

/**
 * Implementation of custom validations.
 */
export const KantValidator = {
    test: (protocol: Protocol) => {
        test.test(globalDescription, protocol)
    },
    printBool: (protocol: Protocol, accept: ValidationAcceptor) => {
        printBool.printBool(globalDescription, protocol, accept)
    },
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
    },
    emptyList: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void> => {
        emptyList.emptyList(protocol, accept)
    },
    identifierWithNoValue: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void> => {
        identifierWithNoValue.identifierWithNoValue(protocol, accept)
    },
    keysAreDeclared: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void> => {
        keysAreDeclared.keysAreDeclared(protocol, accept)
    },
    emtpySet: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void> => {
        emptySet.emptySet(protocol, accept)
    },
    knowledgeKnownToPrincipal: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void> => {
        knowledgeKnownToPrincipal.knowledgeKnownToPrincipal(protocol, accept)
    }
}

export type KantValidator = typeof KantValidator
