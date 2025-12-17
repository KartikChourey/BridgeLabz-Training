import java.util.Scanner;

public class PurchasePrice {
    public static void main(String[] args) {

        // Scanner object
        Scanner input = new Scanner(System.in);

        // Taking unit price
        System.out.print("Enter unit price: ");
        double unitPrice = input.nextDouble();

        // Taking quantity
        System.out.print("Enter quantity: ");
        int quantity = input.nextInt();

        // Calculating total price
        double totalPrice = unitPrice * quantity;

        // Printing result
        System.out.println(
            "The total purchase price is INR " + totalPrice +
            " if the quantity " + quantity +
            " and unit price is INR " + unitPrice
        );

        // Closing scanner
        input.close();
    }
}
