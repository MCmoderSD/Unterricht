package Interface;

import javax.swing.*;

public class HelloWorld extends JFrame {
    private JPanel translate;
    private JLabel tfHelloWorld;
    private JButton bTranslate;

    public HelloWorld() {
        setTitle("Graphical User Interface (GUI)");
        setContentPane(translate);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        pack();
        bTranslate.setVisible(true);
        bTranslate.addActionListener(e -> {
            if (bTranslate.getText().equals("Translate")) {
                tfHelloWorld.setText("Hello World");
                bTranslate.setText("Übersetzen");
            } else {
                tfHelloWorld.setText("Hallo Welt");
                bTranslate.setText("Translate");
            }
        });
    }
}
