import type { MaybePromise, ValidationAcceptor } from "langium"
import { findRootNode, streamAllContents } from "langium"
import type { Protocol } from "../../generated/ast"
import { isKnowledgeFromFunction, isKnowledgeFromFunctionArgsElements } from "../../generated/ast"

export const pkeEncParamsKeys = {
    pkeEncParamsKeys: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void> => {
        streamAllContents(protocol)
            .filter(isKnowledgeFromFunction)
            .forEach(kff => {
                if (
                    findRootNode(protocol).$document?.uri.toString() !== `builtin:/prelude.kant` &&
                    !findRootNode(protocol).$document?.uri.toString().includes(`prelude`)
                ) {
                    if (kff.invoked.ref?.name === `PKE_ENC`) {
                        if (isKnowledgeFromFunctionArgsElements(kff.args)) {
                            if (kff.args.args.length > 1) {
                                accept(`error`, `PKE_ENC takes only one argument`, { node: kff })
                            }
                        }
                        if (kff.key === undefined) {
                            accept(`error`, `PKE_ENC requires a key`, { node: kff })
                        }
                    }
                }
            })
    }
}
