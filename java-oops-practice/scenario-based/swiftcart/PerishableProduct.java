package swiftcart;

//Perishable items like milk, vegetables
public class PerishableProduct extends Product {

 public PerishableProduct(String name, double price) {
     super(name, price, "Perishable");
 }

 @Override
 public double applyDiscount(double total) {
     return total * 0.90; // 10% discount
 }
}

