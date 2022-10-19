package GUI;

import GUI.CalculationMethonds.Addition;
import GUI.CalculationMethonds.Subtraktion;
import GUI.CalculationMethonds.Multiplikation;
import GUI.CalculationMethonds.Division;
import GUI.CalculationMethonds.Modulo;

import javax.swing.*;

public class Calc extends JFrame {
    private JPanel mainPanel;
    private JButton Addition;
    private JButton Subtraktion;
    private JButton Multiplikation;
    private JButton Divsion;
    private JButton Modulo;

    public Calc() {
        setTitle("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        pack();
        setSize(500, 400);
        setContentPane(mainPanel);
        Addition.addActionListener(e -> new Addition());
        Subtraktion.addActionListener(e -> new Subtraktion());

        Multiplikation.addActionListener(e -> new Multiplikation());

        Divsion.addActionListener(e -> new Division());

        Modulo.addActionListener(e -> new Modulo());
    }
}
