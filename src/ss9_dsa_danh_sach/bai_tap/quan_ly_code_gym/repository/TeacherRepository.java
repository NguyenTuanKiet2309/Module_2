package ss9_dsa_danh_sach.bai_tap.quan_ly_code_gym.repository;

import ss9_dsa_danh_sach.bai_tap.quan_ly_code_gym.model.Teacher;

import java.util.ArrayList;
import java.util.List;

public class TeacherRepository implements ITeacherRepository {
    private static ArrayList<Teacher> teachersList = new ArrayList<>();

    static {
        teachersList.add(new Teacher(1, "TrungMini", "3/3/1996", "male", "module2"));
        teachersList.add(new Teacher(2, "Công", "4/4/1984", "male", "module2"));
        teachersList.add(new Teacher(3, "Chánh", "5/5/1985", "male", "module1"));
    }

    @Override
    public List<Teacher> getTeacherList() {
        return teachersList;
    }

    @Override
    public boolean deleteTeacher(int id) {
        for (int i = 0; i < teachersList.size(); i++) {
            if (id == teachersList.get(i).getId()) {
                teachersList.remove(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public void addNewTeacher(Teacher teacher) {
        teachersList.add(teacher);
    }
}
