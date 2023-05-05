package case_study.model;

public class Booking implements Comparable<Booking>{
//    mã booking, ngày booking, ngày bắt đầu thuê, ngày kết thúc thuê, mã khách hàng, mã dịch vụ.
    private String codeBooking;
    private String dateBooking;
    private String dayStart;
    private String dayEnd;
    private String idCustomer;
    private String typeOfService;

    public Booking() {
    }

    public Booking(String codeBooking, String dateBooking, String dayStart, String dayEnd, String idCustomer, String typeOfService) {
        this.codeBooking = codeBooking;
        this.dateBooking = dateBooking;
        this.dayStart = dayStart;
        this.dayEnd = dayEnd;
        this.idCustomer = idCustomer;
        this.typeOfService = typeOfService;
    }

    public String getCodeBooking() {
        return codeBooking;
    }

    public void setCodeBooking(String codeBooking) {
        this.codeBooking = codeBooking;
    }

    public String getDateBooking() {
        return dateBooking;
    }

    public void setDateBooking(String dateBooking) {
        this.dateBooking = dateBooking;
    }

    public String getDayStart() {
        return dayStart;
    }

    public void setDayStart(String dayStart) {
        this.dayStart = dayStart;
    }

    public String getDayEnd() {
        return dayEnd;
    }

    public void setDayEnd(String dayEnd) {
        this.dayEnd = dayEnd;
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getTypeOfService() {
        return typeOfService;
    }

    public void setTypeOfService(String typeOfService) {
        this.typeOfService = typeOfService;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "codeBooking='" + codeBooking + '\'' +
                ", dateBooking='" + dateBooking + '\'' +
                ", dayStart='" + dayStart + '\'' +
                ", dayEnd='" + dayEnd + '\'' +
                ", idCustomer='" + idCustomer + '\'' +
                ", typeOfService='" + typeOfService + '\'' +
                '}';
    }
    public String writeToFile() {
        return codeBooking + "," +
                dateBooking + "," +
                dayStart + "," +
                dayEnd + "," +
                idCustomer + "," +
                typeOfService;
    }

    @Override
    public int compareTo(Booking o) {
        return 1;
    }
}
