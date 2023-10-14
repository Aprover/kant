import { streamAllContents, ValidationAcceptor} from "langium"
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
    knowledgeRetrieval: (knowledgeClass: KnowledgeClass, protocol: Protocol ,
        accept: ValidationAcceptor): void => {

        knowledgeClass.flushKnowledge()
        knowledgeClass.flushCardinality()
        streamAllContents(protocol)
            .filter(isKnowledgeDef)
            .forEach(kd => {
                if (isKnowledgeDefBuiltin(kd)) {
                    
                        // fresh e const
                        
                        for (let i = 0; i < kd.name.length; i++) {
                            const name = kd.name[i]
                            const type = kd.customType[i]?.ref?.name
                            let principalList: List = new List()
                            if (kd.$container.$type === 'PrincipalKnowledgeDef') {
                                kd.$container.target.forEach(principalName => {
                                    principalList.add(principalName.ref?.name!)
                                })
                            }
                            knowledgeClass.addNewGlobalKnowledge(name!, principalList, type!)
                        }

                       
                        
                    
                }
            

                if (isKnowledgeDefCustom(kd)) {
                    let principalList: List = new List()
                            
                            if (kd.$container.$type === 'PrincipalKnowledgeDef') {
                                kd.$container.target.forEach(principalName => {
                                    principalList.add(principalName.ref?.name!)
                                })
                            }

                    if (isKnowledgeFromFunction(kd.value)) {
                        let functionName = kd.value.invoked.ref?.name!
                        let returnType: string = ""
                        if (kd.value.invoked.ref?.return.elements.length! > 1) {
                            returnType = "BitString"
                        } else {
                            returnType = kd.value.invoked.ref?.return.elements[0]?.type.type.ref?.name!
                        }
                        if (
                            functionName === "PW_HASH" ||
                            functionName === "HASH" ||
                            functionName === "PUB_GEN"
                        ) {
                            if (isKnowledgeDefCustomName(kd.left)) {
                                const knowledgeName = kd.left.name
                                const functionParam = kd.value.args.args
                                
                                if (isKnowledgeFromFunctionArgsElements(kd.value.args)) {
                                    let x = functionParam[0]
                                    if (isKnowledgeRef(x)) {
                                        if(knowledgeClass.getGlobalKnowledgeDescriptorMap().get(x.ref)===undefined){
                                            accept("error",`The param "${x.ref}" is invoked before been defined.`,{ node: x })
                                        }
                                    }
                                    if (isListAccess(x)) {
                                        let finalString = x.ref.concat("[" + x.index + "]")
                                            if(knowledgeClass.getGlobalKnowledgeDescriptorMap().get(finalString)===undefined){
                                                accept("error",`The param "${finalString}" is invoked before been defined.`,{ node: x })
                                            }
                                    }
                                }
                                
                                knowledgeClass.addNewGlobalKnowledge(knowledgeName, principalList, returnType)
                            }
                        }
                        if(functionName === "DF"){
                            if (isKnowledgeDefCustomName(kd.left)) {
                                const knowledgeName = kd.left.name
                                const functionParam = kd.value.args.args
                                let paramName:string=""
                                let arrayParam:string[]=[]
                                if (isKnowledgeFromFunctionArgsElements(kd.value.args)) {
                                    for (let i = 0; i < functionParam.length; i++) {
                                        let x = functionParam[i]
                                        if (isKnowledgeRef(x)) {
                                            paramName=x.ref
                                            if(knowledgeClass.getGlobalKnowledgeDescriptorMap().get(x.ref)===undefined){
                                                accept("error",`The param "${x.ref}" is invoked before been defined.`,{ node: x })
                                            }
                                            arrayParam.push(knowledgeClass.getGlobalKnowledgeDescriptorMap().get(paramName)?.getFirstIndex().toString()!)
                                        }
                                        if (isListAccess(x)) {
                                            paramName = x.ref.concat("[" + x.index + "]")
                                                if(knowledgeClass.getGlobalKnowledgeDescriptorMap().get(paramName)===undefined){
                                                    accept("error",`The param "${paramName}" is invoked before been defined.`,{ node: x })
                                                }
                                            arrayParam.push(knowledgeClass.getGlobalKnowledgeDescriptorMap().get(paramName)?.getFirstIndex().toString()!)
                                        }
                                    }
                                }
                                
                                knowledgeClass.addAliasDiffieHellman(arrayParam,knowledgeName, principalList, returnType)
                            }
                        }
                        if(functionName === "EXP"){
                                
                                if (isKnowledgeDefCustomName(kd.left)) {
                                    const knowledgeName = kd.left.name
                                    const functionParam = kd.value.args.args
                                    let paramName:string=""
                                    let ArrayParam:string[]=[]
                                    if (isKnowledgeFromFunctionArgsElements(kd.value.args)) {
                                        for (let i = 0; i < functionParam.length; i++) {
                                            let x = functionParam[i]
                                            if (isKnowledgeRef(x)) {
                                                paramName=x.ref
                                                if(knowledgeClass.getGlobalKnowledgeDescriptorMap().get(x.ref)===undefined){
                                                    accept("error",`The param "${x.ref}" is invoked before been defined.`,{ node: x })
                                                }
                                                ArrayParam.push(paramName)
                                            }
                                            if (isListAccess(x)) {
                                                paramName = x.ref.concat("[" + x.index + "]")
                                                    if(knowledgeClass.getGlobalKnowledgeDescriptorMap().get(paramName)===undefined){
                                                        accept("error",`The param "${paramName}" is invoked before been defined.`,{ node: x })
                                                    }
                                                ArrayParam.push(paramName)
                                            }
                                         }
                                    }
                                    
                                    knowledgeClass.addNewGlobalKnowledge(knowledgeName, principalList, returnType)
                                }
                            
                            
                        }
                        /*if(functionName === "MAC" || functionName === "SIGN"){
                            if (isKnowledgeDefCustomName(kd.left)) {
                                const knowledgeName = kd.left.name
                                knowledgeClass.addNewGlobalKnowledge(knowledgeName, principalList, returnType)
                            }
                        }*/



                        if (functionName === "CONCAT") {
                            if (isKnowledgeDefCustomName(kd.left)) {
                                const knowledgeName = kd.left.name
                                knowledgeClass.addNewGlobalKnowledge(knowledgeName, principalList, "BitString")

                                let tempArr: string[] = []
                               
                                if (isKnowledgeFromFunctionArgsElements(kd.value.args)) {
                                    const functionParam = kd.value.args.args
                                    for (let i = 0; i < functionParam.length; i++) {
                                        let x = functionParam[i]
                                        if (isKnowledgeRef(x)) {
                                            if(knowledgeClass.getGlobalKnowledgeDescriptorMap().get(x.ref)===undefined){
                                                accept("error",`The param "${x.ref}" is invoked before been defined.`,{ node: x })
                                            }
                                            tempArr.push(x.ref)
                                        
                                        }
                                        if (isListAccess(x)) {
                                            let finalString = x.ref.concat("[" + x.index + "]")
                                            if(knowledgeClass.getGlobalKnowledgeDescriptorMap().get(finalString)===undefined){
                                                accept("error",`The param "${finalString}" is invoked before been defined.`,{ node: x })
                                            }
                                            tempArr.push(finalString)
                                        }
                                    }
                                }
                                
                                for (let i = 0; i < tempArr.length; i++) {
                                    let e = tempArr[i]
                                    
                                    let index = 0
                                    if (e) {
                                        let desiredType = knowledgeClass.getGlobalKnowledgeDescriptorMap().get(e)?.getType()
                                        index = knowledgeClass.addAliasGlobalKnowledge(knowledgeName.concat("[" + i + "]"),e, principalList, desiredType!)!
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
                                            if(knowledgeClass.getGlobalKnowledgeDescriptorMap().get(x.ref)===undefined){
                                                accept("error",`The param "${x.ref}" is invoked before been defined.`,{ node: x })
                                            }
                                            knowledgeClass.addAliasGlobalKnowledge(knowledgeSplit, x.ref, principalList, returnType)
                                            knowledgeClass.cloneNodePoiter(knowledgeSplit, x.ref, principalList)
                                        }
                                        if (isListAccess(x)) {
                                            let finalString = x.ref.concat("[" + x.index + "]")
                                            if(knowledgeClass.getGlobalKnowledgeDescriptorMap().get(finalString)===undefined){
                                                accept("error",`The param "${finalString}" is invoked before been defined.`,{ node: x })
                                            }
                                            knowledgeClass.addAliasGlobalKnowledge(knowledgeSplit, finalString, principalList, returnType)
                                            knowledgeClass.cloneNodePoiter(knowledgeSplit, x.ref, principalList)
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
                            functionName === "MAC" ||
                             functionName === "SIGN"

                         ) {
                            if (isKnowledgeDefCustomName(kd.left)) {
                                const knowledgeName = kd.left.name
                                const functionSecondaryParam=kd.value.keys
                                if (isKnowledgeFromFunctionArgsElements(kd.value.args)) {
                                    const functionParam = kd.value.args.args
                                    let indexes:number[]=[]
                                    for (let i = 0; i < functionParam.length; i++) {
                                        let x = functionParam[i]
                                        if (isKnowledgeRef(x)) {
                                            if(knowledgeClass.getGlobalKnowledgeDescriptorMap().get(x.ref)===undefined){
                                                accept("error",`The param "${x.ref}" is invoked before been defined.`,{ node: x })
                                            }
                                            knowledgeClass.addAliasGlobalKnowledge(knowledgeName, x.ref, principalList, returnType)
                                            indexes.push(knowledgeClass.getGlobalKnowledgeDescriptorMap().get(x.ref)?.getFirstIndex()!)
                                        }
                                        if (isListAccess(x)) {
                                            let finalString = x.ref.concat("[" + x.index + "]")
                                            if(knowledgeClass.getGlobalKnowledgeDescriptorMap().get(finalString)===undefined){
                                                accept("error",`The param "${finalString}" is invoked before been defined.`,{ node: x })
                                            }
                                            knowledgeClass.addAliasGlobalKnowledge(knowledgeName, finalString, principalList, returnType)
                                            indexes.push(knowledgeClass.getGlobalKnowledgeDescriptorMap().get(finalString)?.getFirstIndex()!)
                                        }
                                    }
                                    //let keyParam:string
                                    for(let j=0;j<functionSecondaryParam.length;j++){
                                        let keyParam=functionSecondaryParam[j]
                                        if(isKnowledgeRef(keyParam)){
                                            //keyParam=functionSecondaryParam.ref
                                            
                                            if(knowledgeClass.getGlobalKnowledgeDescriptorMap().get(keyParam.ref)===undefined){
                                                accept("error",`The param "${keyParam.ref}" is invoked before been defined.`,{ node: keyParam})
                                            }
                                            
                                            indexes.push(knowledgeClass.getGlobalKnowledgeDescriptorMap().get(keyParam.ref)?.getFirstIndex()!)
                                            //knowledgeClass.setParmKeyPairing(ArrayParam,ArrayKeys)
                                            
                                        }
                                        if(isListAccess(keyParam)){
                                            let final =keyParam.ref.concat("[" + keyParam.index + "]")
                                            
                                            if(knowledgeClass.getGlobalKnowledgeDescriptorMap().get(final)===undefined){
                                                accept("error",`The param "${final}" is invoked before been defined.`,{ node: keyParam})
                                            }
                                            
                                            indexes.push(knowledgeClass.getGlobalKnowledgeDescriptorMap().get(final)?.getFirstIndex()!)
                                            //knowledgeClass.setParmKeyPairing(ArrayParam,ArrayKeys)
                                            
                                        }
                                    }
                                    knowledgeClass.setIndexesParmKeyPairing(indexes)
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
                        if (
                            functionName === "DEC" ||
                            functionName === "PKE_DEC" ||
                            functionName === "AEAD_DEC" ||
                            functionName === "SIGN_VERIF" ||
                            functionName === "MAC_VERIF"
                        ) {
                                /*
                                if (isKnowledgeFromFunctionArgsElements(kd.value.args)) {
                                    const functionParam = kd.value.args.args
                                    //let firstParam: string



                                    if (isKnowledgeRef(functionParam[0])) {
                                        //firstParam = functionParam[0].ref
                                        if (isKnowledgeDefCustomName(kd.left)) {
                                            //accept('info', `(entrato nel ramo if desiderato) firstParam: ${firstParam}`, { node: protocol })
                                            //knowledgeClass.insertAliasDecrypt(firstParam, kd.left.name, principalList)
                                        }
                                    }
                                    if (isListAccess(functionParam[0])) {
                                        //let finalString = functionParam[0].ref.concat("[" + functionParam[0].index + "]")
                                        //accept('info', `(entrato nel ramo if desiderato) firstParam: ${finalString}`, { node: protocol })
                                        if (isKnowledgeDefCustomName(kd.left)){

                                        }
                                        //knowledgeClass.insertAliasDecrypt(finalString, kd.left.name, principalList)                                        
                                    }
                                }*/

                                if (isKnowledgeDefCustomName(kd.left)) {
                                    const knowledgeName = kd.left.name
                                    if (isKnowledgeFromFunctionArgsElements(kd.value.args)) {
                                        const functionParam = kd.value.args.args
                                        const functionSecondaryParam=kd.value.keys
                                        let paramName:string=""
                                        let ArrayParam:string[]=[]
                                        let ArrayKeys:string[]=[]
                                        //for (let i = 0; i < functionParam.length; i++) {
                                            let x = functionParam[0]
                                            
                                            if (isKnowledgeRef(x)) {
                                                paramName=x.ref
                                                
                                                if(knowledgeClass.getGlobalKnowledgeDescriptorMap().get(x.ref)===undefined){
                                                    accept("error",`The param "${x.ref}" is invoked before been defined.`,{ node: x })
                                                }
                                                let firstIndex = knowledgeClass.getGlobalKnowledgeDescriptorMap().get(x.ref)?.getFirstIndex()
                                                let desiredType = knowledgeClass.getGlobalKnowledgeDescriptorMap().get(knowledgeClass.getKnowledgebyIndex(firstIndex!, 0)!)?.getType()
                                                knowledgeClass.addAliasGlobalKnowledge(knowledgeName, x.ref, principalList, desiredType!)
                                                ArrayParam.push(paramName)
                                            }
                                            if (isListAccess(x)) {
                                                paramName = x.ref.concat("[" + x.index + "]")
                                                
                                                if(knowledgeClass.getGlobalKnowledgeDescriptorMap().get(paramName)===undefined){
                                                    accept("error",`The param "${paramName}" is invoked before been defined.`,{ node: x})
                                                }
                                                let firstIndex = knowledgeClass.getGlobalKnowledgeDescriptorMap().get(paramName)?.getFirstIndex()
                                                let desiredType = knowledgeClass.getGlobalKnowledgeDescriptorMap().get(knowledgeClass.getKnowledgebyIndex(firstIndex!, 0)!)?.getType()
                                                
                                                knowledgeClass.addAliasGlobalKnowledge(knowledgeName, paramName, principalList, desiredType!)
                                                ArrayParam.push(paramName)
                                            }
                                            for(let j=0;j<functionSecondaryParam.length;j++){
                                                let keyParam=functionSecondaryParam[j]
                                                if(isKnowledgeRef(keyParam)){
                                                    //keyParam=functionSecondaryParam.ref
                                                    
                                                    if(knowledgeClass.getGlobalKnowledgeDescriptorMap().get(keyParam.ref)===undefined){
                                                        accept("error",`The param "${keyParam.ref}" is invoked before been defined.`,{ node: keyParam})
                                                    }
                                                    
                                                    ArrayKeys.push(keyParam.ref!)
                                                    //knowledgeClass.setParmKeyPairing(ArrayParam,ArrayKeys)
                                                    
                                                }
                                                if(isListAccess(keyParam)){
                                                    let final=keyParam.ref.concat("[" + keyParam.index + "]")
                                                    
                                                    if(knowledgeClass.getGlobalKnowledgeDescriptorMap().get(final)===undefined){
                                                        accept("error",`The param "${final}" is invoked before been defined.`,{ node: keyParam})
                                                    }
                                                    
                                                    ArrayKeys.push(final)
                                                    //knowledgeClass.setParmKeyPairing(ArrayParam,ArrayKeys)
                                                    
                                                }
                                            }
                                            knowledgeClass.setParmKeyPairing(ArrayParam,ArrayKeys)
                                       
                                    }
                                }
                            }
                            // creano alias
                        
                        if (functionName === "HKDF") {
                            let principalList: List = new List()
                            
                            if (kd.$container.$type === 'PrincipalKnowledgeDef') {
                                kd.$container.target.forEach(principalName => {
                                    principalList.add(principalName.ref?.name!)
                                })
                            }
                            // crea 5 valori nuovi (fresh)
                            if (isKnowledgeDefCustomName(kd.left)) {
                                const name = kd.left.name
                                knowledgeClass.addNewGlobalKnowledge(name, principalList, "BitString")

                                let returnLength = 0

                                streamAllContents(protocol)
                                    .filter(isFunctionDef)
                                    .forEach(fd => {
                                        if (fd.name === "HKDF") {
                                            returnLength = fd.return.elements.length
                                        }
                                    })

                                for (let i = 0; i < returnLength; i++) {
                                    knowledgeClass.addNewGlobalKnowledge(name.concat("[" + i + "]"), principalList, "SymmetricKey")
                                }
                            }
                            // for now, no set or list destructuring
                        }
                        if(functionName=== "PUB_GEN"){
                            if (isKnowledgeDefCustomName(kd.left)) {
                                let pubkey= kd.left.name
                                let privkey:string=""
                                if(isKnowledgeRef(kd.value.args.args[0]!)){
                                     privkey=kd.value.args.args[0]!.ref
                                }
                                knowledgeClass.setKeyPairing(pubkey,privkey)

                            }

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
