package swiftcart;
import java.util.ArrayList;

//Cart handles pricing logic securely
public class Cart implements ICheckout {

 private ArrayList<Product> products;
 private double totalPrice;

 // Empty cart
 public Cart() {
     products = new ArrayList<>();
 }

 // Cart with pre-selected items
 public Cart(ArrayList<Product> products) {
     this.products = products;
 }

 public void addProduct(Product product, int quantity) {
     products.add(product);
     totalPrice += product.price * quantity; // operator usage
 }

 @Override
 public void applyDiscount() {
     for (Product p : products) {
         totalPrice = p.applyDiscount(totalPrice);
     }
 }

 @Override
 public void generateBill() {
     applyDiscount();
     System.out.println("Final Bill Amount: ₹" + totalPrice);
 }
}

