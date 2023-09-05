import { findRootNode, streamAllContents, type MaybePromise, type ValidationAcceptor } from "langium"
import { isKnowledgeFromFunction, isKnowledgeFromFunctionArgsElements, type Protocol } from "../../generated/ast"

export const pkeDecParamsKeys = {
    pkeDecParamsKeys: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void> => {
        streamAllContents(protocol)
            .filter(isKnowledgeFromFunction)
            .forEach(kff => {
                if (
                    findRootNode(protocol).$document?.uri.toString() !== `builtin:/prelude.kant` &&
                    !findRootNode(protocol).$document?.uri.toString().includes(`prelude`)
                ) {
                    if (kff.invoked.ref?.name === `PKE_DEC`) {
                        if (isKnowledgeFromFunctionArgsElements(kff.args)) {
                            if (kff.args.args.length > 1) {
                                accept(`error`, `PKE_DEC takes only one argument`, { node: kff })
                            }
                        }
                        if (kff.key === undefined) {
                            accept(`error`, `PKE_DEC requires a key`, { node: kff })
                        }
                    }
                }
            })
    }
}
