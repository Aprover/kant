# noSelfCommunication Validation Function Documentation

The `noSelfCommunication` function is a custom validation function that checks `Protocol` language models to ensure that no principal (actor) in the system communicates with themselves. If such a case is identified, the function raises an error.

## Function Signature

```typescript
noSelfCommunication: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void>
```

This function takes two arguments:

- `protocol`: An instance of the `Protocol` language model, which represents the complete abstract syntax tree (AST) of the parsed source code.
- `accept`: A `ValidationAcceptor` instance used to report errors, warnings, or info messages about the validation.

## Function Description

1. The function begins by streaming all contents of the provided protocol.

2. The stream is then filtered to only include nodes that represent communications (`isCommunication`).

3. For each of the resulting nodes, the function checks whether the principal initiating the communication is the same as the target principal receiving the communication.

4. If a principal is found to be communicating with themselves, the function reports an error using the `accept` function.

## Usage

The `noSelfCommunication` function is especially useful where self-communication is considered an illegal or undesirable operation. By including this function in Kant, you can prevent users from declaring redundant communication.