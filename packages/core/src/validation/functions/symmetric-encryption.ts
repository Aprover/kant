/*import { MaybePromise, ValidationAcceptor, streamAllContents } from "langium";
import { Protocol, isKnowledgeDefCustom, isKnowledgeDefCustomName, isKnowledgeFromFunction, isKnowledgeFromFunctionArgsElements, isKnowledgeRef } from "../../generated/ast";


export const symmetricEncryption = {
    symmetricEncryption: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void> => {
        // trovo tutte le chiavi simmetriche guardando dove viene chiamata ENC
        let contenutoCifrato_chiaviSimmetricheInChiaro = new Map<string, string[]>(); 
        
        streamAllContents(protocol)
            .filter(isKnowledgeDefCustom)
            .forEach(kdc => {
                if (isKnowledgeDefCustomName(kdc.left)) {
                    if (isKnowledgeFromFunction(kdc.value)) {
                        if (kdc.value.invoked.ref?.name === 'ENC') {
                            if (isKnowledgeRef(kdc.value.key)) {
                                const nomeContenutoCifrato = kdc.left.name
                                const chiaveSimmetricaInChiaro = [kdc.value.key.ref]
                                contenutoCifrato_chiaviSimmetricheInChiaro.set(nomeContenutoCifrato, chiaveSimmetricaInChiaro)
                            }
                        }    
                    }    
                }
            })

            // qui ho le coppie <contenuto cifrato con chiave simmetrica, lista di nomi che puntano alla chiave simmetrica>

            let chiaveSimmetricaCifrata_chiaveSimmetricaInChiaro = new Map<string, string>();

            streamAllContents(protocol)
                .filter(isKnowledgeDefCustom)
                .forEach(kdc => {
                    if (isKnowledgeDefCustomName(kdc.left)) {
                        const nomeChiaveSimmetricaCifrata = kdc.left.name
                        if (isKnowledgeFromFunction(kdc.value)) {
                            if (kdc.value.invoked.ref?.name === 'PKE_ENC') {
                                if (isKnowledgeFromFunctionArgsElements(kdc.value.args)) {
                                    const parametro_riferimentoAChiaveSimmetrica = kdc.value.args.args.filter(isKnowledgeRef)[0]?.ref
                                    for (let arrayChiaviInChiaro of contenutoCifrato_chiaviSimmetricheInChiaro.values()) {
                                        arrayChiaviInChiaro.forEach(chiaveInChiaro => {
                                            if (chiaveInChiaro === parametro_riferimentoAChiaveSimmetrica) {
                                                chiaveSimmetricaCifrata_chiaveSimmetricaInChiaro.set(nomeChiaveSimmetricaCifrata, chiaveInChiaro)
                                            }
                                        })
                                    }
                                }
                            }
                        }
                    }
                })

            // qui ho tutte le coppie <nome chiave simmetrica cifrata, nome chiave simmetrica in chiaro>
            
            let altroNomeChiaveSimmetricaInChiaro_chiaveSimmetricaInChiaro = new Map<string, string>()

            streamAllContents(protocol)
                    .filter(isKnowledgeDefCustom)
                    .forEach(kdc => {
                        if (isKnowledgeDefCustomName(kdc.left)) {
                            const altroNomeChiaveSimmetricaInChiaro = kdc.left.name
                            if (isKnowledgeFromFunction(kdc.value)) {
                                if (kdc.value.invoked.ref?.name === 'PKE_DEC') {
                                    if (isKnowledgeFromFunctionArgsElements(kdc.value.args)) {
                                        const parametro_riferimentoAChiaveSimmetricaCifrata = kdc.value.args.args.filter(isKnowledgeRef)[0]?.ref
                                        for (let chiaveSimmetricaCifrata of chiaveSimmetricaCifrata_chiaveSimmetricaInChiaro.keys()) {
                                            if (chiaveSimmetricaCifrata === parametro_riferimentoAChiaveSimmetricaCifrata) {
                                                const chiaveSimmInChiaroDaMappa = chiaveSimmetricaCifrata_chiaveSimmetricaInChiaro.get(parametro_riferimentoAChiaveSimmetricaCifrata)
                                                if (chiaveSimmInChiaroDaMappa !== undefined) {
                                                    altroNomeChiaveSimmetricaInChiaro_chiaveSimmetricaInChiaro.set(altroNomeChiaveSimmetricaInChiaro, chiaveSimmInChiaroDaMappa)
                                                }
                                                
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    })

            for (let contenutoCifrato of contenutoCifrato_chiaviSimmetricheInChiaro.keys()) {
                let listaNomiChiavi = contenutoCifrato_chiaviSimmetricheInChiaro.get(contenutoCifrato)
                if (listaNomiChiavi !== undefined) {
                    for (let altroNome of altroNomeChiaveSimmetricaInChiaro_chiaveSimmetricaInChiaro.keys()) {
                        let nomeOriginale = altroNomeChiaveSimmetricaInChiaro_chiaveSimmetricaInChiaro.get(altroNome)
                        if (nomeOriginale !== undefined) {
                            listaNomiChiavi.forEach(nome => {
                                if (nome === nomeOriginale) {
                                    if (listaNomiChiavi) {
                                        contenutoCifrato_chiaviSimmetricheInChiaro.set(contenutoCifrato, [...listaNomiChiavi, altroNome])
                                    }
                                }
                            })
                        }
                    }
                }
            }

            // abbiamo una lista completa di <contenuto cifrato, lista nomi chiavi che lo decifrano)
        
            streamAllContents(protocol)
                .filter(isKnowledgeDefCustom)
                .forEach(kdc => {
                    if (isKnowledgeFromFunction(kdc.value)) {
                        if (kdc.value.invoked.ref?.name === 'DEC') {
                            if (isKnowledgeFromFunctionArgsElements(kdc.value.args)) {
                                if (kdc.value.args.args.length === 1) {
                                    const encrypted_content = kdc.value.args.args.filter(isKnowledgeRef)[0]?.ref
                                    for (let contenutoCifrato of contenutoCifrato_chiaviSimmetricheInChiaro.keys()) {
                                        if (contenutoCifrato === encrypted_content) {
                                            const chiaviCorrette = contenutoCifrato_chiaviSimmetricheInChiaro.get(contenutoCifrato)
                                            if (chiaviCorrette) {
                                                if (isKnowledgeRef(kdc.value.key)) {
                                                    const chiaveUsata = kdc.value.key.ref
                                                    if (!chiaviCorrette.includes(chiaveUsata)) {
                                                        accept("error", `${chiaveUsata} is not a correct key to decrypt this content`, { node: kdc })
                                                    }
                                                }
                                            }
                                        }
                                    }        
                                }
                            } 
                            
                        }
                    }
                })
            
    }
}
*/

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
