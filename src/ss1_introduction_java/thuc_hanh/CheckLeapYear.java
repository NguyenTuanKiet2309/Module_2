package ss1_introduction_java.thuc_hanh;

import java.util.Scanner;

public class CheckLeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Year Need Check: ");
        int year = Integer.parseInt(sc.nextLine());
        if (year % 400 == 0) {
            System.out.println("Leap Year");
        } else if ((year % 4 == 0 && year % 100 != 0)) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not Leap Year");
        }
    }
}
