import chalk from "chalk"
import { Command } from "commander"
// import { KantLanguageMetaData } from '../language-server/generated/module';
import { createKantServices } from "kant-core"
import { KantLanguageMetaData } from "kant-core/src/generated/module"
import { NodeFileSystem } from "langium/node"
import * as packageJson from "../package.json"
import { extractDocument } from "./cli-util"

// parse and validate
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

// cli
// ------------------------------------------------------------------------------------------------------

export const cli = function (): void {
    const program = new Command()

    program.version(packageJson.version)

    const fileExtensions = KantLanguageMetaData.fileExtensions.join(`, `)
    program
        .command(`check`)
        .argument(`<file>`, `Kant specification to check (ending in ${fileExtensions})`)
        .description(`Indicates where a kant specification parses & validates successfully, with no output given`)
        .action(checkAction)

    program.parse(process.argv)
}
