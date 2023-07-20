# variadicParameterNotLast Validation Function Documentation

The `variadicParameterNotLast` function is a custom validation function that verifies if variadic parameters in a function definition are positioned as the last parameter. If a variadic parameter is found anywhere except at the last position, it raises an error message.

## Function Signature

```typescript
variadicParameterNotLast: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void>
```

This function takes two parameters:

- `protocol`: An instance of the `Protocol` language model, which represents the entire abstract syntax tree (AST) of the parsed source code.
- `accept`: A `ValidationAcceptor` instance used to register errors, warnings, or informational messages during validation.

## Function Description

1. The function starts by iterating over all nodes in the `protocol` that are of type `FunctionDef`.

2. For each `FunctionDef` node, it retrieves the function's parameters.

3. It then loops through the parameters. If it encounters a variadic parameter that is not the last parameter in the list, it calls the `accept` method with an error message.

## Usage

This function helps to ensure that variadic parameters are always at the end of the parameter list in the language.