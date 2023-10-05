import { streamAllContents, type MaybePromise, type ValidationAcceptor } from "langium"
import { isCommunication, type Protocol } from "../../generated/ast"

export const uniqueCommunicationNames = {
    uniqueCommunicationNames: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void> => {
        const communicationNames = new Set<string>()
        streamAllContents(protocol)
            .filter(isCommunication)
            .forEach(c => {
                if (c.messageId !== undefined) {
                    if (communicationNames.has(c.messageId)) {
                        accept(`error`, `Communication name "${c.messageId}" already used.`, { node: c })
                    }
                    communicationNames.add(c.messageId)
                }
            })
    }
}
