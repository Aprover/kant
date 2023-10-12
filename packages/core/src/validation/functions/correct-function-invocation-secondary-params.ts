import { getContainerOfType, MaybePromise, streamAllContents, ValidationAcceptor } from "langium"
import { isKnowledgeFromFunction, isKnowledgeRef, isListAccess, isPropertyDef, Protocol } from "../../generated/ast"
import { KnowledgeClass } from "../../KnowledgeClass"

export const correctFunctionInvocationSecondaryParams = {
    correctFunctionInvocationSecondaryParams: (
        knowledgeClass: KnowledgeClass,
        protocol: Protocol,
        accept: ValidationAcceptor
    ): MaybePromise<void> => {
        const functionToCheckMap = knowledgeClass.getFunctionSecondaryCardinalityMap()
        streamAllContents(protocol)
            .filter(isKnowledgeFromFunction)
            .forEach(i => {
                if (functionToCheckMap.get(i)) {
                    if (getContainerOfType(i, isPropertyDef) === undefined) {
                        let correctKeysTypes: string[] = []
                        i.invoked.ref?.key?.elements.forEach(key => {
                            correctKeysTypes.push(key.type.type.ref?.name!)
                        })

                        let paramKeysNames = i.keys
                        let k = 0
                        paramKeysNames.filter(isKnowledgeRef).forEach(pk => {
                            if (
                                knowledgeClass.getGlobalKnowledgeDescriptorMap().get(pk.ref)?.getType() !==
                                    correctKeysTypes[k] &&
                                correctKeysTypes[k] !== "BitString"
                            ) {
                                accept(
                                    "error",
                                    `You used an incorrect keys type: "${knowledgeClass
                                        .getGlobalKnowledgeDescriptorMap()
                                        .get(pk.ref)
                                        ?.getType()}", while the invoked function requires a key of type "${
                                        correctKeysTypes[k]
                                    }."`,
                                    { node: i }
                                )
                            }
                           


                            k++
                        })

                        let h = 0
                        paramKeysNames.filter(isListAccess).forEach(la => {
                            if (
                                knowledgeClass
                                    .getGlobalKnowledgeDescriptorMap()
                                    .get(la.ref.concat("[" + la.index + "]"))
                                    ?.getType() !== correctKeysTypes[h] &&
                                correctKeysTypes[h] !== "BitString"
                            ) {
                                accept(
                                    "error",
                                    `You used an incorrect param type: "${knowledgeClass
                                        .getGlobalKnowledgeDescriptorMap()
                                        .get(la.ref.concat("[" + la.index + "]"))
                                        ?.getType()}", while the invoked function requires a parameter of type "${
                                        correctKeysTypes[h]
                                    }."`,
                                    { node: i }
                                )
                            }
                            h++
                        })
                        /*
                        paramNames.filter(isKnowledgeFromFunction).forEach(kff => {
                            if (getContainerOfType(kff, isPropertyDef) === undefined) {
                                accept("error", `Cannot use function call as parameter.`, { node: i })
                            }
                        })
                        */
                    }
                }
            })
    }
}
