package mo_hinh_mvc.repository;

import mo_hinh_mvc.model.Student;

import java.util.List;

public interface IStudentRepository {
    List<Student> getStudenlist();

    void addStudent(Student student);

    void editStudent(int id, int input);

    boolean deleteStudent(String id);

    int checkId(String id);
}
