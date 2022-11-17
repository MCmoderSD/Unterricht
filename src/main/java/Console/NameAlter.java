package Console;

import java.util.Scanner;

public class NameAlter {
    public NameAlter() {
        System.out.println("\n");
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nYour Name: ");
        String name = scanner.nextLine();
        System.out.println("\nYour Age: ");
        String alter = scanner.nextLine();
        try {
            int age = Integer.parseInt(alter);
        } catch (Exception e) {
            System.out.println("\nPlease enter a valid number!");
            new NameAlter();
        }
        int age = Integer.parseInt(alter);
        System.out.println("\nYour Name is " + name + " and you are " + age + " years old.");
        new Loader();
    }
}
