// @ts-check
require("esbuild")
    .build({
        // Two entry points, one for the extension, one for the language server
        entryPoints: ["src/extension.ts", "src/main.ts"],
        outdir: "out", // All bundles are put into this directory
        bundle: true, // We want to create bundles for the extension and language server
        external: ["vscode"], // the vscode-module is created on-the-fly during runtime and must be excluded
        platform: "node" // VSCode extensions run in a node process
    })
    .then(() => console.log(`Bundled successfully!`))
    .catch(() => process.exit(1))
