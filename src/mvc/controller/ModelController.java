package mvc.controller;

import java.util.Scanner;

public class ModelController {
    Scanner sc = new Scanner(System.in);

    void menu() {
        System.out.println("---THE WATCH---");
        boolean flag=true;
        do {
            System.out.println("Nhập một lựa chọn\n" +
                    "1.Thêm sản phầm\n" +
                    "2. Hiển thị sản phẩm\n" +
                    "3. Sửa sản phẩm\n" +
                    "4. Xoá sản phẩm\n" +
                    "5. Tìm kiếm");

        }while (flag);
    }
}
