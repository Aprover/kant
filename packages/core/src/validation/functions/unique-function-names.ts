import type { MaybePromise, ValidationAcceptor } from "langium"
import { streamAllContents } from "langium"
import type { Protocol } from "../../generated/ast"
import { isFunctionDef } from "../../generated/ast"

export const uniqueFunctionNames = {
    uniqueFunctionNames: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void> => {
        const functionNames = new Set<string>()
        streamAllContents(protocol)
            .filter(isFunctionDef)
            .forEach(fd => {
                if (functionNames.has(fd.name)) {
                    accept(`error`, `Function name "${fd.name}" already used.`, { node: fd })
                }
                functionNames.add(fd.name)
            })
    }
}
