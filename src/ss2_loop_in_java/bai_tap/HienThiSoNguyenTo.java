package ss2_loop_in_java.bai_tap;

public class HienThiSoNguyenTo {
    public static void main(String[] args) {
        int number = 2;
        int count = 0;
        while (count < 20) {
            boolean flag = true;
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println(number);
                count++;
            }
            number++;
        }
    }
}

