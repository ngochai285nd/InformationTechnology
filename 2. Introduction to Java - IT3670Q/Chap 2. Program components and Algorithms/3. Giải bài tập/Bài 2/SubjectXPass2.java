import java.util.Scanner;

public class SubjectXPass2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student student = new Student();
        int i = 0;
        do {
            System.out.println("Student " + (++i) + ":");
            System.out.print(" - Please enter 4 assignment marks and 2 lab marks: ");
            student.setAssign1(sc.nextInt());
            student.setAssign2(sc.nextInt());
            student.setAssign3(sc.nextInt());
            student.setAssign4(sc.nextInt());
            student.setLab1(sc.nextInt());
            student.setLab2(sc.nextInt());
            student.isPassAssignLab();
            System.out.print(" - Please enter 2 exam marks: ");
            student.setExam1(sc.nextInt());
            student.setExam2(sc.nextInt());
            student.isPassExam();
            student.isPassOverall();
            System.out.println();
            System.out.print("Do you want continue? (y/n): ");
            sc.nextLine();
        } while (sc.nextLine().equalsIgnoreCase("Y"));
        System.out.println("Exit");
        sc.close();
    }
}
