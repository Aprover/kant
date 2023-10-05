import { findRootNode, streamAllContents, type MaybePromise, type ValidationAcceptor } from "langium"
import { isPrincipal, type Protocol } from "../../generated/ast"

export const minimumPrincipalsPerProtocol = {
    minimumPrincipalsPerProtocol: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void> => {
        if (
            findRootNode(protocol).$document?.uri.toString() !== `builtin:/prelude.kant` &&
            !findRootNode(protocol).$document?.uri.toString().includes(`prelude`)
        ) {
            if (streamAllContents(protocol).filter(isPrincipal).count() < 2) {
                accept(`error`, `A protocol should have at least 2 principals.`, { node: protocol })
            }
        }
    }
}
