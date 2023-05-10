import { ValidationAcceptor, MaybePromise } from "langium"
import { AuthenticationCheck } from "../generated/ast"

export const duplicatePrincipalInAuthenticationCheck = {
    /**
     * 
     * @param authenticationCheck 
     * @param accept 
     */
    duplicatePrincipalInAuthenticationCheck: (authenticationCheck: AuthenticationCheck, accept: ValidationAcceptor): MaybePromise<void> => {
        if (authenticationCheck.principal === authenticationCheck.target) {
            accept(`warning`, `Authentication check is redundant`, { node: authenticationCheck })
        }
    }
}