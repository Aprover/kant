import type { MaybePromise, ValidationAcceptor } from "langium"
import { streamAllContents } from "langium"
import type { Protocol } from "../../generated/ast"
import {
    isCommunication,
    isKnowledgeDefBuiltin,
    isKnowledgeDefCustom,
    isKnowledgeDefCustomName,
    isPrincipal,
    isPrincipalKnowledgeDef,
    isSharedKnowledgeDef
} from "../../generated/ast"

export const checkKnowledgeKnownToSender = {
    checkKnowledgeKnownToSender: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void> => {
        const principalKnowledgeMap = new Map<string, string[]>()
        
        streamAllContents(protocol)
            .filter(isPrincipal)
            .forEach(principal => {
                principalKnowledgeMap.set(principal.name, [])
            })

        streamAllContents(protocol)
            .filter(isSharedKnowledgeDef)
            .forEach(sharedKnowledgeDef => {
                if (isKnowledgeDefBuiltin(sharedKnowledgeDef.knowledge)) {
                    sharedKnowledgeDef.knowledge.name.forEach(knowledgeName => {
                        for (const principalKey of principalKnowledgeMap.keys()) {
                            const knowledgeArray = principalKnowledgeMap.get(principalKey)
                            if (knowledgeArray !== undefined) {
                                principalKnowledgeMap.set(principalKey, [...knowledgeArray, knowledgeName])
                            }
                        }
                    })
                }
                if (isKnowledgeDefCustom(sharedKnowledgeDef.knowledge)) {
                    if (isKnowledgeDefCustomName(sharedKnowledgeDef.knowledge.left)) {
                        const name = sharedKnowledgeDef.knowledge.left.name
                        for (const principalKey of principalKnowledgeMap.keys()) {
                            const knowledgeArray = principalKnowledgeMap.get(principalKey)
                            if (knowledgeArray !== undefined) {
                                principalKnowledgeMap.set(principalKey, [...knowledgeArray, name])
                            }
                        }
                    }
                }
            })

        streamAllContents(protocol)
            .filter(isPrincipalKnowledgeDef)
            .forEach(principalKnowledgeDef => {
                let knowledgeList: string[] = []
                principalKnowledgeDef.knowledge.forEach(knowledgeDef => {
                    if (isKnowledgeDefBuiltin(knowledgeDef)) {
                        knowledgeDef.name.forEach(knowledgeName => {
                            knowledgeList = [...knowledgeList, knowledgeName]
                        })
                    }
                    if (isKnowledgeDefCustom(knowledgeDef)) {
                        if (isKnowledgeDefCustomName(knowledgeDef.left)) {
                            knowledgeList = [...knowledgeList, knowledgeDef.left.name]
                        }
                    }
                })
                principalKnowledgeDef.target.forEach(principalReference => {
                    const name = principalReference.ref?.name
                    if (name !== undefined) {
                        const previousKnowledge = principalKnowledgeMap.get(name)
                        if (previousKnowledge !== undefined) {
                            principalKnowledgeMap.set(name, [...previousKnowledge, ...knowledgeList])
                        }
                    }
                })
            })

        streamAllContents(protocol)
            .filter(isCommunication)
            .forEach(communication => {
                const senderName = communication.from.ref?.name
                if (senderName !== undefined) {
                    const senderKnowledge = principalKnowledgeMap.get(senderName)
                    if (senderKnowledge !== undefined) {
                        communication.ref.forEach(reference => {
                            if (!senderKnowledge.includes(reference.ref)) {
                                accept(`error`, `Principal ${senderName} does not know ${reference.ref} here.`, { node: communication })
                            }
                        })
                    }
                }
                communication.ref.forEach(knowledgeReference => {
                    communication.to.forEach(principalReference => {
                        const principalName = principalReference.ref?.name
                        if (principalName !== undefined) {
                            const principalKnowledge = principalKnowledgeMap.get(principalName)
                            if (principalKnowledge !== undefined) {
                                principalKnowledgeMap.set(principalName, [...principalKnowledge, knowledgeReference.ref])
                            }
                        }
                    })
                })
            })
    }
}