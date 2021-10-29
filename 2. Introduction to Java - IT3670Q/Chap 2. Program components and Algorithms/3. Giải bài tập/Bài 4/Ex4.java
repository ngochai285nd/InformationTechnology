import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("- Enter the measures of the 3 sides one by one: ");
            double side1 = sc.nextDouble();
            double side2 = sc.nextDouble();
            double side3 = sc.nextDouble();
            if (((side1 + side2) > side3) && ((side1 + side3) > side2) && ((side2 + side3) > side1)) {
                System.out.println("==> This is the measure of the three sides of a triangle");
            } else {
                System.out.println("==> This is not the measure of the three sides of a triangle");
            }
            sc.nextLine();
            System.out.print("Do you want continue? (y/n): ");
        } while (sc.nextLine().equalsIgnoreCase("y"));
        sc.close();
    }
}
