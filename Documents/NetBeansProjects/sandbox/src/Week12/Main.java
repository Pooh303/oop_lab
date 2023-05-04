package Week12;

//import java.io.*;
public class Main {

//    public static void main(String[] args) {
//        String str = "Hi, Pooh. \nYour code is working.";
//        String txt = "May be this work.";
//        String txt2 = "WithOut-try-with-resources.";
//
//        File f = new File("test.txt");
//
//        if (f.exists()) {
//            System.out.println("wow");
//        } else {
//            System.out.println("sad");
//        }
    ///try-with-resources
//        try (FileOutputStream fout = new FileOutputStream("test.txt");) {
//            for (int i = 0; i < str.length(); i++) {
//                fout.write(str.charAt(i));
//            }
//            System.out.println("Done it");
//        } catch (IOException e) {
//            System.out.println(e);
//        }
    ///try-with-resources
//        try (FileWriter fout = new FileWriter("test.txt");) {
//            fout.write(txt);
//            System.out.println("Done it");
//        } catch (IOException e) {
//            System.out.println(e);
//        }
    //withOut-try-with-resources
//        try {
//            FileWriter fw = new FileWriter("test.txt");
//
//            for (int i = 0; i < txt2.length(); i++) {
//                fw.write(txt2.charAt(i));
//            }
////            fw.write(txt2);
//            fw.close();
//        } catch (IOException e) {
//            System.out.print(e);
//        }
//        try {
//            int ch;
//            FileReader fr = new FileReader("test.txt");
//
//            while ((ch = fr.read()) != -1) {
//                System.out.print((char) ch);
//            }
//            fr.close();
//        } catch (IOException ex) {
//            ex.printStackTrace();
//        }
//    }
    public static void main(String[] args) {
//        new ChatDemoController();
        new StudentController();

    }
}
