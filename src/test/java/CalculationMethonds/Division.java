package CalculationMethonds;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


public class Division extends JFrame {
    private JPanel mainPanel;
    private JTextField Dividend;
    private JTextField Divisor;
    private JButton calculateButton;
    private JLabel Quotient;


    public Division() {
        setTitle("Division");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        pack();
        setContentPane(mainPanel);
        setSize(500, 400);
        calculateButton.addActionListener(e -> Quotient.setText(String.valueOf(Double.parseDouble(Dividend.getText()) / Double.parseDouble(Divisor.getText()))));
        Dividend.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (c == ',')
                    e.setKeyChar('.');
            }
        });

        Divisor.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (c == ',')
                    e.setKeyChar('.');
            }
        });

    }
}
