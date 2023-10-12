import { streamAllContents,  type ValidationAcceptor } from "langium"
import {  isFunctionDef, isKnowledgeFromFunction, type Protocol } from "../../generated/ast"
import { KnowledgeClass } from "../../KnowledgeClass";

export const sameFunctionDefSecondaryParamCardinality = {
    sameFunctionDefSecondaryParamCardinality: (knowledgeClass: KnowledgeClass, protocol: Protocol, accept: ValidationAcceptor): void => {
        const functionDefSecondParamCard= new Map<string, number>();
        //defintition of fuctions in the same file
        streamAllContents(protocol)
            .filter(isFunctionDef)
            .forEach(kf => {
                let functionName=kf.name
                let functionSecondaryParamCard:number=0
                if(kf.key){
                    functionSecondaryParamCard = kf.key.elements.length
                }
                
                functionDefSecondParamCard.set(functionName,functionSecondaryParamCard)
                
            })
        //definition of the reference of the prelude functions used in the file
        streamAllContents(protocol)
            .filter(isKnowledgeFromFunction)
            .forEach(kff => {
                if (kff.invoked) {
                    let functionName = kff.invoked.ref?.name
                    let functionSecondaryParamCard=0
                    if(kff.invoked.ref?.key?.elements.length!==undefined){
                        functionSecondaryParamCard = kff.invoked.ref?.key?.elements.length
                    }
                    functionDefSecondParamCard.set(functionName!,functionSecondaryParamCard!)
                    
                }
            })
        let returnMap= knowledgeClass.getFunctionSecondaryCardinalityMap()
        streamAllContents(protocol)
            .filter(isKnowledgeFromFunction)
            .forEach(i => {
                if (!i.invoked.ref?.variadic) {
                    if (functionDefSecondParamCard.get(i.invoked.ref?.name!)!==undefined) {
                        if (i.keys.length !== functionDefSecondParamCard.get(i.invoked.ref?.name!)) {
                            if(functionDefSecondParamCard.get(i.invoked.ref?.name!)===0){
                                accept(`error`, `"${i.invoked.ref?.name!}" does not requires any secondary arguments to be passed, but you provided "${i.keys.length}".`, { node: i })
                            }else{
                                accept(`error`, `"${i.invoked.ref?.name!}" requires "${functionDefSecondParamCard.get(i.invoked.ref?.name!)}" secondary arguments to be passed, but you provided "${i.keys.length}".`, { node: i })
                            }
                            returnMap.set(i,false)
                        }else{
                           
                            returnMap.set(i,true)
                        }
                    }
                }
            })
        knowledgeClass.setFunctionSecondaryCardinalityMap(returnMap)
    }
}