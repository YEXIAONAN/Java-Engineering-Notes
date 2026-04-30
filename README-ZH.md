# Java-Engineering-Notes

个人 Java 学习笔记仓库，涵盖基础语法、核心 API 和编程练习。所有示例代码位于 `org.code` 包下，采用单模块 Maven 项目管理。

[English](README.md)

## 技术栈

- **Java 17**, Maven
- MySQL Connector 8.0.33, Jakarta Servlet 5.0（provided 作用域）

## 项目结构

全部源码在 `src/main/java/org/code/` 下，按主题分为 26 个包：

| 包 | 说明 |
|-----|------|
| `basics/` | HelloWorld、输入输出、变量、类型转换 |
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
| `util/` | 工具类 |

**资源文件：** `src/main/resources/` 包含 Java 基础教程文档（Markdown）、图片和代码备份。

## 构建

```bash
mvn clean install
```

每个 `.java` 文件包含 `main` 方法，可直接在 IDE 中运行或编译后通过 `java` 执行。
