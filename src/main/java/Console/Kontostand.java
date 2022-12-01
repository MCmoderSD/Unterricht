package Console;

import java.util.Scanner;

public class Kontostand {
    public Kontostand() {
        System.out.println("\n");
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter your Name: ");
        String name = scanner.nextLine();
        System.out.println("\nEnter your Account Balance: ");
        String kontostand = scanner.nextLine();
        try {
            double balance = Double.parseDouble(kontostand);
        } catch (Exception e) {
            System.out.println("\nPlease enter a valid number!");
            new Kontostand();
        }
        double balance = Double.parseDouble(kontostand);
        if (balance < 0) {
            System.out.println("\n" + name + " your Account Balance is " + balance + "€," + " you are in debt!");
        } else if (balance == 0) {
            System.out.println("\n" + name + " Your Account Balance is 0!" + " You are just broke!");
        } else {
            System.out.println("\n" + name + " your Account Balance is positive!" + " You are rich!");
        }
        new Loader();
    }
}
