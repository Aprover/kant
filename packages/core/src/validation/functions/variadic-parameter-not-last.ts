import { streamAllContents, type MaybePromise, type ValidationAcceptor } from "langium"
import { isFunctionDef, type Protocol } from "../../generated/ast"

// TODO: CORREGGERE ALLA LUCE DELLA NUOVA GRAMMATICA

export const variadicParameterNotLast = {
    variadicParameterNotLast: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void> => {
        streamAllContents(protocol)
            .filter(isFunctionDef)
            .forEach(functionDef => {
                const params = functionDef.var
                const len = params.length
                for (let i = 0; i < len; i++) {
                    if (params[i] && i != len - 1) {
                        accept(`error`, `Variadic parameter should be the last parameter of the function.`, {
                            node: functionDef
                        })
                    }
                }
            })
    }
}
