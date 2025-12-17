import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {

        // Scanner object for input
        Scanner input = new Scanner(System.in);

        // Take base in cm
        System.out.print("Enter base in cm: ");
        double base = input.nextDouble();

        // Take height in cm
        System.out.print("Enter height in cm: ");
        double height = input.nextDouble();

        // Calculate area in square centimeters
        double areaCm = 0.5 * base * height;

        // Convert cm to inches (1 inch = 2.54 cm)
        double baseInches = base / 2.54;
        double heightInches = height / 2.54;

        // Calculate area in square inches
        double areaInches = 0.5 * baseInches * heightInches;

        // Print results
        System.out.println(
            "The Area of the triangle in sq in is " + areaInches +
            " and sq cm is " + areaCm
        );

        // Close Scanner
        input.close();
    }
}
