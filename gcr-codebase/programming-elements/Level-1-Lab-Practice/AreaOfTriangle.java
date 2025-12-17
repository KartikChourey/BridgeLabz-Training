import java.util.Scanner;

public class AreaOfTriangle{
    public static void main(String[] args) {

        // Scanner object
        Scanner input = new Scanner(System.in);

        // Taking base input
        System.out.print("Enter base: ");
        double base = input.nextDouble();

        // Taking height input
        System.out.print("Enter height: ");
        double height = input.nextDouble();

        // Calculating area
        double area = 0.5 * base * height;

        // Printing result
        System.out.println("Area of the triangle is " + area);

        // Closing scanner
        input.close();
    }
}
