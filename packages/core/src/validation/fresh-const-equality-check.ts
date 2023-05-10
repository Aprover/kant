import { MaybePromise, ValidationAcceptor, streamAllContents } from "langium";
import { Protocol, isEqualityCheck, isKnowledgeDefBuiltin } from "../generated/ast";

export const freshConstInEqualityCheck = {
    /**
     * 
     * @param protocol 
     * @param accept 
     */
    freshConstInEqualityCheck: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void> => {
        const freshKn = new Set<string>()
        const constKn = new Set<string>()

        streamAllContents(protocol).filter(isKnowledgeDefBuiltin).forEach(builtIn => {
            switch (builtIn.type) {
                case "const": {
                    builtIn.name.forEach(n => {
                        constKn.add(n)
                    })
                    break
                }
                case "fresh": {
                    builtIn.name.forEach(n => {
                        freshKn.add(n)
                    })
                    break
                }
            }
        })

        streamAllContents(protocol).filter(isEqualityCheck).forEach(eCheck => {
            let freshRef: string | undefined = undefined;
            let constRef: string | undefined = undefined;
            eCheck.knowledge.forEach(k => {
                if (freshKn.has(k.ref)) {
                    freshRef = k.ref
                }
                if (constKn.has(k.ref)) {
                    constRef = k.ref
                }
            })

            if (freshKn !== undefined && constKn !== undefined) {
                accept(`error`, `fresh knowledge reference ${freshRef} can't be equal to const knowledge reference ${constRef}.`, { node: eCheck })
            }
        })
    }
}