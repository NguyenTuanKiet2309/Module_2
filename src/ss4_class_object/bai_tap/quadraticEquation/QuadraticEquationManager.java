package ss4_class_object.bai_tap.quadraticEquation;

import java.util.Scanner;

public class QuadraticEquationManager {
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
