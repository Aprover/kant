# knowledgeDeclarationBeforeUsage Validation Function Documentation

`knowledgeDeclarationBeforeUsage` is a custom validation function that checks that all used knowledge variables within a `Protocol` language model have been declared prior to their usage. If a knowledge variable is used without a preceding declaration, the function reports an error.

## Function Signature

```typescript
knowledgeDeclarationBeforeUsage: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void>
```

This function accepts two arguments:

- `protocol`: An instance of the `Protocol` language model, representing the complete abstract syntax tree (AST) of the parsed source code.
- `accept`: A `ValidationAcceptor` instance used to report errors, warnings, or info messages about the validation.

## Function Description

1. The function initializes an empty set, `knowledge`, to store the names of all declared knowledge variables.

2. It then traverses the `Protocol` AST, collecting the names of all built-in and custom knowledge variables, adding them to the `knowledge` set.

3. Once all declarations are collected, the function iterates over all `Communication` and `KnowledgeFromFunctionArgs` nodes.

4. If a reference to a knowledge variable is found, the function checks if the name of the referenced variable exists in the `knowledge` set. If it doesn't, an error is reported via the `accept` method, indicating that the variable has been used without a preceding declaration.

## Usage

The `knowledgeDeclarationBeforeUsage` function is useful in enforcing the rule that all knowledge variables must be declared before they are used. This ensures a logical flow in the protocol and prevents errors due to undeclared variables.

By adding this to the validation suite, it will help identify cases where knowledge variables are used before they are declared, thus helping maintain logical and functional integrity.