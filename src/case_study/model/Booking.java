package case_study.model;

public class Booking {
//    mã booking, ngày booking, ngày bắt đầu thuê, ngày kết thúc thuê, mã khách hàng, mã dịch vụ.
    private String codeBooking;
    private String dateBooking;
    private String dayStart;
    private String dayEnd;
    private String nameCustomer;
    private String typeOfService;

    public Booking() {
    }

    public Booking(String codeBooking, String dateBooking, String dayStart, String dayEnd, String nameCustomer, String typeOfService) {
        this.codeBooking = codeBooking;
        this.dateBooking = dateBooking;
        this.dayStart = dayStart;
        this.dayEnd = dayEnd;
        this.nameCustomer = nameCustomer;
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

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
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
                ", nameCustomer='" + nameCustomer + '\'' +
                ", typeOfService='" + typeOfService + '\'' +
                '}';
    }

}
