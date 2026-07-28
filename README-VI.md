# Java-Engineering-Notes

[English](README.md) | [中文](README-ZH.md) | [한국어](README-KR.md) | [日本語](README-JA.md) | [Français](README-FR.md) | [Русский](README-RU.md)

Một kho tài liệu học Java thực hành, bao gồm từ cú pháp cơ bản đến lập trình mạng, đa luồng và JDBC. Mỗi tệp `.java` đều có phương thức `main` độc lập, được sắp xếp theo chủ đề để học tập tuần tự.

## Công nghệ sử dụng

- **Java 17**, Maven (dự án đơn mô-đun)
- MySQL Connector 8.0.33, Jakarta Servlet 5.0 (phạm vi provided)

## Bắt đầu nhanh

```bash
git clone https://github.com/YEXIAONAN/Java-Engineering-Notes.git
cd Java-Engineering-Notes
mvn clean install
```

Mở bất kỳ tệp `.java` nào trong IDE và chạy phương thức `main` — không cần cấu hình thêm.

## Cấu trúc dự án

Toàn bộ mã nguồn nằm trong `src/main/java/org/code/`, được tổ chức thành 28 gói theo chủ đề:

| Gói | Mô tả |
|-----|-------|
| `basics/` | HelloWorld, nhập/xuất, biến |
| `datatypes/` | Chuyển đổi kiểu, kiểu nguyên thủy, lớp bao, nhị phân |
| `operators/` | Toán tử số học, logic, quan hệ, bit |
| `controlflow/` | if/else, switch, for, while, break, continue |
| `oop/` | Lớp và đối tượng, kế thừa, interface, đóng gói, lớp trừu tượng, lớp nội bộ |
| `arrays/` | Tạo mảng, duyệt, mảng 2 chiều |
| `strings/` | Phương thức String, StringBuilder |
| `collections/` | ArrayList, LinkedList, HashMap, HashSet, Iterator |
| `enums/` | Khai báo và sử dụng enum |
| `lambda/` | Biểu thức Lambda, functional interface |
| `datetime/` | Ngày, giờ, định dạng |
| `exceptions/` | try-catch-finally, throw |
| `io/` | Thao tác đọc/ghi tệp |
| `database/` | JDBC, MySQL CRUD |
| `networking/` | Socket client/server |
| `concurrency/` | Đa luồng |
| `gui/` | Ví dụ Swing |
| `web/` | Servlet, HttpClient |
| `regex/` | Biểu thức chính quy |
| `generics/` | Phương thức generic |
| `methods/` | Khai báo phương thức, nạp chồng |
| `modifiers/` | Bổ từ truy cập, static, final |
| `algorithms/` | Kiểm tra đối xứng, tìm kiếm |
| `recursion/` | Ví dụ đệ quy |
| `exercises/` | Bài tập, thực hành, kiểm tra |
| `review/` | Ôn tập |
| `slf4j/` | SLF4J logging facade |
| `util/` | Tiện ích dùng chung |

**Tài liệu:** Tài liệu hướng dẫn Java bằng tiếng Trung (Markdown) có tại [`src/main/resources/Document/`](src/main/resources/Document/). Thư mục [`Backups/`](src/main/resources/Backups/) chứa các bản sao lưu mã nguồn.

## Xây dựng

```bash
mvn clean install
```

Mỗi tệp `.java` đều có phương thức `main` và có thể chạy trực tiếp từ IDE hoặc sau khi biên dịch bằng lệnh `java`.
