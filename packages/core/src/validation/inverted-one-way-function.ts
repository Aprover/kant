import { MaybePromise, ValidationAcceptor, streamAllContents } from "langium";
import { Protocol, isFunctionDef, isFunctionInversionDef, isPropertyDef } from "../generated/ast";

export const invertedOneWayFunctions = {
    /**
     * 
     * @param protocol 
     * @param accept 
     */
    invertedOneWayFunctions: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void> => {
        const oneWayFunctions = new Set<string>()
        streamAllContents(protocol).filter(isFunctionDef).forEach(functionDef => {
            if (functionDef.ow) {
                oneWayFunctions.add(functionDef.name)
            }
        })

        streamAllContents(protocol).filter(isPropertyDef).forEach(propertyDef => {
            if (isFunctionInversionDef(propertyDef.property)) {
                if (propertyDef.property.function.ref !== undefined) {
                    const name = propertyDef.property.function.ref.name
                    if (oneWayFunctions.has(name)) {
                        accept(`error`, `${name} is a one way function, it can't be inverted.`, { node: propertyDef })
                    }
                }
            }
        })
    }
}