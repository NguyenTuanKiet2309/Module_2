package ss16_binary_file_and_serialization.bai_tap.product_management.view;

import ss16_binary_file_and_serialization.bai_tap.product_management.controller.ProductController;

public class ProductManagement {
    public static void main(String[] args) {
        ProductController productController = new ProductController();
        productController.displayProduct();
    }
}
