package ss11_map_and_tree.bai_tap.luyen_tap_arraylist_linkedlist.service;

import ss11_map_and_tree.bai_tap.luyen_tap_arraylist_linkedlist.model.Product;
import ss11_map_and_tree.bai_tap.luyen_tap_arraylist_linkedlist.repository.ProductRepository;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ProductService implements IProductService {
    Scanner sc = new Scanner(System.in);
    private ProductRepository productRepository = new ProductRepository();
    List<Product> productList = productRepository.getProductList();

    @Override
    public void addNewProduct() {
        System.out.println("Mời bạn nhập id cho sản phẩm : ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Mời bạn nhập tên cho sản phẩm : ");
        String name = sc.nextLine();
        System.out.println("Mời bạn nhập giá cho sản phẩm : ");
        int price = Integer.parseInt(sc.nextLine());
        Product product = new Product(id, name, price);
        productList.add(product);
        displayProduct();
    }

    @Override
    public void editProductById() {
        System.out.println("Mời bạn nhập id muốn sữa : ");
        int idProduct = Integer.parseInt(sc.nextLine());
        boolean isEditProduct = productRepository.checkId(idProduct);
        if (isEditProduct) {
            System.out.println("Mời bạn nhập lại id : ");
            int idEdit = Integer.parseInt(sc.nextLine());
            System.out.println("Mời bạn nhập lại tên sản phẩm :");
            String nameEdit = sc.nextLine();
            System.out.println("Mời bạn nhập lại giá sản phẩm");
            int priceEdit = Integer.parseInt(sc.nextLine());
            productRepository.editProductById(idProduct, idEdit, nameEdit, priceEdit);
        } else {
            System.out.println("khôg tìm thấy id");
        }
        displayProduct();
    }

    @Override
    public void deleteProductById() {
        this.displayProduct();
        System.out.println("Mời bạn nhập id muốn xoá");
        int idProduct = Integer.parseInt(sc.nextLine());
        boolean isDeleteProduct = productRepository.deleteProductById(idProduct);
        if (isDeleteProduct) {
            System.out.println("Xoá thành công");
        } else {
            System.out.println("Không tìm thấy id");
        }
        displayProduct();
    }

    @Override
    public void displayProduct() {
        for (Product p : productList) {
            System.out.println(p);
        }
    }

    @Override
    public void searhProductByName() {
        System.out.println("Mời bạn nhập tên muốn tìm : ");
        String search = sc.nextLine();
        boolean isSearch = productRepository.searchProductByName(search);
        if (isSearch) {
            System.out.println("Đã tìm thấy");
        } else {
            System.out.println("Không tìm thấy");
        }
    }

    @Override
    public void sortProduct() {
        productRepository.getProductList().sort(Comparator.comparing(Product::getPrice));
        displayProduct();
    }
}
