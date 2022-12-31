import type { AstNode, AstNodeDescription, LangiumDocument, PrecomputedScopes } from "langium"
import { DefaultScopeComputation, MultiMap, streamAllContents } from "langium"
import type {
    Communication,
    FunctionDef,
    Knowledge,
    KnowledgeDefBuiltin,
    KnowledgeDefCustom,
    Principal
} from "./generated/ast"
import { isCommunication, isFunctionDef, isKnowledgeBase, isPrincipal } from "./generated/ast"

export class KantScopeComputation extends DefaultScopeComputation {
    override computeExports(document: LangiumDocument): Promise<AstNodeDescription[]> {
        if (document.textDocument.uri.startsWith(`builtin`)) {
            const descriptions = streamAllContents(document.parseResult.value)
                .filter(isFunctionDef)
                .map(functionDef => this.descriptions.createDescription(functionDef, functionDef.name, document))
            return Promise.resolve(descriptions.toArray())
        } else {
            return Promise.resolve([])
        }
    }

    override computeLocalScopes(document: LangiumDocument): Promise<PrecomputedScopes> {
        const rootNode = document.parseResult.value
        const scopes = new MultiMap<AstNode, AstNodeDescription>()
        // Here we navigate the full AST - local scopes shall be available in the whole document
        for (const node of streamAllContents(rootNode)) {
            if (isFunctionDef(node) || isPrincipal(node) || isCommunication(node)) {
                const names = getLocalScopeNamesFrom(node)
                names.forEach(name => scopes.add(rootNode, this.descriptions.createDescription(node, name, document)))
            }

            if (isPrincipal(node)) {
                const knowledge = node.knowledge
                if (knowledge !== undefined) {
                    const names = getKnowledgeNamesFrom(knowledge)
                    names.forEach(name =>
                        scopes.add(node, this.descriptions.createDescription(knowledge, name, document))
                    )
                }
            }

            if (isKnowledgeBase(node)) {
                const names = getKnowledgeNamesFrom(node.knowledge)
                names.forEach(name => scopes.add(rootNode, this.descriptions.createDescription(node, name, document)))
            }
        }
        return Promise.resolve(scopes)
    }
}

const getLocalScopeNamesFrom = (node: FunctionDef | Principal | Communication): string[] => {
    switch (node.$type) {
        case `FunctionDef`:
            return [node.name]
        case `Principal`:
            return node.name
        case `Communication`:
            return node.from.concat(node.to)
    }
}

const getKnowledgeNamesFrom = (knowledge: Knowledge): string[] => {
    const getKnowledgeNamesFromDef = (knowledgeDef: KnowledgeDefBuiltin | KnowledgeDefCustom): string[] => {
        switch (knowledgeDef.$type) {
            case `KnowledgeDefBuiltin`:
                return knowledgeDef.name
            case `KnowledgeDefCustom`:
                switch (knowledgeDef.left.$type) {
                    case `KnowledgeDefCustomName`:
                        return [knowledgeDef.left.name]
                    case `KnowledgeDefListDestructuring`:
                        return knowledgeDef.left.elements
                            .map(element => {
                                switch (element.$type) {
                                    case `KnowledgeDefListDestructuringSkip`:
                                    case `KnowledgeDefListDestructuringSpreading`:
                                        return undefined
                                    case `KnowledgeDefListDestructuringAssignment`:
                                        return element.name
                                }
                            })
                            .filter((name): name is Exclude<typeof name, undefined> => name !== undefined)
                    case `KnowledgeDefSetDestructuring`:
                        return knowledgeDef.left.assignments.map(assignment => assignment.name)
                }
        }
    }

    switch (knowledge.$type) {
        case `KnowledgeDefBuiltin`:
        case `KnowledgeDefCustom`:
            return getKnowledgeNamesFromDef(knowledge)
        case `KnowledgeSet`:
            return knowledge.content
                .map(content => {
                    // eslint-disable-next-line @typescript-eslint/switch-exhaustiveness-check
                    switch (content.$type) {
                        case `KnowledgeDefBuiltin`:
                        case `KnowledgeDefCustom`:
                            return getKnowledgeNamesFromDef(content)
                        case `KnowledgeSpreading`:
                            switch (content.ref.$type) {
                                case `KnowledgeList`:
                                case `KnowledgeRef`:
                                    return []
                                case `KnowledgeSet`:
                                    return getKnowledgeNamesFrom(content.ref)
                            }
                    }
                    return []
                })
                .flat()
        default:
            return []
    }
}
