import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of people: ");
        int numberPeople = sc.nextInt();
        for (int i = 1; i <= numberPeople; i++) {
            System.out.println("Person " + i +":");
            System.out.print(" - Enter your age: ");
            int age = sc.nextInt();
            if(age<16){
                System.out.println("Notification: You are not allowed to watch this movie!");
            } else {
                System.out.println("Notification: OK!");
            }
        }
        sc.close();
    }
}
