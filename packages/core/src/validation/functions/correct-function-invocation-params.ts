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
                        for(let h=0;h<paramNames.length;h++){
                            let iter=paramNames[h]!
                            if(isKnowledgeRef(iter)){
                                if (
                                    knowledgeClass.getGlobalKnowledgeDescriptorMap().get(iter.ref)?.getType() !==
                                        correctParamTypes[h] &&
                                    correctParamTypes[h] !== "BitString"
                                ) {
                                    accept(
                                        "error",
                                        `Incorrect param type: "${knowledgeClass
                                            .getGlobalKnowledgeDescriptorMap()
                                            .get(iter.ref)
                                            ?.getType()}", the invoked function requires a parameter of type "${
                                            correctParamTypes[h]
                                        }."`,
                                        { node: i }
                                    )
                                }

                            }
                            if(isListAccess(iter)){
                                if (
                                    knowledgeClass
                                        .getGlobalKnowledgeDescriptorMap()
                                        .get(iter.ref.concat("[" + iter.index + "]"))
                                        ?.getType() !== correctParamTypes[h] &&
                                    correctParamTypes[h] !== "BitString"
                                ) {
                                    accept(
                                        "error",
                                        `Incorrect param type: "${knowledgeClass
                                            .getGlobalKnowledgeDescriptorMap()
                                            .get(iter.ref.concat("[" + iter.index + "]"))
                                            ?.getType()}", the invoked function requires a parameter of type "${
                                            correctParamTypes[h]
                                        }."`,
                                        { node: i }
                                    )
                                }
                            }
                        }

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
