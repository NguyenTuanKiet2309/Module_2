package ss7_abstraction.bai_tap.interface_resizeable;

public class Test {
    public static void main(String[] args) {
        Shape s[] = new Shape[3];
        s[0] = new Circle(1);
        s[1] = new Rectangle(2,3);
        s[2] = new Square(4);
        System.out.println("Trước khi chuyển đổi là: ");
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i].toString());
        }
        System.out.println("Sau khi chuyển đổi là: ");
        for (int i = 0; i < s.length; i++) {
            s[i].resize(Math.random()*10);
            System.out.println(s[i].toString());
        }
    }
}
