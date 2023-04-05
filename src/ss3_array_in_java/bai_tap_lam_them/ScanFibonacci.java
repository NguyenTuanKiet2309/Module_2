package ss3_array_in_java.bai_tap_lam_them;
import java.util.Scanner;

public class ScanFibonacci {
    public static void main(String[] args) {
        int number1 = 0;
        int number2 = 1;
        while (number1 < 100) {
            System.out.println(number1);
            int number3 = number1 + number2;
            number1 = number2;
            number2 = number3;
        }
    }
}
