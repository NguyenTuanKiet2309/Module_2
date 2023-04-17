package ss11_map_and_tree.bai_tap.luyen_tap_arraylist_linkedlist.service;

import ss11_map_and_tree.bai_tap.luyen_tap_arraylist_linkedlist.model.Product;

import java.util.List;

public interface IProductService {
    void addNewProduct();

    void editProductById();

    void deleteProductById();

    void displayProduct();

    void searhProductByName();

    void sortProduct();
}
