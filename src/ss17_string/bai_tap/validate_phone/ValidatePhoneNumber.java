package ss17_string.bai_tap.validate_phone;

import ss17_string.bai_tap.validate_class.ValidateClassName;

import java.nio.file.Path;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidatePhoneNumber {
    private static final String PHONE_REGEX = "^\\d{2}-[0]\\d{9}$";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a phone number :");
        String phoneNumber = sc.nextLine();
        System.out.println(Pattern.matches(PHONE_REGEX, phoneNumber));
    }
}
