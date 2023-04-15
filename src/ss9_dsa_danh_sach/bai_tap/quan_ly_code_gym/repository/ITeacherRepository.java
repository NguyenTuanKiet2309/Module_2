package ss9_dsa_danh_sach.bai_tap.quan_ly_code_gym.repository;

import ss9_dsa_danh_sach.bai_tap.quan_ly_code_gym.model.Student;
import ss9_dsa_danh_sach.bai_tap.quan_ly_code_gym.model.Teacher;

import java.util.List;

public interface ITeacherRepository {
    List<Teacher> getTeacherList();

    boolean deleteTeacher(int id);

    void addNewTeacher(Teacher teacher);
}
