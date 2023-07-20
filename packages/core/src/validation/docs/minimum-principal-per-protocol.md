# minimumPrincipalsPerProtocol Validation Function Documentation

The `minimumPrincipalsPerProtocol` function is a custom validation function that checks if a `Protocol` language model has at least two principals. If there are fewer than two principals, the function issues a warning.

## Function Signature

```typescript
minimumPrincipalsPerProtocol: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void>
```

This function takes two arguments:

- `protocol`: An instance of the `Protocol` language model, representing the complete abstract syntax tree (AST) of the parsed source code.
- `accept`: A `ValidationAcceptor` instance used to report errors, warnings, or info messages about the validation.

## Function Description

1. The function first checks if the root node of the protocol is not a prelude (`builtin:/prelude.kant`). This is done to ensure that the validation is not applied to foundational language constructs.

2. It then counts the number of principals in the protocol. This is achieved by streaming all contents of the protocol, filtering for principals, and then counting the number of these filtered elements.

3. If the count of principals is less than two, it uses the `accept` function to issue a warning.

## Usage

The `minimumPrincipalsPerProtocol` function is useful for ensuring the usage of at least two principals per protocol for the language constructs to make sense. By incorporating this function into the validation service, you can ensure that every protocol has at least two principals.