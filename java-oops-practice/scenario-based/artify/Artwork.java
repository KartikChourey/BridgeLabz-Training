package artify;
//Base class for all artworks
public abstract class Artwork implements IPurchasable {

 protected String title;
 protected String artist;
 protected double price;

 // Licensing terms must not be exposed directly
 protected String licenseType;

 public Artwork(String title, String artist, double price, String licenseType) {
     this.title = title;
     this.artist = artist;
     this.price = price;
     this.licenseType = licenseType;
 }

 // Optional preview constructor
 public Artwork(String title, String artist, double price) {
     this(title, artist, price, "Standard");
 }

 @Override
 public void purchase(User user) {
     if (user.getWalletBalance() >= price) {
         user.deductBalance(price);
         System.out.println(title + " purchased successfully.");
     } else {
         System.out.println("Insufficient wallet balance.");
     }
 }
}
