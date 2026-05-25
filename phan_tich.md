# Phân tích

Parameterized Logging dùng {} tối ưu hơn dấu + vì:

- Logger chỉ format chuỗi khi log level được bật.
- Tránh tạo String không cần thiết gây tốn CPU và bộ nhớ.
- Code ngắn gọn, dễ đọc và đúng chuẩn SLF4J.