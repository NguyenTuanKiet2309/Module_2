package mo_hinh_mvc.repository;

import mo_hinh_mvc.model.Student;

import java.util.List;

public interface IStudentRepository {
    List<Student> getStudenlist();

    void addStudent(Student student);

   boolean editStudent(String id);

    boolean deleteStudent(String id);
}
