package case_study.service;

import case_study.model.Room;
import case_study.model.Villa;
import case_study.repository.RoomRepository;
import case_study.repository.VillaRepository;
import case_study.utils.ValidateFurama;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class RoomService implements IRoomService {
    Scanner sc = new Scanner(System.in);
    RoomRepository roomRepository = new RoomRepository();

    @Override
    public void addRoom() {
        String idRoom;
        do {
            System.out.print("Enter id Room: ");
            idRoom = sc.nextLine();
            if (!ValidateFurama.checkIdRoom(idRoom)) {
                System.out.println("You input invalid format(SVRO-XXXX)");
            }
        } while (!ValidateFurama.checkIdRoom(idRoom));

        String nameRoom;
        do {
            System.out.print("Enter name Room: ");
            nameRoom = sc.nextLine();
            if (!ValidateFurama.checkNameService(nameRoom)) {
                System.out.println("You input invalid format(Capitalize first letter)");
            }
        } while (!ValidateFurama.checkNameService(nameRoom));

        double areaRoom = 1;
        boolean flagArea = true;
        do {
            try {
                System.out.print("Enter area Room(m2): ");
                areaRoom = Double.parseDouble(sc.nextLine());
                flagArea = false;
                if (areaRoom <= 30) {
                    System.out.println("You input invalid format(>30m2)");
                    flagArea = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Only Number.");
            }
        } while (flagArea);

        double priceRoom = 1;
        boolean flagPrice = true;
        do {
            try {
                System.out.print("Enter price Room: ");
                priceRoom = Double.parseDouble(sc.nextLine());
                flagPrice = false;
                if (priceRoom <= 0) {
                    System.out.println("You input invalid format(>0)");
                    flagPrice = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Only Number.");
            }
        } while (flagPrice);

        int maxPeopleRoom = 1;
        boolean flagMaxPeople = true;
        do {
            try {
                System.out.print("Enter maximum people of Room: ");
                maxPeopleRoom = Integer.parseInt(sc.nextLine());
                flagMaxPeople = false;
                if (maxPeopleRoom <= 0 && maxPeopleRoom > 20) {
                    System.out.println("You input invalid format(>0 and <20)");
                    flagMaxPeople = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Only Number.");
            }
        } while (flagMaxPeople);

        boolean flag;
        String rentalTypeRoom = null;
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
                    rentalTypeRoom = "Year";
                    flag = false;
                    break;
                case "2":
                    rentalTypeRoom = "Month";
                    flag = false;
                    break;
                case "3":
                    rentalTypeRoom = "Day";
                    flag = false;
                    break;
                case "4":
                    rentalTypeRoom = "Hour";
                    flag = false;
                    break;
                default:
                    System.out.println("Wrong, Enter again!");
                    break;
            }
        } while (flag);


        System.out.println("Enter free service of Room: ");
        String freeServiceRoom = sc.nextLine();
        Room room = new Room(idRoom,nameRoom,areaRoom,priceRoom,maxPeopleRoom,rentalTypeRoom,freeServiceRoom);
        roomRepository.addRoom(room);
        System.out.println("Add successful!");
    }

    @Override
    public void showRoomList() {
        Map<Room,Integer> roomList = roomRepository.getRoomList();
        Set<Room> roomSet = roomList.keySet();
        for(Room r : roomSet){
            System.out.println(r + " - " + roomList.get(r) + " times of use");
        }
    }
}
