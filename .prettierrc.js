module.exports = {
    printWidth: 120,
    tabWidth: 4,
    semi: false,
    trailingComma: "none",
    arrowParens: "avoid",
    proseWrap: "preserve",
    quoteProps: "consistent",
    overrides: [
        {
            files: "**/*.md",
            options: {
                tabWidth: 1
            }
        },
        {
            files: "**/*.yml",
            options: {
                tabWidth: 2
            }
        }
    ],
    plugins: [require("prettier-plugin-organize-imports")]
}
