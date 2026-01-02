class BusinessWallet extends Wallet {

    public BusinessWallet(double balance) {
        super(balance);
    }

    public void transferTo(Wallet receiver, double amount) {
        double tax = amount * 0.02;
        if (deductBalance(amount + tax)) {
            receiver.addBalance(amount);
        }
    }
}