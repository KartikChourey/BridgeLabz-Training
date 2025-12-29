import java.util.Scanner;

public class Discount {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        final int TOTAL_ITEMS = 4;   // shopkeeper decided to count 4 items
        double billAmount = 0;

        // taking price of each item
        for (int itemNo = 1; itemNo <= TOTAL_ITEMS; itemNo++) {
            System.out.print("Enter price for item " + itemNo + ": ");
            double price = input.nextDouble();
            billAmount = billAmount + price;
        }

        // discount decision
        if (billAmount > 4500) {
            billAmount = billAmount - (billAmount * 0.20);
            System.out.println("Applied 20% discount");
        } 
        else if (billAmount > 2500) {
            billAmount = billAmount - (billAmount * 0.10);
            System.out.println("Applied 10% discount");
        } 
        else {
            System.out.println("No discount this time");
        }

        System.out.println("Payable Amount: ₹" + billAmount);

        
    }
}
