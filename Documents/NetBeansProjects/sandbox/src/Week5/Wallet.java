package Week5;

public class Wallet {

    private double money;

    public double getMoney() {
        return this.money;
    }

    public void setMoneny(int m) {
        this.money = m;
    }

    public double withdraw(double m) {
        if (money >= m) {
            money -= m;
        } else {
            new Exception("Not Enough!!");
        }
        return m;
    }
}
