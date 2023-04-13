package ss9_dsa_danh_sach.bai_tap.quan_ly_code_gym.model;

import java.util.Date;

public class Teacher extends Person {
    private String specialize;

    public Teacher(int id, String name, String dayOfBirth, String gender, String specialize) {
        super(id, name, dayOfBirth, gender);
        this.specialize = specialize;
    }

    public Teacher() {

    }

    public String getSpecialize() {
        return specialize;
    }

    public void setSpecialize(String specialize) {
        this.specialize = specialize;
    }

    @Override
    public String toString() {
        return "Teacher{" + "specialize='" + specialize + '\'' + super.toString() + '}';
    }
}
