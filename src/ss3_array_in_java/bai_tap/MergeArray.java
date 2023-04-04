package ss3_array_in_java.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr1 = new int[3];
        int[] arr2 = new int[6];
        int[] arr3 = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("Nhập các phẩn tử trong mảng 1 , thứ tự: " + (i + 1));
            arr1[i] = Integer.parseInt(sc.nextLine());
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.println("Nhập các phẩn tử trong mảng 2 , thứ tự: " + (i + 1));
            arr2[i] = Integer.parseInt(sc.nextLine());
        }
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arr3[i + (arr1.length)] = arr2[i];
        }
//        Sử dụng hàm copy array:
//        System.arraycopy(arr1, 0, arr3, 0, arr1.length);
//        System.arraycopy(arr2, 0, arr3, arr2.length, arr2.length);
        System.out.println(Arrays.toString(arr3));
    }
}
