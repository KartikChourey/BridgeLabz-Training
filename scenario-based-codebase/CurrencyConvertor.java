import java.util.Scanner;

public class CurrencyConvertor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char choice;

        do {
            System.out.print("Enter amount in INR: ");
            double inr = sc.nextDouble();

            System.out.println("Choose target currency:");
            System.out.println("1. USD");
            System.out.println("2. EUR");
            System.out.println("3. GBP");

            int option = sc.nextInt();
            double convertedAmount = 0;

         
            switch (option) {
                case 1:
                    convertedAmount = inr * 0.012; 
                    System.out.println("Amount in USD: " + convertedAmount);
                    break;

                case 2:
                    convertedAmount = inr * 0.011;
                    System.out.println("Amount in EUR: " + convertedAmount);
                    break;

                case 3:
                    convertedAmount = inr * 0.010; 
                    System.out.println("Amount in GBP: " + convertedAmount);
                    break;

                default:
                    System.out.println("Invalid currency choice!");
            }

            System.out.print("Do you want another conversion? (y/n): ");
            choice = sc.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        System.out.println("Thank you for using Currency Exchange Kiosk!");
    }
}
