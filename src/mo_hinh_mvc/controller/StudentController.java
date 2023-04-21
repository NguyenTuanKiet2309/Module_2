package mo_hinh_mvc.controller;

import mo_hinh_mvc.model.Student;
import mo_hinh_mvc.repository.StudentRepository;
import mo_hinh_mvc.service.StudentService;

import java.util.Scanner;

public class StudentController {
    Scanner sc = new Scanner(System.in);
    StudentService studentService = new StudentService();

    public void showStudent(){
        System.out.println("--- Quản lý học viên ---");
        boolean flag = true;
        do {
            System.out.println("Chọn 1 chức năng \n" +
                    "1. Thêm mới học viên \n" +
                    "2. Chỉnh sửa thông tin học viên \n" +
                    "3. Hiển thị danh sách học viên \n" +
                    "4.  Xoá học viên \n" +
                    "5. Thoát");
            String choice = sc.nextLine();
            switch (choice){
                case "1":
                    studentService.addStudent();
                    break;
                case "2":
                    studentService.editStudent();
                    break;
                case "3":
                    studentService.displayStudent();
                    break;
                case "4":
                    studentService.deleteStudent();
                    break;
                case "5":
                    System.exit(0);
                    break;
                default:
                    System.out.println("Không có chức năng");
            }
        } while (flag);
    }
}
