import type { MaybePromise, ValidationAcceptor } from "langium"
import { findRootNode, streamAllContents } from "langium"
import {
    isKnowledgeDefCustom,
    isKnowledgeDefCustomName,
    isKnowledgeFromFunction,
    isKnowledgeFromFunctionArgsElements,
    isKnowledgeRef,
    type Protocol
} from "../../generated/ast"

class AsymmetricEncTriple {
    private readonly _encrypted: string
    private readonly _publicKey: string
    private readonly _privateKey: string

    constructor(encrypted: string, publicKey: string, privateKey: string) {
        this._encrypted = encrypted
        this._publicKey = publicKey
        this._privateKey = privateKey
    }

    get encrypted(): string {
        return this._encrypted
    }

    get publicKey(): string {
        return this._publicKey
    }

    get privateKey(): string {
        return this._privateKey
    }
}

export const asymmetricEncryptionValidation = {
    asymmetricEncryptionValidation: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void> => {
        if (
            findRootNode(protocol).$document?.uri.toString() !== `builtin:/prelude.kant` &&
            !findRootNode(protocol).$document?.uri.toString().includes(`prelude`)
        ) {
            const publicKeyToPrivateKey = new Map<string, string>()

            streamAllContents(protocol)
                .filter(isKnowledgeDefCustom)
                .forEach(kdc => {
                    if (isKnowledgeDefCustomName(kdc.left)) {
                        if (isKnowledgeFromFunction(kdc.value)) {
                            if (kdc.value.invoked.ref?.name === `PUB_GEN`) {
                                const publicKey = kdc.left.name
                                if (isKnowledgeFromFunctionArgsElements(kdc.value.args)) {
                                    if (isKnowledgeRef(kdc.value.args.args[0])) {
                                        const privateKey = kdc.value.args.args[0].ref
                                        publicKeyToPrivateKey.set(publicKey, privateKey)
                                    }
                                }
                            }
                        }
                    }
                })

            const asymmetricTriples = new Set<AsymmetricEncTriple>()
            streamAllContents(protocol)
                .filter(isKnowledgeDefCustom)
                .forEach(kdc => {
                    if (isKnowledgeDefCustomName(kdc.left)) {
                        if (isKnowledgeFromFunction(kdc.value)) {
                            if (kdc.value.invoked.ref?.name === `PKE_ENC`) {
                                if (isKnowledgeRef(kdc.value.key)) {
                                    const encrypted = kdc.left.name
                                    const publicKey = kdc.value.key.ref
                                    const privateKey = publicKeyToPrivateKey.get(publicKey)

                                    const knownPublicKeys = new Set<string>(publicKeyToPrivateKey.keys())
                                    if (!knownPublicKeys.has(publicKey)) {
                                        accept(`error`, `A public key is needed to use this function`, { node: kdc })
                                    }

                                    if (privateKey !== undefined) {
                                        const triple = new AsymmetricEncTriple(encrypted, publicKey, privateKey)
                                        asymmetricTriples.add(triple)
                                    }
                                }
                            }
                        }
                    }
                })

            streamAllContents(protocol)
                .filter(isKnowledgeFromFunction)
                .forEach(kff => {
                    if (kff.invoked.ref?.name === `PKE_DEC`) {
                        const encryptedSet = new Set<string>()
                        asymmetricTriples.forEach(triple => {
                            encryptedSet.add(triple.encrypted)
                        })

                        if (isKnowledgeFromFunctionArgsElements(kff.args)) {
                            if (kff.args.args.length > 1) {
                                accept(`error`, `The function PKE_DEC should have one argument: a reference to some encrypted knowledge.`, { node: kff })
                            }
                            if (!isKnowledgeRef(kff.args.args[0])) {
                                accept(`error`, `The function PKE_DEC should have one argument: a reference to some encrypted knowledge.`, { node: kff })
                            } else {
                                const encryptedRef = kff.args.args[0].ref
                                if (!encryptedSet.has(encryptedRef)) {
                                    accept(`error`, `The knowledge ${encryptedRef} is not a reference to encrypted knowledge.`, { node: kff })
                                } else {
                                    if (isKnowledgeRef(kff.key)) {
                                        const usedPrivateKey = kff.key.ref
                                        let correctPrivateKey = undefined
                                        for (const triple of asymmetricTriples) {
                                            if (triple.encrypted === encryptedRef) {
                                                correctPrivateKey = triple.privateKey
                                            }
                                        }
                                        if (usedPrivateKey !== correctPrivateKey) {
                                            accept(`error`, `Incorrect private key used to decrypt encrypted knowledge ${encryptedRef}, the decryption function will not work.`, { node: kff })
                                        }
                                    }
                                }
                            }
                        }
                    }
                })
        }
    }
}
