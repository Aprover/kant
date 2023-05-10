import { MaybePromise, ValidationAcceptor, streamAllContents } from "langium";
import { Protocol, isFunctionDef, isFunctionInversionDef } from "../generated/ast";

export const invertionFunctionWithWrongNumberOfParameters = {
    /**
     * 
     * @param protocol 
     * @param accept 
     */
    invertionFunctionWithWrongNumberOfParameters: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void> => {
        const functions = streamAllContents(protocol).filter(isFunctionDef)
        let invertedParams = 0;
        let inverterParams = 0;
        streamAllContents(protocol).filter(isFunctionInversionDef).forEach(fid => {
            functions.forEach(f => {
                if (f.name === fid.function.ref?.name) {
                    invertedParams = f.params.length
                }
                if (f.name === fid.inverter.ref?.name) {
                    inverterParams = f.params.length
                }
            })

            if (invertedParams !== inverterParams) {
                accept(`error`, `Inversion function ${fid.inverter.ref?.name} has incompatible number of parameters compared to inverted function ${fid.function.ref?.name}`, { node: fid })
            }
        })

        /* const functions = streamAllContents(protocol).filter(isFunctionDef)
        
        streamAllContents(protocol).filter(isFunctionInversionDef).forEach(fid => {
            functions.forEach(f => {
                let invertedParamsCount = 0;
                let inverterParamsCount = 0;
                if (f.name === fid.function.ref?.name) {
                    invertedParamsCount = f.params.length
                    accept(`info`, `INVERTED: ${fid.function.ref?.name}, param length: ${fid.function.ref?.params.length}`, { node: f })
                }
                if (f.name === fid.inverter.ref?.name) {
                    inverterParamsCount = f.params.length
                    accept(`info`, `INVERTER: ${fid.function.ref?.name}, param length: ${fid.function.ref?.params.length}`, { node: f })
                }
                if (invertedParamsCount !== inverterParamsCount) {
                    accept(`error`, `Inversion function ${fid.inverter.ref?.name} has incompatible number of parameters compared to inverted function ${fid.function.ref?.name}`, { node: fid })
                }

            })
        }) */

        /* const functionDefs = protocol.elements.filter(isFunctionDef)

        const properties = protocol.elements.filter(isPropertyDef)
        properties.forEach(propertyDef => {
            if (isFunctionInversionDef(propertyDef.property)) {
                const inverter = propertyDef.property.inverter
                const inverted = propertyDef.property.function

                var invertedFunctionParamsCount = 0
                var inverterFunctionParamsCount = 0;
                
                functionDefs.forEach(functionDef => {
                    if (inverted.ref !== undefined) {
                        if (functionDef.name === inverted.ref.name) {
                            
                            invertedFunctionParamsCount = functionDef.params.length 
                        }
                    }
                    if (inverter.ref !== undefined) {
                        if (functionDef.name === inverter.ref.name) {
                            inverterFunctionParamsCount = functionDef.params.length
                        }
                    }
                })

                if (invertedFunctionParamsCount !== inverterFunctionParamsCount) {
                    if (inverter.ref !== undefined) {
                        accept(`error`, `Inversion function ${inverter.ref.name} has incompatible number of parameters compared to inverted function`, { node: propertyDef })

                    }
                }
            }
        }) */
    }
}