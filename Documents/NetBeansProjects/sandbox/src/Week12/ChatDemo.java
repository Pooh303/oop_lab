package Week12;

import java.awt.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.*;

public class ChatDemo {

    private JFrame fr;
    private JButton b1, b2;
    private JTextField txt1;
    private JTextArea a1;
    private JPanel p1;

    public ChatDemo() {
        fr = new JFrame("");
        a1 = new JTextArea(20, 45);
        txt1 = new JTextField(45);
        b1 = new JButton("Submit");
        b2 = new JButton("Reset");
        p1 = new JPanel();

        p1.add(b1);
        p1.add(b2);

        fr.setLayout(new BorderLayout());
        fr.add(a1, BorderLayout.NORTH);
        fr.add(txt1, BorderLayout.CENTER);
        fr.add(p1, BorderLayout.SOUTH);

        fr.pack();
//        fr.setSize(200, 200);
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new ChatDemo();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.print(dtf.format(LocalDateTime.now()));
    }
}
