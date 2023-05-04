package Week13;

public class PrintName_extends extends Thread {

    public String name;

    public PrintName_extends(String n) {
        name = n;
    }

    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(name + " : " + i);
        }
    }

}
