import { type ValidationAcceptor, type ValidationChecks , type MaybePromise} from "langium"
import { Protocol } from "./generated/ast"
import { type KantAstType } from "./generated/ast"
import type { KantServices } from "./module"
import { knowledgeRetrieval } from "./validation/functions/knowledge-retrieval"
import { printBool } from "./validation/functions/print-bool"
import { KnowledgeClass } from "./KnowledgeClass" 
//import { debug } from "./validation/functions/debug"
import { uniqueFunctionNames } from "./validation/functions/unique-function-names"
import { uniqueKnowledgeNames } from "./validation/functions/unique-knowledge-names"
import { uniquePrincipalNames } from "./validation/functions/unique-principal-names"
import { noSelfCommunication } from "./validation/functions/no-self-communication"
import { principalShoudlStartWithCapitalLetter } from "./validation/functions/principal-should-start-with-capital-letter"
import { noUnusedPrincipals } from "./validation/functions/no-unused-principals"
import { noSelfAuthentication } from "./validation/functions/no-self-authentication"
import { noDuplicationInCommunicationReceivers } from "./validation/functions/no-duplication-communication-receivers"
import { minimumPrincipalsPerProtocol } from "./validation/functions/minimum-principal-per-protocol"
import { knowledgeShouldStartWithLowelcase } from "./validation/functions/knowledge-should-start-with-lowercase"
import { onlyRefInKnowledgeCheck } from "./validation/functions/only-ref-in-knowledge-check"
import { onlyRefInAuthenticationCheck } from "./validation/functions/only-ref-in-authentication-check"
import { noFreshConstEquality } from "./validation/functions/no-fresh-const-equality"
import { uniqueCommunicationNames } from "./validation/functions/unique-communication-names"
import { uniqueScenarioNames } from "./validation/functions/unique-scenario-names"
import { functionsAllCaps } from "./validation/functions/functions-all-caps"
import { consecutiveCommunications } from "./validation/functions/consecutive-communication"
//import { sameFunctionDefParamCardinality } from "./validation/functions/same-function-def-param-number"
import { listAccesPointsToList } from "./validation/functions/list-access-points-to-list"
import { invertedOneWay } from "./validation/functions/inverted-one-way"
import { sameFunctionDefParamCardinality } from "./validation/functions/same-function-def-param-number"
import { correctFunctionInvocationParams } from "./validation/functions/correct-function-invocation-params"
//import { variadicParameterNotLast } from "./validation/functions/variadic-parameter-not-last"
//import { sameFunctionDefParamCardinality } from "./validation/functions/same-function-def-param-number"


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
            KantValidator.knowledgeRetrieval,
            KantValidator.printBool,
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
            //KantValidator.sam
            KantValidator.consecutiveCommunication,
            KantValidator.sameFunctionDefParamNumber,            
            //KantValidator.variadicParameterNotLast,
            KantValidator.listAccessPointsToList,
            KantValidator.invertedOneWay,
            KantValidator.correctFunctionInvocationParams
        ]
    }
    registry.register(checks, validator)
}

/**
 * Implementation of custom validations.
 */
export const KantValidator = {
    knowledgeRetrieval: (protocol: Protocol) => {
        knowledgeRetrieval.knowledgeRetrieval(globalDescription, protocol)
    },
    printBool: (protocol: Protocol, accept: ValidationAcceptor) => {
        printBool.printBool(globalDescription, protocol, accept)
    },/*
    debug: (protocol: Protocol, accept: ValidationAcceptor) => {
        debug.debug(protocol, accept)
    },*/
    uniqueKnowledgeNames: (protocol: Protocol, accept: ValidationAcceptor):MaybePromise<void> => {
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
    consecutiveCommunication: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void> => {
        consecutiveCommunications.consecutiveCommunications(protocol, accept)
    },/* 
    variadicParameterNotLast: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void> => {
        variadicParameterNotLast.variadicParameterNotLast(protocol, accept)
    }, */
    sameFunctionDefParamNumber: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void> => {
        sameFunctionDefParamCardinality.sameFunctionDefParamCardinality(globalDescription, protocol, accept)
    },
    listAccessPointsToList: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void> => {
        listAccesPointsToList.listAccesPointsToList(globalDescription, protocol, accept)
    },
    invertedOneWay: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void> => {
        invertedOneWay.invertedOneWay(protocol, accept)
    },
    correctFunctionInvocationParams: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void> => {
        correctFunctionInvocationParams.correctFunctionInvocationParams(globalDescription, protocol, accept)
    }
}

export type KantValidator = typeof KantValidator
