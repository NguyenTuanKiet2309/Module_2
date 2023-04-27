package case_study.service;

import case_study.model.Employee;
import case_study.repository.EmployeeRepository;
import case_study.utils.ReadAndWriteToFileEmployee;
import case_study.utils.ValidateFurama;

import java.util.List;
import java.util.Scanner;

public class EmployeeService implements IEmployeeService {
    Scanner sc = new Scanner(System.in);
    private EmployeeRepository employeeRepository = new EmployeeRepository();
    private static final String EMPLOYEE_PATH = "src/case_study/data/employee.csv";
    List<Employee> employeeList = employeeRepository.getEmployeeList();

    @Override
    public void addEmployee() {
        String idEmployee;
        do {
            System.out.print("Enter Id Employee: ");
            idEmployee = sc.nextLine();
            if (ValidateFurama.checkIdEmployee(idEmployee)) {
                System.out.println("Success");
            } else {
                System.out.println("You input invalid format(NV-XXXX).");
            }
        } while (!ValidateFurama.checkIdEmployee(idEmployee));

        String nameEmployee;
        do {
            System.out.print("Enter Name For Employee: ");
            nameEmployee = sc.nextLine();
            if (ValidateFurama.checkName(nameEmployee)) {
                System.out.println("Success");
            } else {
                System.out.println("You input invalid format(Capitalize first letter)");
            }
        } while (!ValidateFurama.checkName(nameEmployee));

        String dayOfBirthEmployee;
        do {
            System.out.print("Enter Day Of Birth For Employee(dd/mm/yyyy): ");
            dayOfBirthEmployee = sc.nextLine();
            if (ValidateFurama.checkDayOfBirth(dayOfBirthEmployee)) {
                System.out.println("Success");
            } else {
                System.out.println("You input invalid format");
            }
        } while (!ValidateFurama.checkDayOfBirth(dayOfBirthEmployee));

        String genderEmployee = "";
        boolean flag1 = true;
        do {
            System.out.println("Enter Gender For Employee \n" +
                    "1. Male \n" +
                    "2. Female \n" +
                    "Enter your choice: ");
            String choiceGender = sc.nextLine();
            switch (choiceGender) {
                case "1":
                    genderEmployee = "Male";
                    flag1 = false;
                    break;
                case "2":
                    genderEmployee = "Female";
                    flag1 = false;
                    break;
                default:
                    System.out.println("No choice - Enter your choice again!");
                    flag1 = true;
            }
        } while (flag1);

        String identilyCardEmployee;
        do {
            System.out.print("Enter Identity for Employee: ");
            identilyCardEmployee = sc.nextLine();
            if (ValidateFurama.checkIdentity(identilyCardEmployee)) {
                System.out.println("Success");
            } else {
                System.out.println("You input invalid format(9 or 12 number)");
            }
        } while (!ValidateFurama.checkIdentity(identilyCardEmployee));

        String phoneNumberEmployee;
        do {
            System.out.print("Enter Phone Number For Employee: ");
            phoneNumberEmployee = sc.nextLine();
            if (ValidateFurama.checkPhone(phoneNumberEmployee)) {
                System.out.println("Success");
            } else {
                System.out.println("You input invalid format(Start by number 0 and has 10 numbers)");
            }
        } while (!ValidateFurama.checkPhone(phoneNumberEmployee));
        System.out.print("Enter Email For Employee: ");
        String emailEmployee = sc.nextLine();

        String educationEmployee = "";
        boolean flag2 = true;
        do {
            System.out.print("Enter Education For Employee \n" +
                    "1. Intermediate \n" +
                    "2. College \n" +
                    "3. University \n" +
                    "4. After university\n" +
                    "Enter your choice: ");
            String choiceEducation = sc.nextLine();
            switch (choiceEducation) {
                case "1":
                    educationEmployee = "Intermediate";
                    flag2 = false;
                    break;
                case "2":
                    educationEmployee = "College";
                    flag2 = false;
                    break;
                case "3":
                    educationEmployee = "University";
                    flag2 = false;
                    break;
                case "4":
                    educationEmployee = "After university";
                    flag2 = false;
                    break;
                default:
                    System.out.println("No choice - Enter your choice again!");
                    flag2 = true;
            }
        } while (flag2);
        String locationEmployee = "";
        boolean flag3 = true;
        do {
            System.out.print("Enter Location for Employee \n" +
                    "1. Receptionist \n" +
                    "2. Serve \n" +
                    "3. Expert \n" +
                    "4. Monitor \n" +
                    "5. Manage \n" +
                    "6. Manager \n" +
                    "Enter your choice: ");
            String choiceLocation = sc.nextLine();
            switch (choiceLocation) {
                case "1":
                    locationEmployee = "Receptionist";
                    flag3 = false;
                    break;
                case "2":
                    locationEmployee = "Serve";
                    flag3 = false;
                    break;
                case "3":
                    locationEmployee = "Expert";
                    flag3 = false;
                    break;
                case "4":
                    locationEmployee = "Monitor";
                    flag3 = false;
                    break;
                case "5":
                    locationEmployee = "Manage";
                    flag3 = false;
                    break;
                case "6":
                    locationEmployee = "Manager";
                    flag3 = false;
                    break;
                default:
                    System.out.println("No choice - Enter your choice again!");
                    flag3 = true;
            }
        } while (flag3);
        System.out.print("Enter Salary for Employee: ");
        double salaryEmployee = sc.nextDouble();
        if (salaryEmployee < 0 || salaryEmployee == 0) {
            System.out.println("Enter Salary for Employee Again(Must be greater than 0)");
        } else {
            System.out.println("Success");
        }
        Employee employee = new Employee(idEmployee, nameEmployee, dayOfBirthEmployee, genderEmployee, identilyCardEmployee, phoneNumberEmployee
                , emailEmployee, educationEmployee, locationEmployee, salaryEmployee);
        employeeRepository.addEmployee(employee);
        System.out.println("Add New Employee Success!");
    }


    @Override
    public void editEployee() {
        System.out.print("Enter the employee code name to be edited: ");
        String input = sc.nextLine();
        int flag = employeeRepository.editEmployee(input);
        if (flag == -1) {
            System.out.println("Employee code not found");
        } else {
            String idEdit;
            do {
                System.out.print("Enter Code for Employee: ");
                idEdit = sc.nextLine();
                if (ValidateFurama.checkIdEmployee(idEdit)) {
                    System.out.println("Update successful");
                } else {
                    System.out.println("You input invalid format(NV-XXXX).");
                }
            } while (!ValidateFurama.checkIdEmployee(idEdit));

            String nameEdit;
            do {
                System.out.print("Enter Name for Employee: ");
                nameEdit = sc.nextLine();
                if (ValidateFurama.checkName(nameEdit)) {
                    System.out.println("Update successful");
                } else {
                    System.out.println("You input invalid format(Viết hoa chữ cái đầu)");
                }
            } while (!ValidateFurama.checkName(nameEdit));
            String dayOfBirthEdit;
            do {
                System.out.print("Enter Day Of Birth for Employee(dd/mm/yyyy): ");
                dayOfBirthEdit = sc.nextLine();
                if (ValidateFurama.checkDayOfBirth(dayOfBirthEdit)) {
                    System.out.println("Update successful");
                } else {
                    System.out.println("You input invalid format");
                }
            } while (!ValidateFurama.checkDayOfBirth(dayOfBirthEdit));
            String genderEdit = "";
            boolean flag6 = true;
            do {
                System.out.print("Enter Gender for Employee \n" +
                        "1. Male \n" +
                        "2. Female\n" +
                        "Enter your choice: ");
                String choiceGender = sc.nextLine();
                switch (choiceGender) {
                    case "1":
                        genderEdit = "Male";
                        flag6 = false;
                        break;
                    case "2":
                        genderEdit = "Female";
                        flag6 = false;
                        break;
                    default:
                        System.out.println("No choice - Enter your choice again!");
                        flag6 = true;
                }
            } while (flag6);

            String identilyCardEdit;
            do {
                System.out.print("Enter Identity for Employee: ");
                identilyCardEdit = sc.nextLine();
                if (ValidateFurama.checkIdentity(identilyCardEdit)) {
                    System.out.println("Update successful");
                } else {
                    System.out.println("You input invalid format(9 or 12 number)");
                }
            } while (!ValidateFurama.checkIdentity(identilyCardEdit));
            String phoneNumberEdit;
            do {
                System.out.print("Enter Phone Number for Employee: ");
                phoneNumberEdit = sc.nextLine();
                if (ValidateFurama.checkPhone(phoneNumberEdit)) {
                    System.out.println("Update successful");
                } else {
                    System.out.println("You input invalid format(Start by number 0 and has 10 numbers)");
                }
            } while (!ValidateFurama.checkPhone(phoneNumberEdit));

            System.out.print("Enter Email for Employee: ");
            String emailEdit = sc.nextLine();
            System.out.println("Update successful");
            String educationEdit = "";
            boolean flag4 = true;
            do {
                System.out.print("Enter Education For Employee \n" +
                        "1. Intermediate \n" +
                        "2. College \n" +
                        "3. University \n" +
                        "4. After university \n" +
                        "Enter your choice");
                String choiceEducation = sc.nextLine();
                switch (choiceEducation) {
                    case "1":
                        educationEdit = "Intermediate";
                        flag4 = false;
                        break;
                    case "2":
                        educationEdit = "College";
                        flag4 = false;
                        break;
                    case "3":
                        educationEdit = "University";
                        flag4 = false;
                        break;
                    case "4":
                        educationEdit = "After university";
                        flag4 = false;
                        break;
                    default:
                        System.out.println("No choice - Enter your choice again!");
                        flag4 = true;
                }
            } while (flag4);
            String locationEdit = "";
            boolean flag5 = true;
            do {
                System.out.print("Enter Location for Employee \n" +
                        "1. Receptionist \n" +
                        "2. Serve \n" +
                        "3. Expert \n" +
                        "4. Monitor \n" +
                        "5. Manage \n" +
                        "6. Manager" +
                        "Enter your choice");
                String choiceLocation = sc.nextLine();
                switch (choiceLocation) {
                    case "1":
                        locationEdit = "Receptionist";
                        flag5 = false;
                        break;
                    case "2":
                        locationEdit = "Serve";
                        flag5 = false;
                        break;
                    case "3":
                        locationEdit = "Expert";
                        flag5 = false;
                        break;
                    case "4":
                        locationEdit = "Monitor";
                        flag5 = false;
                        break;
                    case "5":
                        locationEdit = "Manage";
                        flag5 = false;
                        break;
                    case "6":
                        locationEdit = "Manager";
                        flag5 = false;
                        break;
                    default:
                        System.out.println("No choice - Enter your choice again!");
                        flag5 = true;
                }
            } while (flag5);
            System.out.print("Enter Salary for Employee: ");
            double salaryEdit = sc.nextDouble();
            if (salaryEdit < 0 || salaryEdit == 0) {
                System.out.println("Enter Salary for Employee Again(Must be greater than 0)");
            } else {
                System.out.println("Update successful");
            }
            Employee employee = new Employee(idEdit, nameEdit, dayOfBirthEdit, genderEdit, identilyCardEdit, phoneNumberEdit,
                    emailEdit, educationEdit, locationEdit, salaryEdit);
            employeeList.set(flag, employee);
            ReadAndWriteToFileEmployee.writeFile(employeeList, EMPLOYEE_PATH);
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
