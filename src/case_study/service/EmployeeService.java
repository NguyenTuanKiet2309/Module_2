package case_study.service;

import case_study.model.Employee;
import case_study.repository.EmployeeRepository;
import case_study.utils.ReadAndWriteToFileEmployee;
import case_study.utils.ValidateFurama;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class EmployeeService implements IEmployeeService {
    Scanner sc = new Scanner(System.in);
    private EmployeeRepository employeeRepository = new EmployeeRepository();

    @Override
    public void addEmployee() {
        String idEmployee;
        do {
            System.out.print("Enter Id Employee: ");
            idEmployee = sc.nextLine();
            if (!ValidateFurama.checkIdEmployee(idEmployee)) {
                System.out.println("You input invalid format(NV-XXXX)");
            }
        } while (!ValidateFurama.checkIdEmployee(idEmployee));

        String nameEmployee;
        do {
            System.out.print("Enter Name Employee: ");
            nameEmployee = sc.nextLine();
            if (!ValidateFurama.checkName(nameEmployee)) {
                System.out.println("You input invalid format(Capitalize first letter)");
            }
        } while (!ValidateFurama.checkName(nameEmployee));

        String dayOfBirthEmployee;
        boolean checkAge = true;
        do {
            System.out.print("Enter Day Of Birth Employee(yyyy-mm-dd): ");
            dayOfBirthEmployee = sc.nextLine();
            LocalDate localDate = LocalDate.parse(dayOfBirthEmployee);
            if (ValidateFurama.checkDayOfBirth(dayOfBirthEmployee) && ValidateFurama.checkAge(localDate) >= 18) {
                checkAge = false;
            } else {
                System.out.println("You input invalid format or under 18 age");
            }
        } while (checkAge);

        String genderEmployee = "";
        boolean flag1 = true;
        do {
            System.out.print("Enter Gender Employee \n" +
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
            System.out.print("Enter Identity Employee: ");
            identilyCardEmployee = sc.nextLine();
            if (!ValidateFurama.checkIdentity(identilyCardEmployee)) {
                System.out.println("You input invalid format(9 or 12 number)");
            }
        } while (!ValidateFurama.checkIdentity(identilyCardEmployee));

        String phoneNumberEmployee;
        do {
            System.out.print("Enter Phone Number Employee: ");
            phoneNumberEmployee = sc.nextLine();
            if (!ValidateFurama.checkPhone(phoneNumberEmployee)) {
                System.out.println("You input invalid format(Start by number 0 and has 10 numbers)");
            }
        } while (!ValidateFurama.checkPhone(phoneNumberEmployee));
        System.out.print("Enter Email For Employee: ");
        String emailEmployee = sc.nextLine();

        String educationEmployee = "";
        boolean flag2 = true;
        do {
            System.out.print("Enter Education Employee \n" +
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
            System.out.print("Enter Location Employee \n" +
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
        double salaryEmployee;
        do {
            System.out.print("Enter Salary Employee: ");
            salaryEmployee = Double.parseDouble(sc.nextLine());
        } while (salaryEmployee <= 0);

        Employee employee = new Employee(idEmployee, nameEmployee, dayOfBirthEmployee, genderEmployee, identilyCardEmployee, phoneNumberEmployee
                , emailEmployee, educationEmployee, locationEmployee, salaryEmployee);
        employeeRepository.addEmployee(employee);
        System.out.println("Add New Employee Success!");
    }


    @Override
    public void editEmployee() {
        System.out.print("Enter the employee code name to be edited: ");
        String idEmployee = sc.nextLine();
        int checkIdEmployee = employeeRepository.findIdEmployee(idEmployee);
        if (checkIdEmployee == -1) {
            System.out.println("Employee code not found.");
        } else {
            String idEdit;
            do {
                System.out.print("Enter Code Employee: ");
                idEdit = sc.nextLine();
                if (!ValidateFurama.checkIdEmployee(idEdit)) {
                    System.out.println("You input invalid format(NV-XXXX).");
                }
            } while (!ValidateFurama.checkIdEmployee(idEdit));

            String nameEdit;
            do {
                System.out.print("Enter Name Employee: ");
                nameEdit = sc.nextLine();
                if (!ValidateFurama.checkName(nameEdit)) {
                    System.out.println("You input invalid format(Capitalize first letter)");
                }
            } while (!ValidateFurama.checkName(nameEdit));
            String dayOfBirthEdit;
            boolean checkAge = true;
            do {
                System.out.print("Enter Day Of Birth Employee: ");
                dayOfBirthEdit = sc.nextLine();
                LocalDate localDate = LocalDate.parse(dayOfBirthEdit);
                if (ValidateFurama.checkDayOfBirth(dayOfBirthEdit) && ValidateFurama.checkAge(localDate) >= 18) {
                   checkAge =false;
                } else {
                    System.out.println("You input invalid format(yyyy-mm-dd)");
                }
            } while (checkAge);
            String genderEdit = "";
            boolean flag6 = true;
            do {
                System.out.print("Enter Gender Employee \n" +
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
                System.out.print("Enter Identity Employee: ");
                identilyCardEdit = sc.nextLine();
                if (!ValidateFurama.checkIdentity(identilyCardEdit)) {
                    System.out.println("You input invalid format(9 or 12 number)");
                }
            } while (!ValidateFurama.checkIdentity(identilyCardEdit));
            String phoneNumberEdit;
            do {
                System.out.print("Enter Phone Number Employee: ");
                phoneNumberEdit = sc.nextLine();
                if (!ValidateFurama.checkPhone(phoneNumberEdit)) {
                    System.out.println("You input invalid format(Start by number 0 and has 10 numbers)");
                }
            } while (!ValidateFurama.checkPhone(phoneNumberEdit));

            System.out.print("Enter Email Employee: ");
            String emailEdit = sc.nextLine();
            String educationEdit = "";
            boolean flag4 = true;
            do {
                System.out.print("Enter Education Employee \n" +
                        "1. Intermediate \n" +
                        "2. College \n" +
                        "3. University \n" +
                        "4. After university \n" +
                        "Enter your choice: ");
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
                System.out.print("Enter Location Employee \n" +
                        "1. Receptionist \n" +
                        "2. Serve \n" +
                        "3. Expert \n" +
                        "4. Monitor \n" +
                        "5. Manage \n" +
                        "6. Manager" +
                        "Enter your choice: ");
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
            double salaryEdit;
            do {
                System.out.print("Enter Salary Employee: ");
                salaryEdit = Double.parseDouble(sc.nextLine());
            } while (salaryEdit <= 0);
            Employee employee = new Employee(idEdit, nameEdit, dayOfBirthEdit, genderEdit, identilyCardEdit, phoneNumberEdit,
                    emailEdit, educationEdit, locationEdit, salaryEdit);
            employeeRepository.editEmployee(employee);
            System.out.println("Update Successful!");
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
