# noDuplicationInCommunicationReceivers Validation Function Documentation

The `noDuplicationInCommunicationReceivers` function is a custom validation function that checks for any duplicate recipients in communication instances within a `Protocol` language model. If a recipient is duplicated, the function issues an error.

## Function Signature

```typescript
noDuplicationInCommunicationReceivers: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void>
```

This function takes two arguments:

- `protocol`: An instance of the `Protocol` language model, representing the complete abstract syntax tree (AST) of the parsed source code.
- `accept`: A `ValidationAcceptor` instance used to report errors, warnings, or info messages about the validation.

## Function Description

1. The function streams all contents of the protocol and filters out the communication instances. 

2. For each communication instance, it creates a new set `receivers` to store the names of recipients.

3. Then, it goes through each recipient. If the recipient's name is already in the `receivers` set, it uses the `accept` function to issue an error indicating the redundant declaration of the principal in the communication. If the recipient's name is not in the `receivers` set, it adds the name to the set.

## Usage

The `noDuplicationInCommunicationReceivers` function is useful because it disallows duplicate recipients in a communication instance. By incorporating this function into the validation service, you can prevent users from declaring the same recipient multiple times in the same communication.