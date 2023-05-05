package algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class TimSoLuongKyTuChung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào 1 xâu kí tự: ");
        String str = sc.nextLine();
        String[] arr = str.split("");
        System.out.println("Nhập vào 1 xâu kí tự để so sánh: ");
        String str2 = sc.nextLine();
        String[] arr2 = str2.split("");
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr[i].contains(arr2[j])) {
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);
    }
}
