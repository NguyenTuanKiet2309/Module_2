package case_study.service;

import case_study.model.Villa;
import case_study.repository.VillaRepository;
import case_study.utils.ValidateFurama;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class VIllaService implements IVillaService {
    Scanner sc = new Scanner(System.in);
    VillaRepository villaRepository = new VillaRepository();

    @Override
    public void addVilla() {

        String idVilla;
        do {
            System.out.print("Enter id Villa: ");
            idVilla = sc.nextLine();
            if (!ValidateFurama.checkIdVilla(idVilla)) {
                System.out.println("You input invalid format(SVVL-XXXX)");
            }
        } while (!ValidateFurama.checkIdVilla(idVilla));

        String nameVilla;
        do {
            System.out.print("Enter name Villa: ");
            nameVilla = sc.nextLine();
            if (!ValidateFurama.checkNameService(nameVilla)) {
                System.out.println("You input invalid format(Capitalize first letter)");
            }
        } while (!ValidateFurama.checkNameService(nameVilla));

        double areaVilla = 1;
        boolean flagArea = true;
        do {
            try {
                System.out.print("Enter area Villa(m2): ");
                areaVilla = Double.parseDouble(sc.nextLine());
                flagArea = false;
                if (areaVilla <= 30) {
                    System.out.println("You input invalid format(>30m2)");
                    flagArea = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Only Number.");
            }
        } while (flagArea);

        double priceVilla = 1;
        boolean flagPrice = true;
        do {
            try {
                System.out.print("Enter price Villa: ");
                priceVilla = Double.parseDouble(sc.nextLine());
                flagPrice = false;
                if (priceVilla <= 0) {
                    System.out.println("You input invalid format(>0)");
                    flagPrice = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Only Number.");
            }
        } while (flagPrice);

        int maxPeopleVilla = 1;
        boolean flagMaxPeople = true;
        do {
            try {
                System.out.print("Enter maximum people of Villa: ");
                maxPeopleVilla = Integer.parseInt(sc.nextLine());
                flagMaxPeople = false;
                if (maxPeopleVilla <= 0 && maxPeopleVilla > 20) {
                    System.out.println("You input invalid format(>0 and <20)");
                    flagMaxPeople = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Only Number.");
            }
        } while (flagMaxPeople);

        boolean flag;
        String rentalTypeVilla = "";
        do {
            flag = true;
            System.out.print("Choose rental type: \n" +
                    "1. Rent by Year\n" +
                    "2. Rent by month\n" +
                    "3. Rent by day\n" +
                    "4. Rent by hour\n" +
                    "Enter your choice: ");
            String choice = sc.nextLine();
            switch (choice) {
                case "1":
                    rentalTypeVilla = "Year";
                    flag = false;
                    break;
                case "2":
                    rentalTypeVilla = "Month";
                    flag = false;
                    break;
                case "3":
                    rentalTypeVilla = "Day";
                    flag = false;
                    break;
                case "4":
                    rentalTypeVilla = "Hour";
                    flag = false;
                    break;
                default:
                    System.out.println("Wrong, Enter again!");
                    break;
            }
        } while (flag);

        String villaStandard;
        do {
            System.out.print("Enter room standard of Villa: ");
            villaStandard = sc.nextLine();
            if (!ValidateFurama.checkNameService(villaStandard)) {
                System.out.println("You input invalid format(Capitalize first letter)");
            }
        } while (!ValidateFurama.checkNameService(villaStandard));

        double areaPoolVilla = 1;
        boolean flagPool = true;
        do {
            try {
                System.out.print("Enter area pool of Villa(m2): ");
                areaPoolVilla = Double.parseDouble(sc.nextLine());
                flagPool = false;
                if (areaPoolVilla <= 30) {
                    System.out.println("You input invalid format(>30m2)");
                    flagPool = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Only Number.");
            }
        } while (flagPool);

        int floorVilla = 1;
        boolean flagFloor = true;
        do {
            try {
                System.out.print("Enter floor of Villa: ");
                floorVilla = Integer.parseInt(sc.nextLine());
                flagFloor = false;
                if (floorVilla <= 0) {
                    System.out.println("You input invalid format(>0)");
                    flagFloor = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Only Number.");
            }
        } while (flagFloor);
        Villa villa = new Villa(idVilla,nameVilla,areaVilla,priceVilla,maxPeopleVilla,rentalTypeVilla,villaStandard,areaPoolVilla,floorVilla);
        villaRepository.addVilla(villa);
        System.out.println("Add Successful!");
    }

    @Override
    public void showListVilla() {
        Map<Villa,Integer> villaList = villaRepository.getVillaList();
        Set<Villa> villaSet = villaList.keySet();
        for(Villa v: villaSet){
            System.out.println(v + "-" + villaList.get(v) + " times of use");
        }
    }

}

