package ss1_introduction_java.bai_tap;

import java.util.Scanner;

public class SwapMoney {
    public static void main(String[] args) {
        int vnd = 23000;
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập số tiền USD cần chuyển đổi: ");
        int usd = Integer.parseInt(sc.nextLine());
        int swap = usd * vnd;
        System.out.println("Số USD đã chuyển đổi sang VND là: " + swap);
    }
}
