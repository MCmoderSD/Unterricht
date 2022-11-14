package Interface;

import javax.swing.*;

public class Calculator {
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

        bCalculate.addActionListener(e -> {
            if (tfNumber1.getText().isEmpty() || tfNumber2.getText().isEmpty() || tfOperator.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please fill in all fields");
            } else {

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
            }
        });
    }
}
