import java.util.Scanner;


pubic class Voting{
    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Take age input
        int age = sc.nextInt();

        // Check voting eligibility
        if (age >= 18) {

            // Print eligible message
            System.out.println("The person's age is " + age + " and can vote.");
        } else {

            // Print not eligible message
            System.out.println("The person's age is " + age + " and cannot vote.");
        }
    }
}
