package Modules.Calc.CalculationMethonds;

import com.sun.xml.internal.bind.v2.model.annotation.Quick;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputMethodEvent;


public class Division extends JFrame {
    private JPanel mainPanel;
    private JTextField Dividend;
    private JTextField Divisor;
    private JButton calculateButton;
    private JLabel Quotient;

    private void DividendMouseClicked(InputMethodEvent e) {
        if(e.getSource() == Dividend){
            int dividend = Integer.parseInt(Dividend.getText());
        }
    }
    private void DivisorMouseClicked(InputMethodEvent e) {
        if(e.getSource() == Divisor){
            int divisor = Integer.parseInt(Divisor.getText());
        }
    }

    public Division() {
        setTitle("Division");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        pack();
        setContentPane(mainPanel);
        setSize(400, 400);
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Quotient.setText(String.valueOf(Integer.parseInt(Dividend.getText()) / Integer.parseInt(Divisor.getText())));
            }
        });
    }
}
