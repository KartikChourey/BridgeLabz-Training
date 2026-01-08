package medistore;
import java.time.LocalDate;

public class Medistore{
    public static void main(String[] args) {

        Medicine tab = new Tablet("Paracetamol", 2.5, LocalDate.of(2026, 5, 10));
        Medicine syrup = new Syrup("Cough Syrup", 80, LocalDate.of(2025, 1, 15));

        tab.sell(10);
        syrup.sell(1);
    }
}
