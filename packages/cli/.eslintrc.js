module.exports = {
    parser: "@typescript-eslint/parser",
    parserOptions: {
        project: "./tsconfig.json",
        tsconfigRootDir: __dirname,
        ecmaVersion: 11
    },
    overrides: [
        {
            files: ["**/*.ts"],
            rules: {
                "import/no-extraneous-dependencies": ["error", { packageDir: __dirname }]
            }
        },
        {
            files: "src/**/*.ts",
            rules: {
                "no-console": "off"
            }
        }
    ]
}
