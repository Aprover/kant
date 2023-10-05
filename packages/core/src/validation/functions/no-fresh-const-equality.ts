import type { MaybePromise, ValidationAcceptor } from "langium"
import { streamAllContents } from "langium"
import type { Protocol } from "../../generated/ast"
import { isEqualityCheck, isKnowledgeDefBuiltin } from "../../generated/ast"

export const noFreshConstEquality = {
    noFreshConstEquality: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void> => {
        const freshs = new Set<string>()
        const consts = new Set<string>()

        streamAllContents(protocol)
            .filter(isKnowledgeDefBuiltin)
            .forEach(kdb => {
                if (kdb.type === `fresh`) {
                    kdb.name.forEach(n => {
                        freshs.add(n)
                    })
                }
                if (kdb.type === `const`) {
                    kdb.name.forEach(n => {
                        consts.add(n)
                    })
                }
            })

        streamAllContents(protocol)
            .filter(isEqualityCheck)
            .forEach(ec => {
                if (!ec.not) {
                    let hasFresh = false
                    let hasConst = false
                    ec.knowledge.forEach(k => {
                        if (freshs.has(k.ref)) {
                            hasFresh = true
                        }
                        if (consts.has(k.ref)) {
                            hasConst = true
                        }
                        if (hasConst && hasFresh) {
                            accept(
                                `error`,
                                `Equality check has both const and fresh references, these values cannot be equal.`,
                                { node: ec }
                            )
                        }
                    })
                }
            })
    }
}
