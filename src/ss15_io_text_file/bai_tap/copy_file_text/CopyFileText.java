package ss15_io_text_file.bai_tap.copy_file_text;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CopyFileText {
    public static void main(String[] args) {
        String path = "src/ss15_io_text_file/bai_tap/copy_file_text/source_file";
        File file = new File(path);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        List<String> list = new ArrayList();
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String temp;
            while ((temp = bufferedReader.readLine()) != null) {
                list.add(temp);
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

        String path1 = "src/ss15_io_text_file/bai_tap/copy_file_text/target";
        File file1 = new File(path1);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        int count = 0;
        try {
            fileWriter = new FileWriter(file1, true);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (String s : list) {
                bufferedWriter.write(s);
                bufferedWriter.newLine();
                count += s.length();
            }
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
        System.out.println("Tổng số ký tự là: " + count);
        System.out.println(list);
    }
}

