var __awaiter = (this && this.__awaiter) || function (thisArg, _arguments, P, generator) {
    function adopt(value) { return value instanceof P ? value : new P(function (resolve) { resolve(value); }); }
    return new (P || (P = Promise))(function (resolve, reject) {
        function fulfilled(value) { try { step(generator.next(value)); } catch (e) { reject(e); } }
        function rejected(value) { try { step(generator["throw"](value)); } catch (e) { reject(e); } }
        function step(result) { result.done ? resolve(result.value) : adopt(result.value).then(fulfilled, rejected); }
        step((generator = generator.apply(thisArg, _arguments || [])).next());
    });
};
var __generator = (this && this.__generator) || function (thisArg, body) {
    var _ = { label: 0, sent: function() { if (t[0] & 1) throw t[1]; return t[1]; }, trys: [], ops: [] }, f, y, t, g;
    return g = { next: verb(0), "throw": verb(1), "return": verb(2) }, typeof Symbol === "function" && (g[Symbol.iterator] = function() { return this; }), g;
    function verb(n) { return function (v) { return step([n, v]); }; }
    function step(op) {
        if (f) throw new TypeError("Generator is already executing.");
        while (g && (g = 0, op[0] && (_ = 0)), _) try {
            if (f = 1, y && (t = op[0] & 2 ? y["return"] : op[0] ? y["throw"] || ((t = y["return"]) && t.call(y), 0) : y.next) && !(t = t.call(y, op[1])).done) return t;
            if (y = 0, t) op = [op[0] & 2, t.value];
            switch (op[0]) {
                case 0: case 1: t = op; break;
                case 4: _.label++; return { value: op[1], done: false };
                case 5: _.label++; y = op[1]; op = [0]; continue;
                case 7: op = _.ops.pop(); _.trys.pop(); continue;
                default:
                    if (!(t = _.trys, t = t.length > 0 && t[t.length - 1]) && (op[0] === 6 || op[0] === 2)) { _ = 0; continue; }
                    if (op[0] === 3 && (!t || (op[1] > t[0] && op[1] < t[3]))) { _.label = op[1]; break; }
                    if (op[0] === 6 && _.label < t[1]) { _.label = t[1]; t = op; break; }
                    if (t && _.label < t[2]) { _.label = t[2]; _.ops.push(op); break; }
                    if (t[2]) _.ops.pop();
                    _.trys.pop(); continue;
            }
            op = body.call(thisArg, _);
        } catch (e) { op = [6, e]; y = 0; } finally { f = t = 0; }
        if (op[0] & 5) throw op[1]; return { value: op[0] ? op[1] : void 0, done: true };
    }
};
var fs = require("fs");
var path = require("path");
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
var folderPath = "test-cases"; // Replace this with the actual path to your folder
function KantToTxt() {
    return __awaiter(this, void 0, void 0, function () {
        return __generator(this, function (_a) {
            fs.readdir(folderPath, function (err, files) {
                if (err) {
                    console.error("Error reading directory:", err);
                    return;
                }
                files.forEach(function (filename) {
                    var filePath = path.join(folderPath, filename);
                    if (!filename.endsWith(".txt")) {
                        // Skip files that already have the .txt extension
                        var newFilename_1 = "".concat(filename, ".txt");
                        fs.rename(filePath, path.join(folderPath, newFilename_1), function (err) {
                            if (err) {
                                console.error("Error renaming ".concat(filename, ":"), err);
                            }
                            else {
                                console.log("Renamed ".concat(filename, " to ").concat(newFilename_1));
                            }
                        });
                    }
                });
            });
            return [2 /*return*/];
        });
    });
}
function executeSequentially() {
    return __awaiter(this, void 0, void 0, function () {
        return __generator(this, function (_a) {
            switch (_a.label) {
                case 0: 
                //await setup()
                //await TxtToKant()
                //const targetDirectory = `test-cases`
                //await executeCommandOnFiles(targetDirectory)
                return [4 /*yield*/, KantToTxt()];
                case 1:
                    //await setup()
                    //await TxtToKant()
                    //const targetDirectory = `test-cases`
                    //await executeCommandOnFiles(targetDirectory)
                    _a.sent();
                    return [2 /*return*/];
            }
        });
    });
}
executeSequentially();
