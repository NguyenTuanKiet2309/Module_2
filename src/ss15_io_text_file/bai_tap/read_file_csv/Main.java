package ss15_io_text_file.bai_tap.read_file_csv;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String path = "src/ss15_io_text_file/bai_tap/read_file_csv/country.csv";
        File file = new File(path);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        String temp;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            while ((temp = bufferedReader.readLine()) != null) {
                printCountry(addList(temp));
            }
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
    }

    public static List<String> addList(String str) {
        List<String> list = new ArrayList<>();
        if (str != null) {
            String[] arr = str.split(",");
            for (int i = 0; i < arr.length; i++) {
                list.add(arr[i]);
            }
        }
        return list;
    }

    private static void printCountry(List<String> country) {
        System.out.println("[id= "
                + country.get(0)
                + ", code= " + country.get(1)
                + " , name=" + country.get(2)
                + "]");
    }
}