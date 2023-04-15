package ss9_dsa_danh_sach.bai_tap.quan_ly_code_gym.repository;

import ss9_dsa_danh_sach.bai_tap.quan_ly_code_gym.model.Student;
import ss9_dsa_danh_sach.bai_tap.quan_ly_code_gym.model.Teacher;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository implements IStudentRepository {
    private static ArrayList<Student> studenList = new ArrayList<>();


    static {
        studenList.add(new Student(1, "Kiệt", "09/071996", "Male", "C0223G1", 10));
        studenList.add(new Student(2, "Nam", "11/11/1997", "male", "C0223G1", 9));
        studenList.add(new Student(3, "Hưnng", "22/2/2002", "male", "C0223G1", 8));
    }


    @Override
    public List<Student> getStudentList() {
        return studenList;
    }

    @Override
    public boolean deleteStudent(int id) {
        for (int i = 0; i < studenList.size(); i++) {
            if (id == studenList.get(i).getId()) {
                studenList.remove(i);
                return true;
            }
        }
        return false;
    }


    @Override
    public void addNewStudent(Student student) {
        studenList.add(student);
    }
}
