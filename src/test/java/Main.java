import Interface.Calculator;
import Interface.GUI;
import Interface.Spammer.Spammer;
import Interface.shutdown;

import javax.swing.*;

public class Main extends JFrame {
    private JPanel mainPanel;
    private JButton Translate;
    private JButton Calculator;
    private JButton shutdown;
    private JButton Spammer;
    private JButton console;

    public Main() {
        setTitle("Unterricht");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        pack();
        setSize(500, 400);
        setContentPane(mainPanel);
        console.setVisible(false);

        Translate.addActionListener(e -> new GUI());
        Calculator.addActionListener(e -> new Calculator());
        shutdown.addActionListener(e -> new shutdown());
        Spammer.addActionListener(e -> new Spammer());
        console.addActionListener(e -> new Console.Main());
    }

    public static void main(String[] args) {
        new Main();
    }
}
