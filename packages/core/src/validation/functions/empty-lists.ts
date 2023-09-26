import { MaybePromise, ValidationAcceptor, findRootNode, streamAllContents } from "langium";
import { Protocol, isKnowledgeDefCustom, isKnowledgeList } from "../../generated/ast";

export const emptyList = {
    emptyList: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void> => {
        streamAllContents(protocol)
            .filter(isKnowledgeDefCustom)
            .forEach(kdf => {
                if (
                    findRootNode(protocol).$document?.uri.toString() !== `builtin:/prelude.kant` &&
                    !findRootNode(protocol).$document?.uri.toString().includes(`prelude`)
                ) {
                    if (isKnowledgeList(kdf.value)) {
                        if (kdf.value.values.length === 0) {
                            accept('error', 'Cannot declare an empty list.', { node: kdf.value })
                        }
                    }
                }
            })
    }
}