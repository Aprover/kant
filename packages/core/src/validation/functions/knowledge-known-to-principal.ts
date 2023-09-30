import { MaybePromise, streamAllContents, ValidationAcceptor } from "langium"
import {
    isCommunication,
    isKnowledgeDefBuiltin,
    isKnowledgeDefCustom,
    isKnowledgeDefCustomName,
    isKnowledgeRef,
    isPrincipal,
    isPrincipalKnowledgeDef,
    isSharedKnowledgeDef,
    Protocol
} from "../../generated/ast"

export const knowledgeKnownToPrincipal = {
    knowledgeKnownToPrincipal: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void> => {
        
        

        
        
        const principalKnowledgeMap = new Map<string, string[]>()
        streamAllContents(protocol)
            .filter(isPrincipal)
            .forEach(principal => {
                principalKnowledgeMap.set(principal.name, [])
            })
        

        
        streamAllContents(protocol)
            .filter(isSharedKnowledgeDef)
            .forEach(skd => {
                if (isKnowledgeDefBuiltin(skd.knowledge)) {
                    for (const principalKey of principalKnowledgeMap.keys()) {
                        const knowledgeArray = principalKnowledgeMap.get(principalKey)
                        if (knowledgeArray) {
                            principalKnowledgeMap.set(principalKey, [...knowledgeArray, ...skd.knowledge.name])
                        }
                    }
                }
                if (isKnowledgeDefCustom(skd.knowledge) && isKnowledgeDefCustomName(skd.knowledge.left)) {
                    for (const principalKey of principalKnowledgeMap.keys()) {
                        const knowledgeArray = principalKnowledgeMap.get(principalKey)
                        if (knowledgeArray) {
                            principalKnowledgeMap.set(principalKey, [...knowledgeArray, skd.knowledge.left.name])
                        }
                    }
                }
            })

        
        
        streamAllContents(protocol)
            .filter(isPrincipalKnowledgeDef)
            .forEach(pkd => {
                pkd.target.forEach(p => {
                    const principal = p.ref?.name
                    if (principal) {
                        pkd.knowledge.filter(isKnowledgeDefBuiltin).forEach(kdb => {
                            kdb.name.forEach(n => {
                                const prev = principalKnowledgeMap.get(principal)
                                if (prev) {
                                    principalKnowledgeMap.set(principal, [...prev, n])
                                }
                            })
                        })
                        pkd.knowledge.filter(isKnowledgeDefCustom).forEach(cn => {
                            if (isKnowledgeDefCustomName(cn.left)) {
                                const prev = principalKnowledgeMap.get(principal)
                                if (prev) {
                                    principalKnowledgeMap.set(principal, [...prev, cn.left.name])
                                }
                            }
                        })
                    }
                })
            })

        
        streamAllContents(protocol)
            .filter(isCommunication)
            .forEach(c => {
                c.ref.forEach(r => {
                    c.to.forEach(p => {
                        const name = p.ref?.name
                        if (name) {
                            const principalKnowledge = principalKnowledgeMap.get(name)
                            if (principalKnowledge) {
                                principalKnowledgeMap.set(name, [...principalKnowledge, r.ref])
                            }
                        }
                    })
                })
            })


        streamAllContents(protocol)
            .filter(isPrincipalKnowledgeDef)
            .forEach(pkd => {
                pkd.target.forEach(p => {
                    pkd.knowledge.forEach(k => {
                        streamAllContents(k)
                            .filter(isKnowledgeRef)
                            .forEach(r => {
                                const name = p.ref?.name
                                if (name) {
                                    const refs = principalKnowledgeMap.get(name)
                                    if (refs) {
                                        if (!refs.includes(r.ref)) {
                                            accept("error", `${name} doesn't know ${r.ref}.`, { node: r })
                                        }
                                    }
                                }
                            })
                    })
                })
            })
    }
}
