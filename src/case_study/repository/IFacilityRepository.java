package case_study.repository;

import case_study.model.Facility;

import java.util.LinkedHashMap;

public interface IFacilityRepository {
    LinkedHashMap<Facility, Integer> getFacilityList();

    void addFacility();

    void showMaintenanceList();
}
