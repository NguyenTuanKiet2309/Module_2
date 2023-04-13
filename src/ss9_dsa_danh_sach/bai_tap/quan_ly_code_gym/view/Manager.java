package ss9_dsa_danh_sach.bai_tap.quan_ly_code_gym.view;

import java.util.Scanner;

public class Manager {
    public static void main(String[] args) {

        int choice = -1;
        Scanner sc = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("CHƯỜNG TRÌNH QUẢN LÝ SINH VIÊN");
            System.out.println("Chọn chức năng để tiếp tục");
            System.out.println("1. Thêm mới giảng viên hoặc học sinh");
            System.out.println("2. Xoá giảng viên hoặc học sinh");
            System.out.println("3. Xem danh sách giảng viên hoặc học sinh");
            System.out.println("4. Thoát");
            System.out.println("Chọn chức năng: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:

                case 2:
                case 3:
                case 4:
                    System.exit(0);
                default:
                    System.out.println("No choice.");
            }

        }
    }
}
