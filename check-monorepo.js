#!/usr/bin/env node
console.debug("checking monorepo package versions...")
const yaml = require("yaml")
const fs = require("fs")

const packageRoot = require("./package.json")

const pnpmWorkspacesFile = fs.readFileSync("./pnpm-workspace.yaml", "utf8")
const { packages } = yaml.parse(pnpmWorkspacesFile)

packages.forEach(pkg => {
    console.debug(`checking ${pkg}...`)
    const packageJson = require(`./${pkg}/package.json`)
    if (packageJson.version !== packageRoot.version) {
        throw new Error(
            `Package ${packageJson.name}@${packageJson.version} has different version than root (${packageRoot.version})`
        )
    }

    Object.entries(packageJson.dependencies ?? {})
        .concat(Object.entries(packageJson.devDependencies ?? {}))
        .forEach(([name, version]) => {
            if (packages.includes(name) && version !== "workspace:*") {
                throw new Error(
                    `All packages from monorepo should be referenced with the same wildcard version "workspace:*"`
                )
            }
        })
})

console.debug("dependencies checked!")
