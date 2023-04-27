package case_study.model;

public class House extends Facility {
    private String roomStandard;
    private int floorHouse;

    public House(String roomStandard, int floor) {
        this.roomStandard = roomStandard;
        this.floorHouse = floor;
    }

    public House() {

    }

    public House(String idService, String nameService, double area, double price, int maxPeople, String kindType, String roomStandard, int floorHouse) {
        super(idService, nameService, area, price, maxPeople, kindType);
        this.roomStandard = roomStandard;
        this.floorHouse = floorHouse;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getFloorHouse() {
        return floorHouse;
    }

    public void setFloorHouse(int floorHouse) {
        this.floorHouse = floorHouse;
    }

    @Override
    public String toString() {
        return "House{" +
                "roomStandard='" + roomStandard + '\'' +
                ", floor=" + floorHouse +
                '}';
    }

    public String writeToFileHouse() {
        return super.writeToFile() + "," + this.roomStandard +"," + this.floorHouse;
    }
}
