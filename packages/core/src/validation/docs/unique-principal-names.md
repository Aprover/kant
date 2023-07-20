# uniquePrincipalNames Validation Function Documentation

The `uniquePrincipalNames` function is a custom validation function that checks for duplicate names of principals within a `Protocol` language model. If it identifies any duplicate names, it raises an error message.

## Function Signature

```typescript
uniquePrincipalNames: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void>
```

This function takes two parameters:

- `protocol`: An instance of the `Protocol` language model, which represents the entire abstract syntax tree (AST) of the parsed source code.
- `accept`: A `ValidationAcceptor` instance used to register errors, warnings, or informational messages during validation.

## Function Description

1. The function initiates by creating an empty `Set` named `principalNames` to store the names of all principals it encounters.

2. The function then iterates over all nodes in the `protocol` that are of type `Principal`.

3. For each `Principal` node, it checks if its name is already present in the `principalNames` set. If the name exists in the set, it signifies that the name has been used more than once, and the function calls the `accept` method with an error message.

4. If the name is not present in the set, it is added to the `principalNames` set.

## Usage

This function aids in ensuring the uniqueness of the names of principals in the language.