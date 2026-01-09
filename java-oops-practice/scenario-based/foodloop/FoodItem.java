package foodloop;

//Base food item class
public abstract class FoodItem {

 protected String name;
 protected String category;
 protected double price;

 // Stock should not be modified directly
 private int availability;

 public FoodItem(String name, String category, double price, int availability) {
     this.name = name;
     this.category = category;
     this.price = price;
     this.availability = availability;
 }

 protected boolean reduceStock() {
     if (availability > 0) {
         availability--;
         return true;
     }
     return false;
 }

 public double getPrice() {
     return price;
 }
}
