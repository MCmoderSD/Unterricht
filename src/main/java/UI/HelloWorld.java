package UI;

import Functions.JFrameConfig;

import javax.swing.*;

public class HelloWorld extends JFrame {
    private JPanel translate;
    private JLabel tfHelloWorld;
    private JButton bTranslate;

    public HelloWorld() {
        JFrame frame = new JFrame("HelloWorld");
        JFrameConfig.setJFrameConfig(frame, translate, "HelloWorld");
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

    public static void main(String[] args) {
        new HelloWorld();
    }
}
