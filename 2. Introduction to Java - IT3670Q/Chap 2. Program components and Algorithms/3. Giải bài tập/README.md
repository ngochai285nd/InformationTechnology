# BÀI TẬP
# MÔN HỌC: NHẬP MÔN JAVA - IT3670Q
## CHƯƠNG 2: CÁC THÀNH PHẦN CHƯƠNG TRÌNH VÀ THUẬT TOÁN

| HỌ TÊN SV: PHẠM NGỌC HẢI  | MSSV: 20207601       |
|:--------------------------|:---------------------|
| MÃ LỚP: 126516            | MÃ HỌC PHẦN: IT3670Q |


**Bài 1:** Tải file SubjectXPass.java về và chạy. Hãy cải thiện chương trình để cho phép nhập số lượng sinh viên, và ứng với mỗi sinh viên thì cho chạy và xử lý kiểm tra như chương trình SubjectXPass đã làm.

_Bài làm: Đã gửi kèm source code_

**Bài 2:** Yêu cầu tương tự bài 1, tuy nhiên lần này cho người dùng tùy chọn sau khi chương trình đưa ra kết quả thì có muốn thực hiện tiếp cho sinh viên nữa không (số lượng sinh viên không biết trước).

_Bài làm: Đã gửi kèm source code._

**Bài 3:** Viết pseudocode và chương trình Java mô phỏng việc kiểm tra một nhóm người vào xem phim quy định 16+. Đầu tiên nhập số người, sau đó ứng với từng người sẽ yêu cầu nhập tuổi. Nếu người đó chưa đủ 16 tuổi thì in ra màn hình câu "Bạn không được vào xem phim này!".

_Bài làm:_
**pseudocode:**

    BEGIN
        INPUT numberOfPeople
        FOR i:=1 to numberOfPeople do
            INPUT yourAge
            IF (yourAge is less than 16) THEN
                DISPLAY "You are not allowed to watch this movie"
            ELSE
                DISPLAY "OK"
            ENDIF
        ENDFOR
    END
**Source code:** _Đã gửi trong folder_

**Bài 4:** Viết pseudocode và chương trình Java cho người dùng nhập 3 số thực. Chương trình đưa ra kết luận đó có thể là số đo 3 cạnh của 1 tam giác không. Kết thúc mỗi lần đưa ra kết quả thì người dùn luôn được lựa chọn có muốn tiếp tục nhập 3 số đo khác không.
(Gợi ý: số đo 3 cạnh tam giác thì tổng 2 cạnh bất kỳ luôn lớn hơn cạnh còn lại)

_Bài làm:_
**pseudocode:**

    BEGIN
        REPEAT
            INPUT side1, side2, side3
            IF (side1+side2>side3) and (side1+side3>side2) and (side2+side3>side1) THEN
                DISPLAY "This is the measure of the three sides of a triangle"
            ELSE
                DISPLAY "This is not the measure of the three sides of a triangle"
            ENDIF
        UNTIL (user enter "N")
    END
**Source code:** _Đã gửi trong folder_
