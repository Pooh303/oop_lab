package Week8;

//import java.util.*;
//
public class Main {
//
//    public static void main(String[] args) {
//        HashSet s = new HashSet();
//        s.add("C#");
//        s.add("dada");
//        s.add(2);
//        s.add("command");
//        System.out.println(s.size() + " " + s.contains("dada") + " " + s);
//        s.remove("dada");
//        System.out.println(s.size() + " " + s.contains("dada") + " " + s);
//
//        Iterator it = s.iterator();
//        HashSet x = new HashSet();
//        while (it.hasNext()) {
//            x.add(it.next());
//        }
//        System.out.println(x);
//        int x[][];
//        x = new int[3][];
//
//        x[0] = new int[4];
//        x[1] = new int[2];
//        x[2] = new int[3];
//
//        for (int i = 0; i < x.length; i++) {
//            for (int j = 0; j < x[i].length; j++) {
//                x[i][j] = (i + j) * 2;
//            }
//        }
//        for (int i = 0; i < x.length; i++) {
//            for (int j = 0; j < x[i].length; i++) {
//                System.out.println(x[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }
//}

//    public static void main(String[] args) {
//        Account a1 = new Account(5000, "Sommai");
//        Account a2 = new Account(3000, "Somchai");
//        Account a3 = new Account(900, "Somsri");
//
//        Bank myBank = new Bank();
//        myBank.addAccount(a1);
//        myBank.addAccount(a2);
//        myBank.addAccount(a3);
//
//        System.out.println("Number of Account: " + myBank.getNumAccount());
//        myBank.getAccount(0).showAccount();
//        System.out.println("Deposit 500...");
//        myBank.getAccount(0).deposit(500);
//        myBank.getAccount(0).showAccount();
//        System.out.println("Show all accounts");
//        System.out.println("==============================");
//        for (int i = 0; i < myBank.getNumAccount(); i++) {
//            myBank.getAccount(i).showAccount();
//        }
//    }
//}
    public static void main(String[] args) {
        Customer cust = new Customer("Somsri", "Boonjing");
        Account acct1 = new Account(5000, "Somsri01");
        Account acct2 = new Account(3000, "Somsri02");
        cust.addAccount(acct1);
        cust.addAccount(acct2);

        cust.getAccount(0).withdraw(3000);
        cust.getAccount(1).deposit(3000);

        System.out.println(cust);

        for (int i = 0; i < cust.getNumOfAccount(); i++) {
            cust.getAccount(i).showAccount();
        }
    }
}
