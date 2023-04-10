package ss6_inheritance.bai_tap.point_and_moveablePoint;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Point p = new Point(5,5);
        MoveablePoint m = new MoveablePoint(3,3,5,5);

        System.out.println("Point: ");
        System.out.println(Arrays.toString(p.getXY()));
        System.out.println(p.toString());

        System.out.println("MoveablePoint: ");
        System.out.println(Arrays.toString(m.getSpeed()));
        System.out.println(m.toString());

        System.out.println("Speed: ");
        System.out.println(m.move());
    }
}
