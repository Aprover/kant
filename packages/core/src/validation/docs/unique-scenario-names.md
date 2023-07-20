# uniqueScenarioNames Validation Function Documentation

The `uniqueScenarioNames` function is a custom validation function that checks for the uniqueness of scenario names within a `Protocol` language model. If it identifies any duplicate names, it raises an error message.

## Function Signature

```typescript
uniqueScenarioNames: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void>
```

This function takes two parameters:

- `protocol`: An instance of the `Protocol` language model, which represents the entire abstract syntax tree (AST) of the parsed source code.
- `accept`: A `ValidationAcceptor` instance used to register errors, warnings, or informational messages during validation.

## Function Description

1. The function starts by creating an empty `Set` named `scenarioNames` to store the names of all scenarios it encounters.

2. The function then iterates over all nodes in the `protocol` that are of type `Scenario`.

3. For each `Scenario` node, it checks if its name is already present in the `scenarioNames` set. If the name exists in the set, it signifies that the name has been used more than once, and the function calls the `accept` method with an error message.

4. If the name is not present in the set, it is added to the `scenarioNames` set.

## Usage

This function aids in ensuring the uniqueness of the names of different scenarios in protocol specifications.