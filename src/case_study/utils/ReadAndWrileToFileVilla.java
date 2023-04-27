package case_study.utils;

import case_study.model.Employee;
import case_study.model.Villa;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrileToFileVilla {
    public static void writeFile(List<Villa> villas, String path) {
        File file = new File(path);
        try {
            FileWriter fileWriter = new FileWriter(file,false);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for(Villa v : villas){
                bufferedWriter.write(v.writeToFileVilla());
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Villa> readFile(String path) {
        List<Villa> list = new ArrayList<>();
        File file = new File(path);
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String temp;
            while ((temp = bufferedReader.readLine()) != null && !temp.equals("")) {
                String[] tempArr = temp.split(",");
//                String idService, String nameService, double area, double price, int maxPeople,
//                String kindType, String roomStandard, double areaPool, int floorVilla
                Villa v = new Villa(
                        tempArr[0],
                        tempArr[1],
                        Double.parseDouble(tempArr[2]),
                        Double.parseDouble(tempArr[3]),
                        Integer.parseInt(tempArr[4]),
                        tempArr[5],
                        tempArr[6],
                        Double.parseDouble(tempArr[7]),
                        Integer.parseInt(tempArr[8]));
                list.add(v);
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
