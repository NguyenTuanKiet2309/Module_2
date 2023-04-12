package ss8_clean_code_and_refactory.mvc.view;

import ss8_clean_code_and_refactory.mvc.controller.StudentController;
import ss8_clean_code_and_refactory.mvc.model.Student;

public class StudentManager {
    public static void main(String[] args) {
        StudentController studentController = new StudentController();
        studentController.displayStudent();
    }
}
