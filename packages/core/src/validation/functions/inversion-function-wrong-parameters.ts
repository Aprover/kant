import { streamAllContents, type MaybePromise, type ValidationAcceptor } from "langium"
import { isFunctionDef, isFunctionInversionDef, type Protocol } from "../../generated/ast"

export const inversionFunctionWithWrongNumberOfParameters = {
    inversionFunctionWithWrongNumberOfParameters: (
        protocol: Protocol,
        accept: ValidationAcceptor
    ): MaybePromise<void> => {
        const functions = streamAllContents(protocol).filter(isFunctionDef)
        let invertedParams = 0
        let inverterParams = 0
        streamAllContents(protocol)
            .filter(isFunctionInversionDef)
            .forEach(fid => {
                functions.forEach(f => {
                    if (f.name === fid.function.ref?.name) {
                        invertedParams = f.params.length
                    }
                    if (f.name === fid.inverter.ref?.name) {
                        inverterParams = f.params.length
                    }
                })

                if (invertedParams !== inverterParams) {
                    accept(
                        `error`,
                        `Inversion function ${fid.inverter.ref?.name} has incompatible number of parameters compared to inverted function ${fid.function.ref?.name}`,
                        { node: fid }
                    )
                }
            })
    }
}
