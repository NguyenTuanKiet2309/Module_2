package case_study.repository;

import case_study.model.Villa;
import case_study.utils.ReadAndWrileToFileVilla;

import java.util.LinkedHashMap;
import java.util.Map;

public class VillaRepository implements IVillaRepository {
    private Map<Villa, Integer> villaList = new LinkedHashMap<>();
    static final String VILLA_PATH = "src/case_study/data/villa.csv";

    @Override
    public void addVilla(Villa villa) {
        villaList = ReadAndWrileToFileVilla.readFile(VILLA_PATH);
        villaList.put(villa, 0);
        ReadAndWrileToFileVilla.writeFile(villaList, VILLA_PATH);
    }

    @Override
    public Map<Villa, Integer> getVillaList() {
        villaList = ReadAndWrileToFileVilla.readFile(VILLA_PATH);
        return villaList;
    }
}
