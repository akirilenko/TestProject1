package module9;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatorEmil
{
    public static final Pattern pattern = Pattern.compile
            ("^[a-zA-Z-0-9-_]+[@]([a-zA-Z0-9]([a-zA-Z0-9\\-]{0,61}[a-zA-Z0-9])?\\.)+[a-zA-Z]{2,6}$");

    public static void doMatch(String word) {
        Matcher matcher = pattern.matcher(word);
        System.out.println("Validation for " +word+
                (matcher.matches() ? " - passed." : "  - not passed."));
    }

}

