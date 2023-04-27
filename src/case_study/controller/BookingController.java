package case_study.controller;

import case_study.service.BookingService;

import java.util.Scanner;

public class BookingController {
    FuramaController furamaController = new FuramaController();
    BookingService bookingService = new BookingService();
    Scanner sc = new Scanner(System.in);

    public void displayBooking() {
        boolean flagBooking = true;
        System.out.println("--- MANAGEMENT BOOKING ---");
        do {
            System.out.print("1. Add new booking \n" +
                    "2. Display list booking \n" +
                    "3. Create new contracts \n" +
                    "4. Display list contracts \n" +
                    "5. Edit contractsn \n" +
                    "6. Return main menu \n" +
                    "Enter your choice : ");
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
                    furamaController.displayMenu();
                    break;
                default:
                    System.out.println("No Choice - Enter Choice Again!");
                    flagBooking = true;
            }
        } while (flagBooking);
    }
}
