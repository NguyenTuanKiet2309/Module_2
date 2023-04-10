package ss6_inheritance.bai_tap.triangle;

import java.util.Scanner;

public class TestTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập màu cho tam giác:");
        String color = sc.nextLine();
        System.out.println("Mời bạn nhập cạnh 1:");
        double a = sc.nextDouble();
        System.out.println("Mời bạn nhập cạnh 2:");
        double b = sc.nextDouble();
        System.out.println("Mời bạn nhập cạnh 3:");
        double c = sc.nextDouble();
        Triangle t = new Triangle(a,b,c);
        Shape s = new Shape(color);
        System.out.println(t.toString());
        System.out.println(s.toString());
    }
}
