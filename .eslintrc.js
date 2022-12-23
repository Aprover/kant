module.exports = {
    root: true,
    parser: "@typescript-eslint/parser",
    parserOptions: {
        project: "./tsconfig.json",
        tsconfigRootDir: __dirname,
        ecmaVersion: 11
    },
    plugins: [
        "@typescript-eslint",
        "eslint-comments",
        "jest",
        "functional",
        "import",
        "eslint-plugin-import-access",
        "fp-ts",
        "typescript-enum"
    ],
    ignorePatterns: ["**/*.js"],
    env: {
        "es2020": true,
        "node": true,
        "jest/globals": true
    },
    extends: [
        "eslint:recommended",
        "plugin:@typescript-eslint/eslint-recommended",
        "plugin:@typescript-eslint/recommended",
        "plugin:@typescript-eslint/recommended-requiring-type-checking",
        "plugin:@typescript-eslint/strict",
        "plugin:eslint-comments/recommended",
        "plugin:jest/recommended",
        "plugin:jest/style",
        "plugin:functional/no-mutations",
        "plugin:functional/no-object-orientation",
        "plugin:functional/no-exceptions",
        "plugin:functional/currying",
        "plugin:functional/stylistic",
        "plugin:functional/external-recommended",
        "plugin:import/recommended",
        "plugin:import/typescript",
        "plugin:fp-ts/recommended",
        "plugin:fp-ts/recommended-requiring-type-checking",
        "plugin:typescript-enum/recommended"
    ],
    rules: {
        "semi": ["error", "never"],
        "no-console": ["error"],
        // typescript
        "no-duplicate-imports": "off",
        "@typescript-eslint/no-duplicate-imports": ["error"],
        "quotes": "off",
        "@typescript-eslint/quotes": ["error", "backtick"],
        "@typescript-eslint/no-invalid-void-type": "off",
        "@typescript-eslint/prefer-readonly-parameter-types": "off",
        "@typescript-eslint/consistent-type-definitions": ["error", "type"],
        "@typescript-eslint/consistent-type-assertions": [
            "error",
            {
                assertionStyle: "never"
            }
        ],
        "@typescript-eslint/array-type": ["error", { default: "array" }],
        "@typescript-eslint/consistent-type-exports": ["error"],
        "@typescript-eslint/explicit-function-return-type": [
            "error",
            {
                allowExpressions: true
            }
        ],
        "@typescript-eslint/method-signature-style": ["error", "property"],
        "@typescript-eslint/no-confusing-void-expression": ["error"],
        "@typescript-eslint/no-implicit-any-catch": ["error"],
        "@typescript-eslint/no-redundant-type-constituents": ["error"],
        "@typescript-eslint/no-require-imports": ["error"],
        "@typescript-eslint/no-unnecessary-qualifier": ["error"],
        "@typescript-eslint/no-useless-empty-export": ["error"],
        "@typescript-eslint/prefer-enum-initializers": ["error"],
        "@typescript-eslint/strict-boolean-expressions": ["error"],
        "@typescript-eslint/switch-exhaustiveness-check": ["error"],
        "@typescript-eslint/consistent-type-imports": ["error", { prefer: "type-imports" }],
        // eslint comments
        "eslint-comments/no-unused-disable": ["error"],
        "eslint-comments/disable-enable-pair": ["error", { allowWholeFile: true }],
        // jest
        "jest/consistent-test-it": ["error", { withinDescribe: "it" }],
        "jest/no-conditional-in-test": ["error"],
        "jest/no-duplicate-hooks": ["error"],
        "jest/prefer-comparison-matcher": ["error"],
        "jest/prefer-equality-matcher": ["error"],
        "jest/prefer-expect-assertions": ["error"],
        "jest/prefer-expect-resolves": ["error"],
        "jest/prefer-lowercase-title": ["error"],
        "jest/prefer-spy-on": ["error"],
        "jest/prefer-strict-equal": ["error"],
        "jest/prefer-hooks-in-order": ["error"],
        "jest/prefer-hooks-on-top": ["error"],
        "jest/require-to-throw-message": ["error"],
        "jest/require-top-level-describe": ["error"],
        "jest/no-test-return-statement": ["error"],
        "jest/prefer-called-with": ["error"],
        // import
        "import/no-unresolved": [2, { ignore: ["^fp-ts-std/"] }],
        // functional
        "functional/functional-parameters": [
            "error",
            {
                allowRestParameter: true,
                enforceParameterCount: false
            }
        ],
        "functional/prefer-readonly-type": "off",
        // import access (package private)
        "import-access/jsdoc": ["error"]
    },
    overrides: [
        {
            files: "**/*.test.ts",
            rules: {
                "functional/no-throw-statement": "off"
            }
        },
        {
            files: "packages/cli/src/**/*.ts",
            rules: {
                "no-console": "off"
            }
        }
    ]
}
