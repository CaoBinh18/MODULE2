package StringRegex.ValidateNameClass;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NameClassExample {
    private static Pattern pattern;
    private Matcher matcher;

    private static final String NAMECLASS_REGEX = "^[ACP][0-9]{4}[GHIKLM]$";

    public NameClassExample() {
        pattern = Pattern.compile(NAMECLASS_REGEX);
    }

    public boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
