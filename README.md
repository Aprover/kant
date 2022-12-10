# Kant

## Setup

- install [eclipse 2022-12 (4.26.0)](https://www.eclipse.org/downloads/)
- open eclipse and install xtext (2.29.0) following [their guide](https://www.eclipse.org/Xtext/download.html)

## Generate

To generate artifacts from the grammar, right click inside the grammar file located in `it.unimi.xtext.kant/src/it.unimi.xtext/Kant.xtext` and select `Run As` -> `Generate Xtext Artifacts`

## Run

To run an eclipse instance with the language plugged-in, right click on the `it.unimi.xtext.kant` package and select `Run As` -> `Eclipse Application`.

Once there you can open the `examples` project to play with the language and create new kant files or create your own project directly from the running eclipse instance.
