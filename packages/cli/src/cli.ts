import chalk from "chalk"
import { Command } from "commander"
// import { KantLanguageMetaData } from '../language-server/generated/module';
import { createKantServices } from "kant-core"
import { KantLanguageMetaData } from "kant-core/src/generated/module"
import { NodeFileSystem } from "langium/node"
import path from "path"
import { URI } from "vscode-uri"
import * as packageJson from "../package.json"
import { extractDocument } from "./cli-util"

// check
// ------------------------------------------------------------------------------------------------------

export const checkAction = async (fileName: string): Promise<void> => {
    // retrieve the services for our language
    const services = createKantServices(NodeFileSystem).Kant
    // extract a document for our program
    const document = await extractDocument(fileName, services)
    // extract the parse result details
    const parseResult = document.parseResult
    // verify no lexer, parser, or general diagnostic errors show up
    if (parseResult.lexerErrors.length === 0 && parseResult.parserErrors.length === 0) {
        console.log(chalk.green(`${fileName} checked successfully!`))
    } else {
        console.log(chalk.red(`${fileName} failed to check!`))
    }
}

// debug

export const debugAction = async (fileName: string): Promise<void> => {
    // retrieve the services for our language
    const services = createKantServices(NodeFileSystem).Kant
    // extract a document for our program
    const document = await extractDocument(fileName, services)
    const scopeComputation = services.shared.ServiceRegistry.getServices(URI.file(path.resolve(fileName))).references
        .ScopeComputation
    const nameProvider = services.references.NameProvider

    // extract the parse result details
    const parseResult = document.parseResult
    // verify no lexer, parser, or general diagnostic errors show up
    if (parseResult.lexerErrors.length === 0 && parseResult.parserErrors.length === 0) {
        console.log(chalk.green(`${fileName} checked successfully!`))
        console.log(chalk.yellow(`COMPUTED EXPORTS:`))
        console.log(
            chalk.white(
                (await scopeComputation.computeExports(document)).map(description => description.name).join(`\n`)
            )
        )
        console.log(chalk.yellow(`COMPUTED LOCAL SCOPES:`))
        console.log(
            chalk.white(
                (await scopeComputation.computeLocalScopes(document))
                    .entriesGroupedByKey()
                    .map(
                        ([node, descriptions]) =>
                            `${nameProvider.getName(node) ?? `??[${node.$type}]`}:\n${descriptions
                                .map(description => `  ${description.name} [${description.type}]`)
                                .join(`\n`)}`
                    )
                    .join(`\n`)
            )
        )
    } else {
        console.log(chalk.red(`${fileName} failed to check!`))
    }
}

// cli
// ------------------------------------------------------------------------------------------------------

export const cli = function (): void {
    const cli = new Command()

    cli.version(packageJson.version)

    const fileExtensions = KantLanguageMetaData.fileExtensions.join(`, `)
    cli.addCommand(
        new Command()
            .command(`check`)
            .argument(`<file>`, `Kant specification to check (ending in ${fileExtensions})`)
            .description(`Indicates where a kant specification parses & validates successfully, with no output given`)
            .action(checkAction)
    ).addCommand(
        new Command()
            .command(`debug`)
            .argument(`<file>`, `Kant specification to check (ending in ${fileExtensions})`)
            .description(`Print useful information about the given kant file`)
            .action(debugAction)
    )

    cli.parse(process.argv)
}
