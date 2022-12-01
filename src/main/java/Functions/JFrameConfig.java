package Functions;

import javax.swing.*;

public class JFrameConfig {
    public static void setJFrameConfig(JFrame frame, JPanel panel, String title) {
        frame.setContentPane(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setTitle(title);
    }
}
