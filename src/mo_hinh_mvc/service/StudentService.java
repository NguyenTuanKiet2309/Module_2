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
    }

    @Override
    public void editStudent() {
        System.out.println("Nhập id muốn sửa");
        String id = sc.nextLine();
        boolean editStudent = studentRepository.editStudent(id);
        if (editStudent) {
            System.out.println("Mời bạn nhập id");
            String idEdit = sc.nextLine();
            System.out.println("Mời bạn nhập tên");
            String nameEdit = sc.nextLine();
            System.out.println("Mời bạn nhập email");
            String emailEdit = sc.nextLine();
            Student student = new Student(idEdit, nameEdit, emailEdit);
            studentRepository.addStudent(student);
        } else {
            System.out.println("Không tìm thấy mã");
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
        System.out.println("Nhập id muốn sửa");
        String id = sc.nextLine();
        boolean deleleStudent = studentRepository.deleteStudent(id);
        if (deleleStudent) {
            System.out.println("Đã xoá thành công");
        } else {
            System.out.println("Khôgn tìm thấy id");
        }
    }
}
