package case_study.repository;

import case_study.model.Facility;
import case_study.model.House;
import case_study.model.Room;
import case_study.model.Villa;

import java.util.LinkedHashMap;
import java.util.Map;

public class FacilityRepository implements IFacilityRepository {
    private static LinkedHashMap<Facility, Integer> facilityList = new LinkedHashMap<>();
    private static final String ROOM_PATH = "src/case_study/data/room.csv";
    private static final String VILLA_PATH = "src/case_study/data/villa.csv";
    private static final String HOUSE_PATH = "src/case_study/data/house.csv";

    @Override
    public LinkedHashMap<Facility, Integer> getFacilityList() {
        return null;
    }

    @Override
    public void addFacility() {

    }

    @Override
    public void showMaintenanceList() {

    }
}
