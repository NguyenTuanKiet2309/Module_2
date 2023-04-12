package ss8_clean_code_and_refactory.mvc.repository;

import ss8_clean_code_and_refactory.mvc.model.Student;

public class StudentRepository implements IStudentRepository {
    private static Student[] students = new Student[5];


    static {
        Student s1 = new Student("Kiệt", "Kiệt@gmail.com");
        Student s2 = new Student("Hưng", "Hưng@gmail.com");
        Student s3 = new Student("Nam", "Nam@gmail.com");
        Student s4 = new Student("Quốc", "Quốc@gmail.com");
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;
        students[3] = s4;
    }


    @Override
    public void displayStudent() {
        for (Student s : students) {
            if (s == null) {
                break;
            }
            System.out.println(s);
        }
    }
}
