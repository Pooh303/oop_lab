package Week5;

public class Customer {

    private Wallet myWallet;

    public Wallet getWallet() {
        return this.myWallet;
    }

    public void setWallet(Wallet w) {
        this.myWallet = w;
    }

    public double pay(int m) {
        return myWallet.withdraw(m);
    }
}
