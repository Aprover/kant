import * as path from "path"
// eslint-disable-next-line import/no-unresolved
import * as vscode from "vscode"
import type { LanguageClientOptions, ServerOptions } from "vscode-languageclient/node"
import { LanguageClient, TransportKind } from "vscode-languageclient/node"
import { KantBuiltinFileSystemProvider } from "./file-system-provider"

// eslint-disable-next-line functional/no-let
let client: LanguageClient | undefined

// This function is called when the extension is activated.
export function activate(context: vscode.ExtensionContext): void {
    client = startLanguageClient(context)
    KantBuiltinFileSystemProvider.register(context)
}

// This function is called when the extension is deactivated.
export function deactivate(): Thenable<void> | undefined {
    if (client) {
        return client.stop()
    }
    return undefined
}

function startLanguageClient(context: vscode.ExtensionContext): LanguageClient {
    const serverModule = context.asAbsolutePath(path.join(`out`, `main`))
    // The debug options for the server
    // --inspect=6009: runs the server in Node's Inspector mode so VS Code can attach to the server for debugging.
    // By setting `process.env.DEBUG_BREAK` to a truthy value, the language server will wait until a debugger is attached.
    const debugOptions = {
        execArgv: [
            `--nolazy`,
            // eslint-disable-next-line @typescript-eslint/strict-boolean-expressions, @typescript-eslint/prefer-nullish-coalescing
            `--inspect${process.env[`DEBUG_BREAK`] ? `-brk` : ``}=${process.env[`DEBUG_SOCKET`] || `6009`}`
        ]
    }

    // If the extension is launched in debug mode then the debug server options are used
    // Otherwise the run options are used
    const serverOptions: ServerOptions = {
        run: { module: serverModule, transport: TransportKind.ipc },
        debug: { module: serverModule, transport: TransportKind.ipc, options: debugOptions }
    }

    const fileSystemWatcher = vscode.workspace.createFileSystemWatcher(`**/*.kant`)

    // eslint-disable-next-line functional/immutable-data
    context.subscriptions.push(fileSystemWatcher)

    // Options to control the language client
    const clientOptions: LanguageClientOptions = {
        documentSelector: [{ scheme: `file`, language: `kant` }],
        synchronize: {
            // Notify the server about file changes to files contained in the workspace
            fileEvents: fileSystemWatcher
        }
    }

    // Create the language client and start the client.
    const client = new LanguageClient(`kant`, `Kant`, serverOptions, clientOptions)

    // Start the client. This will also launch the server
    // eslint-disable-next-line @typescript-eslint/no-floating-promises
    client.start()
    return client
}
