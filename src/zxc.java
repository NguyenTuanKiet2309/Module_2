import java.util.Arrays;
import java.util.Locale;

public class zxc {
    public static void main(String[] args) {
        String str = "CodegymDaNang";
        System.out.println(solution(str));
    }

    static String solution(String s) {
        String str = "" + s.toLowerCase().charAt(0);
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.toUpperCase().charAt(i)) {
                str = str + " " + s.toLowerCase().charAt(i);
            } else {
                str += s.charAt(i);
            }
        }
        return str;
    }
}