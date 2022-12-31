import type { LangiumDocument, LangiumDocumentFactory, LangiumSharedServices } from "langium"
import { DefaultWorkspaceManager } from "langium"
import type { WorkspaceFolder } from "vscode-languageserver"
import { URI } from "vscode-uri"
import { prelude } from "./builtin/prelude"

export class KantWorkspaceManager extends DefaultWorkspaceManager {
    private readonly documentFactory: LangiumDocumentFactory

    constructor(services: LangiumSharedServices) {
        super(services)
        this.documentFactory = services.workspace.LangiumDocumentFactory
    }

    protected override loadAdditionalDocuments(
        _folders: WorkspaceFolder[],
        collector: (document: LangiumDocument) => void
    ): Promise<void> {
        collector(this.documentFactory.fromString(prelude.content, URI.parse(`builtin:///${prelude.name}`)))
        return Promise.resolve()
    }
}
