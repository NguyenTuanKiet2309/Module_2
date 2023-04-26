package case_study.utils;

import case_study.model.Employee;
import mo_hinh_mvc.model.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFileEmployee {

    public static void writeFile(List<Employee> employees, String path) {
        File file = new File(path);
        try {
            FileWriter fileWriter = new FileWriter(file,false);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for(Employee employee : employees){
                bufferedWriter.write(employee.writeToFileEmployee());
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Employee> readFile(String path) {
        List<Employee> list = new ArrayList<>();
        File file = new File(path);
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String temp;
            while ((temp = bufferedReader.readLine()) != null) {
                String[] tempArr = temp.split(",");
                Employee employee = new Employee(
                        tempArr[0],
                        tempArr[1],
                        tempArr[2],
                        Boolean.parseBoolean(tempArr[3]),
                        Integer.parseInt(tempArr[4]),
                        Integer.parseInt(tempArr[5]),
                        tempArr[6],
                        tempArr[7],
                        tempArr[8],
                        Double.parseDouble(tempArr[9]));
                list.add(employee);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }
}
