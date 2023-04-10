package ss6_inheritance.bai_tap.point;

import java.util.Arrays;

public class TestPoint {
    public static void main(String[] args) {
        Point2D p = new Point2D(10.0f, 30.12f);
        System.out.println(p.toString());

        Point3D pp = new Point3D(10f, 30f, 123.123f);
        System.out.println(pp.toString());

        System.out.println(Arrays.toString(p.getXY()));
        System.out.println(Arrays.toString(pp.getXYZ()));
    }
}
