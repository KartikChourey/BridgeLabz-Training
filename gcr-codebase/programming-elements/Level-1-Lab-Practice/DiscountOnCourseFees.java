public class DiscountOnCourseFees {
    public static void main(String[] args) {

        // Original course fee
        double fee = 125000;

        // Discount percentage
        double discountPercent = 10;

        // Calculating discount amount
        double discount = (fee * discountPercent) / 100;

        // Calculating final fee after discount
        double finalFee = fee - discount;

        // Printing the result
        System.out.println(
            "The discount amount is INR " + discount +
            " and final discounted fee is INR " + finalFee
        );
    }
}
