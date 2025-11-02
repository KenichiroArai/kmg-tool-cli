# KMG ツール CLI（kmg-tool-cli）

[![Java](https://img.shields.io/badge/Java-21-orange.svg)](https://www.oracle.com/java/)
[![Maven](https://img.shields.io/badge/Maven-3.6+-blue.svg)](https://maven.apache.org/)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)
[![Build Status](https://img.shields.io/badge/Build-Passing-brightgreen.svg)](https://github.com/your-username/kmg-tool-cli)

KMG ツール CLI は、Java 開発における様々な自動化処理を提供するコマンドラインツール集です。

## 概要

KMG ツール CLI は、Java 開発の効率化を目的として開発されたコマンドラインツール群です。Javadoc の自動生成、アクセサメソッドの作成、フィールド定義の自動生成など、開発者が日常的に行う作業を自動化します。

## ドキュメント

詳細なドキュメントは [docs/](docs/) ディレクトリに格納されています。

- **操作手順書**: 各ツールの操作方法（[操作手順書一覧](docs/README.md#操作手順書)）
- **Javadoc**: API ドキュメント（[docs/javadoc/](docs/javadoc/)）

## 主な機能

### Javadoc 関連ツール

- **Javadoc タグ設定ツール**: Java ファイルの Javadoc コメントにタグ（@author、@since、@version）を自動追加
- **Javadoc 行削除ツール**: 指定された行から Javadoc コメント行を削除

### アクセサメソッド生成ツール

- **アクセサ作成ツール**: フィールド定義から getter/setter メソッドを自動生成
- **インタフェースアクセサ作成ツール**: インタフェース用のアクセサメソッドを自動生成

### フィールド関連ツール

- **フィールド作成ツール**: データベースフィールド定義から Java フィールド宣言を自動生成

### コード生成ツール

- **メッセージの種類作成ツール**: メッセージ種類定義から Java 列挙型を自動生成
- **列挙型から case 文作成ツール**: 列挙型から switch-case 文を自動生成

### 変換・マッピングツール

- **マッピング変換ツール**: Java ファイル内の文字列を一括置換
- **シンプル 1 入力 1 出力ツール**: 基本的な 1 対 1 変換処理
- **シンプル 2 入力 1 出力ツール**: テンプレートを使用した変換処理

## プロジェクト構成

```
kmg-tool-cli/
├── docs/                          # ドキュメント
│   ├── README.md                  # ドキュメント概要
│   ├── javadoc/                   # Javadoc API ドキュメント
│   └── 操作手順書/                # 各ツールの操作手順書
├── src/                           # ソースコード
│   ├── main/java/kmg/tool/cli/    # メインソースコード
│   │   ├── acccrt/                # アクセサ作成ツール
│   │   ├── cmn/                   # 共通機能
│   │   ├── dtc/                   # データ変換ツール
│   │   ├── e2scc/                 # 列挙型からcase文作成ツール
│   │   ├── fldcrt/                # フィールド作成ツール
│   │   ├── ifacccrt/              # インタフェースアクセサ作成ツール
│   │   ├── input/                 # 入力処理
│   │   ├── io/                    # 入出力処理
│   │   ├── jdocr/                 # Javadoc行削除ツール
│   │   ├── jdts/                  # Javadocタグ設定ツール
│   │   ├── mptf/                  # マッピング変換ツール
│   │   ├── msgtpcrt/              # メッセージの種類作成ツール
│   │   ├── one2one/               # シンプル1入力1出力ツール
│   │   ├── simple/                # シンプルツール
│   │   └── two2one/               # シンプル2入力1出力ツール
│   ├── main/resources/            # リソースファイル
│   │   ├── application.properties
│   │   ├── kmg-tool-cli-messages.properties
│   │   ├── kmg-tool-cli-messages-val.properties
│   │   ├── kmg-tool-cli-messages-log.properties
│   │   └── logback-kmg-tool-cli.xml
│   └── test/                      # テストコード
│       └── java/kmg/tool/cli/     # テストソースコード
├── target/                        # ビルド成果物
├── logs/                          # ログファイル
├── bin/                           # バイナリファイル
├── pom.xml                        # Maven設定ファイル
├── LICENSE                        # ライセンスファイル
└── README.md                      # プロジェクト概要
```

### 主要パッケージ構成

- **acccrt**: アクセサ作成ツール（getter/setter 生成）
- **cmn**: 共通機能（例外処理、メッセージ管理、UI 基盤）
- **dtc**: データ変換ツール（テンプレート変換）
- **e2scc**: 列挙型から case 文作成ツール
- **fldcrt**: フィールド作成ツール（DB 定義から Java フィールド生成）
- **ifacccrt**: インタフェースアクセサ作成ツール
- **input**: 入力処理（ファイル読み込み、バリデーション）
- **io**: 入出力処理
- **jdocr**: Javadoc 行削除ツール
- **jdts**: Javadoc タグ設定ツール
- **mptf**: マッピング変換ツール（文字列一括置換）
- **msgtpcrt**: メッセージの種類作成ツール
- **one2one**: シンプル 1 入力 1 出力ツール
- **simple**: シンプルツール（基本変換）
- **two2one**: シンプル 2 入力 1 出力ツール（テンプレート変換）

## セットアップ

### 前提条件

- Java 21 以上
- Maven 3.6 以上

### インストール

1. リポジトリをクローンします：

   ```bash
   git clone https://github.com/KenichiroArai/kmg-tool-cli.git
   cd kmg-tool-cli
   ```

2. Maven を使用してビルドします：

   ```bash
   mvn clean install
   ```

## 使用方法

各ツールは個別に実行可能で、Maven を使用して以下のように実行できます：

```bash
# 例：Javadocタグ設定ツールの実行
mvn exec:java -Dexec.mainClass="kmg.tool.cli.jdts.presentation.ui.cli.JavadocTagSetterTool"

# 例：アクセサ作成ツールの実行
mvn exec:java -Dexec.mainClass="kmg.tool.cli.acccrt.presentation.ul.cli.AccessorCreationTool"
```

詳細な使用方法については、[docs/操作手順書/](docs/操作手順書/) を参照してください。

## 貢献

プロジェクトへの貢献を歓迎します！以下の手順で貢献できます：

1. このリポジトリをフォークします
2. フィーチャーブランチを作成します (`git checkout -b feature/amazing-feature`)
3. 変更をコミットします (`git commit -m 'Add some amazing feature'`)
4. ブランチにプッシュします (`git push origin feature/amazing-feature`)
5. プルリクエストを作成します

## 問題の報告

バグを発見した場合や機能要求がある場合は、[Issues](https://github.com/KenichiroArai/kmg-tool-cli/issues) で報告してください。

## ライセンス

このプロジェクトは MIT ライセンスの下で公開されています。詳細は[LICENSE](LICENSE)ファイルを参照してください。
