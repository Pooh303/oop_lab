package Week5;

public class Main {

    public static void main(String[] args) {
        Ant a1 = new Ant();
        a1.setName("John");
        Ant a2 = new Ant();
        a2.setName("Alex");
        System.out.println("Hi " + a1.greeting(a1) + " I'm " + a2.greeting(a2));
    }
}
