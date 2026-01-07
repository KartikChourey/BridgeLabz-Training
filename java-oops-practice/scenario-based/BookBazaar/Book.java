package BookBazaar;

//Base Book class
public abstract class Book implements IDiscountable {

 protected String title;
 protected String author;
 protected double price;

 private int stock;

 public Book(String title, String author, double price, int stock) {
     this.title = title;
     this.author = author;
     this.price = price;
     this.stock = stock;
 }

 // Controlled inventory update
 public void reduceStock(int quantity) {
     if (quantity <= stock) {
         stock -= quantity;
     }
 }

 public int getStock() {
     return stock;
 }
}
