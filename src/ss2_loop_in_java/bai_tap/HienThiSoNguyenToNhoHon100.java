package ss2_loop_in_java.bai_tap;

public class HienThiSoNguyenToNhoHon100 {
    public static void main(String[] args) {
        int number = 2;
        while (number < 100) {
            boolean flag = true;
            for (int N = 2; N <= Math.sqrt(number); N++) {
                if (number % N == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println(number + " Là số nguyên tố");
            }
            number++;
        }
    }
}
