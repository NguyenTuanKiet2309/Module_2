package ss1_introduction_java.bai_tap;

import java.util.Scanner;

public class SwapNumberToLetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số cần chuyển đổi : ");
        int number = Integer.parseInt(sc.nextLine());
        System.out.println(number);
        if (number > 0 && number <= 10) {
            switch (number) {
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                case 10:
                    System.out.println("Ten");
                    break;
            }
        }
        int number2 = number % 10;
        if (number > 10 && number <= 20) {
            switch (number2) {
                case 1:
                    System.out.println("Eleven ");
                    break;
                case 2:
                    System.out.println("Twelve ");
                    break;
                case 3:
                    System.out.println("Thirteen ");
                    break;
                case 4:
                    System.out.println("Fourteen ");
                    break;
                case 5:
                    System.out.println("Fifteen ");
                    break;
                case 6:
                    System.out.println("Sixteen ");
                    break;
                case 7:
                    System.out.println("Seventeen ");
                    break;
                case 8:
                    System.out.println("Eigthteen ");
                    break;
                case 9:
                    System.out.println("Nineteen ");
                    break;
            }
        }
        if (number > 20 && number < 100) {
            int hangChuc = number / 10;
            int donVi = number % 10;
            switch (hangChuc) {
                case 2:
                    System.out.print("Twenty ");
                    break;
                case 3:
                    System.out.print("Thirty ");
                    break;
                case 4:
                    System.out.print("Fourty ");
                    break;
                case 5:
                    System.out.print("Fifty ");
                    break;
                case 6:
                    System.out.print("Sixty ");
                    break;
                case 7:
                    System.out.print("Seventy ");
                    break;
                case 8:
                    System.out.print("Eighty ");
                    break;
                case 9:
                    System.out.print("Ninety ");
                    break;
            }
            switch (donVi) {
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
        }
        if (number > 100 && number < 1000) {
            switch (number / 100) {
                case 1:
                    System.out.print("One Hundred and ");
                    break;
                case 2:
                    System.out.print("Two Hundred and ");
                    break;
                case 3:
                    System.out.print("Three Hundred and  ");
                    break;
                case 4:
                    System.out.print("Four Hundred and ");
                    break;
                case 5:
                    System.out.print("Five Hundred and ");
                    break;
                case 6:
                    System.out.print("Six Hundred and ");
                    break;
                case 7:
                    System.out.print("Seven Hundred and ");
                    break;
                case 8:
                    System.out.print("Eight Hundred and ");
                    break;
                case 9:
                    System.out.print("Nine Hundred and ");
                    break;

            }
            switch (number / 10 % 10) {
                case 2:
                    System.out.print("Twenty ");
                    break;
                case 3:
                    System.out.print("Thirty ");
                    break;
                case 4:
                    System.out.print("Fourty ");
                    break;
                case 5:
                    System.out.print("Fifty ");
                    break;
                case 6:
                    System.out.print("Sixty ");
                    break;
                case 7:
                    System.out.print("Seventy ");
                    break;
                case 8:
                    System.out.print("Eighty ");
                    break;
                case 9:
                    System.out.print("Ninety ");
                    break;
            }
            switch (number % 100) {
                case 10:
                    System.out.print("Ten");
                    break;
                case 11:
                    System.out.print("Eleven");
                    break;
                case 12:
                    System.out.print("Twelve");
                    break;
                case 13:
                    System.out.print("Thirteen");
                    break;
                case 14:
                    System.out.print("Fourteen");
                    break;
                case 15:
                    System.out.print("Fifteen");
                    break;
                case 16:
                    System.out.print("Sixteen");
                    break;
                case 17:
                    System.out.print("Seventeen");
                    break;
                case 18:
                    System.out.print("Eightteen");
                    break;
                case 19:
                    System.out.print("Nineteen");
                    break;
            }
            if (number / 10 % 10 > 1) {
                switch (number % 10) {
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                }
            }
        }
    }
}
