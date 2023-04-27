package case_study.repository;

import case_study.model.Employee;
import case_study.utils.ReadAndWriteToFileEmployee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository {
    private static List<Employee> employeeList = new ArrayList<>();
    private static final String EMPLOYEE_PATH = "src/case_study/data/employee.csv";

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
    public int editEmployee(String input) {
        int size = employeeList.size();
        for (int i = 0; i < size; i++) {
            if (employeeList.get(i).getIdEmployee().equals(input)) {
                return i;
            }
        }
        return -1;
    }
}
