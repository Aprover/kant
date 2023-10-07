import { streamAllContents,  type ValidationAcceptor } from "langium"
import {  isFunctionDef, isKnowledgeFromFunction, type Protocol } from "../../generated/ast"
import { KnowledgeClass } from "../../KnowledgeClass";

export const sameFunctionDefParamCardinality = {
    sameFunctionDefParamCardinality: (knowledgeClass: KnowledgeClass, protocol: Protocol, accept: ValidationAcceptor): void => {
        const functionDefParamCard= new Map<string, number>();
        streamAllContents(protocol)
            .filter(isFunctionDef)
            .forEach(kf => {
                let functionName=kf.name
                let functionParamCard = kf.params.length
                functionDefParamCard.set(functionName,functionParamCard)
                
            })
        
        streamAllContents(protocol)
            .filter(isKnowledgeFromFunction)
            .forEach(kff => {
                if (kff.invoked) {
                    let functionName = kff.invoked.ref?.name
                    let functionParamCard = kff.invoked.ref?.params.length
                    functionDefParamCard.set(functionName!,functionParamCard!)
                }
            })
        let returnMap= knowledgeClass.getFunctionCardinalityMap()
        streamAllContents(protocol)
            .filter(isKnowledgeFromFunction)
            .forEach(i => {
                if (!i.invoked.ref?.variadic) {
                    if (functionDefParamCard.get(i.invoked.ref?.name!)) {
                        if (i.args.args.length !== functionDefParamCard.get(i.invoked.ref?.name!)) {
                            accept(`error`, `"${i.invoked.ref?.name!}" requires "${functionDefParamCard.get(i.invoked.ref?.name!)}" arguments to be passed, but you provided "${i.args.args.length}" arguments.`, { node: i })
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