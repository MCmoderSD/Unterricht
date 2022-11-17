package Console;

import java.util.Scanner;

public class Rechner {
    public Rechner() {
        System.out.println("\n");
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nFirst Number: ");
        String firstNumber = scanner.next();
        try {
            double num1 = Double.parseDouble(firstNumber);
        } catch (Exception e) {
            System.out.println("\nPlease enter a valid number!");
            new Rechner();
        }
        double num1 = Double.parseDouble(firstNumber);
        System.out.println("\nSecond Number: ");
        String secondNumber = scanner.next();
        try {
            double num2 = Double.parseDouble(secondNumber);
        } catch (Exception e) {
            System.out.println("\nPlease enter a valid number!");
            new Rechner();
        }
        double num2 = Double.parseDouble(secondNumber);
        System.out.println("\nOperation: ");
        String operation = scanner.next();
        switch (operation) {
            case "+":
                System.out.println("\nThe Result is: " + (num1 + num2));
                break;
            case "-":
                System.out.println("\nThe Result is: " + (num1 - num2));
                break;
            case "*":
                System.out.println("\nThe Result is: " + (num1 * num2));
                break;
            case "/":
                System.out.println("\nThe Result is: " + (num1 / num2));
                break;
            case "%":
                System.out.println("\nThe Result is: " + (num1 % num2));
                break;
            default:
                System.out.println("\nThis operation does not exist!");
                new Rechner();
                break;
        }
        System.out.println("\n" + "\n");
        System.out.println("Do you want to do another calculation? (y/n)");
        String answer = scanner.next();
        if (answer.equals("y")) {
            new Rechner();
        } else if (answer.equals("n")) {
            new Loader();
        } else {
            System.out.println("Please enter a valid answer!");
            new Rechner();
        }
    }
}
