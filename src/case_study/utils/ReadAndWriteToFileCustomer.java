package case_study.utils;

import case_study.model.Customer;
import case_study.model.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteToFileCustomer {
    public static void writeFile(List<Customer> customers, String path) {
        File file = new File(path);
        try {
            FileWriter fileWriter = new FileWriter(file,false);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for(Customer customer : customers){
                bufferedWriter.write(customer.writeToFileCustomer());
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Customer> readFile(String path) {
        List<Customer> list = new ArrayList<>();
        File file = new File(path);
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String temp;
            while ((temp = bufferedReader.readLine()) != null && !temp.equals("")) {
                String[] tempArr = temp.split(",");
                Customer customer = new Customer(
                        tempArr[0],
                        tempArr[1],
                        tempArr[2],
                        tempArr[3],
                        tempArr[4],
                        tempArr[5],
                        tempArr[6],
                        tempArr[7],
                        tempArr[8]);
                list.add(customer);
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
