package ss3_array_in_java.bai_tap;

import java.util.Scanner;

public class FindNumberMinInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập size của mảng");
        int size = Integer.parseInt(sc.nextLine());
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Mời bạn nhập các giá trị, thứ tự : " + (i + 1));
            arr[i] = Integer.parseInt(sc.nextLine());
        }
        int min = arr[0];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                index = i;
            }
        }
        System.out.println("Giá trị nhỏ nhất trong mảng là : " + min + " nằm ở vị trí " + index);
    }
}
