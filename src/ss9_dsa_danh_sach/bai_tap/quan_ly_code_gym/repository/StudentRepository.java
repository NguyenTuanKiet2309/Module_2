package ss9_dsa_danh_sach.bai_tap.quan_ly_code_gym.repository;

import ss9_dsa_danh_sach.bai_tap.array_list.MyList;
import ss9_dsa_danh_sach.bai_tap.quan_ly_code_gym.model.Student;
import ss9_dsa_danh_sach.bai_tap.quan_ly_code_gym.model.Teacher;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentRepository implements IStudentRepository {
    private static ArrayList<Student> students = new ArrayList<>();
    private static ArrayList<Teacher> teachers = new ArrayList<>();

        static {
            students.add(new Student(1, "Kiệt", "09/071996", "Male", "C0223G1", 10));
            students.add(new Student(2, "Nam", "11/11/1997", "male", "C0223G1", 9));
            students.add(new Student(3, "Hưnng", "22/2/2002", "male", "C0223G1", 8));
//            teachers.add(new Teacher(4, "TrungMini", "3/3/1996", "male", "module2"));
//            teachers.add(new Teacher(5, "Công", "4/4/1984", "male", "module2"));
//            teachers.add(new Teacher(6, "Chánh", "5/5/1985", "male", "module1"));
        }

    @Override
    public void displayStudent() {
        for (Student s : students) {
            if (s == null) {
                break;
            }
            System.out.println(s);
        }
    }

    @Override
    public void deleteStudent() {

    }
}
