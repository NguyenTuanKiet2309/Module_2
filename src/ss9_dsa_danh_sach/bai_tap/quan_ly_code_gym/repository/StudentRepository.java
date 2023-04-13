package ss9_dsa_danh_sach.bai_tap.quan_ly_code_gym.repository;

import ss9_dsa_danh_sach.bai_tap.quan_ly_code_gym.model.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentRepository implements IStudentRepository {
    @Override
    public void addStudent() {
        ArrayList<Student> list = new ArrayList();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập id");
        int id = sc.nextInt();
        System.out.println("Nhập tên");
        String name = sc.toString();
        System.out.println("Nhập ngày sinh");
        String date = sc.toString();
        System.out.println("Nhập giới tính");
        String gender = sc.toString();
        System.out.println("Nhập lớp");
        String classRoom = sc.toString();
        System.out.println("Nhập điểm");
        String score = sc.toString();
        Student student = new Student(id, name, date, gender, classRoom, score);
        list.add(student);
        System.out.println(list);
    }
}
