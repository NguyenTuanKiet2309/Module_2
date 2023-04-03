package ss2_loop_in_java.thuc_hanh;

import java.util.Scanner;

public class SoNguyenTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number:");
        int number = scanner.nextInt();
        if (number < 2) {
            System.out.println(number + " không phải là số nguyên tố");
        } else {
            int number2 = 2;
            boolean flag = true;
            while (number2 < number) {
                if (number % number2 == 0) {
                    flag = false;
                    break;
                }
                number2++;
            }
            if (flag) {
                System.out.println(number + " Là số nguyên tố");
            } else {
                System.out.println(number + " Không phải là số nguyên tố");
            }
        }
    }
}
