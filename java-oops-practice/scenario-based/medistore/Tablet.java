package medistore;
//Preserved medicine (longer shelf life)
public class Tablet extends Medicine {

 public Tablet(String name, double price, LocalDate expiryDate) {
     super(name, price, expiryDate);
 }

 @Override
 public boolean checkExpiry() {
     return getExpiryDate().isBefore(LocalDate.now());
 }
}
