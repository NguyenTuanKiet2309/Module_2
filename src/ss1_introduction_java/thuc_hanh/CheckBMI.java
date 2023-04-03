package ss1_introduction_java.thuc_hanh;

import java.util.Scanner;

public class CheckBMI {
    public static void main(String[] args) {
        double width, height, BMI;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Width(kg): ");
        width = sc.nextDouble();

        System.out.println("Enter Your Height(meter): ");
        height = sc.nextDouble();

        BMI =  width / Math.pow(height, 2);

        if (BMI < 18) {
            System.out.println(BMI + " Underweight");
        } else if (BMI < 25) {
            System.out.println(BMI + " Normal");
        } else if (BMI < 30) {
            System.out.println(BMI + " Overweight");
        } else {
            System.out.println(BMI + " Obese");
        }
    }
}