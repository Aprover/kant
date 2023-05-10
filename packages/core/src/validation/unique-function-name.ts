import { MaybePromise, ValidationAcceptor, streamAllContents } from "langium"
import { Protocol, isFunctionDef } from "../generated/ast"

export const uniqueFunctionName = {
    /**
     * 
     * @param protocol 
     * @param accept 
     */
    uniqueFunctionName: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void> => {

        const functions = new Set<string>()

        streamAllContents(protocol).filter(isFunctionDef).forEach(fd => {
            if (functions.has(fd.name)) {
                accept(`error`, `Function definition already exists with same name "${fd.name}"`, { node: fd })
            } else {
                functions.add(fd.name)
            }
        })

        /* const alreadyDefinedNames = new Set<string>()
        protocol.elements.filter(isFunctionDef).forEach(functionDef => {
            if (alreadyDefinedNames.has(functionDef.name)) {
                accept(`error`, `Function definition already exists with same name "${functionDef.name}"`, { node: functionDef })
            } else {
                alreadyDefinedNames.add(functionDef.name)
            }
        })
        protocol.elements.filter(isScenarioBranching).forEach(scenarioBranching => {
            checkUniqueFunctionNameInScenarios(scenarioBranching, alreadyDefinedNames, accept)
        }) */
    }
}

/**
 * 
 * @param scenario 
 * @param functionNames 
 * @param accept 
 */
/* function checkUniqueFunctionNameInScenarios(scenario: ScenarioBranching, functionNames: Set<string>, accept: ValidationAcceptor): void {
    scenario.scenario.forEach(optionalScenario => {
        optionalScenario.elements.filter(isFunctionDef).forEach(optionalScenarioFunctionDef => {
            if (functionNames.has(optionalScenarioFunctionDef.name)) {
                accept(`error`, `Function definition already exists with same name "${optionalScenarioFunctionDef.name}"`, { node: optionalScenarioFunctionDef }) 
            } else {
                functionNames.add(optionalScenarioFunctionDef.name)
            }
        })            
        optionalScenario.elements.filter(isScenarioBranching).forEach(innerScenarioBranching => {
        checkUniqueFunctionNameInScenarios(innerScenarioBranching, functionNames, accept)
        })
    })
} */

