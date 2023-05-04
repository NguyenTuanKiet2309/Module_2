package case_study.service;

import case_study.model.House;
import case_study.repository.HouseRepository;
import case_study.utils.ValidateFurama;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class HouseService implements IHouseService {
    Scanner sc = new Scanner(System.in);
    private HouseRepository houseRepository = new HouseRepository();

    @Override
    public void addHouse() {
        String idHouse;
        do {
            System.out.print("Enter id House: ");
            idHouse = sc.nextLine();
            if (!ValidateFurama.checkIdHouse(idHouse)) {
                System.out.println("You input invalid format(SVHO-XXXX)");
            }
        } while (!ValidateFurama.checkIdHouse(idHouse));

        String nameHouse;
        do {
            System.out.print("Enter name House: ");
            nameHouse = sc.nextLine();
            if (!ValidateFurama.checkNameService(nameHouse)) {
                System.out.println("You input invalid format(Capitalize first letter)");
            }
        } while (!ValidateFurama.checkNameService(nameHouse));

        double areaHouse = 1;
        boolean flagArea = true;
        do {
            try {
                System.out.print("Enter area House(m2): ");
                areaHouse = Double.parseDouble(sc.nextLine());
                flagArea = false;
                if (areaHouse <= 30) {
                    System.out.println("You input invalid format(>30m2)");
                    flagArea = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Only Number.");
            }
        } while (flagArea);

        double priceHouse = 0;
        boolean flagPrice = true;
        do {
            try {
                System.out.print("Enter price House: ");
                priceHouse = Double.parseDouble(sc.nextLine());
                flagPrice = false;
                if (priceHouse <= 0) {
                    System.out.println("You input invalid format(>0)");
                    flagPrice = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Only Number.");
            }
        } while (flagPrice);

        int maxPeopleHouse = 0;
        boolean flagMaxPeople = true;
        do {
            try {
                System.out.print("Enter maximum people of House: ");
                maxPeopleHouse = Integer.parseInt(sc.nextLine());
                flagMaxPeople = false;
                if (maxPeopleHouse < 0) {
                    System.out.println("You input invalid format(>0 and <20)");
                    flagMaxPeople = true;
                } else if (maxPeopleHouse >20){
                    System.out.println("You input invalid format(>0 and <20");
                    flagMaxPeople = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Only Number.");
            }
        } while (flagMaxPeople);

        boolean flag;
        String rentalType = "";
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
                    rentalType = "Year";
                    flag = false;
                    break;
                case "2":
                    rentalType = "Month";
                    flag = false;
                    break;
                case "3":
                    rentalType = "Day";
                    flag = false;
                    break;
                case "4":
                    rentalType = "Hour";
                    flag = false;
                    break;
                default:
                    System.out.println("Wrong, Enter again!");
                    break;
            }
        } while (flag);

        String houseStandard;
        do {
            System.out.print("Enter room standard of House: ");
            houseStandard = sc.nextLine();
            if (!ValidateFurama.checkNameService(houseStandard)) {
                System.out.println("You input invalid format(Capitalize first letter)");
            }
        } while (!ValidateFurama.checkNameService(houseStandard));

        int floorHouse = 0;
        boolean flagFloor = true;
        do {
            try {
                System.out.print("Enter floor of House: ");
                floorHouse = Integer.parseInt(sc.nextLine());
                flagFloor = false;
                if (floorHouse <= 0) {
                    System.out.println("You input invalid format(>0)");
                    flagFloor = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Only Number.");
            }
        } while (flagFloor);

        House house = new House(idHouse, nameHouse, areaHouse, priceHouse, maxPeopleHouse, rentalType, houseStandard, floorHouse);
        houseRepository.addHouse(house);
        System.out.println("Add Successful!");
    }

    @Override
    public void showHouseList() {
        Map<House, Integer> houseList = houseRepository.getHouseList();
        Set<House> houseSet = houseList.keySet();
        for (House h : houseSet) {
            System.out.println(h + " - " + houseList.get(h) + " times of use");
        }
    }
}
