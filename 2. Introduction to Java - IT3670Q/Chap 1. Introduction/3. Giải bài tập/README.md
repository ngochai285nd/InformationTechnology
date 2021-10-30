# BÀI TẬP
# MÔN HỌC: NHẬP MÔN JAVA - IT3670Q
## CHƯƠNG 1: TỔNG QUAN

| Họ tên SV: Phạm Ngọc Hải | MSSV: 20207601       |
|:-------------------------|:---------------------|
| Mã lớp: 126516           | Mã học phần: IT3670Q |

**Bài 1:** Giải thích tại sao ngôn ngữ lập trình Java lại là ngôn ngữ _"dịch ở một nơi và chạy ở nhiều nơi"_ ? Từ đó giải thích tại sao Java là ngôn ngữ độc lập với nền tảng (hệ điều hành)?
_Bài làm_
Ta nhìn vào sơ đồ dưới đây:

![java](https://anphanhv.files.wordpress.com/2015/03/capture.png)

Có thể nói ngôn ngữ lập trình Java là  ngôn ngữ “dịch ở một nơi và chạy nhiều nơi”. Điều này có nghĩa là phần mềm viết bằng ngôn ngữ lập trình Java chỉ cần viết một lần mà có thể chạy được trên mọi nền tảng (platform) khác nhau. Để làm được điều đó, Java đưa ra khái niệm máy ảo JVM (Java Vitual Machine).

Khi bạn biên dịch mã nguồn của một chương trình viết bằng ngôn ngữ Java, thay vì biên dịch trực tiếp ra mã máy, thì với Java mã nguồn được biên dịch ra bytecode. Bytecode này sẽ được bạn phân phối tới các thiết bị khác nhau (chạy các nền tảng hệ điều hành khác nhau), chính JVM cài sẵn trên thiết bị đó sẽ thông dịch mã bytecode sang mã máy và thực thi nó. Sun Microsystem (nay đã được Oracle mua lại) chịu trách nhiệm phát triển các máy ảo Java chạy trên các hệ điều hành trên các kiến trúc CPU khác nhau. Vì vậy còn có thể nói, Java là một ngôn ngữ vừa biên dịch, vừa thông dịch.

Tính độc lập nền của ngôn ngữ lập trình Java: Một chương trình viết bằng ngôn ngữ Java có thể chạy trên nhiều máy tính có hệ điều hành khác nhau (Windows, Unix, Linux, …) miễn sao ở đó có cài đặt máy ảo java (Java Virtual Machine). Viết một lần chạy mọi nơi (write once run anywhere).

**Bài 2.** Hãy viết và chạy thử chương trình HelloWorld bằng ngôn ngữ Java bằng giao diện dòng lệnh. Mô tả các bước em phải thực thi.

_Bài làm:_
- Bước 1: Tạo file HelloWorld.java
- Bước 2: Mở file HelloWorld.java, viết mã nguồn và lưu lại
- Bước 3: Mở CMD (Command Prompt) trên Windows hoặc Terminal trên Linux và dùng lệnh cd (change directory) để di chuyển tới folder chứa file mã nguồn HelloWorld.java. Sau đó, dùng lệnh javac HelloWorld.java để biên dịch mã nguồn Java ra bytecode, ta sẽ thu được file *.class. 
- Bước 4: Dùng lệnh java HelloWorld để thông dịch mã bycode (*.class) sang mã máy để thực thi chương trình

**Bài 3.** Hãy lập trình 2 lớp Person và Student như biểu đồ lớp dưới đây. (chú ý các đặc tính, phương thức của từng lớp, và lớp Student kế thừa từ lớp Person).

![OOP](./Bài%203/Annotation%202021-10-30%20104544.png)

_Bài làm:_ Đã gửi kèm Source code

**Bài 4.** Hãy tải các file .java của Animal_project về, đưa vào cùng 1 project và  chạy file TalkingAnimals.java . Với kết quả nhận được sau quá trình chạy, hãy giải thích tinh kế thừa (Inheritance) và tinh đa hình (Polymorphisme) của ngôn ngữ Java.
_Bài làm:_
Từ kết quả nhận được, ta thấy: 
- Tính kế thừa (Inheritance): Các subclass Emu, Kangaroo và Koala kế thừa tất cả các thuộc tính ( bao gồm popurlarity và favouriteFood) và phương thức (thoughts() và talk()) từ superclass Animal. Vì vậy, mỗi đối tượng được khởi tạo từ lớp con thì đều có thể sử dụng được các thuộc tính và phương thức của lớp cha (chỉ đối với các thành viên khác private). Đây là kiểu kế thừa thứ bậc.
- Tính đa hình (Polymorphisme): ở các lớp con Emu, Kangaroo và Koala đã Overriding Method thoughts() của lớp cha. Vì vậy khi runtime, gọi hàm talk() của lớp cha thì hàm thoughts() bên trong talk() sẽ được tham chiếu tới phương thức thoughts() của lớp con vì phương thức này đã bị lớp con ghi đè. Đây là đa hình lúc runtime.






