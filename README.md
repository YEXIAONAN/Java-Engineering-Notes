# Java-Engineering-Notes

A personal Java learning repository covering fundamentals, core APIs, and practical exercises. All examples are organized under the `org.code` package in a single-module Maven project.

[中文](README-ZH.md)

## Tech Stack

- **Java 17**, Maven
- MySQL Connector 8.0.33, Jakarta Servlet 5.0 (provided scope)

## Project Structure

All source code is under `src/main/java/org/code/`, organized by topic into 26 packages:

| Package | Description |
|---------|-------------|
| `basics/` | HelloWorld, input/output, variables, type conversion |
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
| `util/` | Shared utilities |

**Resources:** `src/main/resources/` contains markdown documentation (Chinese), images, and code backups.

## Build

```bash
mvn clean install
```

Each `.java` file has a `main` method and can be run directly from an IDE or via `java` after compilation.
