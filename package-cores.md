# Các gói cơ bản bổ sung cho core-image-minimal

Danh sách này ghi lại những recipe/gói được thêm vào image.  
Sẽ tiếp tục cập nhật khi dự án phát triển thêm chức năng.

| Gói                | Chức năng                                   |
|---------------------|---------------------------------------------|
| **bash**           | Shell đầy đủ thay cho `busybox sh`          |
| **openssh**        | SSH client và server (`sshd`)                |
| **linux-firmware** | Bộ firmware chung, bao gồm Wi-Fi cho Raspberry Pi 4 |
| **wpa-supplicant** | Cấu hình và kết nối Wi-Fi                    |
| **dhcpcd**         | DHCP client để lấy địa chỉ IP động           |
| **iproute2**       | Bộ lệnh quản lý mạng (`ip`, `ss`, `tc`, ...) |
| **net-tools**      | Bộ lệnh mạng cũ (`ifconfig`, `netstat`, ...) |