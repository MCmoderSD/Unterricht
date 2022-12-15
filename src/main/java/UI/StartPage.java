package UI;

import Functions.JFrameConfig;

import javax.swing.*;

public class StartPage {
    private JButton bCalculator;
    private JPanel mainPanel;
    private JButton bShutdown;
    private JButton bSpammer;
    private JButton bHelloWorld;
    private JButton bWuerfelspiel;
    private JButton bOddOrEven;

    public StartPage() {
        JFrame frame = new JFrame("StartPage");
        JFrameConfig.setJFrameConfig(frame, mainPanel, "Startseite");
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
        bOddOrEven.addActionListener(e -> {
            new OddOrEven();
            frame.dispose();
        });
    }

    public static void main(String[] args) {
        new StartPage();
    }
}
