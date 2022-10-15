package Modules.Calc.CalculationMethonds;

import javax.swing.*;

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
        setSize(400, 400);
        setVisible(true);

        calculateButton.addActionListener(e -> {
            int dividend = Integer.parseInt(Dividend.getText());
            int divisor = Integer.parseInt(Divisor.getText());
            int modulo = dividend % divisor;
            Modulo.setText(String.valueOf(modulo));
        });


    }
}
