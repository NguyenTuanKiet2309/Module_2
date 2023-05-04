package case_study.repository;

import case_study.model.House;
import case_study.service.HouseService;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public interface IHouseRepository {
    void addHouse(House house);

    Map<House, Integer> getHouseList();
}
