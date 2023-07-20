# functionsAllCaps Validation Function Documentation

`functionsAllCaps` is a custom validation function that checks whether all function names in a `Protocol` language model are written in uppercase. If it encounters a function name that is not in uppercase, it issues a warning.

## Function Signature

```typescript
functionsAllCaps: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void>
```

This function receives two arguments:

- `protocol`: An instance of the `Protocol` language model, representing the complete abstract syntax tree (AST) of the parsed source code.
- `accept`: A `ValidationAcceptor` instance that's used to report errors, warnings, or information regarding the validation.

## Function Description

1. The function iterates over all nodes in the `Protocol` AST, filtering for `FunctionDef` nodes.

2. For each `FunctionDef` node, it transforms the function name to uppercase using the `toUpperCase` method.

3. If the original function name does not match the all-caps version, a warning is issued via the `accept` method, suggesting that function names should be all caps.

## Usage

The `functionsAllCaps` function can be used as part of the validation suite in Kant to enforce a coding convention where all function names should be in uppercase. This can contribute to a unified and clean look, making it easier to read and understand the code written.

By integrating this function into your validation service, you will receive warnings about function names that are not written in uppercase, enabling you to maintain consistent naming conventions across your protocol specification.