class PersonalWallet extends Wallet {

    public PersonalWallet(double balance) {
        super(balance);
    }

    public void transferTo(Wallet receiver, double amount) {
        if (deductBalance(amount)) {
            receiver.addBalance(amount);
        }
    }
}