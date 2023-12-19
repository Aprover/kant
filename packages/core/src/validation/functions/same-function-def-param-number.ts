import { streamAllContents,  type ValidationAcceptor } from "langium"
import {  isFunctionDef, isKnowledgeFromFunction, type Protocol } from "../../generated/ast"
import { KnowledgeClass } from "../../KnowledgeClass";

export const sameFunctionDefParamCardinality = {
    sameFunctionDefParamCardinality: (knowledgeClass: KnowledgeClass, protocol: Protocol, accept: ValidationAcceptor): void => {
        const functionDefParamCard= new Map<string, number>();
        //defintition of fuctions in the same file
        streamAllContents(protocol)
            .filter(isFunctionDef)
            .forEach(kf => {
                let functionName=kf.name
                let functionParamCard = kf.params.length
                functionDefParamCard.set(functionName,functionParamCard)
                
            })
        //definition of the reference of the prelude functions used in the file
        streamAllContents(protocol)
            .filter(isKnowledgeFromFunction)
            .forEach(kff => {
                if (kff.invoked) {
                    let functionName = kff.invoked.ref?.name
                    //let functionParamCard = kff.invoked.ref?.params.length
                    let functionParamCard=0
                    //accept(`error`, `"arg: ${kff.invoked.ref?.key?.elements.length}" `, { node: kff })
                    if(kff.invoked.ref?.params.length!==undefined){
                        functionParamCard = kff.invoked.ref?.params.length
                    }
                    functionDefParamCard.set(functionName!,functionParamCard!)
                }
            })
        let returnMap= knowledgeClass.getFunctionCardinalityMap()
        streamAllContents(protocol)
            .filter(isKnowledgeFromFunction)
            .forEach(i => {
                if (!i.invoked.ref?.variadic) {
                    if (functionDefParamCard.get(i.invoked.ref?.name!)!==undefined) {
                        //accept(`error`, `"arg: ${i.args.args.length}" `, { node: i })
                        if (i.args.args.length !== functionDefParamCard.get(i.invoked.ref?.name!)) {
                            
                            accept(`error`, `"${i.invoked.ref?.name!}" requires "${functionDefParamCard.get(i.invoked.ref?.name!)}" argument, but "${i.args.args.length}" arguments are provided.`, { node: i })
                            returnMap.set(i,false)
                        }else{
                            returnMap.set(i,true)
                        }
                    }
                }
            })
        knowledgeClass.setFunctionCardinalityMap(returnMap)
    }
}