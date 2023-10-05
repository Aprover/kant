import { streamAllContents, type MaybePromise, type ValidationAcceptor } from "langium"
import { isCommunication, type Protocol } from "../../generated/ast"

export const noSelfCommunication = {
    noSelfCommunication: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void> => {
        streamAllContents(protocol)
            .filter(isCommunication)
            .forEach(c => {
                const sender = c.from.ref?.name
                c.to.forEach(p => {
                    if (sender === p.ref?.name) {
                        accept(`error`, `Principal ${c.from.ref?.name} cannot communicate with himself.`, { node: c })
                    }
                })
            })
    }
}
