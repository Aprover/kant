# onlyRefInKnowledgeCheck Validation Function Documentation

The `onlyRefInKnowledgeCheck` function is a custom validation function that checks `Protocol` language models to ensure that knowledge checks target only knowledge references. If any knowledge check does not target a knowledge reference, the function issues an error.

## Function Signature

```typescript
onlyRefInKnowledgeCheck: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void>
```

This function takes two arguments:

- `protocol`: An instance of the `Protocol` language model, which represents the complete abstract syntax tree (AST) of the parsed source code.
- `accept`: A `ValidationAcceptor` instance used to report errors, warnings, or info messages about the validation.

## Function Description

1. The function iterates through all `KnowledgeCheck` nodes in the protocol.

2. For each `KnowledgeCheck` node, it checks if the knowledge is a reference (`KnowledgeRef`).

3. If the knowledge is not a reference, the function issues an error message, indicating that the knowledge check should target only knowledge references.

## Usage

The `onlyRefInKnowledgeCheck` function helps ensure that the language's semantics are adhered to correctly.