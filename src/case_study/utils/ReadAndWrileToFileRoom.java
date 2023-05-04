package case_study.utils;

import case_study.model.Employee;
import case_study.model.Room;

import java.io.*;
import java.util.*;

public class ReadAndWrileToFileRoom {
    public static void writeFile(Map<Room, Integer> roomList, String path) {
        File file = new File(path);
        try {
            FileWriter fileWriter = new FileWriter(file, false);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            Set<Room> roomSet = roomList.keySet();
            for (Room r : roomSet) {
                bufferedWriter.write(r.writeToFileRoom() + "," + roomList.get(r));
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Map<Room, Integer> readFile(String path) {
        Map<Room, Integer> roomMap = new LinkedHashMap<>();
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
                int value = Integer.parseInt(tempArr[7]);
                roomMap.put(r, value);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return roomMap;
    }
}
