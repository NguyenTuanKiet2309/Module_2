package case_study.model;

public class Villa extends Facility {
    private String roomStandard;
    private double areaPool;
    private int floorVilla;

    public Villa() {

    }

    public Villa(String roomStandard, double areaPool, int floor) {
        this.roomStandard = roomStandard;
        this.areaPool = areaPool;
        this.floorVilla = floor;
    }

    public Villa(String idService, String nameService, double area, double price, int maxPeople,
                 String kindType, String roomStandard, double areaPool, int floorVilla) {
        super(idService, nameService, area, price, maxPeople, kindType);
        this.roomStandard = roomStandard;
        this.areaPool = areaPool;
        this.floorVilla = floorVilla;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public double getAreaPool() {
        return areaPool;
    }

    public void setAreaPool(double areaPool) {
        this.areaPool = areaPool;
    }

    public int getFloorVilla() {
        return floorVilla;
    }

    public void setFloorVilla(int floorVilla) {
        this.floorVilla = floorVilla;
    }

    @Override
    public String toString() {
        return "Villa{" + super.toString() +
                "roomStandard='" + roomStandard + '\'' +
                ", areaPool=" + areaPool +
                ", floor=" + floorVilla +
                '}';
    }

    public String writeToFileVilla() {
        return super.writeToFile() + "," + this.roomStandard + "," + this.areaPool + "," + this.floorVilla;
    }
}
