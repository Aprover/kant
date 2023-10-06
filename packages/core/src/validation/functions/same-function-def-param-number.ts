import { streamAllContents,  type ValidationAcceptor } from "langium"
import {  isFunctionDef, isFunctionInversionDef, isKnowledgeFromFunction, type Protocol } from "../../generated/ast"
import { KnowledgeClass } from "../../KnowledgeClass";
//import { KnowledgeClass } from "../../KnowledgeClass";

export const sameFunctionDefParamCardinality = {
    sameFunctionDefParamCardinality: (knowledgeClass: KnowledgeClass, protocol: Protocol, accept: ValidationAcceptor): void => {
        const functionDefParamCard= new Map<string, string>();
        
        
        //const functionInvDefParamCard= new Map<string, number>();
        streamAllContents(protocol)
            .filter(isFunctionDef)
            .forEach(kf => {
                let functionName=kf.name
                let functionParamCard = kf.params.length.toString()
                accept('info', `nome funzione: ${functionName}; numero dei suoi parametri 
                ${functionParamCard}`, { node: protocol })
                functionDefParamCard.set(functionName,functionParamCard)
                
            })
        streamAllContents(protocol)
            .filter(isFunctionInversionDef)
            .forEach(kif => {
                let functionInvName=kif.name
                let functionInvParamCard=kif.otherParams.length + 1
                accept('info', `nome funzione: ${functionInvName}; numero dei suoi parametri 
                ${functionInvParamCard}`, { node: protocol })
                functionDefParamCard.set(functionInvName,functionInvParamCard.toString())
                
            })
        //accept('info', `${keyArray}`, { node: protocol })
        let returnMap= knowledgeClass.getFunctionCardinalityMap()
        streamAllContents(protocol)
            .filter(isKnowledgeFromFunction)
            .forEach(i => {
                accept('info', `${i.invoked}: ${functionDefParamCard.get(i.invoked)}, ${i.args.args.length.toString() !== functionDefParamCard.get(i.invoked)}`, { node: protocol })
                if (functionDefParamCard.get(i.invoked.toString())) {
                    if (i.args.args.length.toString() !== functionDefParamCard.get(i.invoked)) {
                        accept(`error`, `"${i.invoked}" requires "${functionDefParamCard.get(i.invoked)}" arguments to be passed, but you provided "${i.args.args.length}" arguments.`, { node: i })
                        returnMap.set(i,false)
                    }else{
                        returnMap.set(i,true)
                    }
                    
                }
            })
        knowledgeClass.setFunctionCardinalityMap(returnMap)
    }
}