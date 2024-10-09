package cleancode.studycafe.bymyself.util;

import java.util.regex.Pattern;

public class Validator {

    private static final String INTEGER_FORMAT = "\\d+";

    public static void checkInteger(String userInput) {

        boolean matches = Pattern.matches(INTEGER_FORMAT, userInput);

        if (matches == false) {
            throw new IllegalArgumentException("숫자가 아닌 값입니다.");
        }
    }
}
