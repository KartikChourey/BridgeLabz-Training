import java.util.Scanner;

publlic class FactorsFor {
    // Main method
    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Take number input
        int number = sc.nextInt();

        // Check positive number
        if (number > 0) {

            // Loop from 1 to number-1
            for (int i = 1; i < number; i++) {

                // Check divisibility
                if (number % i == 0) {
                    System.out.println(i);
                }
            }
        }
    }
}
