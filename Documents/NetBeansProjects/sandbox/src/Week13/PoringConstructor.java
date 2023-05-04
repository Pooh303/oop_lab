package Week13;

import java.awt.FlowLayout;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;

public class PoringConstructor {

    private ArrayList<Poring> poring;
    private JFrame frame;
    private JButton add;

    public PoringConstructor() {
        frame = new JFrame();
        poring = new ArrayList<>();
        frame.setLayout(new FlowLayout());
        add = new JButton("Add");
        add.addActionListener(e -> {
            poring.add(new Poring(poring.size() + 1));
        });
        frame.add(add);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(1000, 500, 180, 80);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new PoringConstructor();

    }

}
