# Java-Engineering-Notes

[English](README.md) | [中文](README-ZH.md) | [한국어](README-KR.md) | [日本語](README-JA.md) | [Tiếng Việt](README-VI.md) | [Русский](README-RU.md)

Un référentiel d'apprentissage Java pratique couvrant les fondamentaux du langage, les API de base et des exercices concrets. Chaque fichier `.java` est autonome avec une méthode `main`, conçu pour un apprentissage progressif — de la syntaxe de base aux sujets avancés comme la programmation réseau, la concurrence et JDBC.

## Stack Technique

- **Java 17**, Maven (projet mono-module)
- MySQL Connector 8.0.33, Jakarta Servlet 5.0 (scope provided)

## Démarrage Rapide

```bash
git clone https://github.com/YEXIAONAN/Java-Engineering-Notes.git
cd Java-Engineering-Notes
mvn clean install
```

Ouvrez n'importe quel fichier `.java` dans votre IDE et exécutez la méthode `main` — aucune configuration supplémentaire n'est nécessaire.

## Structure du Projet

Tout le code source se trouve dans `src/main/java/org/code/`, organisé en 28 packages thématiques :

| Package | Description |
|---------|-------------|
| `basics/` | HelloWorld, entrée/sortie, variables |
| `datatypes/` | Conversion de types, types primitifs, classes wrapper, binaire |
| `operators/` | Opérateurs arithmétiques, logiques, relationnels, bit à bit |
| `controlflow/` | if/else, switch, for, while, break, continue |
| `oop/` | Classes et objets, héritage, interfaces, encapsulation, classes abstraites, classes internes |
| `arrays/` | Création et parcours de tableaux, tableaux 2D |
| `strings/` | Méthodes String, StringBuilder |
| `collections/` | ArrayList, LinkedList, HashMap, HashSet, Iterator |
| `enums/` | Déclaration et utilisation des énumérations |
| `lambda/` | Expressions lambda, interfaces fonctionnelles |
| `datetime/` | Date, heure, formatage |
| `exceptions/` | try-catch-finally, throw |
| `io/` | Opérations d'entrée/sortie fichier |
| `database/` | JDBC, CRUD MySQL |
| `networking/` | Socket client/serveur |
| `concurrency/` | Multithreading |
| `gui/` | Exemples Swing |
| `web/` | Servlet, HttpClient |
| `regex/` | Expressions régulières |
| `generics/` | Méthodes génériques |
| `methods/` | Déclaration de méthodes, surcharge |
| `modifiers/` | Modificateurs d'accès, static, final |
| `algorithms/` | Vérification de palindrome, recherche de clé |
| `recursion/` | Exemples de récursivité |
| `exercises/` | Devoirs, entraînement, vérification |
| `review/` | Exercices de révision |
| `slf4j/` | Façade de logging SLF4J |
| `util/` | Utilitaires partagés |

**Ressources :** Des tutoriels Java en chinois (Markdown) sont disponibles dans [`src/main/resources/Document/`](src/main/resources/Document/). Le répertoire [`Backups/`](src/main/resources/Backups/) contient des archives de code.

## Construction

```bash
mvn clean install
```

Chaque fichier `.java` contient une méthode `main` et peut être exécuté directement depuis un IDE ou via la commande `java` après compilation.
