package case_study.controller;

import case_study.service.CustomerService;

import java.util.Scanner;

public class CustomerController {
    FuramaController furamaController = new FuramaController();
    CustomerService customerService = new CustomerService();
    Scanner sc = new Scanner(System.in);

    public void displayCustomer() {
        System.out.println("--- MANAGEMENT CUSTOMER ---");
        boolean flagCustomer = true;
        do {
            System.out.println("1. Display list customer \n" +
                    "2. Add new customer \n" +
                    "3. Edit customer \n" +
                    "4. Return main menu \n" +
                    "Chọn 1 chức năng : ");
            String choice = sc.nextLine();
            switch (choice) {
                case "1":
                    customerService.showCustomerList();
                    break;
                case "2":
                    customerService.addCustomer();
                    break;
                case "3":
                    customerService.editCustomer();
                    break;
                case "4":
                    furamaController.displayMenu();
                    break;
                default:
                    System.out.println("Không có lựa chọn");
                    flagCustomer = true;
            }
        } while (flagCustomer);
    }
}
