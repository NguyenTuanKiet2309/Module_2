package case_study.repository;

import case_study.model.Facility;
import case_study.model.House;
import case_study.model.Room;
import case_study.model.Villa;
import case_study.utils.ReadAndWrileToFileHouse;
import case_study.utils.ReadAndWrileToFileRoom;
import case_study.utils.ReadAndWrileToFileVilla;
import org.omg.PortableInterceptor.ServerRequestInfo;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class FacilityRepository implements IFacilityRepository {
    private static Map<Villa, Integer> villaMap = ReadAndWrileToFileVilla.readFile("src/case_study/data/villa.csv");
    private static Map<House, Integer> houseMap = ReadAndWrileToFileHouse.readFile("src/case_study/data/house.csv");
    private static Map<Room, Integer> roomMap = ReadAndWrileToFileRoom.readFile("src/case_study/data/room.csv");

    @Override
    public void showMaintenanceList() {
        Set<Villa> villaSet = villaMap.keySet();
        for (Villa v : villaSet) {
            if (villaMap.get(v) > 4) {
                System.out.println(v);
            }
        }
        Set<House> houseSet = houseMap.keySet();
        for (House h : houseSet) {
            if (houseMap.get(h) > 4) {
                System.out.println(h);
            }
        }
        Set<Room> roomSet = roomMap.keySet();
        for (Room r : roomSet) {
            if (roomMap.get(r) > 4) {
                System.out.println(r);
            }
        }
    }
}
