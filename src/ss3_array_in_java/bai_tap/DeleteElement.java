package ss3_array_in_java.bai_tap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Mảng lúc đầu là: " + Arrays.toString(arr));
        System.out.println("Nhập số bạn muốn xoá: ");
        int input = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == input) {
                for (int j = i; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[arr.length - 1] = 0;
                break;
            }
        }
        System.out.println("Mảng kết quả :" + Arrays.toString(arr));
    }
}
