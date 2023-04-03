package ss2_loop_in_java.thuc_hanh;

import java.util.Scanner;

public class TinhTienLai {
    public static void main(String[] args) {
        double tien;
        int thang;
        double laiSuat;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số tiền gửi");
        tien = input.nextDouble();
        System.out.println("Nhập số tháng gửi");
        thang = input.nextInt();
        System.out.println("Nhập số lãi suất");
        laiSuat = input.nextDouble();
        double tinhLaiSuat = 0;
        for (int i = 0; i < thang; i++) {
            tinhLaiSuat += tien * (laiSuat / 100) / 12 * thang;
        }
        System.out.println("lãi suất của bạn là: " + tinhLaiSuat);
    }
}
