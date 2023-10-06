import { streamAllContents,  type ValidationAcceptor } from "langium"
import {  isFunctionDef, isFunctionInversionDef, isKnowledgeFromFunction, KnowledgeFromFunction, type Protocol } from "../../generated/ast"
//import { KnowledgeClass } from "../../KnowledgeClass";

export const sameFunctionDefParamCardinality = {
    sameFunctionDefParamCardinality: (protocol: Protocol, accept: ValidationAcceptor): Map<KnowledgeFromFunction,boolean> => {
        const functionDefParamCard= new Map<string, number>();
        
        //const functionInvDefParamCard= new Map<string, number>();
        streamAllContents(protocol)
            .filter(isFunctionDef)
            .forEach(kf => {
                let functionName=kf.name
                let functionParamCard=kf.params.length
                functionDefParamCard.set(functionName,functionParamCard)
                
            })
        streamAllContents(protocol)
            .filter(isFunctionInversionDef)
            .forEach(kif => {
                let functionInvName=kif.name
                let functionInvParamCard=kif.params.length
                functionDefParamCard.set(functionInvName,functionInvParamCard)
                
            })
        let returnMap=new Map<KnowledgeFromFunction, boolean>();
        streamAllContents(protocol)
            .filter(isKnowledgeFromFunction)
            .forEach(i => {
                if (functionDefParamCard.get(i.invoked)) {
                    if (i.args.args.length !== functionDefParamCard.get(i.invoked)) {
                        accept(`error`, `"${i.invoked}" requires "${functionDefParamCard.get(i.invoked)}" arguments to be passed, but you provided "${i.args.args.length}" arguments.`, { node: i })
                        returnMap.set(i,false)
                    }else{
                        returnMap.set(i,true)
                    }
                    
                }
            })
        return returnMap
    }
}