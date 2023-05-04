package case_study.repository;

import case_study.model.House;
import case_study.utils.ReadAndWrileToFileHouse;

import java.util.LinkedHashMap;
import java.util.Map;


public class HouseRepository implements IHouseRepository {
    private Map<House, Integer> houseList = new LinkedHashMap<>();
    static final String HOUSE_PATH = "src/case_study/data/house.csv";

    @Override
    public void addHouse(House house) {
        houseList = ReadAndWrileToFileHouse.readFile(HOUSE_PATH);
        houseList.put(house, 0);
        ReadAndWrileToFileHouse.writeFile(houseList, HOUSE_PATH);
    }

    @Override
    public Map<House, Integer> getHouseList() {
        houseList = ReadAndWrileToFileHouse.readFile(HOUSE_PATH);
        return houseList;
    }
}
