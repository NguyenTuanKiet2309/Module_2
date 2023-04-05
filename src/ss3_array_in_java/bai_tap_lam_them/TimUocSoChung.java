package ss3_array_in_java.bai_tap_lam_them;
import java.util.Arrays;
import java.util.Scanner;

public class TimUocSoChung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số bất kỳ để tìm ước chung");
        int input = Integer.parseInt(sc.nextLine());
        System.out.println(Arrays.toString(TimUocSoChung.numbers(input)));
    }

    public static int[] numbers(int a) {
        int count = 0;
        int[] arr = new int[a];
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                arr[count] = i;
                count++;
            }
        }
        int[] array = new int[count];
        for (int i = 0; i < array.length; i++) {
            array[i] = arr[i];
        }
        return array;
    }
}
