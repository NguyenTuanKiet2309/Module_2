package ss4_class_object.bai_tap;

import java.util.Scanner;

public class QuadraticEquation {
    double a, b, c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return this.a;
    }

    public double getb() {
        return this.b;
    }

    public double getc() {
        return this.c;
    }

    public double getDiscriminant() {
        return (Math.pow(getb(), 2)) - (4 * getA() * getc());
    }

    public double getRoot1() {
        return (-getb() + Math.sqrt(Math.pow(getb(), 2) - 4 * getA() * getc())) / (2 * getA());
    }

    public double getRoot2() {
        return (-getb() - Math.sqrt(Math.pow(getb(), 2) - 4 * getA() * getc())) / (2 * getA());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập a : ");
        double a = sc.nextDouble();
        System.out.println("Nhập b : ");
        double b = sc.nextDouble();
        System.out.println("Nhập c : ");
        double c = sc.nextDouble();
        System.out.println();
        QuadraticEquation delta = new QuadraticEquation(a, b, c);
        System.out.println("Delta là :" + delta.getDiscriminant());
        if (delta.getDiscriminant() >= 0) {
            System.out.println("Phương trình có 2 nghiệm :");
            System.out.println("x1 là : " + delta.getRoot1());
            System.out.println("x2 là : " + delta.getRoot2());
        } else if (delta.getDiscriminant() == 0) {
            System.out.println("Phương trình có 1 nghiệm, x = " + delta.getRoot1());
        } else {
            System.out.println("The equation has no roots");
        }
    }
}


