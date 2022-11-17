package Interface;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Calculator extends JFrame {
    boolean isNew = true;
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
                if (c == '0' || c == '1' || c == '2' || c == '3' || c == '4' || c == '5' || c == '6' || c == '7' || c == '8' || c == '9' || c == '.' || c == ',' || c == '-') {
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
                if (c == '0' || c == '1' || c == '2' || c == '3' || c == '4' || c == '5' || c == '6' || c == '7' || c == '8' || c == '9' || c == '.' || c == ',' || c == '-') {
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
                char[] operators = {'+', '-', '*', '/', '%'};
                if (c == operators[0] || c == operators[1] || c == operators[2] || c == operators[3] || c == operators[4]) {
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
