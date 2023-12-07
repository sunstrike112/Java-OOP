## Cách 1 chương trình JAVA chạy
- Tạo 1 file .java (simple.java)
- Compile --> bằng câu lệnh : javac simple.java (biên dịch file .java --> file .class) (complier .java --> .class )
- Execute  --> câu lệnh java Simple để chạy file class
- JVM (convert bytecode sang hệ điều hành cần sử dụng) dựa vào file .class (bytecode) theo hệ điều hành sử dụng (Linux, Window, macOS) (decomplier .class --> .java)

## mvn clean install (câu lệnh build, clean, install file jar mới)
- gom toàn bộ các thư viện của project nhúng vào file .jar (chứa file .class, html --> những file cần thiết để start project)
- Xoá file jar cũ đi (clean) và tạo ra file jar mới (install file mới gồm code cũ và những phần code mới)


## Dynamic project : Khi cài đặt thư viện sử dụng cần tự config tay (lên mạng tải file jar + link tới đường dẫn lưu thư viện trong máy)
- Các đường dẫn trên mỗi máy cá nhân khác nhau nên khi đưa project qua máy khác phải tốn công cài lại
- Maven project : có file pom.xml (dependencies) --> sử dựng thư viện nào thì bỏ vào thẻ dependency --> tự động tải phần thư viện lưu sẵn ở cloud ko cần config như dynamic
- Sau khi lưu file tự động biên dịch tải thư viện từ cloud luôn (chạy tự động trc khi mvn clean install)
- file pom.xml <packing> mặc định là JAR (WAR)
- JRE system library khi mới tạo là J2SE-1.5 --> các cú pháp 1.8 sẽ không hiểu
    <properties>
        <maven.compiler.target>1.8</maven.compiler.target>
        <maven.compiler.source>1.8</maven.compiler.source>
    </properties>
	--> add đoạn complier maven này vào file pom.xml --> mvn clean install --> update project để cập nhập JDK mới

# JDK, JRE mô tả
- JRE cung cấp các câu lệnh javac để biên dịch file .java
- JDK cung cấp môi trường cho JRE (JRE cung cấp môi trường cho JVM)
--> JDK > JRE > JVM

# Hướng đối tượng JAVA : Là 1 kỹ thuật Đưa toàn bộ những đối tượng ở đời thực vào JAVA thông qua class, object và 4 tính chất của lập trình hướng đối tượng
- Object là những thực thể có trạng thái or hành vi
Một đối tượng có ba đặc điểm:
Trạng thái: Đại diện cho dữ liệu (giá trị) của một đối tượng.
Hành vi: Đại diện cho hành vi (chức năng) của một đối tượng như gửi tiền, rút tiền, ...
Danh tính: Danh tính của một đối tượng thường được cài đặt thông qua một ID duy nhất. ID này được ẩn đối với user bên ngoài. Tuy nhiên nó được sử dụng trong nội bộ máy ảo JVM để định danh từng đối tượn
- Một lớp là một nhóm đối tượng có các thuộc tính chung. Nó là một mẫu hoặc thiết kế từ đó các đối tượng được tạo ra.
Một lớp trong java có thể chứa:
+ Thành viên dữ liệu
+ Constructor
+ Phương thức
+ Khối lệnh
+ Lớp và Interface
--> Object và Class khác nhau :
- Object là các đối tượng (people, bird, fish, ...)
- Class mô tả đặc điểm của đối tượng (object) (màu da, màu mắt ...)

# Inheritance (tính thừa kế) 
+ Thực tế : Lớp cá (Bơi được) - (cá 7 màu, cá chuồn) -
+ Code : 

# Constructor
- Default (ko tham số) --> Hỗ trợ khởi tạo đối tượng (có sẵn khi tạo class) + thiết lập giá trị khi khởi tạo đối tượng đó
- Có Tham số

# Polymorphism (tính đa hình)
- Overloading : Cùng 1 method (trong 1 class cùng tên, cùng access modify) nhưng có tham số khác nhau --> kỹ thuật triển khai đa hình trong java
- Overrding : Định nghĩa 1 method cùng tên, access modify (với 1 method có sẵn ở class cha) trong class con --> ghi đè lại method ở class cha và thay thế bằng method ở class con
--> Muốn gọi method của class cha thì dùng super.<tên method ở class cha>
This chỉ tham chiếu method, biến trong class hiện tại
Super tham chiếu trong class parent

# Encapsulation (Đóng gói)
- PRivate 1 thuộc tính, muốn lấy giá trị/gán giá trị thì dùng getter, setter
- Java Bean (java class) : tất cả thuộc tính trong class thì chỉ có access modify là private và đc trích xuất giá trị thông qua 2 method getter/setter

# Abtraction (trừu tượng)
- Che body của method (gọi method và ko quan tâm đến logic trong method)
- 1 class chỉ kế thừa 1 class khác tại 1 thời điểm
- interface hỗ trợ đa kế thừa (1 interface extend nhiều interface khác còn abtract class thì ko)
- interface luôn có 1 class kèm theo để implement interface đó (method trong interface ko có body) --> class đi theo triển khai body cho interface
- 1 interface có thể implement bởi 1 or nhiều class

# abtract (method có body và ko body (tính trừu tượng))

# class vs abtract class
- abtract có đầy đủ tính năng như 1 abtract
- abtract có method ko cần triển khai body trong abtract class(sẽ triển khai body ở những class extend)

# abtract class và interface
- abtract class : 
  + ko đa kế thừa 
  + implement 1 or nhiều interface
  + có đan xen những method có body (method ko abtract)
  + access modify đa dạng tuỳ nhu cầu

# interface : 
  + đa kế thừa
  + ko có khái niệm interface implement interface khác (1 interface đc implement bởi 1 or nhiều class khác)  
  + ko cần định nghĩa access modify (có sẵn public)


# JDBC l là một kỹ thuật kết nối csdl giữ java và các hệ quản trị csdl khác (có quan hệ vd MySQL)
- Luồng lấy dữ liệu :
  + Load driver
  + Tạo connection
  + Khởi tạo đối tượng statement
  + Thực thi câu SQL
  + Xử lý data trả về sau khi thực thi
--> Sau khi lấy dữ liệu từ database (toàn bộ kiến trức của table) ra thì đổ vào ResultSet (sai đó thực hiện các bước tiếp theo)
--> rs.next() trả về True/False --> kiểm tra xem có tồn tại row đó hay không (row đầu tiên/row kế tiếp) để đi vào từng column và get data ra
--> get + datatype (primitive + object) :getString, getLong, getInt
--> đặc biệt getObject (viết dạng kiểu dữ liệu nào cũng dùng được/ không xác định đc kiểu dữ liệu)


# Exception trong java
- Checked : I/OException (xử lý file) , SQLException (chạy câu SQL), ClassNotFoundException (cần có file cần thiết để chạy code) 
--> Biên dịch đã lỗi - báo đỏ
- Unchecked (Runtime Exception) : Chạy xong mới lỗi
--> Cần có exception parent bọc bên ngoài cùng với Exception con đã biết được loại của exception đó
+ Exception cha hỗ trợ bắt toàn bộ các case exception (sau đó tìm ra exception cụ thể sau)
+ Fillnaly Block : code chạy lỗi/OKE đều chạy các lệnh ở trong finally
	try { }
	catch { } 
	finally { 
		- close các đối tượng đã khai báo
	}

# ResultSet Metadata
- Tác vụ : lấy giá trị từ column --> kiểm tra row (resultset đang OK)
- vd ResultSet có method get, next  nhưng 1 số trường hợp ko sử dụng đc
--> Dùng ResultSet Metadata
+ lấy kiểu dữ liệu của field trong table getColumnType

# Statement trong JDBC 
- Statement : 
- PrepareedStatement : 
* Callablestatement (tạo method trực tiếp trong database MySQL sau đó chương trình JAVA sẽ gọi)
* Try catch with resource : bỏ các đối tượng vào try ( here ) --> sẽ tự động close lại các đối tượng đó
--> không cần dùng xong phải .close() thủ công
--> Class.forname("com.mysql.jdbc.Driver") --> JDK ver8 có sẵn có sẵn nên ko cần khai báo

# SQL
## Primary key : bigInt, not Null, ko bị trùng
- String trong SQL :
+ Text cho dữ liệu nhiều và dài
+ varchar dữ liệu có độ dài 255

## MySQL có 2 loại tài khoản :
- Tài khoản root (Default) - toàn quyền
- Tài khoản user - được cấp quyền tuỳ chọn

## Tìm kiếm trong SQL
- Đối với string : SELECT * FROM table where like '%building%'
- Where 1 = 1 (không cần xác định field đầu tiền --> các field sau nối and/or thoải mái)
- StringBuilder trong JAVA (dùng để nối chuỗi câu SQL)

--> Garbage collection : tự huỷ đối tượng, xoá cùng nhớ trong JAVA