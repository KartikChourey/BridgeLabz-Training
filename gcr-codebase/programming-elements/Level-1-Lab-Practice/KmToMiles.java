import java.util.Scanner;

public class KmToMiles {
    public static void main(String[] args) {

        // Creating Scanner object for input
        Scanner input = new Scanner(System.in);

        // Taking distance in kilometers from user
        System.out.print("Enter distance in km: ");
        double km = input.nextDouble();

        // Converting km to miles
        double miles = km / 1.6;

        // Printing result
        System.out.println(
            "The total miles is " + miles + " mile for the given " + km + " km"
        );

        // Closing scanner
        input.close();
    }
}
