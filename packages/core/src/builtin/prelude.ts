const name = `prelude.kant`
export const prelude = {
    name,
    content: `/*
    * The prelude is simply a list of function and property definitions that
    * serve as a common base for every protocol definition.
    * 
    * It is automatically loaded by the UI tool and added as the first part
    * of the protocol, therefore its definitions can be used directly without
    * prior definition in protocol definitions.
    */
   type Nonce, SymmetricKey, PrivateKey, PublicKey , Group, IdCertificate, BitString, Timestamp, Digest , Tag , Signature, Ciphertext
   
   function HASH( value:BitString) -> [ hash:Digest ] one way
   function MAC(k:SymmetricKey, value:BitString) -> [ mac:Tag ] one way
   //function HKDF(salt, ikm, info) -> [ k1, k2, k3, k4, k5 ] one way
   //function PW_HASH(value) -> [ pw_hash ] one way
   function PUB_GEN(private:PrivateKey) -> [ pub_gen:PublicKey ] one way
   function DF(base:Group, exp:PrivateKey) -> [ df:Group ] one way
   property forall a:PrivateKey, b:PrivateKey, g:Group | DF(DF(g,b), a) equals DF(DF(g,a), b)
   
   function ENC(content:BitString) with k:SymmetricKey -> [ enc:Ciphertext ]
   function forall x:BitString, k:SymmetricKey | DEC(ENC(x) with k) with k -> [ x]
   property DEC invert ENC
   function AEAD_ENC(content:BitString) with { k:SymmetricKey, auth:BitString } -> [ aead_enc:Ciphertext ]
   function forall x:BitString, k:SymmetricKey, auth:BitString | AEAD_DEC(AEAD_ENC(x) with { k, auth }) with { k, auth } -> [ x ]
   property AEAD_DEC invert AEAD_ENC
   function PKE_ENC(content: BitString) with k: PublicKey -> [ pke_enc: Ciphertext ]
   function forall x: BitString, k: PrivateKey | PKE_DEC(PKE_ENC(x) with PUB_GEN(k)) with k -> [ x ]
   property PKE_DEC invert PKE_ENC
   
   function SIGN(message: BitString) with k: PrivateKey -> [ signed: Signature ]
   function forall m: BitString, k: PrivateKey | SIGNVERIF(SIGN(m) with PUB_GEN(k)) with { k, m } -> [ m ]
   property SIGNVERIF invert SIGN
   
   function CONCAT(...values: BitString) -> [ value: BitString ]
   function forall v: BitString | SPLIT(CONCAT(...v)) -> [ v ]`
}
