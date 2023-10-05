import { MaybePromise, ValidationAcceptor, streamAllContents } from "langium";
import { Protocol } from "../../generated/ast";

export const debug = {
    debug: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void> => {
        streamAllContents(protocol)
            .forEach(node => {
                accept('info', `node type: ${node.$type}`, { node: protocol })
            })
    }
}