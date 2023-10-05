import { streamAllContents, type MaybePromise, type ValidationAcceptor } from "langium"
import { isScenario, type Protocol } from "../../generated/ast"

export const uniqueScenarioNames = {
    uniqueScenarioNames: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void> => {
        const scenarioNames = new Set<string>()
        streamAllContents(protocol)
            .filter(isScenario)
            .forEach(s => {
                if (s.name !== undefined) {
                    if (scenarioNames.has(s.name)) {
                        accept(`error`, `Scenario name "${s.name}" already used.`, { node: s })
                    }
                    scenarioNames.add(s.name)
                }
            })
    }
}
