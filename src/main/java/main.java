import Modules.Calc.Calc;
import Modules.Calc.GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class main extends JFrame {
    private JButton Translate;
    private JButton Calc;
    private JPanel mainPanel;

    public main(){
        setTitle("Unterricht");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        pack();
        setSize(400, 400);
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
    }

    public static void main(String[] args) {
        main main = new main();
    }
}
