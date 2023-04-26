package case_study.model;

public class Employee extends Person {
    private String idEmployee;
    private String education;
    private String location;
    private double salary;

    public Employee() {

    }

    public Employee(String idEmployee, String namePerson, String dayOfBirth, boolean gender, int identityCard, int phoneNumber, String email,
                    String education, String location, double salary) {
        super(namePerson, dayOfBirth, gender, identityCard, phoneNumber, email);
        this.idEmployee = idEmployee;
        this.education = education;
        this.location = location;
        this.salary = salary;
    }

    public String getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(String idEmployee) {
        this.idEmployee = idEmployee;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{ id employee=" + idEmployee
                + super.toString() +
                "education='" + education + '\'' +
                ", location='" + location + '\'' +
                ", salary=" + salary +
                '}';
    }

    public String writeToFileEmployee() {
        return  this.idEmployee + "," + super.getNamePerson() + "," + super.getDayOfBirth() + "," + super.isGender()
                + "," + super.getIdentityCard() + "," + super.getPhoneNumber() + "," + super.getEmail()
                + "," + this.education + "," + this.location + "," + this.salary;
    }
}
