package Modules.Calc.CalculationMethonds;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputMethodEvent;

public class Subtraktion extends JFrame {
    private JTextField Minuend;
    private JTextField Subtrahend;
    private JButton calculateButton;
    private JLabel Differenz;
    private JPanel mainPanel;

    private void MinuendMouseClicked(InputMethodEvent e) {
        if(e.getSource() == Minuend){
            int minuend = Integer.parseInt(Minuend.getText());
        }
    }

    private void SubtrahendMouseClicked(InputMethodEvent e) {
        if(e.getSource() == Subtrahend){
            int subtrahend = Integer.parseInt(Subtrahend.getText());
        }
    }

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
                Differenz.setText(String.valueOf(Integer.parseInt(Minuend.getText()) - Integer.parseInt(Subtrahend.getText())));
            }
        });
    }

}
