package ss6_inheritance.thuc_hanh;

public class TestReactangle {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(2.3, 5.8);
        System.out.println(rectangle);

        rectangle = new Rectangle("orange", true, 3.0, 5.0);
        System.out.println(rectangle);
    }
}
