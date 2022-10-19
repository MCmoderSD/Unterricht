package GUI.CalculationMethonds;

import jdk.internal.org.objectweb.asm.tree.analysis.Value;

import javax.swing.*;
import java.awt.event.*;

public class Addition extends JFrame {
    private JPanel mainPanel;
    private JTextField Summand1;
    private JTextField Summand2;
    private JButton calculateButton;
    private JLabel Summe;


    public Addition() {
        setTitle("Addition");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        pack();
        setSize(500, 400);
        setContentPane(mainPanel);
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Summe.setText(String.valueOf(Double.parseDouble(Summand1.getText()) + Double.parseDouble(Summand2.getText())));
                System.out.println(String.valueOf(Double.parseDouble(Summand1.getText()) + Double.parseDouble(Summand2.getText())));
            }
        });
        Summand1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (c== ',')
                    e.setKeyChar('.');
            }
        });

        Summand2.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (c== ',')
                    e.setKeyChar('.');
            }
        });
    }
}
