package ss13_sort.bai_tap;

import java.util.Arrays;

public class InsertionSort {
    public static int[] insertionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int index = i;
            int x = arr[i];
            while (index > 0 && x < arr[index - 1]) {
                arr[index] = arr[index - 1];
                index--;
            }
            arr[index] = x;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{0, 15, 67, -4, 2, 91, 180, 23, 9};
        System.out.println(Arrays.toString(insertionSort(arr)));

    }
}
