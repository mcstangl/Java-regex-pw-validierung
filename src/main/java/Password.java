import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {
    public static boolean validate(String password) {
        return hasMinimumLength(password) &&
                isNotTooLong(password) &&
                hasCapitalLetters(password) &&
                hasLowerCaseLetters(password) &&
                hasNumber(password) &&
                hasSpecialCharacter(password);

    }



    private static boolean hasMinimumLength(String password) {
        int minimalLength = 8;

        return password.length() >= minimalLength;
    }

    private static boolean isNotTooLong(String password) {
        int maximalLength = 20;

        return password.length() <= maximalLength;
    }

    private static boolean hasCapitalLetters(String password) {
        Pattern pattern = Pattern.compile("[A-Z]");
        Matcher matcher = pattern.matcher(password);

        return matcher.find();
    }

    private static boolean hasLowerCaseLetters(String password) {
        Pattern pattern = Pattern.compile("[a-z]");
        Matcher matcher = pattern.matcher(password);

        return matcher.find();
    }

    private static boolean hasNumber(String password) {
        Pattern pattern = Pattern.compile("[0-9]");
        Matcher matcher = pattern.matcher(password);

        return matcher.find();
    }

    private static boolean hasSpecialCharacter(String password) {
        Pattern pattern = Pattern.compile("[^A-Za-z0-9]");
        Matcher matcher = pattern.matcher(password);

        return matcher.find();
    }
}
