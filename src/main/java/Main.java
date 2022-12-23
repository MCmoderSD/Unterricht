import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String OperatingSystem = System.getProperty("os.name");
        if (OperatingSystem.contains("Windows")) {
            if (args.length == 0) {
                try {
                    Runtime.getRuntime().exec("cmd /c start \"\" java -jar Unterricht.jar a");
                    modeSelector();
                } catch (IOException e) {
                    modeSelector();
                    throw new RuntimeException(e);
                }
            }
        } else {
            modeSelector();
        }
    }

    private static void modeSelector() {
        System.out.println("Continue Through Console or GUI?");
        System.out.println("1. Console");
        System.out.println("2. GUI");

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (input.equals("1")) {
            new Console.Loader();
        } else if (input.equals("2")) {
            new UI.StartPage();
        } else if (input.equals("Console") || input.equals("console")) {
            new Console.Loader();
        } else if (input.equals("GUI") || input.equals("gui")) {
            new UI.StartPage();
        } else {
            System.out.println("Invalid Input");
        }
    }
}
