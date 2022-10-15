package Modules.Calc;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
        setSize(400, 400);
        button1.setVisible(true);
        button2.setVisible(false);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textLabel.setText("Hallo Welt!");
                button1.setVisible(false);
                button2.setVisible(true);
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textLabel.setText("Hello World!");
                button2.setVisible(false);
                button1.setVisible(true);
            }
        });
    }

    public static void main(String[] args) {
        GUI gui = new GUI();
    }
}
