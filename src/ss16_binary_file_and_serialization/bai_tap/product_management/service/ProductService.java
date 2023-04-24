package ss16_binary_file_and_serialization.bai_tap.product_management.service;

import ss16_binary_file_and_serialization.bai_tap.product_management.model.Product;
import ss16_binary_file_and_serialization.bai_tap.product_management.repository.ProductRepository;

import java.util.List;
import java.util.Scanner;

public class ProductService implements IProductService {
    ProductRepository productRepository = new ProductRepository();
    Scanner sc = new Scanner(System.in);

    @Override
    public void addProduct() {
        System.out.println("Mời bạn nhập id sản phẩm");
        String newId = sc.nextLine();
        System.out.println("Mời bạn nhập tên sản phẩm");
        String newName = sc.nextLine();
        System.out.println("Mời bạn nhập giá sản phẩm");
        double newPrice = Double.parseDouble(sc.nextLine());
        System.out.println("Mời bạn nhập hãng sản phẩm");
        String newBrand = sc.nextLine();
        System.out.println("Mời bạn nhập mô tả sản phẩm");
        String newDescribe = sc.nextLine();
        Product product = new Product(newId, newName, newPrice, newBrand, newDescribe);
        productRepository.addProduct(product);
    }

    @Override
    public void showProduct() {
        List<Product> list = productRepository.showProduct();
        for (Product product: list) {
            System.out.println(product);
        }
    }

    @Override
    public void findProduct() {
        System.out.println("NHập id bạn cần tìm");
        String id = sc.nextLine();
        boolean isFindProduct = productRepository.findProduct(id);
        if (isFindProduct) {
            System.out.println("Không có id này");
        }
    }
}
