package ss5_accessmodifier_staticmethod_staticproperty.bai_tap.AccessModifier;

import java.util.Scanner;

public class TestCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào bán kính");
        double input = Integer.parseInt(sc.nextLine());
        Circle c = new Circle();
        c.setRadius(input);
        System.out.println(c.toString());
    }
}
