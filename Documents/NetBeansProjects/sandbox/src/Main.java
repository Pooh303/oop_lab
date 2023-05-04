
import javax.swing.JOptionPane;
import java.awt.Font;

public class Main {

    public static void main(String[] args) {

        // Set the font for the JOptionPane
        Font font = new Font("Arial", Font.PLAIN, 18);

        // Show a message dialog with custom font
        JOptionPane.showMessageDialog(null, "Hello World!", "Message", JOptionPane.PLAIN_MESSAGE);

        // Show an input dialog with custom font
        String input = JOptionPane.showInputDialog(null, "Enter your name:", "Input", JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Hello, " + input + "!", "Message", JOptionPane.PLAIN_MESSAGE);
    }
}
