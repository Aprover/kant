import type { MaybePromise, ValidationAcceptor } from "langium"
import { streamAllContents } from "langium"
import type { Protocol } from "../../generated/ast"
import { isKnowledgeDefBuiltin, isKnowledgeDefCustomName, isKnowledgeRef, isListAccess } from "../../generated/ast"

export const knowledgeDeclarationBeforeUsage = {
    knowledgeDeclarationBeforeUsage: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void> => {
        if (
            protocol.$document?.uri.toString() !== `builtin:/prelude.kant` &&
            !protocol.$document?.uri.toString().includes(`prelude`)
        ) {
            const knowledge = new Set<string>()
            streamAllContents(protocol)
                .filter(isKnowledgeDefBuiltin)
                .forEach(kdb => {
                    kdb.name.forEach(n => {
                        knowledge.add(n)
                    })
                })
            streamAllContents(protocol)
                .filter(isKnowledgeDefCustomName)
                .forEach(cn => {
                    knowledge.add(cn.name)
                })

            streamAllContents(protocol)
                .filter(isKnowledgeRef)
                .forEach(ref => {
                    if (!knowledge.has(ref.ref)) {
                        accept(`error`, `${ref.ref} has not been declared.`, { node: ref })
                    }
                })
            streamAllContents(protocol)
                .filter(isListAccess)
                .forEach(la => {
                    if (!knowledge.has(la.ref)) {
                        accept(`error`, `${la.ref} has not been declared.`, { node: la })
                    }
                })
            //accept(`info`, `Knowledge: ${Array.from(knowledge)}`, { node: protocol })
            /*streamAllContents(protocol)
                .filter(isCommunication)
                .forEach(c => {
                    c.ref.forEach(kr => {
                        if (!knowledge.has(kr.ref)) {
                            accept(`error`, `${kr.ref} has not been declared.`, { node: c })
                        }
                    })
                })
            streamAllContents(protocol)
                .filter(isKnowledgeFromFunctionArgs)
                .forEach(kff => {
                    if (isKnowledgeSpreading(kff)) {
                        if (isKnowledgeRef(kff.ref)) {
                            if (!knowledge.has(kff.ref.ref)) {
                                accept(`error`, `${kff.ref.ref} has not been declared.`, { node: kff })
                            }
                        }
                        if (isKnowledgeSet(kff.ref)) {
                            kff.ref.content.filter(isKnowledgeRef).forEach(r => {
                                if (!knowledge.has(r.ref)) {
                                    accept(`error`, `${r.ref} has not been declared.`, { node: r })
                                }
                            })
                        }
                        if (isKnowledgeList(kff.ref)) {
                            kff.ref.values.filter(isKnowledgeRef).forEach(r => {
                                if (!knowledge.has(r.ref)) {
                                    accept(`error`, `${r.ref} has not been declared.`, { node: r })
                                }
                            })
                        }
                    }
                    if (isKnowledgeFromFunctionArgsElements(kff)) {
                        kff.args.filter(isKnowledgeRef).forEach(r => {
                            if (!knowledge.has(r.ref)) {
                                accept(`error`, `${r.ref} has not been declared.`, { node: r })
                            }
                        })
                        kff.args.filter(isKnowledgeSet).forEach(s => {
                            s.content.filter(isKnowledgeRef).forEach(r => {
                                if (!knowledge.has(r.ref)) {
                                    accept(`error`, `${r.ref} has not been declared.`, { node: r })
                                }
                            })
                        })
                        kff.args.filter(isKnowledgeList).forEach(l => {
                            l.values.filter(isKnowledgeRef).forEach(r => {
                                if (!knowledge.has(r.ref)) {
                                    accept(`error`, `${r.ref} has not been declared.`, { node: r })
                                }
                            })
                        })
                    }
                })*/
        }
    }
}
