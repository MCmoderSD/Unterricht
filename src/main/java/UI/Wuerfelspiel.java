package UI;

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
        frame.setContentPane(mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(480, 480);
        frame.setVisible(true);

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

    public void engine() {
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

    public void resetGame() {
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

    public void highScore() {
        while (iHighScore <= iWhile) {
            engine();
            ++iIteration;
            System.out.println(iIteration + " Iterationen bis High Score von " + iHighScore + " erreicht wurde.");
        }
        float fChance = (float) 1 / iIteration;
        System.out.print("\nDie Chance auf einen High Score von " + iHighScore + " zu erreichen beträgt " + 1 + " zu " + iIteration);
        //System.out.print(" bzw. " + fChance + "%.");
    }
}
