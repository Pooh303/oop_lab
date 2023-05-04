package Week10;

import java.awt.*;
import javax.swing.*;

public class MDISample extends JFrame {

    private JMenuBar mb;
    private JMenu m1, m2, m3, mN;
    private JMenuItem mi1, mi2, mi3, mi4, miW, miM;
    private JDesktopPane desktopPane;
    private JInternalFrame frame1, frame2, frame3;

    public MDISample() {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (Exception e) {
            e.printStackTrace();
        }

        mb = new JMenuBar();
        m1 = new JMenu("File");
        m2 = new JMenu("Edit");
        m3 = new JMenu("View");
        mN = new JMenu("New");
        mi2 = new JMenuItem("Open");
        mi3 = new JMenuItem("Save");
        mi4 = new JMenuItem("Exit");
        miW = new JMenuItem("Window");
        miM = new JMenuItem("Message");

        mb.add(m1);
        mb.add(m2);
        mb.add(m3);
        m1.add(mN);
        m1.add(mi2);
        m1.addSeparator();
        m1.add(mi3);
        m1.addSeparator();
        m1.add(mi4);
        mN.add(miW);
        mN.addSeparator();
        mN.add(miM);

        desktopPane = new JDesktopPane();

        frame1 = new JInternalFrame("Application 01", true, true, true, true);
        frame2 = new JInternalFrame("Application 02", true, true, true, true);
        frame3 = new JInternalFrame("Application 03", true, true, true, true);

//        frame1.getContentPane().add(new JLabel("Frame 1 contents . . ."));
        frame1.setSize(220, 195);
        frame1.setLocation(30, 300);
        frame1.setVisible(true);

//        frame2.getContentPane().add(new JLabel("Frame 2 contents . . ."));
        frame2.setSize(220, 195);
        frame2.setVisible(true);

        int x2 = frame1.getX() + frame1.getWidth() - 60;
        int y2 = frame1.getY() - frame1.getWidth() - 15;
        frame2.setLocation(x2, y2);

        frame3.setSize(300, 200);
        frame3.setVisible(true);
        frame3.setLocation(x2 * 3 - 130, y2 + 170);

        desktopPane.add(frame1);
        desktopPane.add(frame2);
        desktopPane.add(frame3);

        this.setTitle("SubMenuItem Demo");
        this.setJMenuBar(mb);
        this.add(desktopPane, BorderLayout.CENTER);
        this.setMinimumSize(new Dimension(500, 500));
        this.setSize(800, 600);
//        this.pack();
        this.setVisible(true);
//        this.setExtendedState(this.MAXIMIZED_BOTH);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        MDISample frame = new MDISample();
    }

}
