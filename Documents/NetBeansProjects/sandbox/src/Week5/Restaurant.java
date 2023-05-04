package Week5;

public class Restaurant {

    public static void main(String[] args) {
        Wallet w = new Wallet();
        w.setMoneny(1000);
        System.out.println(w.getMoney());
        Customer c = new Customer();
        c.setWallet(w);

        Waiter wa = new Waiter();
        wa.collectMoney(c, 840);
        System.out.println(w.getMoney());
    }
}
