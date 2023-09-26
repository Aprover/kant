import { MaybePromise, ValidationAcceptor, findRootNode, streamAllContents } from "langium";
import { Protocol, isKnowledgeDefCustom, isKnowledgeSet } from "../../generated/ast";

export const emptySet = {
    emptySet: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void> => {
        streamAllContents(protocol)
            .filter(isKnowledgeDefCustom)
            .forEach(kdf => {
                if (
                    findRootNode(protocol).$document?.uri.toString() !== `builtin:/prelude.kant` &&
                    !findRootNode(protocol).$document?.uri.toString().includes(`prelude`)
                ) {
                    if (isKnowledgeSet(kdf.value)) {
                        if (kdf.value.content.length === 0) {
                            accept('error', 'Cannot declare an empty set.', { node: kdf.value })
                        }
                    }
                }
            })
    }
}