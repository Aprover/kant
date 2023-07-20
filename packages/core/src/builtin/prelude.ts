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
   function CONCAT(...values) -> [ value ]
   function forall v : SPLIT(value=CONCAT(...{ values=v })) -> [ v ]
   
   
   
   function HASH(value) ->[ hash ] one way
   function MAC(k, value) -> [ mac ] one way
   function HKDF(salt, ikm, info) -> [ k1, k2, k3, k4, k5 ] one way
   function PW_HASH(value) -> [ pw_hash ] one way
   
   function PUB_GEN(private) -> [ pub_gen ] one way
   function DF(base, exp) -> [ df ] one way
   property forall a, b : DF(PUB_GEN(b), a) equals DF(PUB_GEN(a), b)
   
   function ENC(content) with k -> [ enc ]
   function forall x, k : DEC(content=ENC(x) with k) with k -> [ x ]
   property DEC invert ENC
   
   function AEAD_ENC(content) with { k, auth } -> [ aead_enc ]
   function forall x, k, auth : AEAD_DEC(
       content=AEAD_ENC(x) with { k, auth }
   ) with { k, auth } -> [ x ]
   property AEAD_DEC invert AEAD_ENC
   
   function PKE_ENC(content) with k -> [ pke_enc ]
   function forall x, k : PKE_DEC(content=PKE_ENC(x) with PUB_GEN(k)) with k -> [ x ]
   property PKE_DEC invert PKE_ENC
   
   function SIGN(message) with k -> [ signed ]
   function forall m, k : SIGNVERIF(sign=SIGN(m) with k) with { k, message=m } -> [ m ]
   property SIGNVERIF invert SIGN`
}
