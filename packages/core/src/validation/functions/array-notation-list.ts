import type { MaybePromise, ValidationAcceptor } from "langium"
import { streamAllContents } from "langium"
import type { Protocol } from "../../generated/ast"
import {
    isFunctionDef,
    isKnowledgeDefCustom,
    isKnowledgeDefCustomName,
    isKnowledgeFromFunction,
    isKnowledgeList,
    isListAccess
} from "../../generated/ast"

export const arrayNotationList = {
    arrayNotationList: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void> => {
        const lists = new Set<string>()
        // le list possono essere: dichiarazioni esplicite oppure possono essere tornate da funzioni che tornano più parametri
        const fx = new Set<string>() // set of functions that return more than one value
        fx.add(`HKDF`)
        fx.add(`SPLIT`)
        streamAllContents(protocol)
            .filter(isFunctionDef)
            .forEach(f => {
                if (f.return.elements.length > 1) {
                    fx.add(f.name)
                }
            })

        streamAllContents(protocol)
            .filter(isKnowledgeDefCustom)
            .forEach(kdc => {
                if (isKnowledgeDefCustomName(kdc.left)) {
                    if (isKnowledgeList(kdc.value)) {
                        lists.add(kdc.left.name)
                    }
                    if (isKnowledgeFromFunction(kdc.value)) {
                        const invokedFunction = kdc.value.invoked.ref?.name
                        if (invokedFunction !== undefined) {
                            if (fx.has(invokedFunction)) {
                                lists.add(kdc.left.name)
                            }
                        }
                    }
                }
            })
        //accept(`info`, `liste: ${Array.from(lists)}`, { node: protocol })
        streamAllContents(protocol)
            .filter(isListAccess)
            .forEach(la => {
                if (!lists.has(la.ref)) {
                    accept(`error`, `${la.ref} is not a list, it can't be accessed using an index.`, { node: la })
                }
            })
    }
}
