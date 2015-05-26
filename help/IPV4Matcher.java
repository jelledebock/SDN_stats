package help;

import java.util.regex.Pattern;

/**
 * Created by jelle on 26.05.15.
 */
public class IPV4Matcher {

    static public final String IPV4_REGEX = "(([0-1]?[0-9]{1,2}\\.)|(2[0-4][0-9]\\.)|(25[0-5]\\.)){3}(([0-1]?[0-9]{1,2})|(2[0-4][0-9])|(25[0-5]))";
    static private Pattern IPV4_PATTERN = Pattern.compile(IPV4_REGEX);

    public static boolean isValidIPV4(String s) {
        return IPV4_PATTERN.matcher(s).matches();
    }
}