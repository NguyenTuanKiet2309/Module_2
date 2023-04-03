package ss2_loop_in_java.bai_tap;

import java.util.Scanner;

public class HienThiHinh {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Mời bạn nhập số");
//        int input = sc.nextInt();
//        for (int i = 0; i < input; i++) {
//                System.out.println("*****");
//        }
        for (int i = 1; i <= 5; i++) {
            System.out.println("");
            for (int j = 1; j < i; j++) {
                System.out.println("*");
            }
        }
    }
}
