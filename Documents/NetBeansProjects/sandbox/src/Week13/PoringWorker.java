package Week13;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;

public class PoringWorker implements Runnable {

    private JFrame frame;

    public PoringWorker(JFrame frame) {
        this.frame = frame;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            int xDirection = Math.random() <= 0.5 ? 1 : -1;
            int yDirection = Math.random() <= 0.5 ? 1 : -1;
            frame.setLocation(frame.getX() + (2 * xDirection), frame.getY() + (2 * yDirection));
            frame.setExtendedState(JFrame.NORMAL);
            frame.setResizable(false);
            frame.addMouseListener(new MouseListener() {

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
                    frame.dispose();
                }
            });
        }
    }

}
