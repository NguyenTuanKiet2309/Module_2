package case_study.repository;

import case_study.model.House;
import case_study.model.Villa;

import java.util.List;
import java.util.Map;

public interface IVillaRepository {
    void addVilla(Villa villa);

    Map<Villa,Integer> getVillaList();
}
