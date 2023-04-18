package ss12_algorithm_find.bai_tap;

import java.util.LinkedList;
import java.util.Scanner;

public class FindStringMaxLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời bạn nhập chuỗi bất kỳ: ");
        String str = sc.nextLine();
        LinkedList<Character> listMax = new LinkedList<>();
        LinkedList<Character> list = new LinkedList<>();
        for (int i = 0; i < str.length(); i++) {
            list.add(str.charAt(i));
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(j) > list.getLast()) {
                    list.add(str.charAt(j));
                }
            }
            for (int j = 0; j < list.size(); j++) {
                if (list.size() > listMax.size()) {
                    listMax.add(list.get(j));
                }
            }
            list.clear();
        }
        for (Character ch : listMax) {
            System.out.print("Chuỗi dài nhất là: " + ch);
        }
    }
}
