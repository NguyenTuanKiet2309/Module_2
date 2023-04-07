package ss6_inheritance.demo;

public class Animals {
    private String name;
    private int age;

    public Animals(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void an() {
        System.out.println("măm măm");
    }

    public void uong() {
        System.out.println("ực ực");
    }

    public void ia() {
        System.out.println("đang ỉa nhìn cái gì");
    }
}
