package ss16_binary_file_and_serialization.bai_tap.product_management.repository;

import ss16_binary_file_and_serialization.bai_tap.product_management.model.Product;

import java.util.List;

public interface IProductRepository {
    void addProduct(Product product);

    List<Product> showProduct();

    boolean findProduct(String id);
}
