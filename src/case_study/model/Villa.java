package case_study.model;

public class Villa extends Facility {
    private String roomStandard;
    private double areaPool;
    private int floor;

    public Villa(){

    }

    public Villa(String roomStandard, double areaPool, int floor) {
        this.roomStandard = roomStandard;
        this.areaPool = areaPool;
        this.floor = floor;
    }

    public Villa(String idService, String nameService, double area, double price, int maxPeople, String kindType, String roomStandard, double areaPool, int floor) {
        super(idService, nameService, area, price, maxPeople, kindType);
        this.roomStandard = roomStandard;
        this.areaPool = areaPool;
        this.floor = floor;
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

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "roomStandard='" + roomStandard + '\'' +
                ", areaPool=" + areaPool +
                ", floor=" + floor +
                '}';
    }
}
