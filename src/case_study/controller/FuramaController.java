package case_study.controller;

import javax.jws.soap.SOAPBinding;
import java.util.Scanner;

public class FuramaController {
    Scanner sc = new Scanner(System.in);

    public void displayMenu() {

        System.out.println("--- QUẢN LÝ RESORT FURAMA ---");
        boolean flag = true;
        do {
            System.out.println("1. Employee Management \n" +
                    "2. Customer Management \n" +
                    "3. Facility Management \n" +
                    "4. Booking Management \n" +
                    "5. Promotion Management \n" +
                    "6. Exit! \n" +
                    "Chọn 1 chức năng : ");
            String choice = sc.nextLine();
            switch (choice) {
                case "1":
                    displayEmployee();
                    break;
                case "2":
                    displayCustomer();
                    break;
                case "3":
                    displayFacility();
                    break;
                case "4":
                    displayBooking();
                    break;
                case "5":
                    displayPromotion();
                    break;
                case "6":
                    System.exit(0);
                    System.out.println("Nice To Meet You - Have A Nice Day !!!");
            }
        } while (flag);
    }

    public void displayEmployee() {
        boolean flagEmployee = true;
        System.out.println("--- QUẢN LÝ EMPLOYEE ---");
        do {
            System.out.println("1. Display list employees \n" +
                    "2. Add new employee \n" +
                    "3. Add new employee \n" +
                    "4. Return main menu \n" +
                    "Chọn 1 chức năng : ");
            String choice = sc.nextLine();
            switch (choice) {
                case "1":
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    displayMenu();
                    break;
            }
        } while (flagEmployee);
    }

    public void displayCustomer() {
        System.out.println("--- QUẢN LÝ CUSTOMER ---");
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
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    displayMenu();
                    break;
            }
        } while (flagCustomer);
    }

    public void displayFacility() {
        boolean flagFacility = true;
        System.out.println("--- QUẢN LÝ FACILITY ---");
        do {
            System.out.println("1. Display list facility \n" +
                    "2. Add new facility \n" +
                    "3. Display list facility maintenance \n" +
                    "4. Return main menu \n" +
                    "Chọn 1 chức năng : ");
            String choice = sc.nextLine();
            switch (choice) {
                case "1":
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    displayMenu();
                    break;
            }
        } while (flagFacility);
    }

    public void displayBooking() {
        boolean flagBooking = true;
        System.out.println("--- QUẢN LÝ BOOKING ---");
        do {
            System.out.println("1. Add new booking \n" +
                    "2. Display list booking \n" +
                    "3. Create new contracts \n" +
                    "4. Display list contracts \n" +
                    "5. Edit contractsn \n" +
                    "6. Return main menu \n" +
                    "Chọn 1 chức năng : ");
            String choice = sc.nextLine();
            switch (choice) {
                case "1":
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    break;
                case "5":
                    break;
                case "6":
                    displayMenu();
                    break;
            }
        } while (flagBooking);
    }

    public void displayPromotion() {
        System.out.println("--- QUẢN LÝ PROMOTION ---");
        boolean flagPromotion = true;
        do {
            System.out.println("1. Display list customers use service \n" +
                    "2. Display list customers get voucher \n" +
                    "3. Return main menu \n" +
                    "Chọn 1 chức năng : ");
            String choice = sc.nextLine();
            switch (choice) {
                case "1":
                    break;
                case "2":
                    break;
                case "3":
                    displayMenu();
                    break;
            }
        } while (flagPromotion);
    }
}
