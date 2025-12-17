import java.util.Scanner;

public class PurchasePrice {
    public static void main(String[] args) {

        // Scanner object
        Scanner input = new Scanner(System.in);

        // Take unit price
        System.out.print("Enter unit price: ");
        double unitPrice = input.nextDouble();

        // Take quantity
        System.out.print("Enter quantity: ");
        int quantity = input.nextInt();

        // Calculate total price
        double totalPrice = unitPrice * quantity;

        // Print output
        System.out.println(
            "The total purchase price is INR " + totalPrice +
            " if the quantity " + quantity +
            " and unit price is INR " + unitPrice
        );

        // Close Scanner
        input.close();
    }
}
