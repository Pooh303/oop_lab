package Week5;

public class Waiter {

    private String name;
    private double money;

    public void collectMoney(Customer c, int money) {
        money += c.pay(money);
    }
}
