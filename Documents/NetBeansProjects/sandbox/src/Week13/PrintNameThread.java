package Week13;

public class PrintNameThread {
    ///Has a - implements
//    public static void main(String[] args) {
//        PrintName p1 = new PrintName("Dream");
//        PrintName p2 = new PrintName("Cream");
//        Thread t1 = new Thread(p1);
//        Thread t2 = new Thread(p2);
//        t1.start();
//        t2.start();
//    }
    ///Is a - extends

    public static void main(String[] args) {
        PrintName_extends p1 = new PrintName_extends("Dream");
        PrintName_extends p2 = new PrintName_extends("Cream");
        p1.start();
        p2.start();
    }
}
