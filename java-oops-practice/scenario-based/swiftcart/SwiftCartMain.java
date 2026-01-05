package swiftcart;

public class SwiftCartMain {

    public static void main(String[] args) {

        Cart cart = new Cart();

        Product milk = new PerishableProduct("Milk", 50);
        Product rice = new NonPerishableProduct("Rice", 100);

        cart.addProduct(milk, 2);
        cart.addProduct(rice, 3);

        cart.generateBill();
    }
}
