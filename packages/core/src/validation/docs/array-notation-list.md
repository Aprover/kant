# arrayNotationList Validation Function Documentation

`arrayNotationList` is a custom validation function that verifies the correct usage of array notation in the context of our defined `Protocol` language model. It specifically checks whether variables accessed with array notation are indeed declared as lists or returned from functions that return more than one value.

## Function Signature

```typescript
arrayNotationList: (protocol: Protocol, accept: ValidationAcceptor): MaybePromise<void>
```

This function receives two arguments:

- `protocol`: An instance of the `Protocol` language model, representing the complete abstract syntax tree (AST) of the parsed source code.
- `accept`: A `ValidationAcceptor` instance that's used to report errors, warnings, or information regarding the validation.

## Function Description

1. The function begins by declaring a `Set` of strings named `lists`, which will hold the names of variables that are valid to be accessed using array notation. This can be variables that are explicitly declared as lists.

2. It also declares a `Set` of strings `fx`, which will hold the names of functions that return more than one value. The function `HKDF` and `SPLIT` are added to this set by default.

3. The function then iterates over all `FunctionDef` nodes in the `Protocol` AST. If a function returns more than one value (i.e., the `elements` property of its `return` object has a length greater than 1), the function's name is added to `fx`.

4. Next, it iterates over all `KnowledgeDefCustom` nodes in the `Protocol` AST. If a node's left-hand side is a `KnowledgeDefCustomName` and the right-hand side is a `KnowledgeList` or a `KnowledgeFromFunction` (that invokes a function present in `fx`), the name of the `KnowledgeDefCustomName` is added to `lists`.

5. Finally, the function iterates over all `ListAccess` nodes in the `Protocol` AST. If a `ListAccess` node's referenced variable is not present in `lists`, an error is reported via `accept`, indicating that the variable is not a list and therefore cannot be accessed using an index.

## Usage

`arrayNotationList` function can be used as part of the validation suite of Kant to ensure semantic correctness of list access operations. By integrating it into the validation service, you will receive feedback about incorrect usages of list access notation, enabling better error handling and robustness.