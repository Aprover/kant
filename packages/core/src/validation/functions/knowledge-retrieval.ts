import { streamAllContents} from "langium"
import {
    isCommunication,
    isFunctionDef,
    isKnowledgeDef,
    isKnowledgeDefBuiltin,
    isKnowledgeDefCustom,
    isKnowledgeDefCustomName,
    isKnowledgeFromFunction,
    isKnowledgeFromFunctionArgsElements,
    isKnowledgeRef,
    isListAccess,
    Protocol
} from "../../generated/ast"
import { KnowledgeClass } from "../../KnowledgeClass"
import { List } from "../utility/list"

/**
 * this function populates the KnowledgeClass shared object, it finds all knowledge definition/aliasing and indexes it using the methods of the shared object mentioned (addNewGlobalKnowledge/addAliasGlobalKnowledge).
 * also, it call the methods (addPrincipalToKnowledge) of the shared object to create associations between knowledge references and principals
 * finally, it call the methods (createNodePointer+cloneNodePointer) of the shared object to populate a map that contains pointers to the contents of lists of knowledge 
 */
export const knowledgeRetrieval = {
    knowledgeRetrieval: (knowledgeClass: KnowledgeClass, protocol: Protocol): void => {

        knowledgeClass.flushKnowledge()
        knowledgeClass.flushCardinality()
        streamAllContents(protocol)
            .filter(isKnowledgeDef)
            .forEach(kd => {
                if (isKnowledgeDefBuiltin(kd)) {
                    
                        // fresh e const
                        kd.name.forEach(kn => {
                            let namesList: List = new List()
                            
                            if (kd.$container.$type === 'PrincipalKnowledgeDef') {
                                kd.$container.target.forEach(principalName => {
                                    namesList.add(principalName.ref?.name!)
                                })
                            }   
                            knowledgeClass.addNewGlobalKnowledge(kn, namesList)
                        })
                        
                    
                }
            

                if (isKnowledgeDefCustom(kd)) {
                    let namesList: List = new List()
                            
                            if (kd.$container.$type === 'PrincipalKnowledgeDef') {
                                kd.$container.target.forEach(principalName => {
                                    namesList.add(principalName.ref?.name!)
                                })
                            }

                    if (isKnowledgeFromFunction(kd.value)) {
                        const functionName = kd.value.invoked
                        if (
                            functionName === "MAC" ||
                            functionName === "PW_HASH" ||
                            functionName === "SIGN" ||
                            functionName === "HASH" ||
                            functionName === "DF" ||
                            functionName === "PUB_GEN"
                        ) {
                            if (isKnowledgeDefCustomName(kd.left)) {
                                const knowledgeName = kd.left.name
                                knowledgeClass.addNewGlobalKnowledge(knowledgeName, namesList)
                            }
                        }
                        if (functionName === "CONCAT") {
                            if (isKnowledgeDefCustomName(kd.left)) {
                                const knowledgeName = kd.left.name
                                knowledgeClass.addNewGlobalKnowledge(knowledgeName, namesList)

                                let tempArr: string[] = []
                                // TODO
                                // parametri di CONCAT possono essere solo ref
                                if (isKnowledgeFromFunctionArgsElements(kd.value.args)) {
                                    const functionParam = kd.value.args.args
                                    for (let i = 0; i < functionParam.length; i++) {
                                        let x = functionParam[i]
                                        if (isKnowledgeRef(x)) {
                                            tempArr.push(x.ref)
                                        
                                        }
                                        if (isListAccess(x)) {
                                            let finalString = x.ref.concat("[" + x.index + "]")
                                            tempArr.push(finalString)
                                        }
                                    }
                                }
                                
                                for (let i = 0; i < tempArr.length; i++) {
                                    let e = tempArr[i]
                                    
                                    let index = 0
                                    if (e) {
                                        
                                        index = knowledgeClass.addAliasGlobalKnowledge(knowledgeName.concat("[" + i + "]"),e, namesList)!
                                        //accept('info', `${i}+${knowledgeClass.printc(knowledgeClass.printList)}`, { node: protocol })
                                        knowledgeClass.addNodePointer(knowledgeName, index)
                                    }
                                }
                            }
                            // valore nuovo
                            // modificare globalKnowledge
                            // modificare listKnowledge (array puntatori ai valori delle lista)
                        }
                        if (functionName === "SPLIT") {
                            if (isKnowledgeDefCustomName(kd.left)) {
                                const knowledgeSplit = kd.left.name
                                if (isKnowledgeFromFunctionArgsElements(kd.value.args)) {
                                    const functionParam = kd.value.args.args
                                    for (let i = 0; i < functionParam.length; i++) {
                                        let x = functionParam[i]
                                        if (isKnowledgeRef(x)) {
                                            knowledgeClass.addAliasGlobalKnowledge(knowledgeSplit, x.ref, namesList)
                                            knowledgeClass.cloneNodePoiter(knowledgeSplit, x.ref, namesList)
                                        }
                                        if (isListAccess(x)) {
                                            let finalString = x.ref.concat("[" + x.index + "]")
                                            knowledgeClass.addAliasGlobalKnowledge(knowledgeSplit, finalString, namesList)
                                            knowledgeClass.cloneNodePoiter(knowledgeSplit, x.ref, namesList)
                                        }
                                    }
                                    // TODO
                                    /* if (isKnowledgeList(functionParam)) {
                                            // warning 
                                        } 
                                        if (isKnowledgeSet(functionParam)) {
                                            // warning 
                                        }  */
                                    /* if (isKnowledgeRef(functionParam)) {
                                        const paramName = functionParam.access
                                        if (paramName[0]) {
                                            knowledgeClass.addAliasGlobalKnowledge(knowledgeSplit, paramName[0])
                                            //da controllare la correttezza
                                            knowledgeClass.cloneNodePoiter(paramName[0])
                                        }
                                    } */
                                }
                            }
                            // alias
                            // modificare globalKnowledge
                            // modificare listKnowledge (array puntatori ai valori delle lista)
                        }
                        if (
                            functionName === "ENC" ||
                            functionName === "PKE_ENC" ||
                            functionName === "AEAD_ENC" ||
                            functionName === "DEC" ||
                            functionName === "PKE_DEC" ||
                            functionName === "AEAD_DEC"
                        ) {
                            if (functionName === "DEC" ||
                            functionName === "PKE_DEC" ||
                            functionName === "AEAD_DEC") {
                                if (isKnowledgeFromFunctionArgsElements(kd.value.args)) {
                                    const functionParam = kd.value.args.args
                                    let firstParam: string



                                    if (isKnowledgeRef(functionParam[0])) {
                                        firstParam = functionParam[0].ref
                                        if (isKnowledgeDefCustomName(kd.left)) {
                                            //accept('info', `(entrato nel ramo if desiderato) firstParam: ${firstParam}`, { node: protocol })
                                            knowledgeClass.insertAliasDecrypt(firstParam, kd.left.name, namesList)
                                        }
                                    }
                                    if (isListAccess(functionParam[0])) {
                                        let finalString = functionParam[0].ref.concat("[" + functionParam[0].index + "]")
                                        //accept('info', `(entrato nel ramo if desiderato) firstParam: ${finalString}`, { node: protocol })
                                        if (isKnowledgeDefCustomName(kd.left))
                                        knowledgeClass.insertAliasDecrypt(finalString, kd.left.name, namesList)                                        
                                    }
                                }
                            }

                            // creano alias
                            if (isKnowledgeDefCustomName(kd.left)) {
                                const knowledgeName = kd.left.name
                                if (isKnowledgeFromFunctionArgsElements(kd.value.args)) {
                                    const functionParam = kd.value.args.args

                                    for (let i = 0; i < functionParam.length; i++) {
                                        let x = functionParam[i]
                                        if (isKnowledgeRef(x)) {
                                            knowledgeClass.addAliasGlobalKnowledge(knowledgeName, x.ref, namesList)
                                        }
                                        if (isListAccess(x)) {
                                            let finalString = x.ref.concat("[" + x.index + "]")
                                            knowledgeClass.addAliasGlobalKnowledge(knowledgeName, finalString, namesList)
                                        }
                                    }
                                    // TODO
                                    /* if (isKnowledgeList(functionParam)) {
                                            // warning 
                                        } 
                                        if (isKnowledgeSet(functionParam)) {
                                            // warning 
                                        }  */
                                    // TODO
                                    // PKE_ENC E ANCHE LE FUNZIONI DI DECIFRATURA può prendere solo un parametro (riferimento)
                                    /* if (isKnowledgeRef(functionParam)) {
                                        const paramName = functionParam.access
                                        if (paramName[0]) {
                                            knowledgeClass.addAliasGlobalKnowledge(knowledgeName, paramName[0])
                                        }
                                    } */
                                }
                            }
                        }
                        if (functionName === "HKDF") {
                            let namesList: List = new List()
                            
                            if (kd.$container.$type === 'PrincipalKnowledgeDef') {
                                kd.$container.target.forEach(principalName => {
                                    namesList.add(principalName.ref?.name!)
                                })
                            }
                            // crea 5 valori nuovi (fresh)
                            if (isKnowledgeDefCustomName(kd.left)) {
                                const name = kd.left.name
                                knowledgeClass.addNewGlobalKnowledge(name, namesList)

                                let returnLength = 0

                                streamAllContents(protocol)
                                    .filter(isFunctionDef)
                                    .forEach(fd => {
                                        if (fd.name === "HKDF") {
                                            returnLength = fd.return.elements.length
                                        }
                                    })

                                for (let i = 0; i < returnLength; i++) {
                                    knowledgeClass.addNewGlobalKnowledge(name.concat("[" + i + "]"), namesList)
                                }
                            }
                            // for now, no set or list destructuring
                        }
                    }
                
                }
            })

        streamAllContents(protocol)
            .filter(isCommunication)
            .forEach(c => {
                const payload = c.ref.ref
                const recipients = new List()
                c.to.forEach(p => {
                    recipients.add(p.ref?.name!)
                })

                knowledgeClass.addPrincipalToKnowledge(payload, recipients)
            })
    }
}
