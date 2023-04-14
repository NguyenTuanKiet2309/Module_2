package ss9_dsa_danh_sach.bai_tap.quan_ly_code_gym.model;

public class Student extends Person {
    private String classRoom;
    private int score;

    public Student() {

    }

    public Student(int id, String name, String dayOfBirth, String gender, String classRoom, int score) {
        super(id, name, dayOfBirth, gender);
        this.classRoom = classRoom;
        this.score = score;
    }

    public String getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(String classRoom) {
        this.classRoom = classRoom;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "classRoom='" + classRoom + '\'' +
                ", score='" + score + '\'' + super.toString() + '}';
    }
}
