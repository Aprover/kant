/*
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

export const knowledgeKnownToSender = {
    knowledgeKnownToSender: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void> => {
        const km = new Map<string, string[]>() // Map<principal, his knowledge>()
        streamAllContents(protocol)
            .filter(isPrincipal)
            .forEach(p => {
                km.set(p.name, [])
            })
        streamAllContents(protocol)
            .filter(isSharedKnowledgeDef)
            .forEach(skd => {
                if (isKnowledgeDefBuiltin(skd.knowledge)) {
                    skd.knowledge.name.forEach(n => {
                        for (const k of km.keys()) {
                            const pArray = km.get(k)
                            if (pArray !== undefined) {
                                km.set(k, [...pArray, n])
                            }
                        }
                    })
                }
                if (isKnowledgeDefCustom(skd.knowledge)) {
                    if (isKnowledgeDefCustomName(skd.knowledge.left)) {
                        const name = skd.knowledge.left.name
                        for (const k of km.keys()) {
                            const pArray = km.get(k)
                            if (pArray !== undefined) {
                                km.set(k, [...pArray, name])
                            }
                        }
                    }
                }
            })
        streamAllContents(protocol)
            .filter(isPrincipalKnowledgeDef)
            .forEach(pkd => {
                let knowledge: string[] = []
                pkd.knowledge.forEach(kn => {
                    if (isKnowledgeDefBuiltin(kn)) {
                        kn.name.forEach(n => {
                            knowledge = [...knowledge, n]
                        })
                    }
                    if (isKnowledgeDefCustom(kn)) {
                        if (isKnowledgeDefCustomName(kn.left)) {
                            knowledge = [...knowledge, kn.left.name]
                        }
                    }
                })
                pkd.target.forEach(pRef => {
                    const name = pRef.ref?.name
                    if (name !== undefined) {
                        const prev = km.get(name)
                        if (prev !== undefined) {
                            km.set(name, [...prev, ...knowledge])
                        }
                    }
                })
            })
        streamAllContents(protocol)
            .filter(isCommunication)
            .forEach(c => {
                const sender = c.from.ref?.name
                if (sender !== undefined) {
                    const senderKnowledge = km.get(sender)
                    if (senderKnowledge !== undefined) {
                        c.ref.forEach(r => {
                            if (!senderKnowledge.includes(r.ref)) {
                                accept(`error`, `Principal ${sender} does not know ${r.ref} here.`, { node: c })
                            }
                        })
                    }
                }
                c.ref.forEach(knowRef => {
                    c.to.forEach(pRef => {
                        const pName = pRef.ref?.name
                        if (pName !== undefined) {
                            const pKnow = km.get(pName)
                            if (pKnow !== undefined) {
                                km.set(pName, [...pKnow, knowRef.ref])
                            }
                        }
                    })
                })
            })
    }
}*/ 

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