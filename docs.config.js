const version = require("./package.json").version
const header = "v" + version + (process.env["GITHUB_ACTIONS"] ? "" : " - WIP")

module.exports = {
    stylesheet: ["https://cdnjs.cloudflare.com/ajax/libs/github-markdown-css/2.10.0/github-markdown.min.css"],
    body_class: "markdown-body",
    css: ".page-break { page-break-after: always; } .markdown-body { font-size: 11px; } .markdown-body pre > code { white-space: pre-wrap; }",
    pdf_options: {
        format: "A4",
        margin: "25mm 20mm",
        printBackground: true,
        scale: 1.3,
        headerTemplate:
            '<section style="margin: 0 auto; font-family: system-ui; font-size: 8px;"><span>' +
            header +
            "</span></section>",
        footerTemplate:
            '<section style="margin: 0 auto; font-family: system-ui; font-size: 8px;"><div><span class="pageNumber"></span> di <span class="totalPages"></span></div></section>'
    },
    marked_options: {
        gfm: true
    }
}
