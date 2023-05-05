package case_study.model;

public class Contract {
    //    contract number, booking code, advance deposit, total payment
    private String contractNumber;
    private String codeBooking;
    private String advanceDeposit;
    private String totalPayment;

    public Contract() {
    }

    public Contract(String contractNumber, String codeBooking, String advanceDeposit, String totalPayment) {
        this.contractNumber = contractNumber;
        this.codeBooking = codeBooking;
        this.advanceDeposit = advanceDeposit;
        this.totalPayment = totalPayment;
    }

    public String getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    public String getCodeBooking() {
        return codeBooking;
    }

    public void setCodeBooking(String codeBooking) {
        this.codeBooking = codeBooking;
    }

    public String getAdvanceDeposit() {
        return advanceDeposit;
    }

    public void setAdvanceDeposit(String advanceDeposit) {
        this.advanceDeposit = advanceDeposit;
    }

    public String getTotalPayment() {
        return totalPayment;
    }

    public void setTotalPayment(String totalPayment) {
        this.totalPayment = totalPayment;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "contractNumber='" + contractNumber + '\'' +
                ", codeBooking='" + codeBooking + '\'' +
                ", advanceDeposit='" + advanceDeposit + '\'' +
                ", totalPayment='" + totalPayment + '\'' +
                '}';
    }
    public String writeToFile() {
        return contractNumber + "," + codeBooking + "," + advanceDeposit + "," + totalPayment;
    }
}
