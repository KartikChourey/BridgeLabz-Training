public class Main2 {

    public static void main(String[] args) {

        Bank bank = new Bank("SBI");
        Customer c1 = new Customer("Rohit");

        bank.openAccount(c1, 5000);
        c1.viewBalance();
    }
}
