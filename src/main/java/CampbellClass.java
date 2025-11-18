/**
 * A utility class providing string conversion, unit conversion, and text-cleaning methods.
 */
public final class CampbellClass {

    private CampbellClass() {
    }

    /**
     * Converts an integer to its string representation.
     */
    public static String convertString(int a) {
        return String.valueOf(a);
    }

    /**
     * Converts a double to its string representation.
     */
    public static String convertString(double b) {
        return String.valueOf(b);
    }

    /**
     * Converts a character to its string representation.
     */
    public static String convertString(char c) {
        return String.valueOf(c);
    }

    /**
     * Converts a boolean to its string representation.
     */
    public static String convertString(boolean d) {
        return String.valueOf(d);
    }

    /**
     * Converts meters to centimeters while returning an int.
     */
    public static int convertMetersToCenti(int a) {
        return (a * 100);
    }

    /**
     * Converts meters to centimeters while returning a double.
     */
    public static double convertMetersToCenti(double a) {
        return (a * 100);
    }

    /**
     * Removes all non-letter characters from the given string.
     */
    public static String removeNonAlpha(String s) {
        return s.replaceAll("[^a-zA-Z]", "");
    }

    /**
     * Removes non-letter characters and formats remaining letters in the chosen case.
     */
    public static String removeNonAlpha(String s, boolean upperCase) {
        String cleaned = s.replaceAll("[^a-zA-Z]", "");
        if (upperCase) {
            return cleaned.toUpperCase();
        }
        return cleaned.toLowerCase();
    }
}
