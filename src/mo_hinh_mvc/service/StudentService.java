package mo_hinh_mvc.service;

import mo_hinh_mvc.model.Student;
import mo_hinh_mvc.repository.StudentRepository;

import java.util.Scanner;

public class StudentService implements IStudentService {
    Scanner sc = new Scanner(System.in);
    StudentRepository studentRepository = new StudentRepository();

    @Override
    public void addStudent() {
        System.out.println("Mời bạn nhập id :");
        String id = sc.nextLine();
        System.out.println("Mời bạn nhập tên");
        String name = sc.nextLine();
        System.out.println("Mời bạn nhập email");
        String email = sc.nextLine();
        Student student = new Student(id, name, email);
        studentRepository.addStudent(student);
        System.out.println("Thêm mới thành công");
    }

    @Override
    public void editStudent() {
        System.out.println("Nhập id muốn sửa");
        String id = sc.nextLine();
        int index = studentRepository.checkId(id);
        if (index == -1) {
            System.out.println("Không có mã id này");
        } else {
            System.out.println("Chọn mục cần sửa\n" +
                    "1. Id \n" +
                    "2. Tên\n" +
                    "3. Email");
            int input = sc.nextInt();
            studentRepository.editStudent(index, input);
        }


    }

    @Override
    public void displayStudent() {
        for (Student s : studentRepository.getStudenlist()) {
            System.out.println(s);
        }
    }

    @Override
    public void deleteStudent() {
        System.out.println("Nhập id muốn xoá: ");
        String id = sc.nextLine();
        boolean flag = studentRepository.deleteStudent(id);
        if (flag){
            System.out.println("Đã xoá thành công");
        } else {
            System.out.println("Không tìm thấy id");
        }
    }
}
