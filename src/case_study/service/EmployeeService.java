package case_study.service;

import case_study.model.Employee;
import case_study.repository.EmployeeRepository;
import case_study.utils.ReadAndWriteFileEmployee;

import java.util.List;
import java.util.Scanner;

public class EmployeeService implements IEmployeeService {
    Scanner sc = new Scanner(System.in);
    private EmployeeRepository employeeRepository = new EmployeeRepository();
    private static final String EMPLOYEE_PATH = "src/case_study/data/employee.csv";
    List<Employee> employeeList = employeeRepository.getEmployeeList();

    @Override
    public void addEmployee() {
        System.out.println("Mời bạn nhập mã nhân viên");
        String idEmployee = sc.nextLine();
        System.out.println("Mời bạn nhâp tên nhân viên: ");
        String nameEmployee = sc.nextLine();
        System.out.println("Mời bạn nhâp ngày sinh nhân viên: ");
        String dayOfBirthEmployee = sc.nextLine();
        System.out.println("Mời bạn chọn giới tính nhân viên\n" +
                "1. Nam \n" +
                "2. Nữ: ");
        boolean genderEmployee = false;
        String chooseGender = sc.nextLine();
        if (chooseGender.equals("1")) {
            genderEmployee = true;
        } else if (chooseGender.equals("2")) {
            genderEmployee = false;
        }

        System.out.println("Mời bạn nhâp CMND nhân viên: ");
        int identilyCardEmployee = Integer.parseInt(sc.nextLine());
        System.out.println("Mời bạn nhâp SDT nhân viên: ");
        int phoneNumberEmployee = Integer.parseInt(sc.nextLine());
        System.out.println("Mời bạn nhâp email nhân viên: ");
        String emailEmployee = sc.nextLine();
        System.out.println("Mời bạn nhâp trình độ nhân viên: ");
        String educationEmployee = sc.nextLine();
        System.out.println("Mời bạn nhâp vị trí nhân viên: ");
        String locationEmployee = sc.nextLine();
        System.out.println("Mời bạn nhâp lương nhân viên: ");
        double salaryEmployee = Double.parseDouble(sc.nextLine());
        Employee employee = new Employee(idEmployee, nameEmployee, dayOfBirthEmployee, genderEmployee, identilyCardEmployee, phoneNumberEmployee
                , emailEmployee, educationEmployee, locationEmployee, salaryEmployee);
        employeeRepository.addEmployee(employee);
        System.out.println("Thêm mới thành công");
    }

    @Override
    public void editEployee() {
        System.out.println("Mời bạn nhập mã nhân viên");
        String idEdit = sc.nextLine();
        System.out.println("Nhập tên nhân viên cần sửa: ");
        String name = sc.nextLine();
        int flag = employeeRepository.editEmployee(name);
        System.out.println(flag);
        if (flag == -1) {
            System.out.println("Không tìm thấy tên nhân viên");
        } else {
            System.out.println("Mời bạn nhập lại tên nhân viên");
            String nameEdit = sc.nextLine();
            System.out.println("Mời bạn nhâp ngày sinh nhân viên: ");
            String dayOfBirthEdit = sc.nextLine();
            System.out.println("Mời bạn chọn giới tính nhân viên\n" +
                    "1. Nam \n" +
                    "2. Nữ: ");
            boolean genderEdit = false;
            String chooseGender = sc.nextLine();
            if (chooseGender.equals("1")) {
                genderEdit = true;
            } else if (chooseGender.equals("2")) {
                genderEdit = false;
            }
            System.out.println("Mời bạn nhâp CMND nhân viên: ");
            int identilyCardEdit = Integer.parseInt(sc.nextLine());
            System.out.println("Mời bạn nhâp SDT nhân viên: ");
            int phoneNumberEdit = Integer.parseInt(sc.nextLine());
            System.out.println("Mời bạn nhâp email nhân viên: ");
            String emailEdit = sc.nextLine();
            System.out.println("Mời bạn nhâp trình độ nhân viên: ");
            String educationEdit = sc.nextLine();
            System.out.println("Mời bạn nhâp vị trí nhân viên: ");
            String locationEdit = sc.nextLine();
            System.out.println("Mời bạn nhâp lương nhân viên: ");
            double salaryEdit = Double.parseDouble(sc.nextLine());
            Employee employee = new Employee(idEdit, nameEdit, dayOfBirthEdit, genderEdit, identilyCardEdit, phoneNumberEdit,
                    emailEdit, educationEdit, locationEdit, salaryEdit);
            employeeList.set(flag, employee);
            ReadAndWriteFileEmployee.writeFile(employeeList, EMPLOYEE_PATH);
        }
    }

    @Override
    public void showEmployeeList() {
        List<Employee> list = employeeRepository.getEmployeeList();
        for (Employee e : list) {
            System.out.println(e);
        }
    }
}
