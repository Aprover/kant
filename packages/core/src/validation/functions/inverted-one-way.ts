import { streamAllContents, type MaybePromise, type ValidationAcceptor } from "langium"
import { isFunctionDef, isFunctionInversionDef, isPropertyDef, type Protocol } from "../../generated/ast"

export const invertedOneWay = {
    invertedOneWay: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void> => {
        let owFunctions: string[] = [`HASH`, `MAC`, `DF`, `HDKF`, `PW_HASH`, `PUB_GEN`]
        // trovare tutte le fx dichiarate one way
        streamAllContents(protocol)
            .filter(isFunctionDef)
            .forEach(fd => {
                if (fd.ow) {
                    owFunctions = [...owFunctions, fd.name]
                }
            })

        /* for (const n of owFunctions) {
            accept(`info`, `${n}`, { node: protocol })
        } */

        // cercare tutte le proprietà per assicurarsi che non ci siano proprietà di inversione per le ow fx
        streamAllContents(protocol)
            .filter(isPropertyDef)
            .forEach(pd => {
                if (isFunctionInversionDef(pd.property)) {
                    const inverted = pd.property.function.ref?.name
                    if (inverted !== undefined) {
                        /* accept(
                            `info`,
                            `${owFunctions.includes(inverted)} = result of owFunctions.include(${inverted})`,
                            { node: protocol }
                        ) */
                        if (owFunctions.includes(inverted)) {
                            accept(`error`, `${inverted} is a one way function, it can't be inverted.`, { node: pd })
                        }
                    }
                }
            })
    }
}
