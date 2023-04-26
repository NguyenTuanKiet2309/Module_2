package case_study.controller;

import case_study.service.EmployeeService;

import java.io.IOException;
import java.util.Scanner;

public class EmployeeController {
    FuramaController furamaController = new FuramaController();
    EmployeeService employeeService = new EmployeeService();
    Scanner sc = new Scanner(System.in);

    public void displayEmployee() {
        boolean flagEmployee = true;
        System.out.println("--- QUẢN LÝ EMPLOYEE ---");
        do {
            System.out.println("1. Display list employees \n" +
                    "2. Add new employee \n" +
                    "3. Edit employee \n" +
                    "4. Return main menu \n" +
                    "Chọn 1 chức năng : ");
            String choice = sc.nextLine();
            switch (choice) {
                case "1":
                    employeeService.showEmployeeList();
                    break;
                case "2":
                    employeeService.addEmployee();
                    break;
                case "3":
                    employeeService.editEployee();
                    break;
                case "4":
                    furamaController.displayMenu();
                    break;
                default:
                    System.out.println("Không có lựa chọn");
                    flagEmployee=true;

            }
        } while (flagEmployee);
    }
}
