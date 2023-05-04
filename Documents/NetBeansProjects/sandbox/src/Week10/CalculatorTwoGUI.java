package Week10;

import java.awt.*;
import javax.swing.*;

public class CalculatorTwoGUI {

    JFrame fr;
    JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9;
    JButton o1, o2, o3, o4, clr, eql;
    JTextField txt1;
    JPanel p1, p2;

    public CalculatorTwoGUI() {
        fr = new JFrame("My Calculator");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        o1 = new JButton("+");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        o2 = new JButton("-");
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        o3 = new JButton("x");
        b0 = new JButton("0");
        clr = new JButton("c");
        eql = new JButton("=");
        o4 = new JButton("/");
        txt1 = new JTextField();
        p1 = new JPanel();
        p2 = new JPanel();

        p1.setLayout(new GridLayout(4, 4));
        p1.add(b7);
        p1.add(b8);
        p1.add(b9);
        p1.add(o1);
        p1.add(b4);
        p1.add(b5);
        p1.add(b6);
        p1.add(o2);
        p1.add(b1);
        p1.add(b2);
        p1.add(b3);
        p1.add(o3);
        p1.add(b0);
        p1.add(clr);
        p1.add(eql);
        p1.add(o4);
        p2.setLayout(new BorderLayout());
        p2.add(txt1, BorderLayout.NORTH);
        p2.add(p1);

        fr.add(p2);
        fr.setSize(300, 300);
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new CalculatorTwoGUI();
    }
}
