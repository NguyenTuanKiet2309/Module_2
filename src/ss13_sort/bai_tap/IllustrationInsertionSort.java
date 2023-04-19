package ss13_sort.bai_tap;

import java.sql.Array;
import java.util.Arrays;

public class IllustrationInsertionSort {
    public static void main(String[] args) {
        int[] arr = new int[]{7, 2, 113, 6, 52, 4, -8};
        for (int i = 0; i < arr.length; i++) {
            int index = i;
            int x = arr[i];
            while (index > 0 && x < arr[index - 1]) {
                arr[index] = arr[index - 1];
                index--;
            }
            arr[index] = x;
            System.out.println(Arrays.toString(arr));
            System.out.println("___________________");
        }
    }
}
