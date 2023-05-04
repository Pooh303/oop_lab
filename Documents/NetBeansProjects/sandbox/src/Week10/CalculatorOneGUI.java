package Week10;

import java.awt.*;
import javax.swing.*;

public class CalculatorOneGUI {

    JFrame fr;
    JTextField txt1, txt2, txt3;
    JPanel p1, p2;
    JButton b1, b2, b3, b4;

    public CalculatorOneGUI() {
        fr = new JFrame("Calculator");
        b1 = new JButton("sum");
        b2 = new JButton("subtract");
        b3 = new JButton("multiple");
        b4 = new JButton("devide");
        txt1 = new JTextField();
        txt2 = new JTextField();
        txt3 = new JTextField();
        p1 = new JPanel();
        p2 = new JPanel();

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
        fr.pack();
        fr.setVisible(true);
    }

    public static void main(String[] args) {
        new CalculatorOneGUI();
    }
}
