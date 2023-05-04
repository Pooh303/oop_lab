package Week13;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JFrame;

public class Timer {

    public static boolean isPaused = false;

    public static void main(String[] args) {
        JFrame fr = new JFrame();
        MyTimer clock = new MyTimer();
        Thread thread = new Thread(clock);
        thread.start();
        clock.setFont(new Font("Arial", Font.BOLD, 100));
        fr.setSize(450, 150);
        fr.add(clock, BorderLayout.NORTH);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setResizable(false);
        fr.setVisible(true);
    }

}
