import type { AstNode, AstNodeDescription, LangiumDocument, PrecomputedScopes } from "langium"
import { DefaultScopeComputation, MultiMap, streamAllContents } from "langium"
import type { FunctionDef, FunctionInversionDef, Principal } from "./generated/ast"
import { isFunctionDef, isFunctionInversionDef, isPrincipal } from "./generated/ast"
import { Type, isType } from "langium/lib/grammar/generated/ast"

export class KantScopeComputation extends DefaultScopeComputation {
    override computeExports(document: LangiumDocument): Promise<AstNodeDescription[]> {
        if (document.textDocument.uri.startsWith(`builtin`)) {
            let functionDescriptions = streamAllContents(document.parseResult.value)
                .filter(isFunctionDef)
                .map(functionDef => this.descriptions.createDescription(functionDef, functionDef.name, document)).toArray()
            let typeDescriptions = streamAllContents(document.parseResult.value)
            .filter(isType)
            .map(t => this.descriptions.createDescription(t, t.name, document)).toArray()
            let inversionFunctionDescriptions = streamAllContents(document.parseResult.value)
                .filter(isFunctionInversionDef)
                .map(inversionDef => this.descriptions.createDescription(inversionDef, inversionDef.name, document)).toArray()
            return Promise.resolve(functionDescriptions.concat(typeDescriptions).concat(inversionFunctionDescriptions))
        } else {
            return Promise.resolve([])
        }
    }

    override computeLocalScopes(document: LangiumDocument): Promise<PrecomputedScopes> {
        const rootNode = document.parseResult.value
        const scopes = new MultiMap<AstNode, AstNodeDescription>()
        // Here we navigate the full AST - local scopes shall be available in the whole document
        for (const node of streamAllContents(rootNode)) {
            if (isFunctionDef(node) || isPrincipal(node) || isType(node) || isFunctionInversionDef(node)) {
                const names = getLocalScopeNamesFrom(node)
                names.forEach(name => scopes.add(rootNode, this.descriptions.createDescription(node, name, document)))
            }

            /*if (isPrincipal(node)) {
                const knowledge = node.knowledge
                if (knowledge !== undefined) {
                    const names = getKnowledgeNamesFrom(knowledge)
                    names.forEach(name =>
                        scopes.add(node, this.descriptions.createDescription(knowledge, name, document))
                    )
                }
            }*/

            /*if (isKnowledgeBase(node)) {
                const names = getKnowledgeNamesFrom(node.knowledge)
                names.forEach(name => scopes.add(rootNode, this.descriptions.createDescription(node, name, document)))
            }*/
        }
        return Promise.resolve(scopes)
    }
}

const getLocalScopeNamesFrom = (node: FunctionDef | Principal | Type | FunctionInversionDef): string[] => {
    switch (node.$type) {
        case `FunctionDef`:
            return [node.name]
        case `Principal`:
            return [node.name]
        case 'Type':
            return [node.name]
        case 'FunctionInversionDef':
            return [node.name]
    }
}

/* const getKnowledgeNamesFrom = (knowledge: Knowledge): string[] => {
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
        default:
            return []
    }
} */
