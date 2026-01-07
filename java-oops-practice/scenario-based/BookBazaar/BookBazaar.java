package BookBazaar;

public class BookBazaar {

    public static void main(String[] args) {

        Book book1 = new PrintedBook("Java Mastery", "Herbert Schildt", 600, 10);
        Book book2 = new EBook("Clean Code", "Robert C. Martin", 450);

        Order order1 = new Order(book1, 3);
        Order order2 = new Order(book2, 1);

        order1.confirmOrder();
        order2.confirmOrder();

        System.out.println("Printed Book Total: ₹" + order1.calculateTotal());
        System.out.println("EBook Total: ₹" + order2.calculateTotal());
    }
}
