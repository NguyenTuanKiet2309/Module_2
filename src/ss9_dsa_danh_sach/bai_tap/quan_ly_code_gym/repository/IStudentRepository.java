package ss9_dsa_danh_sach.bai_tap.quan_ly_code_gym.repository;

import ss9_dsa_danh_sach.bai_tap.quan_ly_code_gym.model.Student;

import java.util.List;

public interface IStudentRepository {
    List<Student> getStudentList();

    boolean deleteStudent(int id);

    void addNewStudent(Student student);
}
