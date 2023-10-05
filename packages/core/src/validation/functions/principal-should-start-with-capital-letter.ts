import { streamAllContents, type MaybePromise, type ValidationAcceptor } from "langium"
import { isPrincipal, type Protocol } from "../../generated/ast"

export const principalShoudlStartWithCapitalLetter = {
    principalShoudlStartWithCapitalLetter: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void> => {
        streamAllContents(protocol)
            .filter(isPrincipal)
            .forEach(p => {
                const firstLetter = p.name.charAt(0).toUpperCase()
                if (p.name.charAt(0) !== firstLetter) {
                    accept(`warning`, `Principal name ${p.name} should start with a capital letter.`, { node: p })
                }
            })
    }
}
