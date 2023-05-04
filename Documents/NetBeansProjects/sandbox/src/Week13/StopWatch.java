package Week13;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

public class StopWatch {

    public static boolean isPaused = false;

    public static void main(String[] args) {
        JFrame fr = new JFrame();
        MyTimer clock = new MyTimer();
        Thread thread = new Thread(clock);
        thread.start();
        clock.setFont(new Font("Arial", Font.BOLD, 100));
        fr.setSize(450, 150);
        fr.addMouseListener(new MouseListener() {

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseClicked(MouseEvent e) {
                isPaused = !isPaused;
                if (isPaused) {
                    clock.pauseThread();
                } else {
                    clock.resumeThread();
                }
            }
        });
        fr.add(clock, BorderLayout.NORTH);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setResizable(false);
        fr.setVisible(true);
    }

}
