import GUI.Calc;
import GUI.GUI;
import GUI.Spammer.Spammer;
import GUI.shutdown;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class main extends JFrame {
    private JButton Translate;
    private JButton Calc;
    private JPanel mainPanel;
    private JButton shutdown;
    private JButton Spammer;

    public main(){
        setTitle("Unterricht");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        pack();
        setSize(500, 400);
        setContentPane(mainPanel);

        Translate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GUI gui = new GUI();
            }
        });
        Calc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Calc calc = new Calc();
            }
        });
        shutdown.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                shutdown shutdown = new shutdown();
            }
        });
        Spammer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Spammer spammer = new Spammer();
            }
        });
    }

    public static void main(String[] args) {
        main main = new main();
    }
}
