import { MaybePromise, ValidationAcceptor, streamAllContents } from "langium";
import { Protocol, isKnowledgeDefBuiltin, isKnowledgeDefCustomName, isKnowledgeFromFunction, isKnowledgeRef } from "../../generated/ast";

export const keysAreDeclared = {
    keysAreDeclared: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void> => {
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
            // full knowledge here, need to find the function invocations that use keys
            streamAllContents(protocol)
                .filter(isKnowledgeFromFunction)
                .forEach(kff => {
                    if (kff.key) {
                        if (isKnowledgeRef(kff.key)) {
                            if (!knowledge.has(kff.key.ref)) {
                                accept(`error`, `${kff.key.ref} has not been declared.`, { node: kff })
                            }
                        }
                    }
                })
        }


    }
}