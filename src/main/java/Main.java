import GUI.Calculator;
import GUI.GUI;
import GUI.Spammer.Spammer;
import GUI.shutdown;

import javax.swing.*;

public class Main extends JFrame {
    private JPanel mainPanel;
    private JButton Translate;
    private JButton Calculator;
    private JButton shutdown;
    private JButton Spammer;

    public Main(){
        setTitle("Unterricht");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        pack();
        setSize(500, 400);
        setContentPane(mainPanel);

        Translate.addActionListener(e -> new GUI());
        Calculator.addActionListener(e -> new Calculator());
        shutdown.addActionListener(e -> new shutdown());
        Spammer.addActionListener(e -> new Spammer());
    }

    public static void main(String[] args) {
        new Main();
    }
}
