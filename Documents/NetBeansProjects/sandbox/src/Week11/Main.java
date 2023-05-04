package Week11;

import java.awt.FlowLayout;
import javax.swing.*;

public class Main {

    public Main() {
        JFrame fr = new JFrame("Outer Class Event");
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton b1 = new JButton("Exit");
        fr.setLayout(new FlowLayout());
        b1.addActionListener(new ActionHandler());
        fr.add(b1);
        fr.setSize(200, 200);
        fr.setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }
}
