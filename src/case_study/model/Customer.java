package case_study.model;

public class Customer extends Person {
    private String idCustomer;
    private String typeCustomer;
    private String address;

    public Customer(String idCustomer,String typeCustomer, String address) {
        this.idCustomer = idCustomer;
        this.typeCustomer = typeCustomer;
        this.address = address;
    }

    public Customer(String idCustomer, String namePerson, String dayOfBirth, String gender, String identityCard, String phoneNumber,
                    String email,  String typeCustomer, String address) {
        super(namePerson, dayOfBirth, gender, identityCard, phoneNumber, email);
        this.idCustomer = idCustomer;
        this.typeCustomer = typeCustomer;
        this.address = address;
    }

    public String getTypeCustomer() {
        return typeCustomer;
    }

    public void setTypeCustomer(String typeCustomer) {
        this.typeCustomer = typeCustomer;
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    public Customer() {

    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    @Override
    public String toString() {
        return "Customer{" +
                "id='" + idCustomer + '\'' +
                super.toString() +
                ", typeCustomer='" + typeCustomer + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public String writeToFileCustomer() {
        return  this.idCustomer + "," + super.getNamePerson() + "," + super.getDayOfBirth() + "," + super.getGender()
                + "," + super.getIdentityCard() + "," + super.getPhoneNumber() + "," + super.getEmail()
                + "," + this.typeCustomer + "," + this.address;
    }
}
