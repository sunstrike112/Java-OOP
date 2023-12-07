# Xây dựng mô hình MVC, 3-LAYER, debug cơ bản, nâng cao lớp java core
 
## Bài 1
- Util (static method logic sử dụng lặp đi lặp lại nên viết method)
- Constant (static variable, từ khóa final - không đc phép thay đổi)
- Static (khởi tạo lần đâu và duy trì để dùng gọi lại ở nhiều chỗ khác nhau)
- garbage collection
 
## Bài 2
- ConnectionUtil
- StringBuilder để giải quyết --> Vấn đề cộng chuỗi khi dùng String --> sinh ra nhiều vùng nhớ, yêu cầu thêm tài nguyên để garbage collection xử lý
- Giới thiệu SingleResponsibility (chia code ra từng tính năng)
 
## Bài 3
- Clean code
- 3 Layer :
  + Presentation (Model View Controller)
    * Model : trung gian để luân chuyển dữ liệu. VD : Thêm tòa nhà mới --> model hứng data --> controller
    * Controller : ko có logic nên ko cần áp dụng tính trừu tượng
    * View : show data cho user
  + Business Layer : xử lý logic
  + Data Access Layer : truy vẫn SQL
- Base Model để tạo các thuộc tính chung để extend
- Flow get thông tin tòa nhà và lưu thông tin tòa nhà

## Buổi 4
- Tạo các package tương ứng với 3 layer, MVC
- anhyeuem (DAO), emyeuanh(service)

## Buổi 5
- Vấn đề dùng Array (kích thướng bị mảng bị fix cứng) --> Java collection (ArrayList)

## Buổi 6
- Java collection (HashMap)

