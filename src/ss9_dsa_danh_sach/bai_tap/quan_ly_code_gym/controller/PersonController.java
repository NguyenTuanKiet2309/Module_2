package ss9_dsa_danh_sach.bai_tap.quan_ly_code_gym.controller;

import ss9_dsa_danh_sach.bai_tap.quan_ly_code_gym.service.IStudentService;
import ss9_dsa_danh_sach.bai_tap.quan_ly_code_gym.service.ITeacherService;
import ss9_dsa_danh_sach.bai_tap.quan_ly_code_gym.service.StudentService;
import ss9_dsa_danh_sach.bai_tap.quan_ly_code_gym.service.TeacherService;

import java.util.Scanner;

public class PersonController {
    Scanner sc = new Scanner(System.in);
    private IStudentService iStudentService = new StudentService();
    private ITeacherService iTeacherService = new TeacherService();


    public void dislayController() {
        boolean flag1 = true;
        do {

            System.out.println("---Quản Lý CodeGym--- \n" +
                    "1. Quản Lý Sinh Viên \n" +
                    "2. Quản Lý Giảng Viên \n" +
                    "3. Thoát");
            String choice1 = sc.nextLine();
            switch (choice1) {
                case "1":
                    displayStudent();
                    break;
                case "2":
                    displayTeacher();
                    break;
                case "3":
                    System.out.println("Thoát quản lý codegym");
                    System.exit(0);
                default:
                    System.out.println("Bạn nhập không đúng.Mời bạn nhập lại.");
            }
        } while (flag1);
    }

    public void displayStudent() {
        boolean flag2 = true;
        do {

            System.out.println("---CHƯỜNG TRÌNH QUẢN LÝ SINH VIÊN--- \n" +
                    "Chọn chức năng để tiếp tục \n" +
                    "1. Thêm mới sinh viên \n" +
                    "2. Xoá sinh viên \n" +
                    "3. Xem danh sách sinh viên \n" +
                    "4. Thoát\n" +
                    "Chọn chức năng: ");
            String choice2 = sc.nextLine();
            switch (choice2) {
                case "1":
                    iStudentService.addNewStudent();
                    break;
                case "2":
                    iStudentService.deleteStudent();
                    break;
                case "3":
                    iStudentService.displayStudent();
                    break;
                case "4":
                    System.out.println("Thoát quản lý sinh viên");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Bạn nhập không đúng.Mời bạn nhập lại.");
            }
        } while (flag2);
    }

    public void displayTeacher() {
        boolean flag3 = true;
        String choice3;
        do {

            System.out.println("--CHƯƠNG TRÌNH QUẢN LÝ GIẢNG VIÊN-- \n" +
                    "Chọn chức năng để tiếp tục \n" +
                    "1. Thêm mới giảng viên. \n" +
                    "2. Xóa giảng viên. \n" +
                    "3. Xem danh sách giảng viên. \n" +
                    "4. Thoát \n" +
                    "Chọn chức năng: ");
            choice3 = sc.nextLine();
            switch (choice3) {
                case "1":
                    iTeacherService.addNewTeacher();
                    break;
                case "2":
                    iTeacherService.deleteTeacher();
                    break;
                case "3":
                    iTeacherService.displayTeacher();
                    break;
                case "4":
                    System.out.println("Thoát quản lý giảng viên");
                    System.exit(0);
                default:
                    System.out.println("Bạn nhập không đúng.Mời bạn nhập lại.");
                    break;
            }
        } while (flag3);
    }
}
