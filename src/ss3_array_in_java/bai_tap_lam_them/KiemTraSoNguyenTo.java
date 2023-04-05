package ss3_array_in_java.bai_tap_lam_them;
import java.util.Scanner;

public class KiemTraSoNguyenTo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số cần kiểm tra");
        int input = Integer.parseInt(sc.nextLine());
        System.out.println(KiemTraSoNguyenTo.numbers(input));
    }

    public static boolean numbers(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
}
