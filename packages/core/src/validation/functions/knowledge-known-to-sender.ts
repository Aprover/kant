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
        // inizializzazione della mappa: <nome principal, set vuoto>
        streamAllContents(protocol)
            .filter(isPrincipal)
            .forEach(p => {
                km.set(p.name, [])
            })

        // cominciamo cercando la knowledge top level
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
                // controlliamo che mittente abbia la knowledge inviata
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
                // trasferiamo la knowledge ai destinatari
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
}
