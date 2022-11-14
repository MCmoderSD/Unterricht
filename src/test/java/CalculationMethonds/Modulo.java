package CalculationMethonds;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Modulo extends JFrame {
    private JPanel mainPanel;
    private JTextField Dividend;
    private JTextField Divisor;
    private JButton calculateButton;
    private JLabel Modulo;

    public Modulo() {
        super("Modulo");
        setContentPane(mainPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setSize(500, 400);
        setVisible(true);

        calculateButton.addActionListener(e -> {
            double dividend = Integer.parseInt(Dividend.getText());
            double divisor = Integer.parseInt(Divisor.getText());
            double modulo = dividend % divisor;
            Modulo.setText(String.valueOf(modulo));
        });

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
