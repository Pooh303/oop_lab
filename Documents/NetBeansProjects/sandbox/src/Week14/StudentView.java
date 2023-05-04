package Week14;

public class StudentView {

    public void printDetails(String studentName, String studentRollNo) {
        System.out.println("Student ");
        System.out.println("Name: " + studentName);
        System.out.println("Roll No:" + studentRollNo);
    }
}

//import java.awt.*;
//import javax.swing.*;
//
//public class StudentView {
//
//    private JFrame fr;
//    private JLabel lb1, lb2, lb3, lb4;
//    private JButton bt1;
//    private JTextField txt1, txt2, txt3, txt4;
//
//    public StudentView() {
//        fr = new JFrame();
//        lb1 = new JLabel("Student ID");
//        lb2 = new JLabel("Student Name");
//        lb3 = new JLabel("Student GPA");
//        lb4 = new JLabel("");
//
//        bt1 = new JButton("Update");
//
//        txt1 = new JTextField("", 50);
//        txt2 = new JTextField("", 50);
//        txt3 = new JTextField("", 50);
//
//        fr.setLayout(new FlowLayout());
//        fr.add(lb1);
//        fr.add(txt1);
//        fr.add(lb2);
//        fr.add(txt2);
//        fr.add(lb3);
//        fr.add(txt3);
//        fr.add(bt1);
//        fr.add(lb4);
//
//        fr.setSize(600, 250);
//        fr.setVisible(true);
//        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//    }
//    public void setData(String i, String n, String g){
//        dataStudent = s;
//        txt1.setText(i);
//        txt1.setText(n);
//        txt1.setText(g);
//    }
//}
