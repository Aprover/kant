import { MaybePromise, ValidationAcceptor, findRootNode, streamAllContents } from "langium";
import { Protocol, isKnowledgeFromFunction, isKnowledgeFromFunctionArgsElements } from "../../generated/ast";

export const decParams = {
    decParams: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void> => {
        streamAllContents(protocol)
            .filter(isKnowledgeFromFunction)
            .forEach(kff => {
                if (
                    findRootNode(protocol).$document?.uri.toString() !== `builtin:/prelude.kant` &&
                    !findRootNode(protocol).$document?.uri.toString().includes(`prelude`)
                ) {
                    if (kff.invoked.ref?.name === `DEC`) {
                        if (isKnowledgeFromFunctionArgsElements(kff.args)) {
                            if (kff.args.args.length > 1) {
                                accept(`error`, `DEC takes only one argument`, { node: kff })
                            }
                        }
                        if (kff.key === undefined) {
                            accept(`error`, `DEC requires a key`, { node: kff })
                        }
                    }
                }
            })
    }
}