package Interface;

import javax.swing.*;

public class GUI extends JFrame {
    private JButton button1;
    private JPanel translate;
    private JLabel textLabel;
    private JButton button2;

    public GUI() {
        setTitle("Guided User Interface (GUI)");
        setContentPane(translate);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        pack();
        setSize(500, 400);
        button1.setVisible(true);
        button2.setVisible(false);
        button1.addActionListener(e -> {
            textLabel.setText("Hallo Welt!");
            button1.setVisible(false);
            button2.setVisible(true);
        });
        button2.addActionListener(e -> {
            textLabel.setText("Hello World!");
            button2.setVisible(false);
            button1.setVisible(true);
        });
    }
}
