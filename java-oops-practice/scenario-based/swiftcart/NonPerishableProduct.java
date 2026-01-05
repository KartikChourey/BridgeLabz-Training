package swiftcart;

//Non-perishable items like rice, oil
public class NonPerishableProduct extends Product {

 public NonPerishableProduct(String name, double price) {
     super(name, price, "Non-Perishable");
 }

 @Override
 public double applyDiscount(double total) {
     return total * 0.95; // 5% discount
 }
}

