# Java-Engineering-Notes

[中文](README-ZH.md) | [한국어](README-KR.md) | [日本語](README-JA.md) | [Tiếng Việt](README-VI.md) | [Français](README-FR.md) | [Русский](README-RU.md)

A hands-on Java learning repository covering language fundamentals, core APIs, and practical exercises. Each `.java` file is self-contained with a `main` method, designed for incremental learning — from basic syntax to advanced topics like networking, concurrency, and JDBC.

## Tech Stack

- **Java 17**, Maven (single-module project)
- MySQL Connector 8.0.33, Jakarta Servlet 5.0 (provided scope)

## Quick Start

```bash
git clone https://github.com/YEXIAONAN/Java-Engineering-Notes.git
cd Java-Engineering-Notes
mvn clean install
```

Open any `.java` file in your IDE and run its `main` method — no additional setup required.

## Project Structure

All source code is under `src/main/java/org/code/`, organized by topic into 28 packages:

| Package | Description |
|---------|-------------|
| `basics/` | HelloWorld, input/output, variables |
| `datatypes/` | Type conversion, primitives, wrapper classes, binary |
| `operators/` | Arithmetic, logical, relational, bitwise operators |
| `controlflow/` | if/else, switch, for, while, break, continue |
| `oop/` | Classes, objects, inheritance, interfaces, encapsulation, abstract classes, inner classes |
| `arrays/` | Array creation, iteration, 2D arrays |
| `strings/` | String methods, StringBuilder |
| `collections/` | ArrayList, LinkedList, HashMap, HashSet, Iterator |
| `enums/` | Enum declarations and usage |
| `lambda/` | Lambda expressions, functional interfaces |
| `datetime/` | Date, time, formatting |
| `exceptions/` | try-catch-finally, throw |
| `io/` | File I/O operations |
| `database/` | JDBC, MySQL CRUD |
| `networking/` | Socket client/server |
| `concurrency/` | Multi-threading |
| `gui/` | Swing examples |
| `web/` | Servlet, HttpClient |
| `regex/` | Regular expressions |
| `generics/` | Generic methods |
| `methods/` | Method declarations, overloading |
| `modifiers/` | Access modifiers, static, final |
| `algorithms/` | Palindrome check, key search |
| `recursion/` | Recursion examples |
| `exercises/` | Homework, training, verification |
| `review/` | Revision exercises |
| `slf4j/` | SLF4J logging facade |
| `util/` | Shared utilities |

**Resources:** Tutorial markdown docs (Chinese) are available at [`src/main/resources/Document/`](src/main/resources/Document/). The [`Backups/`](src/main/resources/Backups/) directory contains archived code snapshots.

## Build

```bash
mvn clean install
```

Each `.java` file has a `main` method and can be run directly from an IDE or via `java` after compilation.
