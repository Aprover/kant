import { streamAllContents, type MaybePromise, type ValidationAcceptor } from "langium"
import {
    isAuthenticationCheck,
    isCommunication,
    isKnowledgeCheck,
    isPrincipal,
    isPrincipalKnowledgeDef,
    type Protocol
} from "../../generated/ast"

export const noUnusedPrincipals = {
    noUnusedPrincipals: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void> => {
        const principals = new Set<string>()
        streamAllContents(protocol)
            .filter(isPrincipal)
            .forEach(p => {
                principals.add(p.name)
            })

        const references = new Set<string>()
        streamAllContents(protocol)
            .filter(isCommunication)
            .forEach(c => {
                if (c.from.ref !== undefined) {
                    references.add(c.from.ref.name)
                }
                c.to.forEach(to => {
                    if (to.ref !== undefined) {
                        references.add(to.ref.name)
                    }
                })
            })

        streamAllContents(protocol)
            .filter(isAuthenticationCheck)
            .forEach(ac => {
                if (ac.from.ref !== undefined) {
                    references.add(ac.from.ref.name)
                }
                if (ac.target.ref !== undefined) {
                    references.add(ac.target.ref.name)
                }
            })

        streamAllContents(protocol)
            .filter(isKnowledgeCheck)
            .forEach(kc => {
                kc.target.forEach(tar => {
                    if (tar.ref !== undefined) {
                        references.add(tar.ref.name)
                    }
                })
            })

        streamAllContents(protocol)
            .filter(isPrincipalKnowledgeDef)
            .forEach(pkd => {
                pkd.target.forEach(pref => {
                    if (pref.ref !== undefined) {
                        references.add(pref.ref.name)
                    }
                })
            })

        principals.forEach(p => {
            if (!references.has(p)) {
                streamAllContents(protocol)
                    .filter(isPrincipal)
                    .forEach(principal => {
                        if (principal.name === p) {
                            accept(`warning`, `Principal ${p} is declared but never used.`, { node: principal })
                        }
                    })
            }
        })
    }
}
