package case_study.controller;

import case_study.service.FacilityService;

import java.util.Scanner;

public class FacilityController {
    Scanner sc = new Scanner(System.in);
    FuramaController furamaController = new FuramaController();
    FacilityService facilityService = new FacilityService();

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
                    furamaController.displayMenu();
                    break;
            }
        } while (flagFacility);
    }
}
