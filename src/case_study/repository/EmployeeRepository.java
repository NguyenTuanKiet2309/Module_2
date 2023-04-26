package case_study.repository;

import case_study.model.Employee;
import case_study.utils.ReadAndWriteFileEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeRepository implements IEmployeeRepository {
    Scanner sc = new Scanner(System.in);
    private static List<Employee> employeeList = new ArrayList<>();
    private static final String EMPLOYEE_PATH = "src/case_study/data/employee.csv";

    @Override
    public List<Employee> getEmployeeList() {
        employeeList = ReadAndWriteFileEmployee.readFile(EMPLOYEE_PATH);
        return employeeList;
    }

    @Override
    public void addEmployee(Employee employee) {
        employeeList.add(employee);
        ReadAndWriteFileEmployee.writeFile(employeeList, EMPLOYEE_PATH);
    }

    @Override
    public int editEmployee(String input) {
        int size = employeeList.size();
        for (int i = 0; i < size; i++) {
            if (employeeList.get(i).getNamePerson().equals(input)) {
                return i;
            }
        }
        return -1;
    }
}
