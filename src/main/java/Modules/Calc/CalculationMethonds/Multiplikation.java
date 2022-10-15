package Modules.Calc.CalculationMethonds;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Multiplikation extends JFrame{

    private JTextField Faktor1;
    private JTextField Faktor2;
    private JButton calculateButton;
    private JLabel Produkt;
    private JPanel mainPanel;

    public Multiplikation() {
        setTitle("Multiplikation");
        setContentPane(mainPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        pack();
        setSize(400, 400);
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int faktor1 = Integer.parseInt(Faktor1.getText());
                int faktor2 = Integer.parseInt(Faktor2.getText());
                int produkt = faktor1 * faktor2;
                Produkt.setText(String.valueOf(produkt));

            }
        });
    }


}
