package ss17_string.bai_tap.validate_class;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidateClassName {
    private static final String CLASS_NAME_REGEX = "^(C|A|P)\\d{4}(G|H|I|K)$";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a class name : ");
        String className = sc.nextLine();
        System.out.println(Pattern.matches(CLASS_NAME_REGEX, className));
    }
}
