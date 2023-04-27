package case_study.controller;

import javax.jws.soap.SOAPBinding;
import java.util.Scanner;

public class FuramaController {
    private static EmployeeController employeeController = new EmployeeController();
    private static CustomerController customerController = new CustomerController();
    private static FacilityController facilityController = new FacilityController();
    private static BookingController bookingController = new BookingController();
    private static PromotionController promotionController = new PromotionController();
    private static Scanner sc = new Scanner(System.in);

    public void displayMenu() {

        System.out.println("--- MANAGEMENT RESORT FURAMA ---");
        boolean flag = true;
        do {
            System.out.print("1. Employee Management \n" +
                    "2. Customer Management \n" +
                    "3. Facility Management \n" +
                    "4. Booking Management \n" +
                    "5. Promotion Management \n" +
                    "6. Exit! \n" +
                    "Enter your choice : ");
            String choice = sc.nextLine();
            switch (choice) {
                case "1":
                    employeeController.displayEmployee();
                    break;
                case "2":
                    customerController.displayCustomer();
                    break;
                case "3":
                    facilityController.displayFacility();
                    break;
                case "4":
                    bookingController.displayBooking();
                    break;
                case "5":
                    promotionController.displayPromotion();
                    break;
                case "6":
                    System.out.print("Are you sure you want to exit? \n" +
                            "1. Yes \n" +
                            "2. No \n" +
                            "Enter your choice: ");
                    String choiceExit = sc.nextLine();
                    if (choiceExit.equals("1")){
                        System.out.println("Nice To Meet You - Have A Nice Day !!!");
                        System.exit(0);
                    } else if(choiceExit.equals("2")){
                        System.out.println("Good choice - Please Continue Your Jobs.");
                        displayMenu();
                    }
                default:
                    System.out.println("No Choice - Enter Choice Again! ");
                    flag = true;
            }
        } while (flag);
    }


}
