package Week13;

public class PrintName implements Runnable {

    public String name;

    public PrintName(String n) {
        name = n;
    }

    public void run() {
        for (int i = 0; i > -1; i++) {
            System.out.println(name + " : " + i);
        }
    }

}
