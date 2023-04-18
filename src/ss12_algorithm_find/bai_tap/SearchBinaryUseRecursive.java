package ss12_algorithm_find.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class SearchBinaryUseRecursive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử mảng : ");
        int size = Integer.parseInt(sc.nextLine());
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhập phần tử thứ " + (i + 1) + " trong mảng : ");
            int element = Integer.parseInt(sc.nextLine());
            arr[i] = element;
        }
        System.out.println("Mảng vừa nhập là: " + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Mảng sau khi được sắp xếp: " + Arrays.toString(arr));
        System.out.println("Nhập giá trị cần tìm trong mảng : ");
        int value = Integer.parseInt(sc.nextLine());
        System.out.println(binarySearch(arr, value, 0, arr.length - 1));
    }

    static int binarySearch(int[] arr, int value, int min, int max) {
        if (max >= min) {
            int middle = (min + max) / 2;
            if (value < arr[middle]) {
                return binarySearch(arr, value, min, middle - 1);
            } else if (value == arr[middle]) {
                return middle;
            } else {
                return binarySearch(arr, value, middle + 1, max);
            }
        }
        return -1;
    }
}
