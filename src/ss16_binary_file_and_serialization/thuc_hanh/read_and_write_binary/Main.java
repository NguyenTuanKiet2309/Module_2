package ss16_binary_file_and_serialization.thuc_hanh.read_and_write_binary;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(1, "Kiệt", "Gia Lai"));
        list.add(new Student(2, "Hưng", "Đà Nẵng"));
        list.add(new Student(3, "Nam", "Nghệ An"));
        list.add(new Student(4, "Hoa", "Quảng Nam"));
        ReadAndWriter.write("src/ss16_binary_file_and_serialization/thuc_hanh/read_and_write_binary/text", list);
        List<Student> students = ReadAndWriter.read("src/ss16_binary_file_and_serialization/thuc_hanh/read_and_write_binary/text");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
