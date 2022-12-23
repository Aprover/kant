# Kant

Kant is a domain specific language for security protocols specification.

You can learn more about the details by reading the documentation inside the [docs](docs/) folder or by exploring the [examples](examples/). It's based on the [langium](https://langium.org) language engineering tool.

## Contents

This repo is a monorepo including all the tools provided by Kant. Here's the list of the packages:

|             | name                             | description                                       |
| ----------- | -------------------------------- | ------------------------------------------------- |
| :package:   | [core](packages/core/)           | the core kant language grammar and implementation |
| :computer:  | [cli](packages/cli/)             | the command line interface associated             |
| :blue_book: | [extension](packages/extension/) | the vscode extension for `.kant` files            |

## Setup

### Preparation

- install [pnpm@^7](https://pnpm.io)
- inside a cli execute:
  - `pnpm i`
  - `pnpm run generate`

### Editor (vscode)

You can install vscode from [here](https://code.visualstudio.com).

There are a bunch of vscode extensions useful for working with the repo, you can find them listed in the [extensions](.vscode/extensions.json) file (however vscode should recommend them automatically during the first opening of the repo folder).

Then you can:

- create another vscode instance by pressing `F5` (launch task) with the kant extension preloaded
- generate the vscode kant extension launching the `pnpm run package:extension` command and by `Right Click -> Install Extension VSIX` on the generated `.vsix` file in the [extension](packages/extension/) package

### Lifecycle

You can check if the current state of the packages is ok by running `pnpm run check` (this need to be ran after the `pnpm run generate`, otherwise some files would be missing).

You can find more useful scripts inside the [package.json](./package.json) scripts bit.
