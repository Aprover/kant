# Changelog

## [0.1.0] - 2022-12-23

Migrated the project to use [langium](https://langium.org) as the underlying language engineering tool.

## 2022-09-30

Added Needham-Schroeder protocol example and removed scuttlebutt (for brevity, kept signal instead).

## 2022-08-19

Worked on point 3. Point 4 is not needed anymore. Added authentication queries as checks.

## 2022-08-18

Worked on points from 2.2 to 2.4. Specific `ASSERT` and `SIGNVERIF` are not easily implementable in the language without over complicating it. The solution as of now is to treat every function that returns a specific return value as a point where to add a check over that return value. So `MAC` equality assertion is something completely up to the user and the same holds true for `SIGNVERIF`. But instead of adding a `?`, the property of verification is intrinsic in the `SIGNVERIF` function since it automatically check both arguments and return value adding a specific check. For asserts, a manual check is needed, as they're completely arbitrary.

## 2022-08-17

Worked on points 2.1. Now functions are defined in a better way, with arguments (including key application) checked for inversion functions and such and improved keys and return values definition are replacing properties like key inversion and equality.

## 2022-07-28

Added points after meeting with Mario:

3. authentication queries should be implemented specifying a message (see labeling point 4), two principals (the sender and the receiver) and a knowledge name used for auth purposes (see if principals could be omitted due to message being referenced by label, what about messages with multiple senders/receivers?)
4. label parts of the protocol definition (messages, knowledge blocks) something like go to definitions in old languages `label: principal A know { ... }` or `label: A -> B : 42`

Open points:

- need to check if all possibile kind of functions are easily definable within the language grammar
- generators are not easily usable to define some knowledge in checks (eg. `a, gen() should be equal`, when a is the third value of the gen). One solution could be to add an optional number parameter to generators, like in `a, gen(3) should be equal` in order to express a specific next value. Calling it without the parameter is going to return the next value based on state (normal behaviour). But how to "instantiate" generators in checks? Need more thinking.
- set results of functions are not easily usable to define some knowledge in checks or properties like accessing nested values `a, f().a should be equal`. Should functions have multiple return values by using sets?

## 2022-07-27

Added points after meeting with Mario:

1. SIGN / SIGNVERIF usage is consistent, after double check with Mario. It was about DF function equivalence for public/private keys of two principals (because `forall a, b : DF(DF(b), a) equals DF(DF(a), b)` was needed)
2. verifpal assertion using `ASSERT` or `SIGNVERIF` or `AEAD_DEC` with the ending `?` should be ported to the language and improved
   1. functions that invert others (see `AEAD_DEC`) should have their own definition that reduce the scope of possible arguments and keys based on what and how they invert
   2. functions defined like above should automatically create an invisibile check for the inverted value to be what they should have inverted to originally if the arguments were the same as those defined at compile time (this cover mutations by active attacker)
   3. function that's only purpose is to verify (like `ASSERT` or `SIGNVERIF`) and does not have a role in the language definition except for the property they verify, should not be functions but checks that the language FORCES you to skip or verify, whenever a knowledge of a certain type (like `MAC` or `SIGN` respectively) becomes visible in the principal knowledge either via direct message, decryption (inversion) or transparent/insecure functions pass-through (visibility)
   4. last thing to check is if the previous points cover all the possible cases for checks to be made as automatic as possibile and without restricting or defining functions/checks too specific

## 2022-07-26

Examples:

- tried verifpal scuttlebutt example
- there are two pain points
  - SIGN / SIGNVERIF usage seems inconsistent and wrong in verifpal example but that could also be due to my personal misunderstanding of its usage
  - how are verifpal authentication queries translatable to the dsl? Are those possible?

## 2022-07-20

Open points:

- grammar still needs variadic parameters for functions
- need to check if all possibile kind of functions are easily definable within the language grammar
- generators are not easily usable to define some knowledge in checks (eg. `a, gen() should be equal`, when a is the third value of the gen). One solution could be to add an optional number parameter to generators, like in `a, gen(3) should be equal` in order to express a specific next value. Calling it without the parameter is going to return the next value based on state (normal behaviour). But how to "instantiate" generators in checks? Need more thinking.
- lists should be destructurable like sets are (eg. `{ a, b } = mySet` -> `[a, b, _, _, c, ...] = myList`, with patterns for non bind places or index-like accessing `mySet[3]`?)

## 2022-06-26

- fixed `randomized` and `one way` grammar error which would provoke the one way option to be parsed only when randomized was present too
- generators now are not constrained by the language but by a given type which then should be implemented (as with functions) in order to better let the user express its intent with (possibly) infinite generator types

## 2022-06-21

- `randomized` option for functions now can be added only with the `one way` option and not when using the `invert` option

## 2022-05-24

- added comments to grammar and polished grammar rules
- fix attempt to uncommitted empty folders for the xtext project which could lead to problems when importing the project to eclipse

## 2022-05-19

Meeting with Mario, Chiara and Elvinia in order to define next steps for the project:

- complete the dsl grammar specification
- start writing thesis and define its structure, then let it be checked by professors
- leave parsing and validation to a later step

## 2022-05-03

Meeting with Mario in order to address the last couple of fixes and features to include in the dsl:

- fix: gitkeep in empty folders of the xtext project in order to be able to clone the repo and make it work inside eclipse with no more steps needed
- check available updated xtext versions and upgrade if needed
- add: comments (line & block)
- add: lists as knowledge (`[1,2,3]`)
- fix: highlighting of keyword should be context based. At the moment you cannot use the `key` keyword anywhere except as its use as keyword, but it should also be available as knowledge name, principal names, etc
- add: function application highlighting
- add: check alternatives/optionally names to be unique (in order to better refer to them later)
- add: first checks validation for knowledge, equality and freshness checks (simplified, no verification nor active attacker to use)
- add: branches validation (optionally, alternatively) with backtracking to where/how branches fails

## 2022-04-23

### Grammar definition with xtext

Following the meeting with Mario Lilli the following proposed changes were agreed:

1. functions should define params, key and return type so to check correct usage and map them to verification functions as well as solve "different order params = different result" problem
2. key inversion for functions can now be defined with an expression definition based on some values, instead of just values, in order to define a way to create inverse keys based on some values and not just specify the inverse keys for some keys
3. the protocol should define if it has to be verified against an active or a passive attacker
4. generators definition and usage should be differentiated, so in order to use generators you have to call them (no params function)
5. knowledge namespace should be one, so that there could not be two knowledge with the same name (in order to improve readability and better specify intent)

## 2022-04-18

Added examples (eclipse project) inside this repo

### Grammar definition with xtext

1. finished reworking of [2022-04-17](#2022-04-17) for knowledge rules, check, encryption/decryption as function and key inversion/decryption stated per function
2. missing guarded values when communicating (like public keys, as the ones in verifpal) and authentication checks, for checking if Bob can be sure that a message came from Alice or not (and therefore check if a value has been learned thanks to a specific principal)
3. there's still some investigation to do about key decryption ability expressiveness when used in conjunction with defined custom functions (one way / invert). Don't know if the actual rules can express all scenarios.

## 2022-04-17

### Grammar definition with xtext

1. reworked knowledge rules and encryption as function to express functions used in a generic way
2. still work to do in order to allow both specific functions and generic utilities like "from" for when the specific function is not needed (eg. want to encrypt/decrypt a with k without stating the function used)

## 2022-04-09

### Grammar definition with xtext

Used the verifpal manual to grasp real world concepts about protocol definition and validation.

1. improved knowledge rules and functions/generator rules to better adhere to real world protocol definitions (first examples of verifpal manual helped)
2. assessed the fact that there's no one type of check to be made to the protocol execution (the already thought of knowledge check) but there are others, like freshness check (implemented now) and some others which require more study
3. assessed the fact there could be "passive" and "active" attackers (as verifpal manual states) which lead to different kind of checks and executions to be made from the protocol validator point of view and which change slightly how the grammar is defined

## 2022-04-05

### Grammar definition with xtext

1. restructured knowledge rules to let them be more precise over valid knowledge expressions and usage as blocks or single knowledge values
2. specified useful generators in grammar
3. removed rand as function and moved to generators

## 2022-04-01

- meeting with Mario Lilli, Chiara Braghin, Elvinia Riccobene in order to understand the actual implementation of the dsl grammar and its ability to express protocol specifications
- generators and functions are good to be implemented. For generators, there's some more investigation to do in order to better understand how to implement them

## 2022-03-26

### Repo setup with latex

- setup environment for build thesis latex document
- setup first draft of content structure and title

### Grammar definition with xtext

1. revised rules definition to have better and more clear hierarchy of knowledge-related rules and allows more freedom when defining knowledge values
2. technological mean discussed at point 2.1 during [2022-03-20](#2022-03-20) should not be described as of now
3. implemented basic rules for testing knowledge both at certain point of the protocol execution and in the whole scenario context
4. implemented basic rules for generators (number, string, timestamp) and functions (hash, rand). Don't know yet if they would be useful to enrich testing capabilities. However, they should be useful for describing the protocol itself
5. implemented basic rule for letting the dsl know about decryption capabilities for some key/values (so to express asymmetric keys first by introducing the private e public keys, then describing that the private key is able to decrypt the private key). This method should allow more complex/generic decryption systems instead of using special syntax for asymmetric key pairs
6. new open points:
   1. understand how scenarios make testing differ when checking knowledge not in a particular point of execution (eg. in the global scenario `A should not know X` but in a sub scenario `A` encounters `X`). What should be done? How global checking works related to scenario scopes? It could be useful to have the global scenario executing, then different subscenario happening and then finally in the global scenario again check for something that should be valid for each subscenario.
   2. how should subscenarios describe optionals parts of the protocol or alternatives in a particular point of execution of the protocol? How should this be handled by the knowledge checking?

## 2022-03-20

### Grammar definition with xtext

1. base grammar rules definitions for protocol structure
2. options for possible advanced definitions to include in the DSL itself:
   1. _test_ for testing protocol requirements in a certain _point (in time)_ during defined communications are respected or not (eg. after communication `A -> B` with data `D`, does `B` know `D`? Does `C` know `D`?)
   2. should the technological communication mean (direct/physical, broadcast, internet, other?) be defined within communication definitions? Should the technology world (local net, internet, other?) where communication happens be described?
3. first _advanced_ concept drafts:
   1. knowledge and shared knowledge as blocks to describe several data and reference them in other principal knowledge or as data already known for all principals respectively
   2. testing of knowledge at a certain point should be both reference based (a principal knows the data `D`) and value based, so that if somehow a principal get to know the value `"string"` or `42` a warning should be triggered if that value is a value that principal should not know
   3. _generators_ for having data/knowledged expressed as function (generator) for just in time retrieving of value (potentially useful for timestamps and random values)
