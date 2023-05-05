package case_study.service;

import case_study.model.House;
import case_study.model.Room;
import case_study.model.Villa;
import case_study.repository.FacilityRepository;
import case_study.repository.HouseRepository;
import case_study.repository.RoomRepository;
import case_study.repository.VillaRepository;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class FacilityService implements IFacilityService {
    Scanner sc = new Scanner(System.in);
    FacilityRepository facilityRepository = new FacilityRepository();
    RoomRepository roomRepository = new RoomRepository();
    VillaRepository villaRepository = new VillaRepository();
    HouseRepository houseRepository = new HouseRepository();

    @Override
    public void displayListFacility() {
        Map<Villa, Integer> villaMap = villaRepository.getVillaList();
        Set<Villa> villaSet = villaMap.keySet();
        Map<House, Integer> houseMap = houseRepository.getHouseList();
        Set<House> houseSet = houseMap.keySet();
        Map<Room, Integer> roomMap = roomRepository.getRoomList();
        Set<Room> roomSet = roomMap.keySet();
        for (Villa v : villaSet) {
            System.out.println(v + " - " + villaMap.get(v) + " used");
        }
        for (House h : houseSet) {
            System.out.println(h + " - " + houseMap.get(h) + " used");
        }
        for (Room r : roomSet) {
            System.out.println(r + " - " + roomMap.get(r) + " used");
        }
    }

    @Override
    public void displayListFacilityMaintenance() {
        facilityRepository.showMaintenanceList();
    }
}
