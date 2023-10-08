import { getContainerOfType, MaybePromise, streamAllContents, ValidationAcceptor } from "langium"
import { isKnowledgeFromFunction, isKnowledgeRef, isListAccess, isPropertyDef, Protocol } from "../../generated/ast"
import { KnowledgeClass } from "../../KnowledgeClass"

export const correctFunctionInvocationParams = {
    correctFunctionInvocationParams: (
        knowledgeClass: KnowledgeClass,
        protocol: Protocol,
        accept: ValidationAcceptor
    ): MaybePromise<void> => {
        const functionToCheckMap = knowledgeClass.getFunctionCardinalityMap()
        streamAllContents(protocol)
            .filter(isKnowledgeFromFunction)
            .forEach(i => {
                if (functionToCheckMap.get(i)) {
                    if (getContainerOfType(i, isPropertyDef) === undefined) {
                        let correctParamTypes: string[] = []
                        i.invoked.ref?.typeParams.forEach(param => {
                            correctParamTypes.push(param.type.ref?.name!)
                        })

                        let paramNames = i.args.args
                        let k = 0
                        paramNames.filter(isKnowledgeRef).forEach(pref => {
                            if (
                                knowledgeClass.getGlobalKnowledgeDescriptorMap().get(pref.ref)?.getType() !==
                                    correctParamTypes[k] &&
                                correctParamTypes[k] !== "BitString"
                            ) {
                                accept(
                                    "error",
                                    `You used an incorrect param type: "${knowledgeClass
                                        .getGlobalKnowledgeDescriptorMap()
                                        .get(pref.ref)
                                        ?.getType()}", while the invoked function requires a parameter of type "${
                                        correctParamTypes[k]
                                    }."`,
                                    { node: i }
                                )
                            }

                            k++
                        })

                        let h = 0
                        paramNames.filter(isListAccess).forEach(la => {
                            if (
                                knowledgeClass
                                    .getGlobalKnowledgeDescriptorMap()
                                    .get(la.ref.concat("[" + la.index + "]"))
                                    ?.getType() !== correctParamTypes[h] &&
                                correctParamTypes[h] !== "BitString"
                            ) {
                                accept(
                                    "error",
                                    `You used an incorrect param type: "${knowledgeClass
                                        .getGlobalKnowledgeDescriptorMap()
                                        .get(la.ref.concat("[" + la.index + "]"))
                                        ?.getType()}", while the invoked function requires a parameter of type "${
                                        correctParamTypes[h]
                                    }."`,
                                    { node: i }
                                )
                            }
                            h++
                        })

                        paramNames.filter(isKnowledgeFromFunction).forEach(kff => {
                            if (getContainerOfType(kff, isPropertyDef) === undefined) {
                                accept("error", `Cannot use function call as parameter.`, { node: i })
                            }
                        })
                    }
                }
            })
    }
}
