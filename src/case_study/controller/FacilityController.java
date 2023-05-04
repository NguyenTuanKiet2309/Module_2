package case_study.controller;

import case_study.service.FacilityService;
import case_study.service.HouseService;
import case_study.service.RoomService;
import case_study.service.VIllaService;

import java.util.Scanner;

public class FacilityController {
    Scanner sc = new Scanner(System.in);
    FuramaController furamaController = new FuramaController();
    FacilityService facilityService = new FacilityService();
    HouseService houseService = new HouseService();
    RoomService roomService = new RoomService();
    VIllaService vIllaService = new VIllaService();

    public void displayFacility() {
        boolean flagFacility = true;
        System.out.println("--- MANAGEMENT FACILITY ---");
        do {
            System.out.print("1. Display list facility \n" +
                    "2. Add new facility \n" +
                    "3. Display list facility maintenance \n" +
                    "4. Return main menu \n" +
                    "Enter your choice : ");
            String choice = sc.nextLine();
            switch (choice) {
                case "1":
                    facilityService.displayListFacility();
                    break;
                case "2":
                    boolean flagAdd = true;
                    do {
                        System.out.print("1. Add new Villa \n" +
                                "2. Add new House \n" +
                                "3. Add new Room \n" +
                                "4. Back to menu \n" +
                                "Enter your choice: ");
                        String choiceAdd = sc.nextLine();
                        switch (choiceAdd) {
                            case "1":
                                vIllaService.addVilla();
                                break;
                            case "2":
                                houseService.addHouse();
                                break;
                            case "3":
                                roomService.addRoom();
                                break;
                            case "4":
                                displayFacility();
                                break;
                            default:
                                System.out.println("No Choice - Enter Choice Again!");
                                flagAdd = true;
                        }
                    } while (flagAdd);
                    break;
                case "3":
                    facilityService.displayListFacilityMaintenance();
                    break;
                case "4":
                    furamaController.displayMenu();
                    break;
                default:
                    System.out.println("No Choice - Enter Choice Again!");
                    flagFacility = true;
            }
        } while (flagFacility);
    }
}
