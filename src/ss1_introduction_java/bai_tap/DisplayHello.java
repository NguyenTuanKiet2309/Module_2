package ss1_introduction_java.bai_tap;

import java.util.Scanner;

public class DisplayHello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String str = sc.nextLine();
        System.out.println("Hello " + str);
    }
}
