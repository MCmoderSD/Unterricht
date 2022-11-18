package UI;

import Functions.DoesContain;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Calculator extends JFrame {
    boolean isNew = true;
    char[] allowed = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '.', ',', '-'};
    char[] operators = {'+', '-', '*', '/', '%'};

    private JPanel mainPanel;
    private JTextField tfNumber1;
    private JTextField tfNumber2;
    private JTextField tfOperator;
    private JTextField tfOutput;
    private JButton bCalculate;

    public Calculator() {
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        tfNumber1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (DoesContain.contains(allowed, c)) {
                    e.setKeyChar(c);
                    if (c == ',')
                        e.setKeyChar('.');
                } else {
                    e.consume();
                }
            }

        });

        tfNumber2.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (DoesContain.contains(allowed, c)) {
                    e.setKeyChar(c);
                    if (c == ',')
                        e.setKeyChar('.');
                } else {
                    e.consume();
                }
            }
        });

        tfOperator.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (DoesContain.contains(operators, c)) {
                    e.setKeyChar(c);
                } else {
                    e.consume();
                }
            }

        });
        tfOutput.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                e.consume();
            }
        });

        bCalculate.addActionListener(e -> {
            if (tfNumber1.getText().isEmpty() || tfNumber2.getText().isEmpty() || tfOperator.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please fill in all fields");
            } else {
                if (!isNew) {
                    tfNumber1.setText("");
                    tfNumber2.setText("");
                    tfOperator.setText("");
                    tfOutput.setText("");
                    isNew = true;
                } else {
                    try {
                        double number1 = Double.parseDouble(tfNumber1.getText());
                        double number2 = Double.parseDouble(tfNumber2.getText());
                        char operator = tfOperator.getText().charAt(0);

                        switch (operator) {
                            case '+':
                                tfOutput.setText(String.valueOf(number1 + number2));
                                break;
                            case '-':
                                tfOutput.setText(String.valueOf(number1 - number2));
                                break;
                            case '*':
                                tfOutput.setText(String.valueOf(number1 * number2));
                                break;
                            case '/':
                                tfOutput.setText(String.valueOf(number1 / number2));
                                break;
                            case '%':
                                tfOutput.setText(String.valueOf(number1 % number2));
                                break;

                            default:
                                tfOutput.setText("Invalid Operator");
                        }
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, "Error at: " + ex.getMessage());
                    }
                }
                isNew = !isNew;
            }
        });
    }
}
