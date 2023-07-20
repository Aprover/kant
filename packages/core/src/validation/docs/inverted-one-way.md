# invertedOneWay Validation Function Documentation

`invertedOneWay` is a custom validation function that checks for any attempts to invert one-way functions within a `Protocol` language model. If such an inversion is found, it issues an error.

## Function Signature

```typescript
invertedOneWay: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void>
```

This function receives two arguments:

- `protocol`: An instance of the `Protocol` language model, representing the complete abstract syntax tree (AST) of the parsed source code.
- `accept`: A `ValidationAcceptor` instance that's used to report errors, warnings, or information regarding the validation.

## Function Description

1. The function starts by defining a list of predefined one-way functions (`owFunctions`).

2. It then iterates over all nodes in the `Protocol` AST, filtering for `FunctionDef` nodes.

3. If a `FunctionDef` node is marked as one-way (i.e., `ow` is true), its name is added to the list of one-way functions.

4. Afterwards, the function iterates over all `PropertyDef` nodes in the `Protocol` AST.

5. For each `PropertyDef` node, if it defines a `FunctionInversionDef` property, the function checks if the name of the inverted function is in the list of one-way functions. If it is, an error is reported via the `accept` method, indicating that a one-way function cannot be inverted.

## Usage

The `invertedOneWay` function can be used as part of the validation suite in Kant to prevent inversions of one-way functions. One-way functions, by definition, should not be invertible, so this validation helps preserve the logical correctness of the protocol specification.

By integrating this function into the validation service, you will receive errors about attempts to invert one-way functions, helping you maintain the correct design and functionality.