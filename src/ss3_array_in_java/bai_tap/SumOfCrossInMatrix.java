package ss3_array_in_java.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfCrossInMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số hàng :");
        int n = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập số cột :");
        int m = Integer.parseInt(sc.nextLine());
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("Nhập phần tử thứ [" + i + ", " + j + "]: ");
                arr[i][j] = Integer.parseInt(sc.nextLine());
            }
        }
        System.out.println(Arrays.deepToString(arr));
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][i];
        }
        System.out.println(sum);
    }
}
