package case_study.model;

public class Employee extends Person{
    //Trình độ, Vị trí, lương
    private String education;
    private String location;
    private double salary;

    public Employee(){

    }

    public Employee(String education, String location, double salary) {
        this.education = education;
        this.location = location;
        this.salary = salary;
    }

    public Employee(String namePerson, String dayOfBirth, boolean gender, int identityCard, int phoneNumber, String email, String education, String location, double salary) {
        super(namePerson, dayOfBirth, gender, identityCard, phoneNumber, email);
        this.education = education;
        this.location = location;
        this.salary = salary;
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
        return "Employee{" +
                "education='" + education + '\'' +
                ", location='" + location + '\'' +
                ", salary=" + salary +
                '}';
    }
}
