import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GermanStyleDateChecker {
    public static Matcher getMatcher(String dateString) {
        Pattern p = Pattern.compile("^([0-2]?\\d|3(0|1))[- .]((\\d(0|1|2))|(0\\d)|(\\d))[- .]((19)|(20))?\\d\\d$");
        Matcher m = p.matcher(dateString);
        return m;
    }
}
