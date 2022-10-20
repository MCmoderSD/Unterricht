package GUI;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Calculator extends JFrame {
    private JPanel mainPanel;
    private JButton Addition;
    private JTextField Number1;
    private JTextField Number2;
    private JButton Subtraktion;
    private JButton Multiplikation;
    private JButton Division;
    private JButton Modulo;
    public Calculator() {
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(500, 400);
        Addition.addActionListener(e -> {
        if (Number1.getText().isEmpty() || Number2.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please fill in all the fields");
        } else {
            if (Number1.getText().matches("[0-9]+") && Number2.getText().matches("[0-9]+")) {
                double number1 = Double.parseDouble(Number1.getText());
                double number2 = Double.parseDouble(Number2.getText());
                double result = number1 + number2;
                JOptionPane.showMessageDialog(null, "Result: " + result);
            } else {
                JOptionPane.showMessageDialog(null, "Please enter a number");
            }
            }
        });
        Subtraktion.addActionListener(e -> {
            if (Number1.getText().isEmpty() || Number2.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please fill in all the fields");
            } else {
                if (Number1.getText().matches("[0-9]+") && Number2.getText().matches("[0-9]+")) {
                    double number1 = Double.parseDouble(Number1.getText());
                    double number2 = Double.parseDouble(Number2.getText());
                    double result = number1 - number2;
                    JOptionPane.showMessageDialog(null, "Result: " + result);
                } else {
                    JOptionPane.showMessageDialog(null, "Please enter a number");
                }
            }
        });
        Multiplikation.addActionListener(e -> {
            if (Number1.getText().isEmpty() || Number2.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please fill in all the fields");
            } else {
                if (Number1.getText().matches("[0-9]+") && Number2.getText().matches("[0-9]+")) {
                    double number1 = Double.parseDouble(Number1.getText());
                    double number2 = Double.parseDouble(Number2.getText());
                    double result = number1 * number2;
                    JOptionPane.showMessageDialog(null, "Result: " + result);
                } else {
                    JOptionPane.showMessageDialog(null, "Please enter a number");
                }
            }
        });
        Division.addActionListener(e -> {
            if (Number1.getText().isEmpty() || Number2.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please fill in all the fields");
            } else {
                if (Number1.getText().matches("[0-9]+") && Number2.getText().matches("[0-9]+") && Number2.getText().equals(">0")) {
                    double number1 = Double.parseDouble(Number1.getText());
                    double number2 = Double.parseDouble(Number2.getText());
                    double result = number1 / number2;
                    JOptionPane.showMessageDialog(null, "Result: " + result);
                } else {
                    JOptionPane.showMessageDialog(null, "Please enter a valid number");
                }
            }
        });
        Modulo.addActionListener(e -> {
            if (Number1.getText().isEmpty() || Number2.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please fill in all the fields");
            } else {
                if (Number1.getText().matches("[0-9]+") && Number2.getText().matches("[0-9]+") && Number2.getText().equals(">0")) {
                    double number1 = Double.parseDouble(Number1.getText());
                    double number2 = Double.parseDouble(Number2.getText());
                    double result = number1 % number2;
                    JOptionPane.showMessageDialog(null, "Result: " + result);
                } else {
                    JOptionPane.showMessageDialog(null, "Please enter a valid number");
                }
            }
        });
        Number1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (c== ',')
                    e.setKeyChar('.');
            }
        });
        Number2.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (c== ',')
                    e.setKeyChar('.');
            }
        });
    }
}
