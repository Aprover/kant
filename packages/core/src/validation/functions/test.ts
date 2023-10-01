import { ValidationAcceptor, streamAllContents } from "langium";
import { Protocol, isKnowledgeDef, isKnowledgeDefBuiltin, isKnowledgeDefCustom, isKnowledgeDefCustomName, isKnowledgeFromFunction, isKnowledgeFromFunctionArgs, isKnowledgeFromFunctionArgsElements, isKnowledgeList, isKnowledgeRef, isKnowledgeSet } from "../../generated/ast";
import { KnowledgeClass } from "../../KnowledgeClass";

export const test = {
    test: (knowledgeClass: KnowledgeClass, protocol: Protocol, accept: ValidationAcceptor): void => {
        streamAllContents(protocol)
            .filter(isKnowledgeDef)
            .forEach(kd => {
                if (isKnowledgeDefBuiltin(kd)) {
                    if (kd.type !== 'state') {
                        // fresh e const
                        kd.name.forEach(kn => {
                            knowledgeClass.addNewGlobalKnowledge(kn)
                        })
                    }
                } 

                if (isKnowledgeDefCustom(kd)) {
                    if (isKnowledgeFromFunction(kd.value)) {
                        const functionName = kd.value.invoked.ref?.name
                        switch (functionName) {
                            case "MAC":
                            case "PW_HASH":    
                            case "SIGN":
                            case "HASH":
                            case "DF":
                            case "PUB_GEN": {
                                // valore nuovo
                                if (isKnowledgeDefCustomName(kd.left)) {
                                    const knowledgeName = kd.left.name
                                    knowledgeClass.addNewGlobalKnowledge(knowledgeName)
                                }
                                break;
                            }
                            case "CONCAT": {
                                if (isKnowledgeDefCustomName(kd.left)) {
                                    const knowledgeName = kd.left.name
                                    knowledgeClass.addNewGlobalKnowledge(knowledgeName) 

                                    let tempArr: string[] = []
                                    // TODO
                                    // parametri di CONCAT possono essere solo ref
                                    if (isKnowledgeFromFunctionArgsElements(kd.value.args)) {
                                        kd.value.args.args.forEach(arg => {
                                            if (isKnowledgeRef(arg)) {
                                                tempArr.push(arg.ref)
                                            }
                                        })
                                    }

                                    let i
                                    for (i = 0; i < tempArr.length; i++) {
                                        let e = tempArr[i]
                                        let index=0
                                        if (e) {
                                            index=knowledgeClass.addAliasGlobalKnowledge(knowledgeName.concat("[" + i + "]"), e)!
                                            knowledgeClass.addNodePointer(knowledgeName,index)
                                        }
                                    }

                                }
                                // valore nuovo 
                                // modificare globalKnowledge
                                // modificare listKnowledge (array puntatori ai valori delle lista)
                                break;
                            }
                            case "SPLIT": {
                                if (isKnowledgeDefCustomName(kd.left)) {
                                    const knowledgeSplit = kd.left.name
                                    if (isKnowledgeFromFunctionArgsElements(kd.value.args)) {
                                        const functionParam = kd.value.args.args
                                        // TODO
                                        /* if (isKnowledgeList(functionParam)) {
                                            // warning 
                                        } 
                                        if (isKnowledgeSet(functionParam)) {
                                            // warning 
                                        }  */
                                        if (isKnowledgeRef(functionParam)) {
                                            const paramName = functionParam.access
                                            if (paramName[0]) {
                                                knowledgeClass.addAliasGlobalKnowledge(knowledgeSplit, paramName[0])
                                                //da controllare la correttezza
                                                knowledgeClass.cloneNodePoiter(paramName[0])
                                            }
                                        }
                                    }
                                    
                                }
                                // alias
                                // modificare globalKnowledge
                                // modificare listKnowledge (array puntatori ai valori delle lista)
                                break;
                            }
                            case "ENC":
                            case "PKE_ENC":
                            case "AEAD_ENC": 
                            case "DEC":
                            case "PKE_DEC":
                            case "AEAD_DEC": {
                                // creano alias
                                if (isKnowledgeDefCustomName(kd.left)) {
                                    const knowledgeName = kd.left.name
                                    if (isKnowledgeFromFunctionArgsElements(kd.value.args)) {
                                        const functionParam = kd.value.args.args
                                        // TODO
                                        /* if (isKnowledgeList(functionParam)) {
                                            // warning 
                                        } 
                                        if (isKnowledgeSet(functionParam)) {
                                            // warning 
                                        }  */
                                        if (isKnowledgeRef(functionParam)) {
                                            const paramName = functionParam.access
                                            if (paramName[0]) {
                                                knowledgeClass.addAliasGlobalKnowledge(knowledgeName, paramName[0])
                                            }
                                        }
                                    }
                                    
                                }
                                break;
                            }
                            case "HKDF": {
                                // crea 5 valori nuovi (fresh)
                                break;
                            }
                        }
                    }
                }
            })
    }
}