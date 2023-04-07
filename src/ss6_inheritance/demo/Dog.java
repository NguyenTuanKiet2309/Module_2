package ss6_inheritance.demo;

public class Dog extends Animals {
    private String sua;
    private String baoVeChu;

    public Dog(String name, int age, String sua, String baoVeChu) {
        super(name, age);
        this.sua = sua;
        this.baoVeChu = baoVeChu;
    }

    public String getSua() {
        return sua;
    }

    public void setSua(String sua) {
        this.sua = sua;
    }

    public String getBaoVeChu() {
        return baoVeChu;
    }

    public void setBaoVeChu(String baoVeChu) {
        this.baoVeChu = baoVeChu;
    }

    public void sua() {
        System.out.println("gâu gâu");
    }

    public void vayDuoi() {
        System.out.println("vẫy vẫy");
    }
}
