// old launcher code, need to readapt it

import { exec } from "child_process"
import { readdirSync, statSync } from "fs"
import { join } from "path"

const vsixPath = `packages/extension/kant-extension-0.1.0.vsix`

exec(`code --install-extension ${vsixPath} --force`, (error: unknown, stdout: string) => {
    if (error) {
        console.error(`exec error: ${error}`)
        return
    }
    console.log(`stdout: ${stdout}`)
    // console.error(`stderr: ${stderr}`);
})

function executeCommandOnFiles(directory: string) {
    const files = readdirSync(directory)
    let counter = 1

    for (const file of files) {
        const filePath = join(directory, file)
        const fileStats = statSync(filePath)

        if (fileStats.isDirectory()) {
            executeCommandOnFiles(filePath) // Recursively traverse subdirectories
        } else if (fileStats.isFile()) {
            exec(
                `npm run cli check packages/core/src/validation/test/test-cases/${file}`,
                (error: unknown, stdout: string, stderr: string) => {
                    //console.log(stdout)
                    //console.log(stderr)
                    if (error) {
                        //console.log(error)
                        if (stderr.includes(`Knowledge name "c" already used.`)) {
                            console.log(
                                `\x1b[32m%s\x1b[0m`,
                                `[${counter}] Test for ${file}: SUCCESSFUL. The output includes the desired error.`
                            )
                            counter++
                        } else {
                            console.log(`\x1b[31m%s\x1b[0m`, `Test for ${file}: FAILED.\n${error}`)
                        }
                        return
                    }
                    if (stdout.includes(`checked successfully!`)) {
                        console.log(`\x1b[31m%s\x1b[0m`, `Test for ${file}: FAILED.\n${error}`)
                        return
                    }
                }
            )
        }
    }
}

const targetDirectory = `packages/core/src/validation/test/test-cases`
executeCommandOnFiles(targetDirectory)

/*

const folderPath = 'packages/core/src/validation/test/test-cases';


const files = fs.readdirSync(folderPath);
console.log(`Nomi dei file nella cartella ${folderPath}:`);
console.log(files);

files.forEach(file => {
  exec(`npm run cli check packages/core/src/validation/test/test-cases/${file}`, (error: unknown, stdout: string, stderr: string) => {
    if (error) {
      if (stderr.includes("Duplicate principal name A in same declaration")) {
        console.log("\x1b[32m%s\x1b[0m", `Test for ${file}: SUCCESSFUL. The output includes the desired error.`)
      }
      return;
    }
    if (stdout.includes("checked successfully!")) {
      console.log("\x1b[31m%s\x1b[0m", `Test for ${file}: FAILED.\n${error}`);
      return;
    }
    // console.log(stdout)
  })
});
*/
