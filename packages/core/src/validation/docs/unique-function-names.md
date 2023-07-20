# uniqueFunctionNames Validation Function Documentation

The `uniqueFunctionNames` function is a custom validation function that checks `Protocol` language models for duplicate function names. If it finds a duplicate, it raises an error.

## Function Signature

```typescript
uniqueFunctionNames: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void>
```

This function takes two arguments:

- `protocol`: An instance of the `Protocol` language model, which represents the complete abstract syntax tree (AST) of the parsed source code.
- `accept`: A `ValidationAcceptor` instance used to report errors, warnings, or info messages about the validation.

## Function Description

1. The function starts by creating an empty `Set` called `functionNames` to hold the names of all the functions it encounters.

2. The function then iterates over all nodes in the `protocol` that are `FunctionDef` nodes.

3. For each `FunctionDef` node, the function checks if its `name` is already present in the `functionNames` set.

4. If the `name` is already in the set, the function calls the `accept` function with an error message, because this means the `name` has been used more than once.

5. If the `name` is not already in the set, the function adds it to the set and continues to the next `FunctionDef` node.

## Usage

The `uniqueFunctionNames` function helps to enforce the uniqueness of these names in the language.