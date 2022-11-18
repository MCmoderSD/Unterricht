package Functions;

public class DoesContain {
    public static boolean contains(char[] array, char c) {
        for (char value : array) {
            if (value == c) {
                return true;
            }
        }
        return false;
    }
}
