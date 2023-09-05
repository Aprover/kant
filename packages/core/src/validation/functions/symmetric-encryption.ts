import { MaybePromise, ValidationAcceptor, streamAllContents } from "langium";
import { Protocol, isKnowledgeDefCustom, isKnowledgeDefCustomName, isKnowledgeFromFunction, isKnowledgeFromFunctionArgsElements, isKnowledgeRef } from "../../generated/ast";

export const symmetricEncryption = {
    symmetricEncryption: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void> => {
        const encryptedKnowledgeWithKeys = new Map<string, string[]>();
        
        streamAllContents(protocol)
            .filter(isKnowledgeDefCustom)
            .forEach(customKnowledgeDef => {
                if (isKnowledgeDefCustomName(customKnowledgeDef.left)) {
                    if (isKnowledgeFromFunction(customKnowledgeDef.value)) {
                        if (customKnowledgeDef.value.invoked.ref?.name === 'ENC') {
                            if (isKnowledgeRef(customKnowledgeDef.value.key)) {
                                const encryptedContentName = customKnowledgeDef.left.name;
                                const plainKeys = [customKnowledgeDef.value.key.ref];
                                encryptedKnowledgeWithKeys.set(encryptedContentName, plainKeys);
                            }
                        }
                    }
                }
            });

        const encryptedKeyToPlainKey = new Map<string, string>();

        streamAllContents(protocol)
            .filter(isKnowledgeDefCustom)
            .forEach(customKnowledgeDef => {
                if (isKnowledgeDefCustomName(customKnowledgeDef.left)) {
                    const encryptedKeyName = customKnowledgeDef.left.name;
                    if (isKnowledgeFromFunction(customKnowledgeDef.value)) {
                        if (customKnowledgeDef.value.invoked.ref?.name === 'PKE_ENC') {
                            if (isKnowledgeFromFunctionArgsElements(customKnowledgeDef.value.args)) {
                                const keyParamRef = customKnowledgeDef.value.args.args.filter(isKnowledgeRef)[0]?.ref;
                                for (let plainKey of encryptedKnowledgeWithKeys.keys()) {
                                    const plainKeys = encryptedKnowledgeWithKeys.get(plainKey);
                                    if (plainKeys !== undefined && keyParamRef && plainKeys.includes(keyParamRef)) {
                                        encryptedKeyToPlainKey.set(encryptedKeyName, keyParamRef);
                                    }
                                }
                            }
                        }
                    }
                }
            });

        const decryptedKeyToPlainKey = new Map<string, string>();

        streamAllContents(protocol)
            .filter(isKnowledgeDefCustom)
            .forEach(customKnowledgeDef => {
                if (isKnowledgeDefCustomName(customKnowledgeDef.left)) {
                    const decryptedKeyName = customKnowledgeDef.left.name;
                    if (isKnowledgeFromFunction(customKnowledgeDef.value)) {
                        if (customKnowledgeDef.value.invoked.ref?.name === 'PKE_DEC') {
                            if (isKnowledgeFromFunctionArgsElements(customKnowledgeDef.value.args)) {
                                const encryptedKeyParamRef = customKnowledgeDef.value.args.args.filter(isKnowledgeRef)[0]?.ref;
                                for (let encryptedKey of encryptedKeyToPlainKey.keys()) {
                                    if (encryptedKey === encryptedKeyParamRef) {
                                        const plainKeyFromMap = encryptedKeyToPlainKey.get(encryptedKeyParamRef);
                                        if (plainKeyFromMap !== undefined) {
                                            decryptedKeyToPlainKey.set(decryptedKeyName, plainKeyFromMap);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            });

        for (let encryptedContent of encryptedKnowledgeWithKeys.keys()) {
            let plainKeyNames = encryptedKnowledgeWithKeys.get(encryptedContent);
            if (plainKeyNames !== undefined) {
                for (let decryptedKey of decryptedKeyToPlainKey.keys()) {
                    let originalKey = decryptedKeyToPlainKey.get(decryptedKey);
                    if (originalKey !== undefined) {
                        plainKeyNames.forEach(keyName => {
                            if (keyName === originalKey) {
                                if (plainKeyNames) {
                                    encryptedKnowledgeWithKeys.set(encryptedContent, [...plainKeyNames, decryptedKey]);
                                }
                            }
                        });
                    }
                }
            }
        }

        streamAllContents(protocol)
            .filter(isKnowledgeDefCustom)
            .forEach(customKnowledgeDef => {
                if (isKnowledgeFromFunction(customKnowledgeDef.value)) {
                    if (customKnowledgeDef.value.invoked.ref?.name === 'DEC') {
                        if (isKnowledgeFromFunctionArgsElements(customKnowledgeDef.value.args)) {
                            if (customKnowledgeDef.value.args.args.length === 1) {
                                const encryptedContentRef = customKnowledgeDef.value.args.args.filter(isKnowledgeRef)[0]?.ref;
                                for (let encryptedContent of encryptedKnowledgeWithKeys.keys()) {
                                    if (encryptedContent === encryptedContentRef) {
                                        const correctKeys = encryptedKnowledgeWithKeys.get(encryptedContent);
                                        if (correctKeys) {
                                            if (isKnowledgeRef(customKnowledgeDef.value.key)) {
                                                const usedKey = customKnowledgeDef.value.key.ref;
                                                if (!correctKeys.includes(usedKey)) {
                                                    accept("error", `${usedKey} is not a correct symmetric key to decrypt ${encryptedContentRef}`, { node: customKnowledgeDef });
                                                }
                                            }
                                        }
                                    }
                                }        
                            }
                        } 
                    }
                }
            });
    }
}
