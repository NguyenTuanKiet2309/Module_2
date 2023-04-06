package ss3_array_in_java.bai_tap_lam_them;

import java.util.Scanner;

public class KiemTraChanLe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số để kiểm tra");
        int input = Integer.parseInt(sc.nextLine());
        System.out.println(KiemTraChanLe.isOdd(input));
    }

    public static boolean isOdd(int num) {
        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
