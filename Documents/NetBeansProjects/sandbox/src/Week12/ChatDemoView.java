package Week12;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class ChatDemoView {

    private JFrame fream;
    private JTextField chatbox;
    private JTextArea console;
    private JButton btn1, btn2;
    private JPanel panel1;

    public ChatDemoView() {
        fream = new JFrame("ChatDemo");
        chatbox = new JTextField(45);
        console = new JTextArea(20, 45);
        btn1 = new JButton("Submit");
        btn2 = new JButton("Reset");

        panel1 = new JPanel();

        panel1.add(btn1);
        panel1.add(btn2);

        console.setEditable(false);

        fream.add(console, BorderLayout.NORTH);
        fream.add(chatbox, BorderLayout.CENTER);
        fream.add(panel1, BorderLayout.SOUTH);

        fream.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        fream.pack();
        fream.setVisible(true);
    }

    public JFrame getFream() {
        return fream;
    }

    public void setFream(JFrame fream) {
        this.fream = fream;
    }

    public JTextField getChatbox() {
        return chatbox;
    }

    public void setChatbox(JTextField chatbox) {
        this.chatbox = chatbox;
    }

    public JTextArea getConsole() {
        return console;
    }

    public void setConsole(JTextArea console) {
        this.console = console;
    }

    public JButton getBtn1() {
        return btn1;
    }

    public void setBtn1(JButton btn1) {
        this.btn1 = btn1;
    }

    public JButton getBtn2() {
        return btn2;
    }

    public void setBtn2(JButton btn2) {
        this.btn2 = btn2;
    }

    public JPanel getPanel1() {
        return panel1;
    }

    public void setPanel1(JPanel panel1) {
        this.panel1 = panel1;
    }

}
