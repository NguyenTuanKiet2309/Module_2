package case_study.controller;

import java.util.Scanner;

public class PromotionController {
    FuramaController furamaController = new FuramaController();
//    PromotionController promotionController = new PromotionController();
    Scanner sc = new Scanner(System.in);

    public void displayPromotion() {
        System.out.println("--- MANAGEMENT PROMOTION ---");
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
                    furamaController.displayMenu();
                    break;
            }
        } while (flagPromotion);
    }
}
