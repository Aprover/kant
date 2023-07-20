# knowledgeInSharedDef Validation Function Documentation

The `knowledgeInSharedDef` function is a custom validation function that checks if the knowledge defined in a shared knowledge definition within a `Protocol` language model is either a built-in or a custom knowledge definition. If a `KnowledgeValue` type of knowledge is found, the function reports an error.

## Function Signature

```typescript
knowledgeInSharedDef: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void>
```

This function takes two arguments:

- `protocol`: An instance of the `Protocol` language model, representing the complete abstract syntax tree (AST) of the parsed source code.
- `accept`: A `ValidationAcceptor` instance used to report errors, warnings, or info messages about the validation.

## Function Description

1. The function traverses the `Protocol` AST and locates all shared knowledge definitions.

2. For each shared knowledge definition (`skd`), it checks if the `knowledge` attribute is of type `KnowledgeValue`.

3. If a `KnowledgeValue` is found, the function reports an error through the `accept` method. The error message informs that a shared knowledge definition should contain either a built-in or a custom knowledge definition.

## Usage

The `knowledgeInSharedDef` function is useful in maintaining the structural integrity of shared knowledge definitions within a `Protocol` language model. It ensures that these definitions are either built-in or custom knowledge definitions, thus preventing the use of `KnowledgeValue` types in such context.

By incorporating this function into Kant's validation service, you can enforce the correct usage of shared knowledge definitions within your DSL.