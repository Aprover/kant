import { streamAllContents, type MaybePromise, type ValidationAcceptor } from "langium"
import { isFunctionDef, isFunctionInversionDef, isPropertyDef, type Protocol } from "../../generated/ast"

export const invertedOneWay = {
    invertedOneWay: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void> => {
        let owFunctions: string[] = [`HASH`, `MAC`, `DF`, `PUB_GEN`]
        // trovare tutte le fx dichiarate one way
        streamAllContents(protocol)
            .filter(isFunctionDef)
            .forEach(fd => {
                if (fd.ow) {
                    owFunctions = [...owFunctions, fd.name]
                }
            })

        // cercare tutte le proprietà per assicurarsi che non ci siano proprietà di inversione per le ow fx
        streamAllContents(protocol)
            .filter(isPropertyDef)
            .forEach(pd => {
                if (isFunctionInversionDef(pd.property)) {
                    const inverterIsOw = pd.property.inverter.ref?.ow
                    if (inverterIsOw) {
                        accept(`error`, `${pd.property.inverter.ref?.name} is a one way function, it can't invert another function.`, { node: pd })
                    }
                    const invertedIsOw = pd.property.firstParam.invoked.ref?.ow
                    if (invertedIsOw) {
                        accept(`error`, `${pd.property.firstParam.invoked.ref?.name} is a one way function, it can't be inverted.`, { node: pd })
                    }
                }
            })
    }
}