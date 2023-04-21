package mo_hinh_mvc.repository;

import mo_hinh_mvc.common.WriteAndReadFile;
import mo_hinh_mvc.model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentRepository implements IStudentRepository {
    Scanner sc = new Scanner(System.in);
    static List<Student> list = new ArrayList<>();

    static {
        list.add(new Student("01", "NGuyễn TUấn Kiệt", "tuankiett@gmail.com"));
        list.add(new Student("02", "NGuyễn Đức Trung", "ductrung@gmail.com"));
        list.add(new Student("03", "Phạm Công Nam", "congnam@gmail.com"));
    }


    @Override
    public List<Student> getStudenlist() {
        return WriteAndReadFile.readFile();
    }

    @Override
    public void addStudent(Student student) {
        WriteAndReadFile.writeFile(student);
    }

    @Override
    public boolean editStudent(String id) {
        for (int i = 0; i < list.size(); i++) {
            if (id.equals(list.get(i).getId())) {
                int x = i;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean deleteStudent(String id) {
        for (int i = 0; i < list.size(); i++) {
            if (id.equals(list.get(i).getId())) {
                list.remove(i);
                return true;
            }
        }
        return false;
    }
}
