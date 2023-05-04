package Week8;

import Week7.*;

public class CheckingAccount extends Account {

    private double credit;

    public CheckingAccount() {
        this(0, "", 0);
    }

    public CheckingAccount(double balance, String name, double credit) {
        super(balance, name);
        this.credit = credit;
    }

    public void setCredit(double credit) {
        if (credit < 0) {
            System.out.println("Input number must be a positive integer.");
        } else {
            this.credit = credit;
        }
    }

    public double getCredit() {
        return this.credit;
    }

    @Override
    public void withdraw(double a) {
        double num = balance - a;
        if (a > 0) {
            if (num >= 0) {
                System.out.println(a + " baht is withdrawn from " + this.name + " and your credit balance is " + this.credit + ".");
            } else if (num + getCredit() >= 0) {
                balance = 0;
                System.out.println(a + " baht is withdrawn from " + name + " and your credit balance is " + credit + ".");
            } else if (num < 0 & num + credit < 0) {
                System.out.println("Not enough money!");
            }
        }
    }

    public void withdraw(String a) {
        this.withdraw(Double.parseDouble(a));
    }

    @Override
    public String toString() {
        return ("The " + name + " account has " + balance + " baht and " + credit + " credits.");
    }
}
