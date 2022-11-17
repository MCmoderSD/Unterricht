package Console;

import java.util.Scanner;

public class Loader {
    public Loader() {
        System.out.println("\n");
        System.out.println("\nPlease enter a number to select a script:\n");
        System.out.println("1: Hallo Welt");
        System.out.println("2: Name Alter");
        System.out.println("3: Kontostand");
        System.out.println("4: Rechner");
        System.out.println("5: Shutdown");
        Scanner scanner = new Scanner(System.in);
        try {
            int script = scanner.nextInt();
            switch (script) {
                case 1:
                    new HelloWorld();
                    break;
                case 2:
                    new NameAlter();
                    break;
                case 3:
                    new Kontostand();
                    break;
                case 4:
                    new Rechner();
                    break;
                case 5:
                    new Shutdown();
                    break;
                default:
                    System.out.println("Please enter the valid number of the script you want to start!");
                    break;
            }
        } catch (Exception e) {
            System.out.println("Please enter a valid number!");
        }
    }
}