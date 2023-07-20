# noFreshConstEquality Validation Function Documentation

The `noFreshConstEquality` function is a custom validation function that checks for any invalid equality check cases within a `Protocol` language model. Specifically, it makes sure that no equality check (`isEqualityCheck`) involves both "fresh" and "const" knowledge definition values at the same time. If such a case is detected, an error is issued because "fresh" and "const" values cannot be equal.

## Function Signature

```typescript
noFreshConstEquality: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void>
```

This function takes two arguments:

- `protocol`: An instance of the `Protocol` language model, representing the complete abstract syntax tree (AST) of the parsed source code.
- `accept`: A `ValidationAcceptor` instance used to report errors, warnings, or info messages about the validation.

## Function Description

1. The function initializes two sets: `freshs` and `consts` to store the names of "fresh" and "const" knowledge definition values respectively.

2. It streams all contents of the protocol and filters out the built-in knowledge definitions (`isKnowledgeDefBuiltin`). 

3. For each built-in knowledge definition, it checks its type. If the type is "fresh", it adds the names of the definition to the `freshs` set. If the type is "const", it adds the names to the `consts` set.

4. Then it streams all contents of the protocol again, this time filtering out the equality checks (`isEqualityCheck`).

5. For each equality check, it checks whether it involves both "fresh" and "const" knowledge definitions. If such a case is found, it uses the `accept` function to issue an error message.

## Usage

The `noFreshConstEquality` function is beneficial in a domain-specific language that disallows "fresh" and "const" knowledge definition values to be equal, like Kant. You can use this function in Kant's validation service to prevent users from making invalid equality checks.