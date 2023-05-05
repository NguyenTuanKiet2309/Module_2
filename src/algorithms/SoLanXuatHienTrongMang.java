package algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SoLanXuatHienTrongMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử trong mảng 1: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhập phần tử thứ: " + i);
            arr[i] = sc.nextInt();
        }

        System.out.println("Nhập số lượng phần tử trong mảng 2: ");
        int size2 = sc.nextInt();
        int[] arr2 = new int[size2];
        for (int i = 0; i < arr2.length; i++) {
            System.out.println("Nhập phần tử thứ: " + i);
            arr2[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr[i] == arr2[j]){
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);
    }
}
