
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;
import java.awt.Color;

public class Mypanel extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        g2.setColor(new Color(255, 0, 0));
        g2.fillRect(10, 10, 200, 50);
        g2.setColor(new Color(0, 0, 0));
        g2.drawString("Hello World", 10, 10);
    }

}
