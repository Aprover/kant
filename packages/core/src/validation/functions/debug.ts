import { streamAllContents, type MaybePromise, type ValidationAcceptor } from "langium"
import { type Protocol } from "../../generated/ast"

export const debug = {
    debug: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void> => {
        streamAllContents(protocol).forEach(node => {
            accept(`info`, `${node.$type}`, { node: protocol })
        })
    }
}
