const fs = require(`fs`)
const path = require(`path`)
/*
async function setup() {
    const vsixPath = `packages/extension/kant-extension-0.1.0.vsix`
    exec(`code --install-extension ${vsixPath} --force`, (error: unknown, stdout: string) => {
        if (error) {
            console.error(`exec error: ${error}`)
            return
        }
        console.log(`stdout: ${stdout}`)
    })
}
const folderPath = `test-cases` // Replace this with the actual path to your folder
async function TxtToKant() {
    fs.readdir(folderPath, (err: any, files: any[]) => {
        if (err) {
            console.error(`Error reading directory:`, err)
            return
        }

        files.forEach((file: string) => {
            if (file.endsWith(`.kant.txt`)) {
                const newName = file.slice(0, -4) // Removes the last 4 characters (i.e., .txt)
                const oldPath = path.join(folderPath, file)
                const newPath = path.join(folderPath, newName)

                fs.rename(oldPath, newPath, (err: any) => {
                    if (err) {
                        console.error(`Error renaming file:`, err)
                    }
                })
            }
        })
    })
}

async function executeCommandOnFiles(directory: string) {
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

*/
const folderPath = `test-cases` // Replace this with the actual path to your folder
async function KantToTxt() {
    fs.readdir(folderPath, (err: any, files: any[]) => {
        if (err) {
            console.error(`Error reading directory:`, err)
            return
        }

        files.forEach((filename: string) => {
            const filePath = path.join(folderPath, filename)

            if (!filename.endsWith(`.txt`)) {
                // Skip files that already have the .txt extension
                const newFilename = `${filename}.txt`

                fs.rename(filePath, path.join(folderPath, newFilename), (err: any) => {
                    if (err) {
                        console.error(`Error renaming ${filename}:`, err)
                    } else {
                        console.log(`Renamed ${filename} to ${newFilename}`)
                    }
                })
            }
        })
    })
}

async function executeSequentially() {
    //await setup()
    //await TxtToKant()
    //const targetDirectory = `test-cases`
    //await executeCommandOnFiles(targetDirectory)
    await KantToTxt()
}

executeSequentially()
