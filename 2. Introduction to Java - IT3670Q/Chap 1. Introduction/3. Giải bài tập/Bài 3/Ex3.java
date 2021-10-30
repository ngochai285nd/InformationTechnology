import java.util.Scanner;

public class Ex3 {
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {

        Student sv1 = new Student();
        // Nhap thong tin sinh vien
        setInforOfStudent(sv1);
        // Xuat thong tin sinh vien
        showInforOfStudent(sv1);
    }

    public static void showInforOfStudent(Student sv) {
        System.out.println();
        System.out.println("Full name: " + sv.getName());
        System.out.println("Student number: " + sv.studentNumber);
        System.out.println("Date of birth: " + sv.getDateOfBirth());
        System.out.println("Age: " + sv.calculateAge());
        System.out.println("Enrolled Subjects: " + String.join(", ", sv.enrolledSubjects));
    }

    public static void setInforOfStudent(Student sv) {
        // Nhap ho va ten
        System.out.print("Enter full name : ");
        sv.setName(keyboard.nextLine());

        // Nhap ma so sinh vien
        System.out.print("Enter student number: ");
        sv.studentNumber = keyboard.nextLine();

        // Nhap dia chi
        System.out.print("Enter address: ");
        sv.changeAddress(keyboard.nextLine());

        // Nhap so dien thoai
        System.out.print("Enter phone number: ");
        sv.setPhoneNumber(keyboard.nextLine());

        // Nhap ngay thang nam sinh
        System.out.print("Enter date of birth: ");
        sv.setDateOfBirth(keyboard.nextLine());

        // Nhap ten mon hoc muon them
        do {
            System.out.print("Enter the subject you want to add: ");
            sv.enrollnSubject(keyboard.nextLine());
            System.out.print("Continue add? (Y/N) ");
        } while (keyboard.nextLine().equalsIgnoreCase("y"));

        // Nhap ten mon hoc muon xoa
        do {
            System.out.print("Enter the subject you want to remove: ");
            sv.withdrawFromSubject(keyboard.nextLine());
            System.out.print("Continue delete? (Y/N) ");
        } while (keyboard.nextLine().equalsIgnoreCase("y"));
    }
}
