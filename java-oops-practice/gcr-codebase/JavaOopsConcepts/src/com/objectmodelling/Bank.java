
public class Bank {

    String bankName;

    Bank(String bankName) {
        this.bankName = bankName;
    }

    void openAccount(Customer c, double amount) {
        c.balance += amount;
        System.out.println("Account opened for " + c.name + " in " + bankName);
    }
}
