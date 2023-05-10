import { MaybePromise, ValidationAcceptor } from "langium"
import { Communication } from "../generated/ast"

export const duplicatePrincipalInCommunication = {
    /**
     * 
     * @param communication 
     * @param accept 
     */
    duplicatePrincipalInCommunication: (communication: Communication, accept: ValidationAcceptor): MaybePromise<void> => {
        communication.from.forEach(principal => {
            if (communication.to.includes(principal)) {
                accept(`warning`, `Communication is redundant: "${principal}" already knows this knowledge`, {node: communication})
            }
        })
    }
}