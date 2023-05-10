import { MaybePromise, ValidationAcceptor } from "langium";
import { Principal } from "../generated/ast";

export const duplicatePrincipalInDeclaration = {
    duplicatePrincipalInDeclaration: (principal: Principal, accept: ValidationAcceptor): MaybePromise<void> => {
        const principalNames = new Set<string>()
        principal.name.forEach(pName => {
            if (principalNames.has(pName)) {
                accept(`error`, `Duplicate principal name ${pName} in same declaration.`, { node: principal })
            }
            principalNames.add(pName)
        })
    }
}