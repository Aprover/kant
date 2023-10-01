import { streamAllContents, ValidationAcceptor } from "langium"
import {
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

export const test = {
    test: (knowledgeClass: KnowledgeClass, protocol: Protocol, accept: ValidationAcceptor): void => {
        knowledgeClass.emptyAll()
        streamAllContents(protocol)
            .filter(isKnowledgeDef)
            .forEach(kd => {
                if (isKnowledgeDefBuiltin(kd)) {
                    if (kd.type !== "state") {
                        // fresh e const
                        kd.name.forEach(kn => {
                            knowledgeClass.addNewGlobalKnowledge(kn)
                        })
                    }
                }

                if (isKnowledgeDefCustom(kd)) {
                    if (isKnowledgeFromFunction(kd.value)) {
                        const functionName = kd.value.invoked.ref?.name
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
                                knowledgeClass.addNewGlobalKnowledge(knowledgeName)
                            }
                        }
                        if (functionName === "CONCAT") {
                            if (isKnowledgeDefCustomName(kd.left)) {
                                const knowledgeName = kd.left.name
                                knowledgeClass.addNewGlobalKnowledge(knowledgeName)

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
                                        
                                        index = knowledgeClass.addAliasGlobalKnowledge(
                                            knowledgeName.concat("[" + i + "]"),
                                            e
                                        )!
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
                                            knowledgeClass.addAliasGlobalKnowledge(knowledgeSplit, x.ref)
                                            knowledgeClass.cloneNodePoiter(knowledgeSplit, x.ref, protocol, accept)
                                        }
                                        if (isListAccess(x)) {
                                            let finalString = x.ref.concat("[" + x.index + "]")
                                            knowledgeClass.addAliasGlobalKnowledge(knowledgeSplit, finalString)
                                            knowledgeClass.cloneNodePoiter(knowledgeSplit, x.ref, protocol, accept)
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
                                            knowledgeClass.insertAliasDecrypt(firstParam, kd.left.name, protocol, accept)
                                        }
                                    }
                                    if (isListAccess(functionParam[0])) {
                                        let finalString = functionParam[0].ref.concat("[" + functionParam[0].index + "]")
                                        //accept('info', `(entrato nel ramo if desiderato) firstParam: ${finalString}`, { node: protocol })
                                        if (isKnowledgeDefCustomName(kd.left))
                                        knowledgeClass.insertAliasDecrypt(finalString, kd.left.name, protocol, accept)                                        
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
                                            knowledgeClass.addAliasGlobalKnowledge(knowledgeName, x.ref)
                                        }
                                        if (isListAccess(x)) {
                                            let finalString = x.ref.concat("[" + x.index + "]")
                                            knowledgeClass.addAliasGlobalKnowledge(knowledgeName, finalString)
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
                            // crea 5 valori nuovi (fresh)
                            if (isKnowledgeDefCustomName(kd.left)) {
                                const name = kd.left.name
                                knowledgeClass.addNewGlobalKnowledge(name)

                                let returnLength = 0

                                streamAllContents(protocol)
                                    .filter(isFunctionDef)
                                    .forEach(fd => {
                                        if (fd.name === "HKDF") {
                                            returnLength = fd.return.elements.length
                                        }
                                    })

                                for (let i = 0; i < returnLength; i++) {
                                    knowledgeClass.addNewGlobalKnowledge(name.concat("[" + i + "]"))
                                }
                            }
                            // for now, no set or list destructuring
                        }
                    }
                }
            })
    }
}
