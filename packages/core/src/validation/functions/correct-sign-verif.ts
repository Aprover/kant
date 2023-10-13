import {  MaybePromise, streamAllContents, ValidationAcceptor } from "langium"
import {  isKnowledgeFromFunction, isKnowledgeRef, isListAccess, Protocol } from "../../generated/ast"
import { KnowledgeClass } from "../../KnowledgeClass"

export const correctSignVerif = {
    correctSignVerif: (
        knowledgeClass: KnowledgeClass,
        protocol: Protocol,
        accept: ValidationAcceptor
    ): MaybePromise<void> => {
        streamAllContents(protocol)
            .filter(isKnowledgeFromFunction)
            .forEach(i => {
                
                if(i.invoked.ref?.name==="SIGN_VERIF"){
                    //accept("error",`The result: "${i.invoked.ref?.name}"`,{ node: i})
                    knowledgeClass
                    let param = i.args.args[0]!
                    
                    let paramskeys:string[]=new Array<string>
                    if (isKnowledgeRef(param)) {
                        //accept("error",`The result: "${param.ref}"`,{ node: param })
                        //knowledgeClass.addAliasGlobalKnowledge(knowledgeName, x.ref, namesList, returnType)
                        paramskeys.push(param.ref)
                    }
                   
                    if (isListAccess(param)) {
                        let finalString = param.ref.concat("[" + param.index + "]")
                        
                        paramskeys.push(finalString)
                        //knowledgeClass.addAliasGlobalKnowledge(knowledgeName, finalString, namesList, returnType)
                    }
                     
                    let keys=i.keys
                    //for(let j=0;j<keys.length;j++){
                        let k=keys[0]
                        let indexreplace:number=0
                        if (isKnowledgeRef(k)){
                            //knowledgeClass.addAliasGlobalKnowledge(knowledgeName, x.ref, namesList, returnType)
                            
                            paramskeys.push(k.ref)
                            indexreplace=knowledgeClass.getKeyPairing(k.ref)![1]!
                            //let ref=knowledgeClass.getGlobalKnowledge()![indexreplace!]!.get(0)
                            //paramskeys.push(ref)

                        }
                        
                    
                        if (isListAccess(k)) {
                            let finalString = k.ref.concat("[" + k.index + "]")
                            
                            indexreplace=knowledgeClass.getKeyPairing(finalString)![1]!
                            //paramskeys.push(knowledgeClass.getGlobalKnowledge()![indexreplace!]!.get(0))
                            //accept("error",`test1: "${indexreplace}"`,{ node: i })
                            paramskeys.push(finalString)
                            //knowledgeClass.addAliasGlobalKnowledge(knowledgeName, finalString, namesList, returnType)
                        }  
                    //}
                    
                    let stringKey=indexreplace?.toString()
                    //accept("error",`test1: "${stringKey}"`,{ node: i })
                    
                    let lastIndex=knowledgeClass.getParmKeyPairing(paramskeys)!.lastIndexOf(",");
                    let indexSliced=knowledgeClass.getParmKeyPairing(paramskeys)!.slice(0,lastIndex+1);
                    let result=indexSliced.concat(stringKey!)
                    
                    if(knowledgeClass.getIndexesParmKeyPairing(result!)!==true){
                        accept("error",`There is not an 'SIGN' function that can be verified using this signature and this public key"`,{ node: i })
                    }

                }
            })

    }
}