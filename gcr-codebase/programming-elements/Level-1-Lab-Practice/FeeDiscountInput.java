import java.util.Scanner;

public class FeeDiscountInput {
    public static void main(String[] args) {

        // Scanner object to take input
        Scanner input = new Scanner(System.in);

        // Taking course fee input
        System.out.print("Enter course fee: ");
        double fee = input.nextDouble();

        // Taking discount percentage input
        System.out.print("Enter discount percentage: ");
        double discountPercent = input.nextDouble();

        // Calculating discount amount
        double discount = (fee * discountPercent) / 100;

        // Calculating final fee
        double finalFee = fee - discount;

        // Printing output
        System.out.println(
            "The discount amount is INR " + discount +
            " and final discounted fee is INR " + finalFee
        );

        // Closing scanner
        input.close();
    }
}
