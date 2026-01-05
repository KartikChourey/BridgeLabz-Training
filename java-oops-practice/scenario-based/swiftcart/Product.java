package swiftcart;

//Base product class
public abstract class Product {

 protected String name;
 protected double price;
 protected String category;

 public Product(String name, double price, String category) {
     this.name = name;
     this.price = price;
     this.category = category;
 }

 // Polymorphic discount method
 public abstract double applyDiscount(double total);
}
