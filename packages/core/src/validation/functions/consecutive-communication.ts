import { streamAllContents, type MaybePromise, type ValidationAcceptor } from "langium"
import type { Communication } from "../../generated/ast"
import { isCommunication, type Protocol } from "../../generated/ast"

export const consecutiveCommunications = {
    consecutiveCommunications: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void> => {
        let communications: Communication[] = []
        streamAllContents(protocol)
            .filter(isCommunication)
            .forEach(c => {
                communications = [...communications, c]
            })
        /* const firstC = communications[0]
        if (firstC !== undefined) {
            accept(`info`, `${communicationToString(firstC)}`, { node: protocol })
        } */

        for (let i = 0; i < communications.length - 1; i++) {
            const first = communications[i]
            const second = communications[i + 1]
            if (first !== undefined && second !== undefined) {
                if (communicationToString(first) === communicationToString(second)) {
                    accept(`warning`, `redundant consecutive communication`, { node: second })
                }
            }
        }
    }
}

function communicationToString(c: Communication): string {
    const sender = [c.from.ref?.name]
    let receivers: string[] = []
    c.to.forEach(r => {
        const name = r.ref?.name
        if (name !== undefined) {
            receivers = [...receivers, name]
        }
    })
    let knowledge: string[] = []
    c.ref.forEach(r => {
        const know = r.ref
        if (know !== undefined) {
            knowledge = [...knowledge, know]
        }
    })
    return sender.concat(receivers).concat(knowledge).toString()
}
