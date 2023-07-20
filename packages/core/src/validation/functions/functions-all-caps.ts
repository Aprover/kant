import { streamAllContents, type MaybePromise, type ValidationAcceptor } from "langium"
import { isFunctionDef, type Protocol } from "../../generated/ast"

export const functionsAllCaps = {
    functionsAllCaps: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void> => {
        streamAllContents(protocol)
            .filter(isFunctionDef)
            .forEach(fd => {
                const allCaps = fd.name.toUpperCase()
                if (fd.name !== allCaps) {
                    accept(`warning`, `Function names should be all caps.`, { node: fd })
                }
            })
    }
}
