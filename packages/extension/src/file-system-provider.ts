import { prelude } from "kant-core"
// eslint-disable-next-line import/no-unresolved
import * as vscode from "vscode"

export class KantBuiltinFileSystemProvider implements vscode.FileSystemProvider {
    static register(context: vscode.ExtensionContext): void {
        // eslint-disable-next-line functional/immutable-data
        context.subscriptions.push(
            vscode.workspace.registerFileSystemProvider(`builtin`, new KantBuiltinFileSystemProvider(), {
                isReadonly: true,
                isCaseSensitive: false
            })
        )
    }

    stat(): vscode.FileStat {
        const date = Date.now()
        return {
            ctime: date,
            mtime: date,
            size: prelude.content.length,
            type: vscode.FileType.File
        }
    }

    readFile(): Uint8Array {
        // We could return different libraries based on the URI
        // We have only one, so we always return the same
        return new Uint8Array(Buffer.from(prelude.content))
    }

    // The following class members only serve to satisfy the interface

    private readonly didChangeFile = new vscode.EventEmitter<vscode.FileChangeEvent[]>()
    onDidChangeFile = this.didChangeFile.event

    watch(): {
        dispose: () => undefined
    } {
        return {
            dispose: () => undefined
        }
    }

    readDirectory(): never {
        // eslint-disable-next-line functional/no-throw-statement
        throw vscode.FileSystemError.NoPermissions()
    }

    createDirectory(): never {
        // eslint-disable-next-line functional/no-throw-statement
        throw vscode.FileSystemError.NoPermissions()
    }

    writeFile(): never {
        // eslint-disable-next-line functional/no-throw-statement
        throw vscode.FileSystemError.NoPermissions()
    }

    delete(): never {
        // eslint-disable-next-line functional/no-throw-statement
        throw vscode.FileSystemError.NoPermissions()
    }

    rename(): never {
        // eslint-disable-next-line functional/no-throw-statement
        throw vscode.FileSystemError.NoPermissions()
    }
}
