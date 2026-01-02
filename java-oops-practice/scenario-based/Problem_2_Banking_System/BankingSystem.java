
import java.util.*;
public class BankingSystem {
    public static void main(String[] args) {

        List<BankAccount> accounts = new ArrayList<>();

        accounts.add(new SavingsAccount("S101", "Kartik", 80000));
        accounts.add(new CurrentAccount("C201", "Business Corp", 150000));

        for (BankAccount acc : accounts) {
            System.out.println("-----------------");
            acc.displayAccount(); // Polymorphism
        }
    }
}