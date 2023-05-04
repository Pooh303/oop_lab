package Week8;

import java.util.*;
import Week7.*;

public class Customer {

    private String firstName;
    private String lastName;
//    private Account acct[];
    ArrayList<Account> acct;
//    private int numOfAccount;

    public Customer() {
        this("", "");
//        this.firstName = "";
//        this.lastName = "";
    }

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
//        acct = new Account[5];
        acct = new ArrayList();

    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void addAccount(Account acct) {
//        this.acct[numOfAccount] = acct;
        this.acct.add(acct);
//        numOfAccount += 1;
    }

    public Account getAccount(int index) {
//        return acct[index];
        return acct.get(index);
    }

    public int getNumOfAccount() {
//        return this.numOfAccount;
        return this.acct.size();
    }

    @Override
    public String toString() {
        if (acct.size() > 1) /*if (numOfAccount > 1)*/ {
            return (firstName + " " + lastName + " have " + /*numOfAccount*/ acct.size() + " accounts.");
        } else {
            return (firstName + " " + lastName + " has " + /*numOfAccount*/ acct.size() + " account.");
        }
    }

    public boolean equals(Customer c) {
        return this.getFirstName().equals(c.getFirstName()) & this.getLastName().equals(c.getLastName());
    }
}
