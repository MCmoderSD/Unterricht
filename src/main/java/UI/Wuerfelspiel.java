package UI;

import Functions.JFrameConfig;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;
import java.util.Scanner;

public class Wuerfelspiel extends JFrame {
    int iZahl, iSumme, iHighScore, iIteration, iWhile;
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);
    private JPanel mainPanel;
    private JLabel Zahl;
    private JLabel Summe;
    private JLabel HighScore;
    private JButton bWurf;
    private JLabel Game;
    private JButton bReset;

    public Wuerfelspiel() {
        JFrame frame = new JFrame("Würfelspiel");
        JFrameConfig.setJFrameConfig(frame, mainPanel, "Würfelspiel");
        frame.setSize(480, 480);
        resetGame();
        bReset.addActionListener(e -> resetGame());
        bWurf.addActionListener(e -> engine());
        bReset.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    System.out.println("\n\nWelcher High Score muss erreicht werden?");
                    iWhile = Integer.parseInt(scanner.nextLine());
                    highScore();
                }
            }
        });
    }

    public static void main(String[] args) {
        new Wuerfelspiel();
    }

    private void engine() {
        //iZahl = (int) (Math.random() * 6 + 1);    //Randomizer
        iZahl = random.nextInt(6) + 1;      //Randomizer
        iSumme += iZahl;
        Zahl.setText("Zahl: " + iZahl);
        Summe.setText("Summe: " + iSumme);

        if (iZahl == 6) {
            Game.setForeground(Color.red);
            Game.setText("Du hast Verloren!");
            iSumme = 0;
        } else {
            Game.setForeground(Color.green);
            Game.setText("Du hast Gewonnen!");
        }

        if (iSumme > iHighScore) {
            iHighScore = iSumme;
            HighScore.setText("HighScore: " + iHighScore);
        }
    }

    private void resetGame() {
        iSumme = 0;
        iZahl = 0;
        iHighScore = 0;
        iIteration = 0;
        iWhile = 0;
        Summe.setText("Summe: ");
        Zahl.setText("Zahl: ");
        HighScore.setText("HighScore: ");
        Game.setText(" ");
    }

    private void highScore() {
        while (iHighScore < iWhile) {
            engine();
            ++iIteration;
            System.out.println(iIteration + " Iterationen bis High Score von " + iHighScore + " erreicht wurde.");
        }
        System.out.print("\nEs benötigte " + iIteration + " Iterationen bis ein High Score von " + iHighScore + " erreicht wurde.");
    }
}
