package Week10;

import java.awt.*;
import javax.swing.*;

public class TellerGUI {

    JFrame fr;
    JPanel p1, p2, p3, p4;
    JButton b1, b2, b3;
    JTextField txt1, txt2;
    JLabel l1, l2;

    public TellerGUI() {
        fr = new JFrame("Teller GUI");
        b1 = new JButton("Deposit");
        b2 = new JButton("Withdraw");
        b3 = new JButton("Exit");
        l1 = new JLabel("Balance");
        l2 = new JLabel("Amout");
        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
        p4 = new JPanel();
        txt1 = new JTextField();
        txt2 = new JTextField();

        p1.setLayout(new GridLayout(4, 2));
        p1.add(p2);

        p1.add(p3);
        p1.add(p4);

        p2.setLayout(new GridLayout(2, 2));
        p2.add(l1);
        p2.add(txt1);
        p2.add(l2);
        p2.add(txt2);

        p3.setLayout(new FlowLayout());
        p3.add(b1);
        p3.add(b2);
        p3.add(b3);

        fr.add(p1);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(280, 280);
        fr.setVisible(true);

    }

    public static void main(String[] args) {
        new TellerGUI();
    }
}
