package mo_hinh_mvc.common;

import mo_hinh_mvc.model.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteAndReadFile {

    public static void writeFile(Student student) {
        String path = "src/mo_hinh_mvc/data/data.txt";
        File file = new File(path);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file,true);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(student.writeToFile());
            bufferedWriter.newLine();
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileWriter.close();
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static List<Student> readFile() {
        String path = "src/mo_hinh_mvc/data/data.txt";
        List<Student> list = new ArrayList<>();
        File file = new File(path);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String temp;
            String[] tempArr;
            Student student;
            while ((temp = bufferedReader.readLine()) != null) {
                tempArr = temp.split(",");
                student = new Student(tempArr[0], tempArr[1], tempArr[2]);
                list.add(student);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileReader.close();
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return list;
    }
}
