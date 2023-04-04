package ss3_array_in_java.bai_tap;

import java.util.Scanner;

public class CountCharaterInString {
    public static void main(String[] args) {
        String str = "VIETNAMNUMBERONE";
        char a = 'E';
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (a == str.charAt(i)) {
                count++;
            }
        }
        System.out.println("Số lần xuất hiện của ký tự trong chuỗi là: " + count);
    }
}
