package BookBazaar;

public class Order {

    private Book book;
    private int quantity;
    private String orderStatus;

    public Order(Book book, int quantity) {
        this.book = book;
        this.quantity = quantity;
        this.orderStatus = "PLACED";
    }

    public double calculateTotal() {
        double total = book.price * quantity;
        double discount = book.applyDiscount(quantity);
        return total - discount;
    }

    // Restricted status change
    protected void updateStatus(String status) {
        this.orderStatus = status;
    }

    public void confirmOrder() {
        book.reduceStock(quantity);
        updateStatus("CONFIRMED");
    }
}
