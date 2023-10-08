import { getContainerOfType, MaybePromise, streamAllContents, ValidationAcceptor } from "langium"
import { isCommunication, isKnowledgeRef, isPrincipalKnowledgeDef, isPropertyDef, Protocol } from "../../generated/ast"
import { KnowledgeClass } from "../../KnowledgeClass"
import { List } from "../utility/list"

export const knowledgeIsDeclaredForPrincipal = {
    knowledgeIsDeclaredForPrincipal: (
        knowledgeClass: KnowledgeClass,
        protocol: Protocol,
        accept: ValidationAcceptor
    ): MaybePromise<void> => {
        streamAllContents(protocol)
            .filter(isKnowledgeRef)
            .forEach(kr => {
                if (getContainerOfType(kr, isPropertyDef) === undefined) {
                    const indexes = knowledgeClass.getGlobalKnowledgeDescriptorMap().get(kr.ref)?.getIndexes()
                    if (indexes !== undefined) {
                        let principals: List = new List()
                        principals.append(
                            knowledgeClass.getPrincipalsAssociationKnowledge()[indexes![0]!]![indexes![1]!]!
                        )
                        const principalKnowledgeDef = getContainerOfType(kr, isPrincipalKnowledgeDef)
                        const communication = getContainerOfType(kr, isCommunication)
                        if (principalKnowledgeDef) {
                            principalKnowledgeDef.target.forEach(p => {
                                /* accept('error', `p.ref.name: ${p.ref?.name}`, { node: kr })
                            accept('error', `principals: ${principals.toString()}`, { node: kr })
                            accept('error', `indexes: ${indexes?.toString()}`, { node: kr })  */
                                let found = principals.contains(p.ref?.name!)

                                if (!found) {
                                    accept("error", `Principal "${p.ref?.name}" doesn't know "${kr.ref}" here.`, {
                                        node: kr
                                    })
                                }
                            })
                        }
                        if (communication) {
                            let found = principals.contains(communication.from.ref?.name!)
                            if (!found) {
                                accept(
                                    "error",
                                    `Principal "${communication.from.ref?.name}" doesn't know "${kr.ref}" here.`,
                                    { node: kr }
                                )
                            }
                        }
                    }
                }
            })
    }
}
