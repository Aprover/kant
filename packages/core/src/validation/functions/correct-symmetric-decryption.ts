import {  MaybePromise, streamAllContents, ValidationAcceptor } from "langium"
import {  isKnowledgeFromFunction, isKnowledgeRef, isListAccess, Protocol } from "../../generated/ast"
import { KnowledgeClass } from "../../KnowledgeClass"

export const correctSymmetricDecryption = {
    correctSymmetricDecryption: (
        knowledgeClass: KnowledgeClass,
        protocol: Protocol,
        accept: ValidationAcceptor
    ): MaybePromise<void> => {
        streamAllContents(protocol)
            .filter(isKnowledgeFromFunction)
            .forEach(i => {
                if(i.invoked.ref?.name==="DEC"){
                    let param = i.args.args[0]!
                    let paramskeys:string[]=new Array<string>
                    if (isKnowledgeRef(param)) {
                        //knowledgeClass.addAliasGlobalKnowledge(knowledgeName, x.ref, namesList, returnType)
                        paramskeys.push(param.ref)
                    }
                    if (isListAccess(param)) {
                        let finalString = param.ref.concat("[" + param.index + "]")
                        paramskeys.push(finalString)
                        //knowledgeClass.addAliasGlobalKnowledge(knowledgeName, finalString, namesList, returnType)
                    }
                    let keys=i.keys
                    for(let j=0;j<keys.length;j++){
                        let k=keys[j]
                        if (isKnowledgeRef(k)){
                            //knowledgeClass.addAliasGlobalKnowledge(knowledgeName, x.ref, namesList, returnType)
                            paramskeys.push(k.ref)


                        }
                        if (isListAccess(k)) {
                            let finalString = k.ref.concat("[" + k.index + "]")
                            paramskeys.push(finalString)
                            //knowledgeClass.addAliasGlobalKnowledge(knowledgeName, finalString, namesList, returnType)
                        }  
                    }
                    
                    if(knowledgeClass.getIndexesParmKeyPairing(knowledgeClass.getParmKeyPairing(paramskeys)!)!==true){
                        accept("error",`There is not an 'ENC' function that can be inverted using this cyphertext and key"`,{ node: i })
                    }

                }
            })

    }
}