package ss8_clean_code_and_refactory.mvc.controller;

import ss8_clean_code_and_refactory.mvc.service.IStudentService;
import ss8_clean_code_and_refactory.mvc.service.StudentService;

public class StudentController {
    private IStudentService iStudentService = new StudentService();

    public void displayStudent() {
        iStudentService.displayStudent();
    }
}
