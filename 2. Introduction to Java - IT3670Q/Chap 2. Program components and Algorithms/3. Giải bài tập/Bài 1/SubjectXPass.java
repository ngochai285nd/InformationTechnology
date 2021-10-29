import java.util.Scanner;

public class SubjectXPass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students in the class: ");
        int numOfStudents = sc.nextInt();
        Student[] student = new Student[numOfStudents];
        for (int i = 0; i < numOfStudents; i++) {
            System.out.println("Student " + (i + 1) + ":");
            student[i] = new Student();
            System.out.print(" - Please enter 4 assignment marks and 2 lab marks: ");
            student[i].setAssign1(sc.nextInt());
            student[i].setAssign2(sc.nextInt());
            student[i].setAssign3(sc.nextInt());
            student[i].setAssign4(sc.nextInt());
            student[i].setLab1(sc.nextInt());
            student[i].setLab2(sc.nextInt());
            student[i].isPassAssignLab();
            System.out.print(" - Please enter 2 exam marks: ");
            student[i].setExam1(sc.nextInt());
            student[i].setExam2(sc.nextInt());
            student[i].isPassExam();
            student[i].isPassOverall();
            System.out.println();
        }
        sc.close();
    }
}
