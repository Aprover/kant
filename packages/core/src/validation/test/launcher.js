"use strict";
// old launcher code, need to readapt it
Object.defineProperty(exports, "__esModule", { value: true });
var child_process_1 = require("child_process");
var fs_1 = require("fs");
var path_1 = require("path");
var vsixPath = "packages/extension/kant-extension-0.1.0.vsix";
(0, child_process_1.exec)("code --install-extension ".concat(vsixPath, " --force"), function (error, stdout) {
    if (error) {
        console.error("exec error: ".concat(error));
        return;
    }
    console.log("stdout: ".concat(stdout));
    // console.error(`stderr: ${stderr}`);
});
function executeCommandOnFiles(directory) {
    var files = (0, fs_1.readdirSync)(directory);
    var counter = 1;
    var _loop_1 = function (file) {
        var filePath = (0, path_1.join)(directory, file);
        var fileStats = (0, fs_1.statSync)(filePath);
        if (fileStats.isDirectory()) {
            executeCommandOnFiles(filePath); // Recursively traverse subdirectories
        }
        else if (fileStats.isFile()) {
            (0, child_process_1.exec)("npm run cli check packages/core/src/validation/test/test-cases/".concat(file), function (error, stdout, stderr) {
                //console.log(stdout)
                //console.log(stderr)
                if (error) {
                    //console.log(error)
                    if (stderr.includes("Knowledge name \"c\" already used.")) {
                        console.log("\u001B[32m%s\u001B[0m", "[".concat(counter, "] Test for ").concat(file, ": SUCCESSFUL. The output includes the desired error."));
                        counter++;
                    }
                    else {
                        console.log("\u001B[31m%s\u001B[0m", "Test for ".concat(file, ": FAILED.\n").concat(error));
                    }
                    return;
                }
                if (stdout.includes("checked successfully!")) {
                    console.log("\u001B[31m%s\u001B[0m", "Test for ".concat(file, ": FAILED.\n").concat(error));
                    return;
                }
            });
        }
    };
    for (var _i = 0, files_1 = files; _i < files_1.length; _i++) {
        var file = files_1[_i];
        _loop_1(file);
    }
}
var targetDirectory = "packages/core/src/validation/test/test-cases";
executeCommandOnFiles(targetDirectory);
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
