import { MaybePromise, streamAllContents, ValidationAcceptor } from "langium"
import { isAuthenticationCheck, Protocol } from "../../generated/ast"

export const noSelfAuthentication = {
    noSelfAuthentication: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void> => {
        streamAllContents(protocol)
            .filter(isAuthenticationCheck)
            .forEach(ac => {
                if (ac.from.ref?.name === ac.target.ref?.name) {
                    accept(`error`, `Principal ${ac.from.ref?.name} cannot authenticate himself.`, { node: ac })
                }
            })
    }
}
