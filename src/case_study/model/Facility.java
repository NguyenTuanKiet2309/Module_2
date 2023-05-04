package case_study.model;

public abstract class Facility {
    private String idService;
    private String nameService;
    private double area;
    private double price;
    private int maxPeople;
    private String kindType;

    public Facility() {
    }

    public Facility(String idService, String nameService, double area, double price, int maxPeople, String kindType) {
        this.idService = idService;
        this.nameService = nameService;
        this.area = area;
        this.price = price;
        this.maxPeople = maxPeople;
        this.kindType = kindType;
    }

    public String getIdService() {
        return idService;
    }

    public void setIdService(String idService) {
        this.idService = idService;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(int maxPeople) {
        this.maxPeople = maxPeople;
    }

    public String getKindType() {
        return kindType;
    }

    public void setKindType(String kindType) {
        this.kindType = kindType;
    }

    @Override
    public String toString() {
        return "idService='" + idService + '\'' +
                ", nameService='" + nameService + '\'' +
                ", area=" + area +
                ", price=" + price +
                ", maxPeople=" + maxPeople +
                ", kindType='" + kindType;
    }


    public String writeToFile() {
        return this.idService + "," + this.nameService + "," + this.area + "," + this.price + "," + this.maxPeople + "," + this.kindType;
    }
}
