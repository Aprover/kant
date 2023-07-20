# uniqueKnowledgeNames Validation Function Documentation

The `uniqueKnowledgeNames` function is a custom validation function that checks `Protocol` language models for duplicate knowledge names. If it finds a duplicate, it raises an error.

## Function Signature

```typescript
uniqueKnowledgeNames: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void>
```

This function takes two arguments:

- `protocol`: An instance of the `Protocol` language model, which represents the complete abstract syntax tree (AST) of the parsed source code.
- `accept`: A `ValidationAcceptor` instance used to report errors, warnings, or info messages about the validation.

## Function Description

1. The function starts by creating an empty `Set` called `knowledgeNames` to hold the names of all the knowledge items it encounters.

2. The function then iterates over all nodes in the `protocol` that are `Knowledge` and `KnowledgeDef` nodes.

3. For each `KnowledgeDef` node, the function checks if it is a `KnowledgeDefBuiltin` or a custom knowledge definition, and if the latter, whether it's not a set or from a function.

4. For `KnowledgeDefBuiltin`, the function iterates over the names and checks if each `name` is already present in the `knowledgeNames` set. If the `name` is already in the set, the function calls the `accept` function with an error message, because this means the `name` has been used more than once. If the `name` is not already in the set, the function adds it to the set.

5. For custom knowledge definitions, the function checks if the left side of the definition is a `KnowledgeDefCustomName` and if so, repeats the same process as with built-in knowledge names.

## Usage

The `uniqueKnowledgeNames` function can be used in a domain-specific language that includes the concept of knowledge with unique names, like Kant. This function helps to enforce the uniqueness of these names in the language.