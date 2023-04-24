package ss16_binary_file_and_serialization.bai_tap.product_management.repository;

import mo_hinh_mvc.model.Student;
import ss16_binary_file_and_serialization.bai_tap.product_management.common.ReadAndWriter;
import ss16_binary_file_and_serialization.bai_tap.product_management.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {
    static List<Product> list = new ArrayList<>();

    static {
        list.add(new Product("01", "Air Max 97", 30000, "Nike", "Basic Style"));
        list.add(new Product("02", "Converse 1970s", 10000, "Converse", "Retro Style"));
        list.add(new Product("03", "Air Force 1", 20000, "Nike", "Basic Style"));
        ReadAndWriter.write(list);
    }

    @Override
    public void addProduct(Product product) {
        List<Product> list = ReadAndWriter.read();
        list.add(product);
        ReadAndWriter.write(list);
    }

    @Override
    public List<Product> showProduct() {
        return ReadAndWriter.read();
    }

    @Override
    public boolean findProduct(String id) {
        List<Product> list = ReadAndWriter.read();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getIdProduct().equals(id)) {
                System.out.println(list.get(i));
                return false;
            }
        }
        return true;
    }
}
