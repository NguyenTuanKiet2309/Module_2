package ss9_dsa_danh_sach.bai_tap.quan_ly_code_gym.service;

import ss9_dsa_danh_sach.bai_tap.quan_ly_code_gym.model.Teacher;
import ss9_dsa_danh_sach.bai_tap.quan_ly_code_gym.repository.TeacherRepository;

import java.util.List;
import java.util.Scanner;

public class TeacherService implements ITeacherService {
    Scanner sc = new Scanner(System.in);
    private TeacherRepository teacherRepository = new TeacherRepository();
    List<Teacher> teacherList = teacherRepository.getTeacherList();

    @Override
    public void displayTeacher() {
        for (Teacher t : teacherList) {
            System.out.println(t);
        }
    }

    @Override
    public void addNewTeacher() {
        System.out.print("Nhap id giảng viên: ");
        int studentId = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap tên giảng viên: ");
        String studentName = sc.nextLine();
        System.out.print("Nhap ngày sinh giảng viên: ");
        String dayOfBirth = sc.nextLine();
        System.out.println("Nhập gioi tinh giảng viên");
        String gender = sc.nextLine();
        System.out.print("Nhap chuyên môn của giảng viên: ");
        String specialize = sc.nextLine();
        Teacher newTeacher = new Teacher(studentId, studentName, dayOfBirth, gender, specialize);
        teacherRepository.addNewTeacher(newTeacher);
        System.out.println("Thêm mới thành công giảng viên : " + newTeacher.getName());
    }

    @Override
    public void deleteTeacher() {
        this.displayTeacher();
        System.out.println("Nhập mã giảng viên muốn xóa");
        int idTeacher = Integer.parseInt(sc.nextLine());
        boolean isDeleteTeacher = teacherRepository.deleteTeacher(idTeacher);
        if (isDeleteTeacher) {
            System.out.println("Đã xóa thành công giảng viên ");
            this.displayTeacher();
        } else {
            System.out.println("Không tìm thấy mã giảng viên");
        }
    }
}
