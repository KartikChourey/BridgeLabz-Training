package medistore;

//Highly sensitive medicine
public class Injection extends Medicine {

 public Injection(String name, double price, LocalDate expiryDate) {
     super(name, price, expiryDate);
 }

 @Override
 public boolean checkExpiry() {
     return getExpiryDate().isBefore(LocalDate.now().plusDays(2));
 }
}
