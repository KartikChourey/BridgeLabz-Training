import java.util.Scanner;

public class EmployeeBonus {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take salary input
        double salary = sc.nextDouble();

        // Take years of service input
        int years = sc.nextInt();

        // Check if service is more than 5 years
        if (years > 5) {

            double bonus = salary * 0.05;

            System.out.println("Bonus amount is " + bonus);
        } else {

            // Print no bonus message
            System.out.println("No bonus");
        }
    }
}
