package Console;

import java.io.IOException;

public class Main {
    public Main() {
        try {
            Runtime.getRuntime().exec("cmd /c start cmd.exe \n cd");
            System.out.println("Console started");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
