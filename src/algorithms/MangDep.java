package algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class MangDep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhập phần tử thứ " + i);
            arr[i] = sc.nextInt();
        }
        System.out.println(check(arr));
    }

    public static boolean check(int[] arr) {
        if (arr.length < 3) {
            return false;
        }
        int sum = arr[0];
        int sum1 = arr[arr.length - 1];
        int count = 1;
        int count1 = arr.length - 2;
        for (int i = 0; i < arr.length - 3; i++) {
            if (sum < sum1) {
                sum += arr[count];
                count++;
            } else {
                sum1 += arr[count1];
                count1--;
            }
        }
        return sum == sum1;
    }

}
