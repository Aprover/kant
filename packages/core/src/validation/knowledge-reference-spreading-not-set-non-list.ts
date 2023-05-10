import { MaybePromise, ValidationAcceptor } from "langium";
import { Protocol, isKnowledgeBase, isKnowledgeDef, isKnowledgeDefCustom, isKnowledgeDefCustomName, isKnowledgeFromFunction, isKnowledgeList, isKnowledgeRef, isKnowledgeSet, isKnowledgeSpreading } from "../generated/ast";

export const knowledgeReferenceSpreadingOfNonSetNonListValues =  {
    /**
     * 
     * @param protocol 
     * @param accept 
     */
    knowledgeReferenceSpreadingOfNonSetNonListValues: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void> => {
        const knowledgeSetNames = new Set<string>()
        const knowledgeListNames = new Set<string>()

        protocol.elements.filter(isKnowledgeBase).forEach(knowledgeBase => {
            
            if (isKnowledgeDef(knowledgeBase.knowledge)) {
                if (isKnowledgeDefCustom(knowledgeBase.knowledge)) {
                    
                    if (isKnowledgeSet(knowledgeBase.knowledge.value)) {
                        
                        let setName: string = "null"

                        if (isKnowledgeDefCustomName(knowledgeBase.knowledge.left)) {
                            setName = knowledgeBase.knowledge.left.name
                            knowledgeSetNames.add(setName)
                        }

                        const setKnowledgeDef = knowledgeBase.knowledge.value.content.filter(isKnowledgeDef)
                        setKnowledgeDef.forEach(knowledgeDef => {
                            if (isKnowledgeDefCustom(knowledgeDef)) {
                                if (isKnowledgeSet(knowledgeDef.value)) {
                                    if (isKnowledgeDefCustomName(knowledgeDef.left)) { 
                                        if (setName !== "null") {
                                            const innerSet = setName.concat(".").concat(knowledgeDef.left.name)
                                            knowledgeSetNames.add(innerSet)
                                        }
                                    }
                                }
                                if (isKnowledgeList(knowledgeDef.value)) {
                                    if (isKnowledgeDefCustomName(knowledgeDef.left)) { 
                                        if (setName !== "null") {
                                            const innerList = setName.concat(".").concat(knowledgeDef.left.name)
                                            knowledgeListNames.add(innerList)
                                        }
                                    }
                                }
                            }
                        })
                    
                    }

                    if (isKnowledgeList(knowledgeBase.knowledge.value)) {
                        if (isKnowledgeDefCustomName(knowledgeBase.knowledge.left)) {
                            knowledgeListNames.add(knowledgeBase.knowledge.left.name)
                        }
                    }
                }
            }
        })

        const finalSet = new Set<string>()
        knowledgeListNames.forEach(listName => {
            finalSet.add(listName)
        })
        knowledgeSetNames.forEach(setName => {
            finalSet.add(setName)
        })

        const knowledgeBases = protocol.elements.filter(isKnowledgeBase)
        knowledgeBases.forEach(knowledgeBase => {
            if (isKnowledgeDef(knowledgeBase.knowledge)) {
                if (isKnowledgeDefCustom(knowledgeBase.knowledge)) {
                    if (isKnowledgeSet(knowledgeBase.knowledge.value)) {
                        const knowledgeSet = knowledgeBase.knowledge.value
                        knowledgeSet.content.forEach(setContent => {
                            if (isKnowledgeSpreading(setContent)) {
                                if (isKnowledgeRef(setContent.ref)) {
                                    let toCheck = setContent.ref.ref
                                    if (setContent.ref.access.length !== 0) {
                                        toCheck = toCheck.concat(".").concat(setContent.ref.access.toString())
                                    }
                                    // accept(`info`, `${toCheck}`, { node: protocol })
                                    if (!finalSet.has(toCheck)) {
                                        accept(`error`, `Knowledge reference spreading of non set or non list values.`, { node: setContent })
                                    }
                                }
                            }
                        })
                    }
                    if (isKnowledgeList(knowledgeBase.knowledge.value)) {
                        const knowledgeList = knowledgeBase.knowledge.value
                        knowledgeList.values.forEach(listValue => {
                            if (isKnowledgeSpreading(listValue)) {
                                if (isKnowledgeRef(listValue.ref)) {
                                    let toCheck = listValue.ref.ref
                                    if (listValue.ref.access.length !== 0) {
                                        toCheck = toCheck.concat(".").concat(listValue.ref.access.toString())
                                    }
                                    // accept(`info`, `${toCheck}`, { node: protocol })
                                    if (!finalSet.has(toCheck)) {
                                        accept(`error`, `Knowledge reference spreading of non set or non list values.`, { node: listValue })
                                    }
                                }
                            }
                        })
                    }

                    if (isKnowledgeFromFunction(knowledgeBase.knowledge.value)) {
                        if (knowledgeBase.knowledge.value.args !== undefined) {
                            if (isKnowledgeSpreading(knowledgeBase.knowledge.value.args)) {
                                if (isKnowledgeRef(knowledgeBase.knowledge.value.args.ref)) {
                                    let x = knowledgeBase.knowledge.value.args.ref
                                    let toCheck = x.ref
                                    if (x.access.length !== 0) {
                                        toCheck = toCheck.concat(".").concat(x.access.toString())
                                    }
                                    if (!finalSet.has(toCheck)) {
                                        accept(`error`, `Knowledge reference spreading of non set or non list values.`, { node: x })
                                    }
                                }
                            }
                        }
                    }
                }
            }
        })
    }
}