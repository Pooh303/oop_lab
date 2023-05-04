
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyMap extends JPanel implements KeyListener {

    public int px = 0, py = 0;

    public static void main(String[] args) {
        MyMap p = new MyMap();
        JFrame fr = new JFrame();
        fr.setSize(700, 700);
        fr.add(p);
        fr.addKeyListener(p);
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void paintComponent(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, 700, 700);
        Image img = new ImageIcon("p1.gif").getImage();
        g.drawImage(img, this.px, this.py, this);
    }

    public void keyTyped(KeyEvent ke) {
    }

    public void keyPressed(KeyEvent ke) {
        if (ke.getKeyCode() == 37) {
            this.px -= 10;
        } else if (ke.getKeyCode() == 38) {
            this.py -= 10;
        } else if (ke.getKeyCode() == 39) {
            this.px += 10;
        } else if (ke.getKeyCode() == 40) {
            this.py += 10;
        }
        repaint();
    }

    public void keyReleased(KeyEvent ke) {
    }

}
