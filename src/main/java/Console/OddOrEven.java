package Console;

import java.util.Scanner;

public class OddOrEven {
    Scanner scanner = new Scanner(System.in);

    public OddOrEven() {
        System.out.println("\n");
        System.out.println("\nEnter a Number: ");
        String input = scanner.nextLine();
        try {
            int iInput = Integer.parseInt(input);
            if (isEven(iInput)) {
                System.out.println("\n" + iInput + " is Even");
            } else {
                System.out.println("\n" + iInput + " is Odd");
            }
        } catch (Exception e) {
            System.out.println("\nPlease enter a valid number!");
            new OddOrEven();
        }
        new Loader();
    }

    private boolean isEven(int pInput) {
        return pInput % 2 == 0;
    }
}
