package algorithms;

import java.util.Scanner;

public class SoNguyenTo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập số lượng phần tử của mảng");
        int input = Integer.parseInt(sc.nextLine());
        int[] arr = new int[input];
        for (int i = 0; i < input; i++) {
            System.out.println("Nhập phần tử thứ " + i);
            arr[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.println("Tổng của các số nguyên tố có trong mảng là : " + tinhTongSoNguyenTo(arr));
    }

    public static int tinhTongSoNguyenTo(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (kiemTraSoNguyenTo(arr[i])){
                sum += arr[i];
            }
        }
        return sum;
    }

    public static boolean kiemTraSoNguyenTo(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
