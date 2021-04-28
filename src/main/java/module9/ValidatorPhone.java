package module9;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatorPhone {
    /* public  static final Pattern pattern = Pattern.compile ("^[+38\\s]|\\(?\\d{3}\\)?[-.\\s]?\\d{3}[-.\\s]?[\\d{2}]|[-.\\s]?[\\d{2}]$");*/
    public  static final Pattern pattern = Pattern.compile("^\\+\\d{2}\\(?\\d{3}\\)?[\\s-]?\\d{3}[-.\\s]?\\d{2,4}?[-.\\s]?\\d{2,4}$");

    public static void doMatch(String word) {
        Matcher matcher = pattern.matcher(word);
        System.out.println("Validation for " +word+
                (matcher.matches() ? " - passed." : "  - not passed."));
    }
}
