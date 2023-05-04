package Week13;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Poring {

    private PoringWorker worker;
    private JFrame frame;
    private JLabel label;

    public Poring(int countable) {
        frame = new JFrame();
        frame.setLayout(new FlowLayout());
        worker = new PoringWorker(frame);
        label = new JLabel(new ImageIcon("mon.gif"));
        label.setText(countable + "");
        frame.add(label);
        Thread thread = new Thread(worker);
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
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation((int) (Math.random() * (dimension.getWidth() - frame.getWidth())), (int) (Math.random() * (dimension.getHeight() - frame.getHeight())));
        frame.pack();
        frame.setVisible(true);
        thread.start();
    }

}
