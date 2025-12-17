import java.util.Scanner;

public class SquareSide {
    public static void main(String[] args) {

        // Scanner object for input
        Scanner input = new Scanner(System.in);

        // Take perimeter from user
        System.out.print("Enter perimeter of the square: ");
        double perimeter = input.nextDouble();

        // Calculate side of square
        double side = perimeter / 4;

        // Print output
        System.out.println(
            "The length of the side is " + side +
            " whose perimeter is " + perimeter
        );

        // Close Scanner
        input.close();
    }
}
