package Week11;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class lab1 implements ActionListener {

    private JFrame fr;
    private JPanel p1, p2;
    private JTextField txt1, txt2, txt3;
    private JButton b1, b2, b3, b4;

    public lab1() {
        fr = new JFrame("Calculator");
        p1 = new JPanel();
        p2 = new JPanel();
        txt1 = new JTextField();
        txt2 = new JTextField();
        txt3 = new JTextField();
        b1 = new JButton("+");
        b2 = new JButton("-");
        b3 = new JButton("*");
        b4 = new JButton("/");

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);

        p1.setLayout(new GridLayout(4, 1));
        p1.add(txt1);
        p1.add(txt2);
        p1.add(p2);
        p1.add(txt3);

        p2.setLayout(new FlowLayout());
        p2.add(b1);
        p2.add(b2);
        p2.add(b3);
        p2.add(b4);
        fr.add(p1);

        fr.setFont(new Font("TH SarabunPSK", Font.BOLD, 60));
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.pack();
        fr.setVisible(true);
    }

    public static void main(String[] args) {
        new lab1();
    }

//    public void actionPerformed(ActionEvent ae) {
//        if (ae.getSource().equals(b1)) {
//            System.out.println("b1");
//        } else if (ae.getSource().equals(b2)) {
//            System.out.println("b2");
//        } else if (ae.getSource().equals(b3)) {
//            System.out.println("b3");
//        } else if (ae.getSource().equals(b4)) {
//            System.out.println("b4");
//        }
//    }
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource().equals(b1)) {
            double num1 = Double.parseDouble(txt1.getText());
            double num2 = Double.parseDouble(txt2.getText());
            double result = num1 + num2;
            txt3.setText(Double.toString(result));
        } else if (ae.getSource().equals(b2)) {
            double num1 = Double.parseDouble(txt1.getText());
            double num2 = Double.parseDouble(txt2.getText());
            double result = num1 - num2;
            txt3.setText(Double.toString(result));
        } else if (ae.getSource().equals(b3)) {
            double num1 = Double.parseDouble(txt1.getText());
            double num2 = Double.parseDouble(txt2.getText());
            double result = num1 * num2;
            txt3.setText(Double.toString(result));
        } else if (ae.getSource().equals(b4)) {
            double num1 = Double.parseDouble(txt1.getText());
            double num2 = Double.parseDouble(txt2.getText());
            double result = num1 / num2;
            txt3.setText(Double.toString(result));
        }
    }

}
