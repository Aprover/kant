import { streamAllContents, type MaybePromise, type ValidationAcceptor } from "langium"
import { isCommunication, type Protocol } from "../../generated/ast"

export const noDuplicationInCommunicationReceivers = {
    noDuplicationInCommunicationReceivers: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void> => {
        streamAllContents(protocol)
            .filter(isCommunication)
            .forEach(c => {
                const receivers = new Set<string>()
                c.to.forEach(principalRef => {
                    if (principalRef.ref?.name !== undefined) {
                        if (receivers.has(principalRef.ref.name)) {
                            accept(
                                `error`,
                                `Redundand declaration of principal ${principalRef.ref.name} in communication.`,
                                { node: c }
                            )
                        }
                        receivers.add(principalRef.ref.name)
                    }
                })
            })
    }
}
