package ss3_array_in_java.bai_tap_lam_them;

import java.util.Scanner;

public class CheckLeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập năm cần kiểm tra");
        int input = Integer.parseInt(sc.nextLine());
        System.out.println(CheckLeapYear.checkYear(input));
    }

    public static boolean checkYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else if ((year % 4 == 0 && year % 100 != 0)) {
            return true;
        } else {
            return false;
        }
    }
}
