package ss3_array_in_java.bai_tap;

import java.util.ArrayList;
import java.util.List;

public class FindNumberMaxInArray {
    public static void main(String[] args) {
        int[][] arr = new int[][]{
                {1, 2, 12, 4, 5},
                {3, 4, 5, 9, 15},
                {20, 32, 4, 99, 3}
        };
        int max = arr[0][0];
        int count = 0, count1 = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    count = i;
                    count1 = j;
                }
            }
        }
        System.out.println("Phần tử lớn nhất trong ma trận là: " + max + " ở vị trí thứ : " + "[" + count + "]" + "[" + count1 + "]");
    }
}
