import { MaybePromise, ValidationAcceptor, streamAllContents } from "langium";
import { Protocol, isPrincipal } from "../../generated/ast";

export const uniquePrincipalNames = {
    uniquePrincipalNames: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void> => {
        const principalNames = new Set<string>()
        streamAllContents(protocol)
            .filter(isPrincipal)
            .forEach(p => {
                if (principalNames.has(p.name)) {
                    accept(`error`, `Principal name "${p.name}" already used.`, { node: p })
                }
                principalNames.add(p.name)
            })
    } 
}