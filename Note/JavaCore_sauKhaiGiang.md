# Sau khai giảng
 
## Bài 1 (Phần 1) 
- MVN clean install + Workspace
- Giới thiệu OOP
## Bài 1 (Phần 2)
- Update project để dùng java 1.8
- Chương trình java chạy như thế nào ?
  + --> Tạo file .java --> complile bằng câu lệnh javac để tạo file .class --> JVM Chuyển bytecode trong file .class để chạy trên từng HĐH
- File jar nén code java lại (run ở nơi khác sẽ bung ra)
- JVM < JRE(cung cấp môi trường cho JVM chạy) < JDK (cung cấp môi trường cho JRE)
- OOP khái niệm, 4 tính chất (kế thừa, đóng gói, đa hình, trừu tượng)
- Object, Class java
- Rule đặt tên
## Bài 2
- Access modifiers trong JAVA thể hiện phạm vi hoạt động của biến, method
  - Private : trong 1 class
  -
- Data type :
  + Non-primative : Classes, Interfaces, Arrays, String
  + Primitive : boolean, char, byte, short, int, long, float, double
- Wrapper class : Interger, Long, Float, Double, Boolean --> khởi tạo cho phép = null
## Bài 3
- Autoboxing and autounboxing (boxing -> chuyển từ primitive sang wrapper)
- Access modifiers trong JAVA thể hiện phạm vi hoạt động của biến, method
  + Private : trong 1 class
  + Protected : trong 1 class, trong 1 package + giới hạn phạm vi chỉ class con dùng > private
  + Public : 
  + Default : khi gọi 1 method nằm ngoài package cần import
- OOP (Thừa kế - inheritance) - dùng protected khai báo method/biến để class con sử dụng method class cha
- Constructor trong JAVA (1 public method dùng để thiết lập giá trị cho các thuộc tính trong class)
  + OR khởi tạo đối tượng (là contructor default không có tham số không có trong code nhưng tự sinh ra --> new CaChuon)
  + Không có khai báo contructor default cần truyền tham số vào cho contructor có tham số.
  + Nếu khai báo tường minh 1 contructor không tham số thì ko cần truyền tham số.
  + Từ khóa this tham chiếu đến tất cả thông tin var/method trong class đó
  + Từ khóa super đến tất cả thông tin var/method trong class cha
## Bài 4 
- VD this và super
- JAVA bean (private all, getter and setter)
- OOP (đa hình - Polymorphism)
  + Overloading : Nhiều method cùng tên, access modifiers nhưng khác về parameter (số lượng or kiểu dữ liệu của tham số) 
  + Overriding : Class con có thể override lại method ở lớp cha và change logic
- OOP (trừu tượng - Abstraction) : 
  + VD công ty A nhận chức năng biết gọi method nào ? truyền parameter ntn --> output
  + Ko nắm đc logic cụ thể từ bên B
  + Giảm sự phụ thuộc nếu bên B có thay đổi logic/version
  + VD xe ô tô
## Bài 5
- OOP (trừu tượng - Abstraction)
  + Abstract class : method không có body, sẽ đc triển khai ở class con (@Override), access modifiers tùy chọn
- Class and abstract class
- Giống
  + 1 class có thể đc extend từ 1 or nhiều class khác
  + Class đơn thừa kế
- Khác
  + Class thường method phải có body, abstract có cả 2 method có và ko có body
- Interface (JDK < 1.8)
  + 1 interface có thể extend từ 1 or nhiều interface khác
  + 1 interface có thể 1 or nhiều class implement
  + Method interface cần implement nếu ko sẽ báo lỗi
  + Access modifiers chỉ public
- | Abstract class      | Interface |
  | ----------- | ----------- |
  | Đơn thừa kế      | Đa thừa kế       |
  | Method có thể có or không body      | JDK < 1.8 chỉ có method không có body       |
  | Access modifier tùy ý theo nhu cầu      | Only public       |
  | class có thể implement interface      |        |
  | 1 class có thể impl nhiều interfacae   | 1 interface có thể implement bởi nhiều class        |
- OOP (Đóng gói - Encapsulation) --> JAVA Bean