package Interface;

import javax.swing.*;

public class StartPage {
    private JButton bCalculator;
    private JPanel panel1;
    private JButton bShutdown;
    private JButton bSpammer;
    private JButton bHelloWorld;

    public StartPage() {
        JFrame frame = new JFrame("Starter");
        frame.setContentPane(panel1);
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
    }
}
