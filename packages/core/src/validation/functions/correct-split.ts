import {  MaybePromise, streamAllContents, ValidationAcceptor } from "langium"
import {  isKnowledgeFromFunction, isKnowledgeRef, isListAccess, Protocol } from "../../generated/ast"
import { KnowledgeClass } from "../../KnowledgeClass"

export const correctSplit = {
    correctSplit: (
        knowledgeClass: KnowledgeClass,
        protocol: Protocol,
        accept: ValidationAcceptor
    ): MaybePromise<void> => {
        streamAllContents(protocol)
            .filter(isKnowledgeFromFunction)
            .forEach(i => {
                if(i.invoked.ref?.name==="SPLIT"){
                    let param = i.args.args[0]!
                    let sizePointers:number=0
                    
                    if (isKnowledgeRef(param)) {
                        //knowledgeClass.addAliasGlobalKnowledge(knowledgeName, x.ref, namesList, returnType)
                        let listIndex=knowledgeClass.getGlobalKnowledgeDescriptorMap().get(param.ref)?.getFirstIndex()
                        let name=knowledgeClass.getKnowledgebyIndex(listIndex!,0)
                        sizePointers=knowledgeClass.getListNodePointerKnowledge().get(name!)?.length!
                    }
                    if (isListAccess(param)) {
                        let finalString = param.ref.concat("[" + param.index + "]")
                        let listIndex=knowledgeClass.getGlobalKnowledgeDescriptorMap().get(finalString)?.getFirstIndex()
                        let name=knowledgeClass.getKnowledgebyIndex(listIndex!,0)
                        sizePointers=knowledgeClass.getListNodePointerKnowledge().get(name!)?.length!
                        //knowledgeClass.addAliasGlobalKnowledge(knowledgeName, finalString, namesList, returnType)
                        //accept("error",`The 'SPLIT' function size "${sizePointers}"`,{ node: i })
                    }
                   
                    
                    if(sizePointers===0 || sizePointers=== undefined){
                        accept("error",`The 'SPLIT' function is called on a parameter that is not the product of 'CONCAT'"`,{ node: i })
                    }

                }
            })

    }
}