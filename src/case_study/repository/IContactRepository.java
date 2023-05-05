package case_study.repository;

import case_study.model.Contract;

import java.util.List;

public interface IContactRepository {
    void createNewContract(Contract contract);

    List<Contract> displayContract();

    void editContract();

    int checkIdContract(String id);
}
