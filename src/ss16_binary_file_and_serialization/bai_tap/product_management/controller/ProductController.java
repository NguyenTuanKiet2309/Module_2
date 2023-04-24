package ss16_binary_file_and_serialization.bai_tap.product_management.controller;

import ss16_binary_file_and_serialization.bai_tap.product_management.service.ProductService;

import java.util.Scanner;

public class ProductController {
    ProductService productService = new ProductService();
    Scanner sc = new Scanner(System.in);

    public  void displayProduct(){
        System.out.println("--- SNEAKER CHÍNH HÃNG ---");
        boolean flag = true;
        do {
            System.out.println("1. Thêm sản phẩm \n" +
                    "2. Hiển thị sản phẩm \n" +
                    "3. Tìm kiếm sản phẩm \n" +
                    "4. Thoát \n" +
                    "- Mời bạn chọn chức năng -");
            String choice = sc.nextLine();
            switch (choice){
                case "1":
                    productService.addProduct();
                    break;
                case "2":
                    productService.showProduct();
                    break;
                case "3":
                    productService.findProduct();
                    break;
                case "4":
                    System.out.println("Thoát app");
                    System.exit(0);;
            }
        }while (flag);
    }
}
