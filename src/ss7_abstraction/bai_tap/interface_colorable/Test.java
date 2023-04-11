package ss7_abstraction.bai_tap.interface_colorable;

public class Test {
    public static void main(String[] args) {
        Shape[] s = new Shape[3];
        s[0] = new Square(5);
        s[1] = new Circle(2);
        s[2] = new Rectangle(4, 4);
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i].toString());
            if (s[i] instanceof IColorable) {
                s[i].howToColor();
            }
        }
    }
}
