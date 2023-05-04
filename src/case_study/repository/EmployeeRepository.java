package case_study.repository;

import case_study.model.Employee;
import case_study.utils.ReadAndWriteToFileEmployee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository {
    private List<Employee> employeeList = new ArrayList<>();
    private final String EMPLOYEE_PATH = "src/case_study/data/employee.csv";

    @Override
    public List<Employee> getEmployeeList() {
        employeeList = ReadAndWriteToFileEmployee.readFile(EMPLOYEE_PATH);
        return employeeList;
    }

    @Override
    public void addEmployee(Employee employee) {
        employeeList.add(employee);
        ReadAndWriteToFileEmployee.writeFile(employeeList, EMPLOYEE_PATH);
    }

    @Override
    public int findIdEmployee(String idEmployee) {
        int size = employeeList.size();
        for (int i = 0; i < size; i++) {
            if (employeeList.get(i).getIdEmployee().equals(idEmployee)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void editEmployee(Employee employee) {
        employeeList.set(findIdEmployee(employee.getIdEmployee()), employee);
        ReadAndWriteToFileEmployee.writeFile(employeeList, EMPLOYEE_PATH);
    }
}
