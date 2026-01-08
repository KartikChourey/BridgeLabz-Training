package medistore;

//Liquid medicine (expires faster once opened)
public class Syrup extends Medicine {

 public Syrup(String name, double price, LocalDate expiryDate) {
     super(name, price, expiryDate);
 }

 @Override
 public boolean checkExpiry() {
     return getExpiryDate().isBefore(LocalDate.now().plusDays(5));
 }
}
