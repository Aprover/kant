# referenceSpreadingFunctionParams Validation Function Documentation

The `referenceSpreadingFunctionParams` function is a custom validation function that checks `Protocol` language models to ensure that the use of the spreading operator is appropriate in the context of function arguments. If the function encounters a spreading operation on a reference that is not to a set or list, the function issues an error.

## Function Signature

```typescript
referenceSpreadingFunctionParams: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void>
```

This function takes two arguments:

- `protocol`: An instance of the `Protocol` language model, which represents the complete abstract syntax tree (AST) of the parsed source code.
- `accept`: A `ValidationAcceptor` instance used to report errors, warnings, or info messages about the validation.

## Function Description

1. The function starts by collecting all references to sets and lists in the protocol. It does this by iterating over all `KnowledgeDefCustom` nodes and, if the node's value is a set or a list, adds the name of the node to the `setsOrLists` set.

2. The function then goes through all the function invocation arguments (`KnowledgeFromFunctionArgs` nodes) in the protocol.

3. If it finds a `KnowledgeSpreading` node in the function invocation arguments, it checks whether the reference (`KnowledgeRef`) is included in the `setsOrLists` set.

4. If the reference is not in the `setsOrLists` set, the function calls the `accept` function to issue an error message, because the spread operation is being used on a reference that is not a set or list.

## Usage

The `referenceSpreadingFunctionParams` function is useful in Kant because it is a domain-specific language that includes the concept of spreading operator, function invocations, sets and lists. This function helps to ensure that the language's rules about where the spreading operator can be used are correctly enforced.