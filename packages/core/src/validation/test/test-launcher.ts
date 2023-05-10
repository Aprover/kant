const { exec } = require("child_process")

import * as fs from 'fs';

const folderPath = 'packages/core/src/validation/test/test-cases';
const vsixPath = 'packages/extension/kant-extension-0.1.0.vsix';



// Run the code command with the --install-extension and --force options
exec(`code --install-extension ${vsixPath} --force`, (error: unknown, stdout: string) => {
  if (error) {
    console.error(`exec error: ${error}`);
    return;
  }
  console.log(`stdout: ${stdout}`);
  // console.error(`stderr: ${stderr}`);
});

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