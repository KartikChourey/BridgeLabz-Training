// Main Class 

public class BankScenarioTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Creating a savings account object
        SavingsAccount account =
                new SavingsAccount(1001, 5000, 4.0);

        int choice;

        // Menu-driven approach
        do {
            System.out.println("\n--- Bank Menu ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Calculate Interest");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter deposit amount: ");
                    double depAmount = sc.nextDouble();
                    account.deposit(depAmount);
                    break;

                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double wdAmount = sc.nextDouble();
                    account.withdraw(wdAmount);
                    break;

                case 3:
                    account.showBalance();
                    break;

                case 4:
                    account.calculateInterest();
                    break;

                case 5:
                    System.out.println("Thank you for using the bank system");
                    break;

                default:
                    System.out.println("Invalid choice, try again");
            }

        } while (choice != 5);

     
    }
}