package ss11_map_and_tree.bai_tap.luyen_tap_arraylist_linkedlist.repository;

import ss11_map_and_tree.bai_tap.luyen_tap_arraylist_linkedlist.model.Product;
import ss9_dsa_danh_sach.bai_tap.quan_ly_code_gym.model.Student;

import java.util.List;

public interface IProductRepository {
    List<Product> getProductList();

    void addNewProduct(Product product);

    boolean checkId(int id);

    void editProductById(int id, int idEdit, String nameEdit, double priceEdit);

    boolean deleteProductById(int id);

    boolean searchProductByName(String name);

    void sortProduct();
}
