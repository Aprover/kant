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
                        
                        for(let h=0;h<paramKeysNames.length;h++){
                            let iter=paramKeysNames[h]!
                            //accept("error",`You used an incorrect h: "${correctKeysTypes[h]}"`,{ node: i })
                            if(isKnowledgeRef(iter)){
                                
                                if (
                                    knowledgeClass.getGlobalKnowledgeDescriptorMap().get(iter.ref)?.getType() !==
                                        correctKeysTypes[h] &&
                                    correctKeysTypes[h] !== "BitString"
                                ) {
                                    accept(
                                        "error",
                                        `Incorrect keys type: "${knowledgeClass
                                            .getGlobalKnowledgeDescriptorMap()
                                            .get(iter.ref)
                                            ?.getType()}", the invoked function requires a key of type "${
                                            correctKeysTypes[h]
                                        }."`,
                                        { node: iter }
                                    )
                                    
                                }
                            }
                            if(isListAccess(iter)){
                                
                                if (
                                    knowledgeClass
                                        .getGlobalKnowledgeDescriptorMap()
                                        .get(iter.ref.concat("[" + iter.index + "]"))
                                        ?.getType() !== correctKeysTypes[h] &&
                                    correctKeysTypes[h] !== "BitString"
                                ) {
                                    accept(
                                        "error",
                                        `Incorrect key type: "${knowledgeClass
                                            .getGlobalKnowledgeDescriptorMap()
                                            .get(iter.ref.concat("[" + iter.index + "]"))
                                            ?.getType()}", the invoked function requires a key of type "${
                                            correctKeysTypes[h]
                                        }."`,
                                        { node: iter }
                                    )
                                    
                                }
                            }
                        }
                       
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
