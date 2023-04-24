package ss16_binary_file_and_serialization.bai_tap.product_management.common;

import ss16_binary_file_and_serialization.bai_tap.product_management.model.Product;
import ss16_binary_file_and_serialization.thuc_hanh.read_and_write_binary.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriter {
    private static final String PATH = "src/ss16_binary_file_and_serialization/bai_tap/product_management/data/text";

    public static void write(List<Product> products) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(PATH);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(products);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static List<Product> read() {
        List<Product> list = new ArrayList<>();
        try {
            FileInputStream fileInputStream = new FileInputStream(PATH);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            list = (List<Product>) objectInputStream.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return list;
    }
}
