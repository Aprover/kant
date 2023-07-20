import { streamAllContents, type MaybePromise, type ValidationAcceptor } from "langium"
import {
    isKnowledgeDefBuiltin,
    isKnowledgeDefCustom,
    isKnowledgeDefCustomName,
    isPrincipal,
    isSharedKnowledgeDef,
    type Protocol
} from "../../generated/ast"

export const communicationPayloadKnownToSender = {
    communicationKnownToSender: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void> => {
        const principalKnowledge = new Map<string, string[]>()
        streamAllContents(protocol)
            .filter(isPrincipal)
            .forEach(p => {
                const name = p.name
                if (!principalKnowledge.has(name)) {
                    principalKnowledge.set(name, [])
                }
            })

        accept(`info`, `${Array.from(principalKnowledge.keys())}`, { node: protocol })

        streamAllContents(protocol)
            .filter(isSharedKnowledgeDef)
            .forEach(skd => {
                for (const principal of principalKnowledge.keys()) {
                    if (isKnowledgeDefBuiltin(skd.knowledge)) {
                        skd.knowledge.name.forEach(n => {
                            const previousKnowledge = principalKnowledge.get(principal)
                            if (previousKnowledge !== undefined) {
                                principalKnowledge.set(principal, [...previousKnowledge, n])
                            } else {
                                principalKnowledge.set(principal, [n])
                            }
                        })
                    } else if (isKnowledgeDefCustom(skd.knowledge)) {
                        if (isKnowledgeDefCustomName(skd.knowledge.left)) {
                            const previousKnowledge = principalKnowledge.get(principal)
                            if (previousKnowledge !== undefined) {
                                principalKnowledge.set(principal, [...previousKnowledge, skd.knowledge.left.name])
                            } else {
                                principalKnowledge.set(principal, [skd.knowledge.left.name])
                            }
                        }
                    }
                }
            })

        //accept(`info`, `${principalKnowledge.get(`A`)}`, { node: protocol })
    }
}
