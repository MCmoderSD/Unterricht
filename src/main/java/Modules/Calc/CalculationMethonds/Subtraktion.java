package Modules.Calc.CalculationMethonds;

import javax.swing.*;
import java.awt.event.*;

public class Subtraktion extends JFrame {
    private JTextField Minuend;
    private JTextField Subtrahend;
    private JButton calculateButton;
    private JLabel Differenz;
    private JPanel mainPanel;

    public Subtraktion() {
        setTitle("Subtraktion");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        pack();
        setSize(400, 400);
        setContentPane(mainPanel);
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Differenz.setText(String.valueOf(Double.parseDouble(Minuend.getText()) - Double.parseDouble(Subtrahend.getText())));
            }
        });
        Minuend.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (c== ',')
                    e.setKeyChar('.');
            }
        });

        Subtrahend.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (c== ',')
                    e.setKeyChar('.');
            }
        });
    }

}
