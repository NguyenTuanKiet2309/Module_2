package ss9_dsa_danh_sach.bai_tap.quan_ly_code_gym.service;

import ss9_dsa_danh_sach.bai_tap.quan_ly_code_gym.repository.IStudentRepository;
import ss9_dsa_danh_sach.bai_tap.quan_ly_code_gym.repository.StudentRepository;

public class StudentService implements IStudentService{
    private StudentRepository studentRepository = new StudentRepository();

    @Override
    public void displayStudent() {
        studentRepository.displayStudent();
    }

    @Override
    public void addNewStudent() {

    }

    @Override
    public void deleteStudent() {

    }
}
