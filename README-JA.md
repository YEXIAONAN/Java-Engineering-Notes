# Java-Engineering-Notes

[English](README.md) | [中文](README-ZH.md) | [한국어](README-KR.md) | [Tiếng Việt](README-VI.md) | [Français](README-FR.md) | [Русский](README-RU.md)

Javaの基礎文法からネットワーキング、並行処理、JDBCまでを網羅したハンズオン学習リポジトリです。すべての`.java`ファイルは`main`メソッドを持ち、トピックごとに段階的に学習できるよう構成されています。

## 技術スタック

- **Java 17**、Maven（単一モジュールプロジェクト）
- MySQL Connector 8.0.33、Jakarta Servlet 5.0（provided スコープ）

## クイックスタート

```bash
git clone https://github.com/YEXIAONAN/Java-Engineering-Notes.git
cd Java-Engineering-Notes
mvn clean install
```

IDEで任意の`.java`ファイルを開き、`main`メソッドを実行してください — 追加設定は不要です。

## プロジェクト構成

すべてのソースコードは`src/main/java/org/code/`にあり、28のトピック別パッケージに分類されています：

| パッケージ | 説明 |
|-----------|------|
| `basics/` | HelloWorld、入出力、変数 |
| `datatypes/` | 型変換、プリミティブ型、ラッパークラス、バイナリ |
| `operators/` | 算術、論理、関係、ビット演算子 |
| `controlflow/` | if/else、switch、for、while、break、continue |
| `oop/` | クラスとオブジェクト、継承、インターフェース、カプセル化、抽象クラス、内部クラス |
| `arrays/` | 配列作成、反復処理、2次元配列 |
| `strings/` | Stringメソッド、StringBuilder |
| `collections/` | ArrayList、LinkedList、HashMap、HashSet、Iterator |
| `enums/` | 列挙型の宣言と使用 |
| `lambda/` | ラムダ式、関数型インターフェース |
| `datetime/` | 日付、時刻、フォーマット |
| `exceptions/` | try-catch-finally、throw |
| `io/` | ファイル入出力 |
| `database/` | JDBC、MySQL CRUD |
| `networking/` | Socketクライアント/サーバー |
| `concurrency/` | マルチスレッド |
| `gui/` | Swing例 |
| `web/` | Servlet、HttpClient |
| `regex/` | 正規表現 |
| `generics/` | ジェネリックメソッド |
| `methods/` | メソッド宣言、オーバーロード |
| `modifiers/` | アクセス修飾子、static、final |
| `algorithms/` | 回文チェック、キー検索 |
| `recursion/` | 再帰の例 |
| `exercises/` | 宿題、トレーニング、検証 |
| `review/` | 復習問題 |
| `slf4j/` | SLF4Jロギングファサード |
| `util/` | 共有ユーティリティ |

**資料:** 中国語のJavaチュートリアルMarkdown文書が[`src/main/resources/Document/`](src/main/resources/Document/)に含まれています。[`Backups/`](src/main/resources/Backups/)ディレクトリにはコードアーカイブが保管されています。

## ビルド

```bash
mvn clean install
```

各`.java`ファイルには`main`メソッドが含まれており、IDEで直接実行するか、コンパイル後に`java`コマンドで実行できます。
