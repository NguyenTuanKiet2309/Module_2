package ss16_binary_file_and_serialization.bai_tap.product_management.model;

import java.io.Serializable;

public class Product implements Serializable {
    private static final long serialVersionUID = 6433858223774886977L;
    private String idProduct;
    private String nameProduct;
    private double price;
    private String brand;
    private String describe;

    public Product() {
    }

    public Product(String idProduct, String nameProduct, double price, String brand, String describe) {
        this.idProduct = idProduct;
        this.nameProduct = nameProduct;
        this.price = price;
        this.brand = brand;
        this.describe = describe;
    }

    public String getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(String idProduct) {
        this.idProduct = idProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    @Override
    public String toString() {
        return "Product{" +
                "idProduct='" + idProduct + '\'' +
                ", nameProduct='" + nameProduct + '\'' +
                ", price=" + price +
                ", brand='" + brand + '\'' +
                ", describe='" + describe + '\'' +
                '}';
    }
}
