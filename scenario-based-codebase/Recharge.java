// 10. Phone Recharge Simulator 📱
// Take the user's mobile operator and amount.
// ● Use a switch to display offers.
// ● Loop to allow repeated recharges.
// ● Show balance after each recharge.

import java.util.Scanner;

public class Recharge {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double walletBalance = 0;
        boolean continueRecharge = true;

        while (continueRecharge) {

            System.out.println("\nSelect Operator");
            System.out.println("1. Jio");
            System.out.println("2. Airtel");
            System.out.println("3. VI");

            System.out.print("Your choice: ");
            int operator = input.nextInt();

            System.out.print("Enter recharge amount: ");
            double amount = input.nextDouble();
            walletBalance += amount;

            // showing offers
            switch (operator) {
                case 1:
                    System.out.println("Jio: Free 1GB data added");
                    break;
                case 2:
                    System.out.println("Airtel: Unlimited calling benefit");
                    break;
                case 3:
                    System.out.println("VI: Extra SMS pack activated");
                    break;
                default:
                    System.out.println("Unknown operator selected");
            }

            System.out.println("Current Balance: ₹" + walletBalance);

            System.out.print("Recharge again? (yes/no): ");
            String choice = input.next();

            if (!choice.equalsIgnoreCase("yes")) {
                continueRecharge = false;
            }
        }

        System.out.println("Recharge session ended");
       
    }
}
