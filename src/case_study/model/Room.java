package case_study.model;

public class Room extends Facility {
    private String freeService;

    public Room() {

    }

    public Room(String freeService) {
        this.freeService = freeService;
    }

    public Room(String idService, String nameService, double area, double price, int maxPeople, String kindType, String freeService) {
        super(idService, nameService, area, price, maxPeople, kindType);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Room{" +
                "freeService='" + freeService + '\'' +
                '}';
    }

    public String writeToFileRoom(){
        return super.writeToFile() + "," + this.freeService;
    }
}
