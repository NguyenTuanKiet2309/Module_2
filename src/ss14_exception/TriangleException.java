package ss14_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TriangleException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Nhập lần lượt cạnh cạnh a, b, c :");
            double sideA = sc.nextInt();
            double sideB = sc.nextInt();
            double sideC = sc.nextInt();
            checkTriangleException(sideA, sideB, sideC);
        } catch (IllegalTriangleException | InputMismatchException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Finally!");
        }
    }

    static void checkTriangleException(double sideA, double sideB, double sideC) throws IllegalTriangleException {
        if (sideA < 0 || sideB < 0 || sideC < 0) {
            throw new IllegalTriangleException("Lỗi cạnh âm");
        } else if (sideA + sideB <= sideC || sideA + sideC <= sideB || sideB + sideC <= sideA) {
            throw new IllegalTriangleException("Lỗi cạnh nhỏ hơn");
        } else {
            System.out.println("Tam giác hợp lệ");
        }

    }
}
