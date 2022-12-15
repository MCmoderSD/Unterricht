package UI;

import Functions.JFrameConfig;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class OddOrEven extends JFrame {
    private JTextField tfInput;
    private JPanel mainPanel;
    private JButton bCheck;
    private JLabel lOutput;

    public OddOrEven() {
        JFrame frame = new JFrame("OddOrEven");
        JFrameConfig.setJFrameConfig(frame, mainPanel, "OddOrEven");
        pack();
        frame.setSize(380, 280);
        bCheck.addActionListener(e -> {
            int iInput = Integer.parseInt(tfInput.getText());
            if (isEven(iInput)) {
                lOutput.setText(iInput + " is Even");
            } else {
                lOutput.setText(iInput + " is Odd");
            }
        });

        tfInput.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (c < '0' || c > '9') {
                    e.consume();
                }
            }
        });
    }

    public static void main(String[] args) {
        new OddOrEven();
    }

    private boolean isEven(int pInput) {
        return pInput % 2 == 0;
    }

}
