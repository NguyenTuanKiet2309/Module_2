package mo_hinh_mvc.repository;

import mo_hinh_mvc.common.WriteAndReadFile;
import mo_hinh_mvc.model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentRepository implements IStudentRepository {
    Scanner sc = new Scanner(System.in);
    private static List<Student> list = new ArrayList<>();
    private static final String STUDENT_PATH = "src/mo_hinh_mvc/data/data.txt";

    @Override
    public List<Student> getStudenlist() {
        list = WriteAndReadFile.readFile(STUDENT_PATH);
        return list;
    }

    @Override
    public void addStudent(Student student) {
        list.add(student);
        WriteAndReadFile.writeFile(list, STUDENT_PATH);
    }

    @Override
    public void editStudent(int index, int input) {
        if (input == 1) {
            System.out.println("Nhập vào mã cần sửa");
            String newId = sc.nextLine();
            list.get(index).setId(newId);
        } else if (input == 2) {
            System.out.println("Nhập vào tên cần sửa");
            String newName = sc.nextLine();
            list.get(index).setName(newName);
        } else if (input == 3) {
            System.out.println("Nhập vào email cần sửa");
            String newEmail = sc.nextLine();
            list.get(index).setEmail(newEmail);
        }
        WriteAndReadFile.writeFile(list, STUDENT_PATH);
    }

    @Override
    public boolean deleteStudent(String id) {
        int sizeList = list.size();
        for (int i = 0; i < sizeList; i++) {
            if (list.get(i).getId().equals(id)) {
                list.remove(i);
                WriteAndReadFile.writeFile(list, STUDENT_PATH);
                return true;
            }
        }
        return false;
    }

    @Override
    public int checkId(String id) {
        int result = -1;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(id)) {
                result = i;
                break;
            }
        }
        return result;
    }
}

