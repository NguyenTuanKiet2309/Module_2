package algorithms;

import java.security.PublicKey;
import java.util.Scanner;

public class ChinhSuaXauKyTu {
    public static String solution(String s) {
        String str = "";
        str += s.toLowerCase().charAt(0);
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.toUpperCase().charAt(i)){
                str = str + " " + s.toLowerCase().charAt(i);
            }else{
                str += s.charAt(i);
            }
        }
        return str;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi bất kì: ");
        String str = sc.nextLine();
        System.out.println(solution(str));
    }
}
