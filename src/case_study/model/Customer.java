package case_study.model;

public class Customer extends Person {
    private String address;

    public Customer(String address) {
        this.address = address;
    }

    public Customer() {

    }

    public Customer(String namePerson, String dayOfBirth, boolean gender, int identityCard, int phoneNumber, String email, String address) {
        super(namePerson, dayOfBirth, gender, identityCard, phoneNumber, email);
        this.address = address;
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
                "address='" + address + '\'' +
                '}';
    }
}
