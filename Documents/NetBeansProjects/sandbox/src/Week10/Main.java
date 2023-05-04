package Week10;

//import java.util.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import javax.swing.*;

public class Main {

//    public static void main(String[] args) {
//        JFrame f = new JFrame("Title");
//        JFrame s = new JFrame("Hello");
//        JPanel p = new JPanel();
//        JButton b1 = new JButton("press me");
//        JButton b2 = new JButton("Button2");
//        JLabel l = new JLabel("Hey yo!");
//
//        //Step 2
//        f.setSize(500, 200);
//        s.setSize(500, 200);
//        f.setLocation(500, 500);
//        s.setBounds(700, 500, 500, 500);
//        s.setResizable(false);
//
//        //step3
//        p.add(b1);
//        p.add(b2);
//        f.add(p);
//        f.add(l);
//        s.add(p);
//
//        f.setVisible(true);
//        s.setVisible(true);
////        s.pack();
//        s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//    }
    private JFrame fr;
    private JButton b1, b2, b3, b4, b5;

    public Main() {
        fr = new JFrame("Button");
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        b1 = new JButton("B1");
        b2 = new JButton("B2");
        b2.setMnemonic(KeyEvent.VK_D);
        b2.setToolTipText("Click B2 Here");
        b3 = new JButton("B3");
        b4 = new JButton("B4");
        b5 = new JButton("B5");

        fr.setLayout(new GridLayout(5, 1));
        fr.add(b1, BorderLayout.NORTH);
        fr.add(b2, BorderLayout.SOUTH);
        fr.add(b3, BorderLayout.EAST);
        fr.add(b4, BorderLayout.WEST);
        fr.add(b5);

        fr.setVisible(true);
        fr.setSize(200, 150);
    }

    public static void main(String[] args) {
        Main m = new Main();
    }
}
