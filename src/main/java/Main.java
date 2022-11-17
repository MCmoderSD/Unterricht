import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        if (args.length == 0)

            try {
                Runtime.getRuntime().exec("cmd /c start \"\" java -jar Unterricht.jar a");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        else {
            System.out.println("Continue Through Console or GUI?");
            System.out.println("1. Console");
            System.out.println("2. GUI");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            if (input.equals("1")) {
                new Console.Loader();
            } else if (input.equals("2")) {
                new Interface.StartPage();
            } else if (input.equals("Console") || input.equals("console")) {
                new Console.Loader();
            } else if (input.equals("GUI") || input.equals("gui")) {
                new Interface.StartPage();
            } else {
                System.out.println("Invalid Input");
            }
        }
    }
}
