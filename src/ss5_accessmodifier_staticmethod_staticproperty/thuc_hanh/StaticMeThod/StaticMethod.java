package ss5_accessmodifier_staticmethod_staticproperty.thuc_hanh.StaticMeThod;

public class StaticMethod {
    private int id;
    private String name;
    private static String college;

    StaticMethod(int id, String name) {
        this.id = id;
        this.name = name;
    }

    static void change() {
        college = "CODEGYM";
    }

    void display() {
        System.out.println(id + " " + name + " " + college);
    }
}
