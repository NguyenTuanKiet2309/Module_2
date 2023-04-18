package ss11_map_and_tree.bai_tap.luyen_tap_arraylist_linkedlist.repository;

import ss11_map_and_tree.bai_tap.luyen_tap_arraylist_linkedlist.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {
    private static ArrayList<Product> productList = new ArrayList();

    static {
        productList.add(new Product(1, "Nike", 10000));
        productList.add(new Product(2, "Adidas", 15000));
        productList.add(new Product(3, "NYC", 12000));
        productList.add(new Product(4, "Dr. Marten", 8000));
    }


    @Override
    public boolean checkId(int id) {
        for (Product product : productList) {
            if (id == product.getId()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void editProductById(int id, int idEdit, String nameEdit, double priceEdit) {
        for (Product p : productList) {
            if (id == p.getId()) {
                p.setId(idEdit);
                p.setName(nameEdit);
                p.setPrice(priceEdit);
                break;
            }
        }
    }

    @Override
    public boolean deleteProductById(int id) {
        for (int i = 0; i < productList.size(); i++) {
            if (id == productList.get(i).getId()) {
                productList.remove(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean searchProductByName(String name) {
        for (int i = 0; i < productList.size(); i++) {
            if (name.equals(productList.get(i).getName())) {
                System.out.println(productList.get(i));
                return true;
            }
        }
        return false;
    }

    @Override
    public void sortProduct() {

    }


    @Override
    public List<Product> getProductList() {
        return productList;
    }

    @Override
    public void addNewProduct(Product product) {
        productList.add(product);
    }
}
