package mo_hinh_mvc.view;

import mo_hinh_mvc.controller.StudentController;

public class StudentManager {
    public static void main(String[] args) {
        StudentController studentController = new StudentController();
        studentController.showStudent();
    }
}
