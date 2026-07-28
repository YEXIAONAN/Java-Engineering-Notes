# Java-Engineering-Notes

[English](README.md) | [中文](README-ZH.md) | [日本語](README-JA.md) | [Tiếng Việt](README-VI.md) | [Français](README-FR.md) | [Русский](README-RU.md)

Java 기초 문법부터 네트워킹, 동시성, JDBC까지 포괄하는 실습형 학습 저장소입니다. 모든 `.java` 파일은 독립적인 `main` 메서드를 포함하며, 주제별로 점진적으로 학습할 수 있도록 구성되어 있습니다.

## 기술 스택

- **Java 17**, Maven (단일 모듈 프로젝트)
- MySQL Connector 8.0.33, Jakarta Servlet 5.0 (provided 범위)

## 빠른 시작

```bash
git clone https://github.com/YEXIAONAN/Java-Engineering-Notes.git
cd Java-Engineering-Notes
mvn clean install
```

IDE에서 원하는 `.java` 파일을 열고 `main` 메서드를 실행하세요 — 추가 설정이 필요하지 않습니다.

## 프로젝트 구조

모든 소스 코드는 `src/main/java/org/code/` 아래에 있으며, 28개의 주제별 패키지로 구성됩니다:

| 패키지 | 설명 |
|---------|------|
| `basics/` | HelloWorld, 입출력, 변수 |
| `datatypes/` | 형변환, 기본형, 래퍼 클래스, 이진수 |
| `operators/` | 산술, 논리, 관계, 비트 연산자 |
| `controlflow/` | if/else, switch, for, while, break, continue |
| `oop/` | 클래스와 객체, 상속, 인터페이스, 캡슐화, 추상 클래스, 내부 클래스 |
| `arrays/` | 배열 생성, 순회, 2차원 배열 |
| `strings/` | String 메서드, StringBuilder |
| `collections/` | ArrayList, LinkedList, HashMap, HashSet, Iterator |
| `enums/` | 열거형 선언과 사용 |
| `lambda/` | 람다 표현식, 함수형 인터페이스 |
| `datetime/` | 날짜, 시간, 포맷팅 |
| `exceptions/` | try-catch-finally, throw |
| `io/` | 파일 입출력 |
| `database/` | JDBC, MySQL CRUD |
| `networking/` | Socket 클라이언트/서버 |
| `concurrency/` | 멀티스레딩 |
| `gui/` | Swing 예제 |
| `web/` | Servlet, HttpClient |
| `regex/` | 정규 표현식 |
| `generics/` | 제네릭 메서드 |
| `methods/` | 메서드 선언, 오버로딩 |
| `modifiers/` | 접근 제어자, static, final |
| `algorithms/` | 회문 검사, 키 검색 |
| `recursion/` | 재귀 예제 |
| `exercises/` | 과제, 훈련, 검증 |
| `review/` | 복습 문제 |
| `slf4j/` | SLF4J 로깅 퍼사드 |
| `util/` | 공유 유틸리티 |

**자료:** 중국어 Java 튜토리얼 Markdown 문서가 [`src/main/resources/Document/`](src/main/resources/Document/)에 포함되어 있습니다. [`Backups/`](src/main/resources/Backups/) 디렉토리에는 코드 아카이브가 보관되어 있습니다.

## 빌드

```bash
mvn clean install
```

각 `.java` 파일에는 `main` 메서드가 포함되어 있어 IDE에서 직접 실행하거나 컴파일 후 `java` 명령으로 실행할 수 있습니다.
