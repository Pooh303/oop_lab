package Week6;

public class Seller extends Employee {

    public Food sell(Employee e) {
        Food m = new Food();
        double price = m.getPrice();
        if (e.getWallet().getBalance() >= m.getPrice()) {
            getWallet().setBalance(getWallet().getBalance() + price);
            e.getWallet().setBalance(e.getWallet().getBalance() - price);
            return m;
        } else {
            System.out.println("Your money is not enough.");
        }
        return null;
    }
}
