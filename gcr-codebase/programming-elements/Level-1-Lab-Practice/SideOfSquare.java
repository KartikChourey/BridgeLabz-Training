import java.util.Scanner;

public class SideOfSquare {
    public static void main(String[] args) {

        // Scanner object
        Scanner input = new Scanner(System.in);

        // Taking perimeter input
        System.out.print("Enter perimeter of square: ");
        double perimeter = input.nextDouble();

        // Calculating side
        double side = perimeter / 4;

        // Printing output
        System.out.println(
            "The length of the side is " + side +
            " whose perimeter is " + perimeter
        );

        // Closing scanner
        input.close();
    }
}
