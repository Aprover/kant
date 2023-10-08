import { MaybePromise, ValidationAcceptor, streamAllContents } from "langium";
import { KnowledgeClass } from "../../KnowledgeClass";
import { Protocol, isKnowledgeFromFunction, isKnowledgeRef} from "../../generated/ast";

export const correctFunctionInvocationParams = {
    correctFunctionInvocationParams: (knowledgeClass: KnowledgeClass, protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void> => {
        const functionToCheckMap = knowledgeClass.getFunctionCardinalityMap()
        streamAllContents(protocol)
            .filter(isKnowledgeFromFunction)
            .forEach(i => {
                if (functionToCheckMap.get(i)) {

                    let correctParamTypes: string[] = []
                    i.invoked.ref?.typeParams.forEach(param => {
                        correctParamTypes.push(param.type.ref?.name!)
                    })
                   
                    let paramNames=i.args.args
                    let k=0
                    paramNames.filter(isKnowledgeRef).forEach(pref => {
                        if(knowledgeClass.getGlobalKnowledgeDescriptorMap().get(pref.ref)?.getType()!==correctParamTypes[k]){
                            accept('error', `You used an incorrect param type: "${knowledgeClass.getGlobalKnowledgeDescriptorMap().get(pref.ref)?.getType()}", while the invoked function requires a parameter of type "${correctParamTypes[k]}."`, { node: i })
                        }
                           
                        k++
                    })

                    
                    
                }
                
            

            })
        }
}


