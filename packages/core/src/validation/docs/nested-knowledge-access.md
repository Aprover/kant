# nestedKnowledgeAccess Validation Function Documentation

The `nestedKnowledgeAccess` function is a custom validation function that checks if nested access operations are performed only on `KnowledgeSet` data structures within a `Protocol` language model. If nested access is performed on non-set knowledge structures, the function issues an error.

## Function Signature

```typescript
nestedKnowledgeAccess: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void>
```

This function takes two arguments:

- `protocol`: An instance of the `Protocol` language model, representing the complete abstract syntax tree (AST) of the parsed source code.
- `accept`: A `ValidationAcceptor` instance used to report errors, warnings, or info messages about the validation.

## Function Description

1. The function first creates an empty set `sets` to store the names of all `KnowledgeSet` instances in the protocol.

2. It then streams all contents of the protocol and filters out the custom knowledge definitions. For each custom knowledge definition, it checks if the left part is a custom name and the value part is a set. If both conditions are satisfied, it adds the name of the set to the `sets`.

3. Next, the function streams all contents of the protocol again and filters out the knowledge references. For each knowledge reference, it checks if there are any access operations. If there are, it checks if the reference is a set. If the reference is not a set, it uses the `accept` function to issue an error.

## Usage

The `nestedKnowledgeAccess` function is useful in Kant because it supports nested access operations only on `KnowledgeSet` data structures. By incorporating this function into your Kant's validation service, it can prevent users from performing nested access on non-set knowledge structures.