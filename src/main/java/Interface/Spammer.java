package Interface;

import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class Spammer extends JFrame {

    private JButton bStartButton;
    private JTextField tfDelayToStart;
    private JPanel mainPanel;
    private JTextField tfNumberOfSpamms;
    private JTextField tfDelayBetweenSpamms;
    private JTextField tfMessageField;


    public Spammer() {
        KeyboardFocusManager.getCurrentKeyboardFocusManager()
                .addKeyEventDispatcher(e -> {
                    if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
                        System.exit(0);
                    }
                    return false;
                });
        Window();
        bStartButton.addActionListener(e -> {
            if (tfNumberOfSpamms.getText().isEmpty() || tfDelayBetweenSpamms.getText().isEmpty() || tfDelayToStart.getText().isEmpty() || tfMessageField.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please fill in all the fields");
            } else {
                if (tfNumberOfSpamms.getText().matches("[0-9]+") && tfDelayBetweenSpamms.getText().matches("[0-9]+") && tfDelayToStart.getText().matches("[0-9]+")) {
                    if (Integer.parseInt(tfDelayBetweenSpamms.getText()) < 1)
                        try {
                            Robot robot = new Robot();
                            String message = tfMessageField.getText();
                            int times = Integer.parseInt(tfNumberOfSpamms.getText());
                            int delay = Integer.parseInt(tfDelayBetweenSpamms.getText());
                            int delayStart = Integer.parseInt(tfDelayToStart.getText());
                            StringSelection stringSelection = new StringSelection(message);
                            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
                            new Thread(() -> {
                                try {
                                    Thread.sleep(delayStart);
                                    for (int x = 0; x < times; x++) {
                                        robot.keyPress(KeyEvent.VK_CONTROL);
                                        robot.keyPress(KeyEvent.VK_V);
                                        robot.keyRelease(KeyEvent.VK_V);
                                        robot.keyRelease(KeyEvent.VK_CONTROL);
                                        robot.keyPress(KeyEvent.VK_DELETE);
                                        robot.keyRelease(KeyEvent.VK_DELETE);
                                        robot.keyPress(KeyEvent.VK_ENTER);
                                        robot.keyRelease(KeyEvent.VK_ENTER);
                                        Thread.sleep((delay + 1) * 1000L);
                                    }
                                } catch (InterruptedException ex) {
                                    throw new RuntimeException(ex);
                                }
                            }).start();
                        } catch (AWTException e2) {
                            throw new RuntimeException(e2);
                        }
                } else {
                    JOptionPane.showMessageDialog(null, "Please enter a valid number");
                }
            }
        });
    }

    public void Window() {
        JFrame frame = new JFrame("Spammer");
        frame.setContentPane(mainPanel);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Spammer");
    }
}