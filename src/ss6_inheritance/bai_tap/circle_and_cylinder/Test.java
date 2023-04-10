package ss6_inheritance.bai_tap.circle_and_cylinder;

public class Test {
    public static void main(String[] args) {
        Circle c = new Circle();
        System.out.println(c.toString());

        Cylinder cc = new Cylinder(7.1, "green", 10.0, 5);
        System.out.println(cc.toString());
    }
}
