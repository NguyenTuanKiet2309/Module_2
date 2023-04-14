package ss9_dsa_danh_sach.bai_tap.quan_ly_code_gym.controller;

import ss9_dsa_danh_sach.bai_tap.quan_ly_code_gym.service.IStudentService;
import ss9_dsa_danh_sach.bai_tap.quan_ly_code_gym.service.StudentService;

public class StudentController {
    private IStudentService iStudentService = new StudentService();

    public void displayStudent() {
        iStudentService.displayStudent();;
    }
}
