package case_study.utils;

import case_study.model.Employee;
import case_study.model.Room;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrileToFileRoom {
    public static void writeFile(List<Room> room, String path) {
        File file = new File(path);
        try {
            FileWriter fileWriter = new FileWriter(file,false);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for(Room r : room){
                bufferedWriter.write(r.writeToFileRoom());
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Room> readFile(String path) {
        List<Room> list = new ArrayList<>();
        File file = new File(path);
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String temp;
            while ((temp = bufferedReader.readLine()) != null && !temp.equals("")) {
                String[] tempArr = temp.split(",");
//                String idService, String nameService, double area, double price, int maxPeople, String kindType, String freeService
                Room r = new Room(
                        tempArr[0],
                        tempArr[1],
                        Double.parseDouble(tempArr[2]),
                        Double.parseDouble(tempArr[3]),
                        Integer.parseInt(tempArr[4]),
                        tempArr[5],
                        tempArr[6]);
                list.add(r);
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
