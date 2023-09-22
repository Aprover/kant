/*import type { MaybePromise, ValidationAcceptor } from "langium"
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
    private readonly _enc: string
    private readonly _publicKey: string
    private readonly _privateKey: string

    constructor(enc: string, publicKey: string, privateKey: string) {
        this._enc = enc
        this._publicKey = publicKey
        this._privateKey = privateKey
    }

    get enc(): string {
        return this._enc
    }

    get publicKey(): string {
        return this._publicKey
    }

    get privateKey(): string {
        return this._privateKey
    }
}

export const asymmetricEncryption = {
    asymmetricEncryption: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void> => {
        if (
            findRootNode(protocol).$document?.uri.toString() !== `builtin:/prelude.kant` &&
            !findRootNode(protocol).$document?.uri.toString().includes(`prelude`)
        ) {
            const pubpriv = new Map<string, string>() // Map<public key, private key>()

            streamAllContents(protocol)
                .filter(isKnowledgeDefCustom)
                .forEach(kdc => {
                    if (isKnowledgeDefCustomName(kdc.left)) {
                        if (isKnowledgeFromFunction(kdc.value)) {
                            if (kdc.value.invoked.ref?.name === `PUB_GEN`) {
                                const pub = kdc.left.name
                                if (isKnowledgeFromFunctionArgsElements(kdc.value.args)) {
                                    if (isKnowledgeRef(kdc.value.args.args[0])) {
                                        const priv = kdc.value.args.args[0]
                                        pubpriv.set(pub, priv.ref)
                                    }
                                }
                            }
                        }
                    }
                })
            // qui ho tutte le coppie <chiave pubblica, chiave privata>
            // quindi ho la chiave privata e la chiave privata usata per crearla

            // comincio a creare triple <contenuto cifrato, chiave pubblica, chiave privata>
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
                                    const privateKey = pubpriv.get(publicKey)

                                    const publicKeys = new Set<string>()
                                    for (const key of pubpriv.keys()) {
                                        publicKeys.add(key)
                                    }

                                    if (!publicKeys.has(publicKey)) {
                                        accept(`error`, `A public key is needed to use this function`, { node: kdc })
                                    }

                                    if (privateKey !== undefined) {
                                        const aet = new AsymmetricEncTriple(encrypted, publicKey, privateKey)
                                        asymmetricTriples.add(aet)
                                    }
                                }
                            }
                        }
                    }
                })

            // ora ho tutte le triple che desideravo
            streamAllContents(protocol)
                .filter(isKnowledgeFromFunction)
                .forEach(kff => {
                    if (kff.invoked.ref?.name === `PKE_DEC`) {
                        const enc = new Set<string>()
                        asymmetricTriples.forEach(at => {
                            enc.add(at.enc)
                        })

                        if (isKnowledgeFromFunctionArgsElements(kff.args)) {
                            if (kff.args.args.length > 1) {
                                accept(
                                    `error`,
                                    `The function PKE_DEC should have one argument: a reference to some encrypted knowledge.`,
                                    { node: kff }
                                )
                            }
                            if (!isKnowledgeRef(kff.args.args[0])) {
                                accept(
                                    `error`,
                                    `The function PKE_DEC should have one argument: a reference to some encrypted knowledge.`,
                                    { node: kff }
                                )
                            } else {
                                if (!enc.has(kff.args.args[0].ref)) {
                                    accept(
                                        `error`,
                                        `The knowledge ${kff.args.args[0].ref} is not a refence to encrypted knowledge.`,
                                        { node: kff }
                                    )
                                } else {
                                    if (isKnowledgeRef(kff.key)) {
                                        const privateKeyUsed = kff.key.ref
                                        let correctPrivateKey = undefined
                                        for (const at of asymmetricTriples) {
                                            if (at.enc === kff.args.args[0].ref) {
                                                correctPrivateKey = at.privateKey
                                            }
                                        }
                                        if (privateKeyUsed !== correctPrivateKey) {
                                            accept(
                                                `error`,
                                                `Incorrect private key used to decrypt encrypted knowledge ${kff.args.args[0].ref}, the decryption function will not work.`,
                                                { node: kff }
                                            )
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
*/
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
