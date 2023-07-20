import { streamAllContents, type MaybePromise, type ValidationAcceptor } from "langium"
import { type Protocol } from "../../generated/ast"

export const debug = {
    debug: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void> => {
        streamAllContents(protocol).forEach(node => {
            accept(`info`, `${node.$type}`, { node: protocol })
        })
        /* streamAllContents(protocol)
            .filter(isKnowledgeFromFunctionArgs)
            .forEach(k => {
                accept(
                    `info`,
                    `Ho trovato un knowledgeFromFunctionArgs, il type del suo container è: ${
                        k.$container.$type
                    }, mentre il type del container del container è: ${k.$container.$container.$type}
                    , Il docuento in cui si trova è: ${findRootNode(k).$document?.uri}`,
                    { node: k }
                )
            }) */

        /* const names = new Set<string>()
        streamAllContents(protocol)
            .filter(isScenario)
            .forEach(s => {
                if (s.name !== undefined) {
                    if (names.has(s.name)) {
                        accept(`error`, `${s.name} ERRORE`, { node: protocol })
                    }
                    names.add(s.name)
                }
            }) */
        /* names.forEach(n => {
            accept(`info`, `${n}`, { node: protocol })
        })
        accept(`info`, `${names.has(`ciao`)}`, { node: protocol }) */
    }
}
