package Week13;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JFrame;

public class MyFrame {

    public static void main(String[] args) {
        JFrame fr = new JFrame();
        MyClock clock = new MyClock();
        Thread t = new Thread(clock);
        t.start();
        fr.setSize(450, 150);
        clock.setFont(new Font("Arial", Font.BOLD, 100));
        fr.add(clock, BorderLayout.CENTER);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setResizable(false);
        fr.setVisible(true);
    }
}
