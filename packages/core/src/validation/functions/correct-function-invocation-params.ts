import { MaybePromise, ValidationAcceptor, streamAllContents } from "langium";
import { KnowledgeClass } from "../../KnowledgeClass";
import { Protocol, isKnowledgeDef, isKnowledgeDefBuiltin, isKnowledgeDefCustom, isKnowledgeDefCustomName, isKnowledgeFromFunction, isKnowledgeRef } from "../../generated/ast";

export const correctFunctionInvocationParams = {
    correctFunctionInvocationParams: (knowledgeClass: KnowledgeClass, protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void> => {
        const functionToCheckMap = knowledgeClass.getFunctionCardinalityMap()
        streamAllContents(protocol)
            .filter(isKnowledgeFromFunction)
            .forEach(i => {
                if (functionToCheckMap.get(i)) {
                    
                    let correctParamTypes: string[] = []
                    i.invoked.ref?.typeParams.forEach(param => {
                        correctParamTypes.push(param.type.ref?.name!)
                    })

                    //[Bitstring, Ciphertext,...]
                    
                    let usedParamTypes: string[] = []

                    let first: string = ""
                    i.args.args.forEach(r => {
                        if (isKnowledgeRef(r)) {
                            const globalKnowledge = knowledgeClass.getGlobalKnowledge()
                            globalKnowledge.forEach(list => {
                                for (let i = 0; i < list.size(); i++) {
                                    if (list.get(i) === r.ref) {
                                        first = list.get(0)
                                        const listNodePointer = knowledgeClass.getListNodePointerKnowledge()
                                        if (listNodePointer.get(first)?.length! > 0) {
                                            usedParamTypes.push("Bitstring")
                                        } else {
                                            streamAllContents(protocol)
                                                .filter(isKnowledgeDef)
                                                .forEach(kd => {
                                                    if (isKnowledgeDefBuiltin(kd)) {
                                                        // const fresh 
                                                        /* for (let i = 0; i < j)
                                                        kd.name.forEach(n => {
                                                            if (n === first) {
                                                                usedParamTypes.push(kd.customType)
                                                            }
                                                        }) */
                                                    } else if (isKnowledgeDefCustom(kd)) {
                                                        // chiamate a funzioni
                                                        if (isKnowledgeDefCustomName(kd.left)) {
                                                            if (isKnowledgeFromFunction(kd.value)) {
                                                                kd.value.invoked.ref?.typeParams.forEach(type => {
                                                                    usedParamTypes.push(type.type.ref?.name!)
                                                                })
                                                            }
                                                        }
                                                    }
                                                })
                                        }
                                    }
                                }
                            })
                        }
                    })

                    for (let j = 0; j < usedParamTypes.length; j++) {
                        if (correctParamTypes[j] !== usedParamTypes[j]) {
                            accept('error', `You used an incorrect param type: "${usedParamTypes[j]}", while the invoked function requires a parameter of type "${correctParamTypes[j]}."`, { node: i })
                        }
                    }

                }
            })
    }
}