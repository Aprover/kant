import { MaybePromise, ValidationAcceptor, streamAllContents } from "langium";
import { Protocol, isKnowledgeDefCustom, isKnowledgeDefCustomName, isKnowledgeDefListDestructuring, isKnowledgeDefSetDestructuring, isKnowledgeList, isKnowledgeRef, isKnowledgeSet } from "../generated/ast";

export const destructuringNonSetNonListValues = {
    /**
     * 
     * @param protocol 
     * @param accept 
     */
    destructuringNonSetNonListValues: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void> => {
        const setNames = new Set<string>()
        const listNames = new Set<string>()

        streamAllContents(protocol).filter(isKnowledgeDefCustom).forEach(defCustom => {
            if (isKnowledgeDefCustomName(defCustom.left) && isKnowledgeSet(defCustom.value)) {
                setNames.add(defCustom.left.name)
            }
            if (isKnowledgeDefCustomName(defCustom.left) && isKnowledgeList(defCustom.value)) {
                listNames.add(defCustom.left.name)
            }
        })

        streamAllContents(protocol).filter(isKnowledgeDefSetDestructuring).forEach(sd => {
            const right = sd.$container.value
            if (isKnowledgeRef(right) || isKnowledgeSet(right)) {
                if (isKnowledgeRef(right)) {
                    if (!setNames.has(right.ref)) {
                        accept(`error`, `Destructured value is not a set`, { node: right })        
                    }
                }
            } else {
                accept(`error`, `Destructured value is not a set`, { node: right })
            }
        })

        streamAllContents(protocol).filter(isKnowledgeDefListDestructuring).forEach(ld => {
            const right = ld.$container.value
            if (isKnowledgeRef(right) || isKnowledgeList(right)) {
                if (isKnowledgeRef(right)) {
                    if (!listNames.has(right.ref)) {
                        accept(`error`, `Destructured value is not a list`, { node: right })        
                    }
                }
            } else {
                accept(`error`, `Destructured value is not a list`, { node: right })
            }
        })
    }
}