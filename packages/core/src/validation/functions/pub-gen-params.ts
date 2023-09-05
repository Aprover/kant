import type { MaybePromise, ValidationAcceptor } from "langium"
import { findRootNode, streamAllContents } from "langium"
import type { Protocol } from "../../generated/ast"
import {
    isFunctionDef,
    isKnowledgeDefCustom,
    isKnowledgeDefCustomName,
    isKnowledgeFromFunction,
    isKnowledgeFromFunctionArgsElements,
    isKnowledgeGenerator,
    isKnowledgeList,
    isKnowledgeRef,
    isKnowledgeSet,
    isKnowledgeSpreading
} from "../../generated/ast"

export const pubGenParams = {
    pubGenParams: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void> => {
        // param di pub_gen deve essere un riferimento PER FORZA, no chiamata a funzione, oppure un accesso a lista oppure un accesso a set (che è contenuto in ref)
        // questo ref non deve puntare a set, a list, a funzioni che tornano più di un valore (liste), a gen

        if (
            findRootNode(protocol).$document?.uri.toString() !== `builtin:/prelude.kant` &&
            !findRootNode(protocol).$document?.uri.toString().includes(`prelude`)
        ) {
            // troviamo tutti i riferimenti a liste
            const lists = new Set<string>()
            // le list possono essere: dichiarazioni esplicite oppure possono essere tornate da funzioni che tornano più parametri
            const fx = new Set<string>() // set di funzioni che tornano più di un valore
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
            // ABBIAMO TUTTI I RIFERIMENTI A LISTE E A FUNZIONI CHE TORNANO LISTE

            // troviamo tutti i riferimenti a set
            const sets = new Set<string>()
            streamAllContents(protocol)
                .filter(isKnowledgeDefCustom)
                .forEach(kdc => {
                    if (isKnowledgeDefCustomName(kdc.left)) {
                        if (isKnowledgeSet(kdc.value)) {
                            sets.add(kdc.left.name)
                        }
                    }
                })
            // ABBIAMO TUTTI I RIFERIMENTI A SET

            const gens = new Set<string>()
            streamAllContents(protocol)
                .filter(isKnowledgeDefCustom)
                .forEach(kdc => {
                    if (isKnowledgeDefCustomName(kdc.left)) {
                        if (isKnowledgeGenerator(kdc.value)) {
                            gens.add(kdc.left.name)
                        }
                    }
                })
            // ABBIAMO TUTTI I RIFERIMENTI A GEN

            streamAllContents(protocol)
                .filter(isKnowledgeFromFunction)
                .forEach(kff => {
                    if (kff.invoked.ref?.name === `PUB_GEN`) {
                        // knowledge spreading => molteplici valori, quindi errato
                        if (isKnowledgeSpreading(kff.args)) {
                            accept(`error`, `PUB_GEN takes only one argument, a private key.`, { node: kff })
                        }

                        // args elements: deve essere un singolo valore
                        if (isKnowledgeFromFunctionArgsElements(kff.args)) {
                            // quindi la lunghezza deve essere necessariamente 1
                            if (kff.args.args.length !== 1) {
                                accept(`error`, `PUB_GEN takes only one argument, a private key.`, { node: kff })
                            }
                            // il parametro deve essere un riferimento
                            kff.args.args.forEach(param => {
                                if (!isKnowledgeRef(param)) {
                                    accept(`error`, `The argument of PUB_GEN must be a reference to a single value.`, {
                                        node: kff
                                    })
                                }
                            })
                            // il riferimento non può puntare a knowledge set, lists, funzioni che tornano più di un valore (list) o generator
                            kff.args.args.filter(isKnowledgeRef).forEach(r => {
                                if (lists.has(r.ref)) {
                                    accept(
                                        `error`,
                                        `PUB_GEN takes only one argument, a private key. The reference ${r.ref} points to a list.`,
                                        { node: kff }
                                    )
                                }
                                if (sets.has(r.ref)) {
                                    accept(
                                        `error`,
                                        `PUB_GEN takes only one argument, a private key. The reference ${r.ref} points to a set.`,
                                        { node: kff }
                                    )
                                }
                                if (gens.has(r.ref)) {
                                    accept(
                                        `error`,
                                        `PUB_GEN takes only one argument, a private key. The reference ${r.ref} points to a generator.`,
                                        { node: kff }
                                    )
                                }
                            })
                        }
                    }
                })
        }
    }
}
