public class ProfitCalculation {
    public static void main(String[] args) {

        // Cost price of the product
        int costPrice = 129;

        // Selling price of the product
        int sellingPrice = 191;

        // Calculating profit
        int profit = sellingPrice - costPrice;

        // Calculating profit percentage
        double profitPercentage = (profit * 100.0) / costPrice;

        // Single print statement with multiline output
        System.out.println(
            "The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice +
            "\nThe Profit is INR " + profit + " and the Profit Percentage is " + profitPercentage
        );
    }
}
