public class EWalletApp {
    public static void main(String[] args) {

        Wallet user1 = new PersonalWallet(5000);
        Wallet user2 = new BusinessWallet(10000);

        user1.transferTo(user2, 1000);

        System.out.println("User1 Balance: ₹" + user1.getBalance());
        System.out.println("User2 Balance: ₹" + user2.getBalance());
    }
}