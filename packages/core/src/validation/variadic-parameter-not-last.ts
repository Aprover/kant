import { MaybePromise, ValidationAcceptor, streamAllContents } from "langium";
import { Protocol, isFunctionDef } from "../generated/ast";

export const variadicParameterNotLast = {
    /**
     * 
     * @param protocol 
     * @param accept 
     */
    variadicParameterNotLast: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void> => {
        streamAllContents(protocol).filter(isFunctionDef).forEach(functionDef => {
            const params = functionDef.params
            const len = params.length
            for (let i = 0; i < len; i++) {
                if (params[i]?.variadic && i != len - 1) {
                    accept(`error`, `Variadic parameter should be the last parameter of the function.`, { node: functionDef })
                }
            }
        })
    }
}