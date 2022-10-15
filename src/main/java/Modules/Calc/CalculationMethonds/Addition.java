package Modules.Calc.CalculationMethonds;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputMethodEvent;
import java.awt.event.InputMethodListener;

public class Addition extends JFrame {
    private JPanel mainPanel;
    private JTextField Summand1;
    private JTextField Summand2;
    private JButton calculateButton;
    private JLabel Summe;

    private void Summand1MouseClicked(InputMethodEvent e) {
        if(e.getSource() == Summand1){
            int summand1 = Integer.parseInt(Summand1.getText());
        }
    }

    private void Summand2MouseClicked(InputMethodEvent e) {
        if(e.getSource() == Summand2){
            int summand2 = Integer.parseInt(Summand2.getText());
        }
    }


    public Addition() {
        setTitle("Addition");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        pack();
        setSize(400, 400);
        setContentPane(mainPanel);
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Summe.setText(String.valueOf(Integer.parseInt(Summand1.getText()) + Integer.parseInt(Summand2.getText())));
            }
        });
    }
}
