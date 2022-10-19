package GUI.CalculationMethonds;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

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
        setSize(500, 400);
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double faktor1 = Double.parseDouble(Faktor1.getText());
                double faktor2 = Double.parseDouble(Faktor2.getText());
                double produkt = faktor1 * faktor2;
                Produkt.setText(String.valueOf(produkt));

                Faktor1.addKeyListener(new KeyAdapter() {
                    @Override
                    public void keyTyped(KeyEvent e) {
                        char c = e.getKeyChar();
                        if (c== ',')
                            e.setKeyChar('.');
                    }
                });

                Faktor2.addKeyListener(new KeyAdapter() {
                    @Override
                    public void keyTyped(KeyEvent e) {
                        char c = e.getKeyChar();
                        if (c== ',')
                            e.setKeyChar('.');
                    }
                });

            }
        });
    }


}
