package ss9_dsa_danh_sach.bai_tap.quan_ly_code_gym.service;

import ss9_dsa_danh_sach.bai_tap.quan_ly_code_gym.model.Student;
import ss9_dsa_danh_sach.bai_tap.quan_ly_code_gym.repository.StudentRepository;

import java.util.List;
import java.util.Scanner;

public class StudentService implements IStudentService {
    Scanner sc = new Scanner(System.in);
    private StudentRepository studentRepository = new StudentRepository();
    List<Student> studentList = studentRepository.getStudentList();

    @Override
    public void displayStudent() {

        for (Student s : studentList) {
            System.out.println(s);
        }
    }

    @Override
    public void addNewStudent() {
        System.out.print("Nhap id sinh vien: ");
        int studentId = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap ten sinh vien: ");
        String studentName = sc.nextLine();
        System.out.print("Nhap ngay sinh vien: ");
        String dayOfBirth = sc.nextLine();
        System.out.println("Nhập gioi tinh");
        String gender = sc.nextLine();
        System.out.print("Nhap lop cua sinh vien: ");
        String classes = sc.nextLine();
        System.out.print("nhap diem cua sinh vien: ");
        int grade = Integer.parseInt(sc.nextLine());
        Student newStudent = new Student(studentId, studentName, dayOfBirth, gender, classes, grade);
        studentRepository.addNewStudent(newStudent);
        System.out.println("Thêm mới thành công sinh viên " + newStudent.getName());

    }

    @Override
    public void deleteStudent() {
        this.displayStudent();
        System.out.println("Nhập mã học viên muốn xóa");
        int idStudent = Integer.parseInt(sc.nextLine());
        boolean isDeleteStudent = studentRepository.deleteStudent(idStudent);
        if (isDeleteStudent) {
            if (isDeleteStudent) {
                System.out.println("Đã xóa thành công học viên ");
                this.displayStudent();
            } else {
                System.out.println("Không tìm thấy mã học sinh");
            }
        }
    }
}
