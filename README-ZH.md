# Java-Engineering-Notes

[English](README.md) | [한국어](README-KR.md) | [日本語](README-JA.md) | [Tiếng Việt](README-VI.md) | [Français](README-FR.md) | [Русский](README-RU.md)

个人 Java 学习笔记仓库，涵盖基础语法、核心 API 和进阶实战。所有代码示例自包含 `main` 方法，可按主题循序渐进学习 — 从 HelloWorld 到网络编程、并发编程和 JDBC 数据库操作。

## 技术栈

- **Java 17**，Maven（单模块项目）
- MySQL Connector 8.0.33，Jakarta Servlet 5.0（provided 作用域）

## 快速开始

```bash
git clone https://github.com/YEXIAONAN/Java-Engineering-Notes.git
cd Java-Engineering-Notes
mvn clean install
```

在 IDE 中打开任意 `.java` 文件，直接运行 `main` 方法即可 — 无需额外配置。

## 项目结构

全部源码在 `src/main/java/org/code/` 下，按主题分为 28 个包：

| 包 | 说明 |
|-----|------|
| `basics/` | HelloWorld、输入输出、变量 |
| `datatypes/` | 类型转换、基本类型、包装类、二进制 |
| `operators/` | 算术、逻辑、关系、位运算符 |
| `controlflow/` | if/else、switch、for、while、break、continue |
| `oop/` | 类与对象、继承、接口、封装、抽象类、内部类 |
| `arrays/` | 数组创建、遍历、二维数组 |
| `strings/` | String 方法、StringBuilder |
| `collections/` | ArrayList、LinkedList、HashMap、HashSet、Iterator |
| `enums/` | 枚举定义与使用 |
| `lambda/` | Lambda 表达式、函数式接口 |
| `datetime/` | 日期时间处理与格式化 |
| `exceptions/` | try-catch-finally、throw |
| `io/` | 文件读写操作 |
| `database/` | JDBC、MySQL 增删改查 |
| `networking/` | Socket 客户端/服务端 |
| `concurrency/` | 多线程示例 |
| `gui/` | Swing 界面示例 |
| `web/` | Servlet、HttpClient |
| `regex/` | 正则表达式 |
| `generics/` | 泛型方法 |
| `methods/` | 方法声明、重载 |
| `modifiers/` | 访问修饰符、static、final |
| `algorithms/` | 回文判断、关键字查找 |
| `recursion/` | 递归示例 |
| `exercises/` | 作业、测验、验证程序 |
| `review/` | 复习练习 |
| `slf4j/` | SLF4J 日志门面 |
| `util/` | 工具类 |

**配套文档：** [`src/main/resources/Document/`](src/main/resources/Document/) 包含 Java 教程 Markdown 文档，与代码示例互为补充。[`Backups/`](src/main/resources/Backups/) 目录存放了历史代码归档。

## 构建

```bash
mvn clean install
```

每个 `.java` 文件都包含 `main` 方法，可在 IDE 中直接运行或编译后通过 `java` 命令执行。
