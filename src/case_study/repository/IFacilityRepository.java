package case_study.repository;

import case_study.model.Facility;

import java.util.LinkedHashMap;
import java.util.Map;

public interface IFacilityRepository {
    Map<Facility, Integer> getFacilityList();

    void showMaintenanceList();
}
