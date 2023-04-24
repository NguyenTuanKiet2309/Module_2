package case_study.model;

public abstract class Person {
    //Họ tên, Ngày sinh, Giới tính, Số CMND,
    // Số Điện Thoại, Email,
    //, Họ tên, Ngày sinh, Giới tính, Số CMND, Số Điện Thoại, Email,
    //
    private String namePerson;
    private String dayOfBirth;
    private boolean gender;
    private int identityCard;
    private int phoneNumber;
    private String email;

    public Person() {
    }

    public Person(String namePerson, String dayOfBirth, boolean gender, int identityCard, int phoneNumber, String email) {
        this.namePerson = namePerson;
        this.dayOfBirth = dayOfBirth;
        this.gender = gender;
        this.identityCard = identityCard;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getNamePerson() {
        return namePerson;
    }

    public void setNamePerson(String namePerson) {
        this.namePerson = namePerson;
    }

    public String getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(String dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public int getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(int identityCard) {
        this.identityCard = identityCard;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "namePerson='" + namePerson + '\'' +
                ", dayOfBirth='" + dayOfBirth + '\'' +
                ", gender=" + gender +
                ", identityCard=" + identityCard +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                '}';
    }
}
