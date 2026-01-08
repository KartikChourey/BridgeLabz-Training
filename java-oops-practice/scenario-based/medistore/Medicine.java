package medistore;

import java.time.LocalDate;

//Base class for all medicines
public abstract class Medicine implements ISellable {

 private String name;
 private double price;
 private LocalDate expiryDate;
 private int quantity;   // stock is hidden (encapsulation)

 // Constructor with default quantity
 public Medicine(String name, double price, LocalDate expiryDate) {
     this(name, price, expiryDate, 50); // default stock = 50
 }

 public Medicine(String name, double price, LocalDate expiryDate, int quantity) {
     this.name = name;
     this.price = price;
     this.expiryDate = expiryDate;
     this.quantity = quantity;
 }

 // Sensitive pricing logic is private
 private double calculateTotal(int units) {
     return price * units;
 }

 @Override
 public boolean sell(int units) {
     if (units <= quantity && !checkExpiry()) {
         quantity -= units; // stock adjustment using operators
         double bill = calculateTotal(units);
         System.out.println(units + " units sold. Bill: ₹" + bill);
         return true;
     }
     System.out.println("Sale failed (Out of stock or expired)");
     return false;
 }

 protected LocalDate getExpiryDate() {
     return expiryDate;
 }

 protected String getName() {
     return name;
 }
}
