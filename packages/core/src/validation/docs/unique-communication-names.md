# uniqueCommunicationNames Validation Function Documentation

The `uniqueCommunicationNames` function is a custom validation function that checks `Protocol` language models for duplicate communication names. If it finds a duplicate, it raises an error.

## Function Signature

```typescript
uniqueCommunicationNames: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void>
```

This function takes two arguments:

- `protocol`: An instance of the `Protocol` language model, which represents the complete abstract syntax tree (AST) of the parsed source code.
- `accept`: A `ValidationAcceptor` instance used to report errors, warnings, or info messages about the validation.

## Function Description

1. The function starts by creating an empty `Set` called `communicationNames` to hold the names of all the communications it encounters.

2. The function then iterates over all nodes in the `protocol` that are `Communication` nodes.

3. For each `Communication` node, the function checks if it has a `messageId`. If it does, the function checks if this `messageId` is already present in the `communicationNames` set.

4. If the `messageId` is already in the set, the function calls the `accept` function with an error message, because this means the `messageId` has been used more than once.

5. If the `messageId` is not already in the set, the function adds it to the set and continues to the next `Communication` node.

## Usage

The `uniqueCommunicationNames` function helps to enforce the uniqueness of these names in the Kant language.