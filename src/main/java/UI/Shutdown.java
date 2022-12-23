package UI;

import Functions.JFrameConfig;
import Functions.MusicPlayer;

import javax.swing.*;

public class Shutdown {
    private JButton bStart;
    private JPanel mainPanel;

    public Shutdown() {
        JFrame frame = new JFrame("shutdown");
        JFrameConfig.setJFrameConfig(frame, mainPanel, "Shutdown");
        bStart.addActionListener(e -> {
            try {
                new Thread(() -> {
                    try {
                        MusicPlayer player = new MusicPlayer();
                        player.play(getClass().getResource("/sounds/shutdown.wav"));
                        new Thread(() -> {
                            try {
                                Thread.sleep(6000);
                                for (int i = 0; i < 10; i++) {
                                    System.out.println("Shutdown in T-" + (10 - i));
                                    Thread.sleep(1000);
                                }
                            } catch (Exception e1) {
                                e1.printStackTrace();
                            }
                        }).start();
                        Thread.sleep(16000);
                        System.out.println("Shutdown");
                        if (Functions.CheckOS.isWindows) {
                            Runtime.getRuntime().exec("shutdown -s -t 0");
                        } else if (Functions.CheckOS.isMac) {
                            Runtime.getRuntime().exec("shutdown -h now");
                        } else if (Functions.CheckOS.isUnix) {
                            Runtime.getRuntime().exec("shutdown -h now");
                        }
                    } catch (Exception e1) {
                        e1.printStackTrace();
                    }
                }).start();
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        });
    }

    public static void main(String[] args) {
        new Shutdown();
    }
}
