package ss11_map_and_tree.bai_tap.luyen_tap_arraylist_linkedlist.controller;

import ss11_map_and_tree.bai_tap.luyen_tap_arraylist_linkedlist.repository.IProductRepository;
import ss11_map_and_tree.bai_tap.luyen_tap_arraylist_linkedlist.repository.ProductRepository;
import ss11_map_and_tree.bai_tap.luyen_tap_arraylist_linkedlist.service.IProductService;
import ss11_map_and_tree.bai_tap.luyen_tap_arraylist_linkedlist.service.ProductService;

import java.util.Scanner;

public class ProductController {
    Scanner sc = new Scanner(System.in);
    private IProductService iProductService = new ProductService();
    private IProductRepository iProductRepository = new ProductRepository();

    public void dislayController() {
        boolean flag = true;
        do {

            System.out.println("----- SNEAKER CHÍNH HÃNG----- \n" +
                    "1. Thêm sản phẩm \n" +
                    "2. Sửa thông tin sản phẩm theo id \n" +
                    "3. Xoá sản phẩm theo id \n" +
                    "4. Hiển thị danh sách sản phẩm \n" +
                    "5. Tìm kiếm sản phẩm theo tên\n" +
                    "6. Sắp xếp tăng dân theo giá \n" +
                    "0. Thoát \n" +
                    "--- Mời bạn chọn chức năng : ");
            String choice = sc.nextLine();
            switch (choice) {
                case "1":
                    iProductService.addNewProduct();
                    break;
                case "2":
                    iProductService.editProductById();
                    break;
                case "3":
                    iProductService.deleteProductById();
                    break;
                case "4":
                    iProductService.displayProduct();
                    break;
                case "5":
                    iProductService.searhProductByName();
                    break;
                case "6":
                    iProductService.sortProduct();
                    break;
                case "0":
                    System.out.println("Thoát App");
                    System.exit(0);
            }
        } while (flag);
    }
}
