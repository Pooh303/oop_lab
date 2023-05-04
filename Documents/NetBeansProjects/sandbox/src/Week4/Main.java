package Week4;

import java.util.Scanner;

//public class Main {
//
//    private String breed;
//    private String size;
//    private int age;
//    private String color;
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        Main myDog1 = new Main();
//        myDog1.size = "Large";
////        System.out.print("Input your dog1 age : ");
////        myDog1.age = sc.nextInt();
//        myDog1.color = "Black";
//        /*System.out.println(myDog1.size + "\n" + myDog1.age + "\n" + myDog1.color);
//         */
//        Dog myDog2 = new Dog();
//        System.out.print("Input your dog2 age : ");
//        myDog2.age = sc.nextInt();
//        myDog2.color = "Red";
//
//        if (myDog2.age > myDog1.age) {
//            System.out.println("Shit! dog2 older than dog1 " + (myDog2.age - myDog1.age));
//        } else {
//            System.out.println("Ummm dog1 older than dog2");
//        }
//    }
//}
///
//public class Main {
//
//    public int HP, ATK = 2;
//
//    public void cut(Main p) {
//        p.HP -= ATK;
//    }
//
//    public static void main(String[] args) {
//        Main p1 = new Main();
//        Main p2 = new Main();
//        p1.HP = 10;
//        p2.HP = 10;
//        p1.cut(p2);
//        System.out.println(p2.HP);
//
//    }
//}
///
//public class Main {
//
//    public int num;
//
//    public void addOne(int i) {
//        i += 1;
//    }
//
//    public void addTwo(Main m) {
//        m.num += 2;
//    }
//
//    public static void main(String[] args) {
//        int i = 100;
//        Main m = new Main();
//
//        //Step 1
//        System.out.println(" i before : " + i);
//        m.addOne(i);
//        System.out.println(" i after : " + i);
//
//        //Step 2
//        m.num = 10;
//        System.out.println("\n obj m before : " + m.num);
//        m.addTwo(m);
//        System.out.println(" obj m after : " + m.num);
//
//        //Step 3
//        Main n = m;
//        System.out.println("\n obj m before : " + m.num);
//        System.out.println(" obj n  before : " + n.num);
//        m.addTwo(n);
//        System.out.println(" obj m after : " + m.num);
//        System.out.println(" obj n after : " + n.num);
//    }
//}
//"LAB"//
//public class Main {
//
//    public void show() {
//        System.out.println("Hello world");
//    }
//
//    public static void main(String[] args) {
//        System.out.println("Hello start");
//        Main m = new Main();
//        m.show();
//        System.out.println("Hello end");
//    }
//}
///
//public class Main {
//
//    public int AddTwo(int a) {
//        int result = a + 2;
//        return result;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        Main cm = new Main();
//
//        System.out.println("Please insert number : ");
//        int x = sc.nextInt();
//        int num = cm.AddTwo(x);
//        System.out.println("The result#1 is " + num);
//
//        num = cm.AddTwo(x + 5);
//        System.out.println("The result#2 is " + num);
//
//        num = cm.AddTwo(x * 3 + 2);
//        System.out.println("The result#3 is " + num);
//    }
//}
///
//public class Main {
//
//    public int AddTwo(int a) {
//        return AddNum(a, 2);
//    }
//
//    public int AddNum(int a, int num) {
//        return (a + num);
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        Main obj = new Main();
//
//        System.out.println("Please insert number1 : ");
//        int x = sc.nextInt();
//        System.out.println("Please inssert number2 : ");
//        int num = sc.nextInt();
//
//        int result = obj.AddTwo(x);
//        System.out.println("The result#1 is " + result);
//
//        result = obj.AddNum(x + 5, num);
//        System.out.println("The result#2 is " + result);
//
//        result = obj.AddTwo(x * 3 + 2);
//        System.out.println("The result#3 is " + result);
//    }
//}
///
//public class Main {
//
//    public String name;
//    public double mScore;
//    public double fScore;
//
//    public void showGrade() {
//        System.out.println("Your grade is " + ((mScore * 0.4) + (fScore * 0.4) + 20));
//    }
//
//    public static void main(String[] args) {
//        Main s = new Main();
//        s.mScore = 80;
//        s.fScore = 80;
//        s.showGrade();
//    }
//}
///
//public class Main {
//
//    public int topN;
//    public int btmN;
//
//    public String toFraction() {
//        return (topN + "/" + btmN);
//    }
//
//    public String toFloat() {
//        return ("" + (topN * 1.0 / btmN));
//    }
//
//    public void addFraction(Main f) {
//        if (btmN == f.btmN) {
//            topN = topN + f.topN;
//            btmN = btmN;
//        } else {
//            topN = topN * f.btmN + f.topN * btmN;
//            btmN *= f.btmN;
//        }
//    }
//
//    //Additional
//    public boolean myEquals(Main x) {
//        if (Math.abs((topN * 1.0 / btmN) - (x.topN * 1.0 / x.btmN)) < 0.001) {
//            return true;
//        } else {
//            return false;
//        }
//    }
//
//    //Additional
//    public void LowestTermFrac() {
//
//        // Find the greatest common divisor (GCD) of the numerator and denominator
//        int gcd = 1;
//        for (int i = 1; i <= Math.min(topN, btmN); i++) {
//            if (topN % i == 0 && btmN % i == 0) {
//                gcd = i;
//            }
//        }
//
//        // Divide both the numerator and denominator by the GCD to get the lowest fraction
//        topN /= gcd;
//        btmN /= gcd;
//    }
//    public static void main(String[] args) {
//        Main f1 = new Main();
//        f1.topN = 2;
//        f1.btmN = 5;
//        Main f2 = new Main();
//        f2.topN = 3;
//        f2.btmN = 7;
//        System.out.println("before " + f1.toFraction());
//        System.out.println("before " + f1.toFloat());
//        f1.addFraction(f2);
//        System.out.println("after " + f1.toFraction());
//        System.out.println("after " + f1.toFloat());
//    }
//    public static void main(String[] args) {
//        Main f1 = new Main();
//        f1.topN = 1;
//        f1.btmN = 3;
//
//        Main f2 = new Main();
//        f2.topN = 4;
//        f2.btmN = 16;
//
//        Main f3 = new Main();
//        f3.topN = 5;
//        f3.btmN = 15;
//
//        System.out.println(f1.toFloat());
//        System.out.println(f2.toFloat());
//        System.out.println(f3.toFloat());
//
//        System.out.println("f1 is equal to f2 >> " + f1.myEquals(f2));
//        System.out.println("f1 is equal to f3 >> " + f1.myEquals(f3));
//
//        System.out.println("Before : " + f2.toFraction());
//        f2.LowestTermFrac();
//        System.out.println("After : " + f2.toFraction());
//    
//    }
//}
///
//public class Main {
//
//    private String name;
//    private String color;
//    public double height;
//    public double weight;
//
//    private void setWeight(double w) {
//        if (w > 0) {
//            weight = w;
//        } else {
//            System.out.println("Error");
//        }
//    }
//
//    private void setHeight(double h) {
//        if (h > 0) {
//            height = h;
//        } else {
//            System.out.println("Error");
//        }
//    }
//
//    private void setName(String n) {
//        name = n;
//    }
//
//    private void setColor(String c) {
//        color = c;
//    }
//
//    public void upWeight(double w) {
//        if (w > 0) {
//            setWeight(weight += w);
//        } else {
//            System.out.println("Error");
//        }
//    }
//
//    public void downWeight(double w) {
//        if (w > 0) {
//            setWeight(weight -= w);
//        } else {
//            System.out.println("Error");
//        }
//    }
//
//    public void upHeight(double h) {
//        if (h > 0) {
//            setHeight(height += h);
//        } else {
//            System.out.println("Error");
//        }
//    }
//
//    public void defineCat(String n, String c) {
//        setName(n);
//        setColor(c);
//    }
//
//    public void speak() {
//        System.out.println("Name : " + name + "\nColor : " + color + "\nHeight : " + height + "\nWeight : " + weight);
//    }
//
//    public static void main(String[] args) {
//        Main c = new Main();
//        c.defineCat("Mew", "White");
//        c.speak();
//
//        c.upWeight(5);
//        c.upHeight(10);
//        c.speak();
//
//        c.upWeight(-5);
//        c.upHeight(-10);
//        c.speak();
//    }
//}
public class Main {

    public static void main(String[] args) {
        Customer c = new Customer();
        c.name = "Taravichet";

        MyDate dob = new MyDate();
        dob.day = 8;
        dob.month = 11;
        dob.year = 2023;

        Account acct = new Account();
        acct.name = c.name;
        acct.balance = 500;

        c.DOB = dob;
        c.acct = acct;

        System.out.println("My name is " + c.name + ".");

        c.acct.showInfo();
        c.DOB.showDate();

        c.acct.deposit(500);
        c.acct.showInfo();
        c.acct.withdraw(3000);
        c.acct.showInfo();
    }
}
