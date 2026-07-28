# Java-Engineering-Notes

[English](README.md) | [中文](README-ZH.md) | [한국어](README-KR.md) | [日本語](README-JA.md) | [Tiếng Việt](README-VI.md) | [Français](README-FR.md)

Практический репозиторий для изучения Java, охватывающий основы языка, основные API и практические упражнения. Каждый файл `.java` самодостаточен и содержит метод `main`, что позволяет изучать материал последовательно — от базового синтаксиса до сетевого программирования, многопоточности и JDBC.

## Технологический стек

- **Java 17**, Maven (одномодульный проект)
- MySQL Connector 8.0.33, Jakarta Servlet 5.0 (область provided)

## Быстрый старт

```bash
git clone https://github.com/YEXIAONAN/Java-Engineering-Notes.git
cd Java-Engineering-Notes
mvn clean install
```

Откройте любой файл `.java` в вашей IDE и запустите метод `main` — дополнительная настройка не требуется.

## Структура проекта

Исходный код находится в `src/main/java/org/code/`, организован в 28 тематических пакетов:

| Пакет | Описание |
|-------|----------|
| `basics/` | HelloWorld, ввод/вывод, переменные |
| `datatypes/` | Преобразование типов, примитивы, классы-обёртки, двоичные числа |
| `operators/` | Арифметические, логические, реляционные, побитовые операторы |
| `controlflow/` | if/else, switch, for, while, break, continue |
| `oop/` | Классы и объекты, наследование, интерфейсы, инкапсуляция, абстрактные классы, внутренние классы |
| `arrays/` | Создание массивов, обход, двумерные массивы |
| `strings/` | Методы String, StringBuilder |
| `collections/` | ArrayList, LinkedList, HashMap, HashSet, Iterator |
| `enums/` | Объявление и использование перечислений |
| `lambda/` | Лямбда-выражения, функциональные интерфейсы |
| `datetime/` | Дата, время, форматирование |
| `exceptions/` | try-catch-finally, throw |
| `io/` | Файловый ввод/вывод |
| `database/` | JDBC, CRUD MySQL |
| `networking/` | Socket клиент/сервер |
| `concurrency/` | Многопоточность |
| `gui/` | Примеры Swing |
| `web/` | Servlet, HttpClient |
| `regex/` | Регулярные выражения |
| `generics/` | Обобщённые методы |
| `methods/` | Объявление методов, перегрузка |
| `modifiers/` | Модификаторы доступа, static, final |
| `algorithms/` | Проверка палиндрома, поиск ключа |
| `recursion/` | Примеры рекурсии |
| `exercises/` | Задания, тренировка, проверка |
| `review/` | Упражнения для повторения |
| `slf4j/` | Фасад логирования SLF4J |
| `util/` | Общие утилиты |

**Ресурсы:** Учебные материалы по Java на китайском языке (Markdown) находятся в [`src/main/resources/Document/`](src/main/resources/Document/). Директория [`Backups/`](src/main/resources/Backups/) содержит архивы кода.

## Сборка

```bash
mvn clean install
```

Каждый файл `.java` содержит метод `main` и может быть запущен непосредственно из IDE или после компиляции командой `java`.
