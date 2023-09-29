import { exec } from "child_process"
import { readdirSync, statSync } from "fs"
import { join } from "path"

async function executeCommandOnFiles(directory: string) {
    const files = readdirSync(directory)
    let counter = 1

    for (const file of files) {
        const filePath = join(directory, file)
        const fileStats = statSync(filePath)

        if (fileStats.isDirectory()) {
            executeCommandOnFiles(filePath)
        } else if (fileStats.isFile()) {
            exec(
                `npm run cli check packages/core/src/validation/test/test-cases/${file}`,
                (error: unknown, stdout: string, stderr: string) => {
                    console.log(stdout)
                    if (error) {
                        if (stderr) {
                            console.log(
                                `\x1b[32m%s\x1b[0m`,
                                `[${counter}] Test for ${file}: SUCCESSFUL. The output includes the desired error.`
                            )
                            counter++
                        }
                        return
                    } else {
                        console.log(`\x1b[31m%s\x1b[0m`, `[${counter}]Test for ${file}: FAILED.\n${error}`)
                        counter++
                        return
                    }
                }
            )
        }
    }
}

const folderPath = `test-cases`
executeCommandOnFiles(folderPath)