package Functions;

public class CheckOS {
    public static boolean isWindows = false;
    public static boolean isMac = false;
    public static boolean isUnix = false;

    public CheckOS() {
        String OperatingSystem = System.getProperty("os.name");
        if (OperatingSystem.contains("Windows")) {
            isWindows = true;
        } else if (OperatingSystem.contains("Mac")) {
            isMac = true;
        } else if (OperatingSystem.contains("nix") || OperatingSystem.contains("nux") || OperatingSystem.contains("aix")) {
            isUnix = true;
        }
    }

    public static void main(String[] args) {
        new CheckOS();
    }
}

