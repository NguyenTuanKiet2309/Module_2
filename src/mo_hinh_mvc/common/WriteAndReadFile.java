package mo_hinh_mvc.common;

import mo_hinh_mvc.model.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteAndReadFile {

    public static void writeFile(List<Student> student, String path) {
        File file = new File(path);
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Student s : student) {
                bufferedWriter.write(s.writeToFile());
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Student> readFile(String path) {
        List<Student> list = new ArrayList<>();
        File file = new File(path);
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String temp = null;
            while ((temp = bufferedReader.readLine()) != null) {
                String[] tempArr = temp.split(",");
                Student student = new Student(tempArr[0], tempArr[1], tempArr[2]);
                list.add(student);
            }
            fileReader.close();
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }
}
