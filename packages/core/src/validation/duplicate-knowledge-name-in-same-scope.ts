import { MaybePromise, ValidationAcceptor } from "langium";
import { Protocol, isKnowledgeBase, isKnowledgeDef, isKnowledgeDefBuiltin, isKnowledgeDefCustom, isKnowledgeList, isKnowledgeRef, isKnowledgeSet, isKnowledgeValue } from "../generated/ast";

export const duplicateKnowledgeNameInSameScope = {
    /**
     * 
     * @param protocol 
     * @param accept 
     */
    duplicateKnowledgeNameInSameScope: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void> => {
        const definedBuiltinKnowledge = new Set<string>()
        protocol.elements.filter(isKnowledgeBase).forEach(knowledgeBase => {
            if (isKnowledgeDef(knowledgeBase.knowledge)) {
                if (isKnowledgeDefBuiltin(knowledgeBase.knowledge)) {
                    knowledgeBase.knowledge.name.forEach(knowledgeName => {
                        if (definedBuiltinKnowledge.has(knowledgeName)) {
                            accept(`error`, `Duplicate knowledge definition`, { node: knowledgeBase.knowledge })
                        } else {
                            definedBuiltinKnowledge.add(knowledgeName)
                        }
                    })
                }
                if (isKnowledgeDefCustom(knowledgeBase.knowledge)) {
                    if (isKnowledgeSet(knowledgeBase.knowledge.value)) {
                        const setKnowledge = new Set<string>()
                        knowledgeBase.knowledge.value.content.forEach(setValue => {
                            if (isKnowledgeDefBuiltin(setValue)) {
                                setValue.name.forEach(n => {
                                    if (setKnowledge.has(n)) {
                                        accept(`error`, `Duplicate knowledge definition`, { node: knowledgeBase.knowledge })
                                    } else {
                                        setKnowledge.add(n)
                                    }
                                })
                            }
                            if (isKnowledgeRef(setValue)) {
                                if (setKnowledge.has(setValue.ref.concat(setValue.access.toString()))) {
                                    accept(`error`, `Duplicate knowledge definition`, { node: knowledgeBase.knowledge })
                                } else {
                                    setKnowledge.add(setValue.ref.concat(setValue.access.toString()))
                                }
                            }
                        })
                    }
                }
            }

            if (isKnowledgeValue(knowledgeBase.knowledge)) {
                if (isKnowledgeSet(knowledgeBase.knowledge)) {
                    knowledgeBase.knowledge.content.forEach(setContent => {
                        if (isKnowledgeDefBuiltin(setContent)) {
                            setContent.name.forEach(name => {
                                if (definedBuiltinKnowledge.has(name)) {
                                    accept(`error`, `Duplicate knowledge definition`, { node: knowledgeBase.knowledge })
                                } else {
                                    definedBuiltinKnowledge.add(name)
                                }
                            })   
                        }
                    })
                }
                if (isKnowledgeList(knowledgeBase.knowledge)) {
                    const listKnowledge = new Set<string>()
                    knowledgeBase.knowledge.values.forEach(listVal => {
                        if (isKnowledgeRef(listVal)) {
                            if (listKnowledge.has(listVal.ref.concat(listVal.access.toString()))) {
                                accept(`error`, `Duplicate knowledge definition`, { node: knowledgeBase.knowledge })
                            } else {
                                listKnowledge.add(listVal.ref.concat(listVal.access.toString()))
                            }
                        }
                    })
                }
            }
        })
    }
}