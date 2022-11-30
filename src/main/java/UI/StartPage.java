package UI;

import javax.swing.*;

public class StartPage {
    private JButton bCalculator;
    private JPanel mainPanel;
    private JButton bShutdown;
    private JButton bSpammer;
    private JButton bHelloWorld;
    private JButton bWuerfelspiel;

    public StartPage() {
        JFrame frame = new JFrame("Starter");
        frame.setContentPane(mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);


        bCalculator.addActionListener(e -> {
            new Calculator();
            frame.dispose();
        });
        bShutdown.addActionListener(e -> {
            new Shutdown();
            frame.dispose();
        });
        bSpammer.addActionListener(e -> {
            new Spammer();
            frame.dispose();
        });
        bHelloWorld.addActionListener(e -> {
            new HelloWorld();
            frame.dispose();
        });
        bWuerfelspiel.addActionListener(e -> {
            new Wuerfelspiel();
            frame.dispose();
        });
    }
}
