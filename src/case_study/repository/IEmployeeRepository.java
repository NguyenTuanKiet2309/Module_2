package case_study.repository;

import case_study.model.Employee;

import java.util.List;

public interface IEmployeeRepository {
    List<Employee> getEmployeeList();

    void addEmployee(Employee employee);

    int findIdEmployee(String input);

    void editEmployee(Employee employee);
}
