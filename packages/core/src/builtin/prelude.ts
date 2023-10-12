const name = `prelude.kant`
export const prelude = {
    name,
    content: `
    /*
    * The prelude is simply a list of function and property definitions that
    * serve as a common base for every protocol definition.
    * 
    * It is automatically loaded by the UI tool and added as the first part
    * of the protocol, therefore its definitions can be used directly without
    * prior definition in protocol definitions.
    */
   type Nonce, SymmetricKey, PrivateKey, PublicKey , Group, IdCertificate, BitString, Timestamp, Digest , Tag , Signature, Ciphertext 
   
   function HASH(value:BitString) -> [ hash:Digest ] one way
   function HKDF(salt: Nonce, ikm: SymmetricKey, info: BitString) -> [ k1: SymmetricKey, k2: SymmetricKey, k3: SymmetricKey, k4: SymmetricKey, k5: SymmetricKey ] one way
   function PW_HASH(value: BitString) -> [ pw_hash: Digest ] one way
   function PUB_GEN(private:PrivateKey) -> [ pub_gen:PublicKey ] one way
   
   function DF(base:Group, exp:PrivateKey) -> [ df:Group ] one way
   property forall a:PrivateKey, b:PrivateKey, g:Group | DF(DF(g,b), a) equals DF(DF(g,a), b)
   
   function ENC(content:BitString) with k:SymmetricKey -> [ enc:Ciphertext ]
   function DEC(enc:Ciphertext) with k:SymmetricKey -> [ content:BitString ]
   property forall x:BitString, k:SymmetricKey | DEC(ENC(x) with k) with k -> [ x ]
   
   function AEAD_ENC(content:BitString) with { k:SymmetricKey, auth:BitString } -> [ aead_enc:Ciphertext ]
   function AEAD_DEC(aead_enc:Ciphertext) with { k:SymmetricKey, auth:BitString } -> [content: BitString]
   property forall x:BitString, k:SymmetricKey, auth:BitString | AEAD_DEC(AEAD_ENC(x) with { k, auth }) with { k, auth } -> [ x ]
   
   function PKE_ENC(content: BitString) with k: PublicKey -> [ pke_enc: Ciphertext ]
   function PKE_DEC(pke_enc: Ciphertext) with k: PrivateKey -> [ content: BitString ]
   property forall x: BitString, k: PrivateKey | PKE_DEC(PKE_ENC(x) with PUB_GEN(k)) with k -> [ x ]
   
   
   function SIGN(message: BitString) with k: PrivateKey -> [ signed: Signature ]
   function SIGNVERIF(signed: Signature) with k: PublicKey -> [ message: BitString ]
   property forall m: BitString, k: PrivateKey | SIGNVERIF(SIGN(m) with PUB_GEN(k)) with  k-> [ m ]
   
   function MAC(value:BitString) with k:SymmetricKey -> [ mac:Tag ]
   function MACVERIF(mac:Tag) with k:SymmetricKey -> [value:BitString]
   property forall v: BitString, k: SymmetricKey | MACVERIF(MAC(v) with k) with  k -> [ v ]
   
   function CONCAT(...values: BitString) -> [ value: BitString ]
   function SPLIT(value: BitString) -> [ values: BitString ]
   property forall v: BitString | SPLIT(CONCAT(...v)) -> [ v ]`
}
