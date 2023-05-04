package case_study.utils;

import case_study.model.Employee;
import case_study.model.House;

import java.io.*;
import java.util.*;

public class ReadAndWrileToFileHouse {
    public static void writeFile(Map<House,Integer> house, String path) {
        File file = new File(path);
        try {
            FileWriter fileWriter = new FileWriter(file,false);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            Set<House> houseSet = house.keySet();
            for(House h : houseSet){
                bufferedWriter.write(h.writeToFileHouse() + "," + house.get(h));
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Map<House,Integer> readFile(String path) {
        Map<House,Integer> houseIntegerMap = new LinkedHashMap<>();
        File file = new File(path);
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String temp;
            while ((temp = bufferedReader.readLine()) != null && !temp.equals("")) {
                String[] tempArr = temp.split(",");
                House house = new House(
                        tempArr[0],
                        tempArr[1],
                        Double.parseDouble(tempArr[2]),
                        Double.parseDouble(tempArr[3]),
                        Integer.parseInt(tempArr[4]),
                        tempArr[5],
                        tempArr[6],
                        Integer.parseInt(tempArr[7]));
                int value = Integer.parseInt(tempArr[8]);
                houseIntegerMap.put(house,value);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return houseIntegerMap;
    }
}
