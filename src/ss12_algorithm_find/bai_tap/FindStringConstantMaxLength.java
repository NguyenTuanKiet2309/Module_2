package ss12_algorithm_find.bai_tap;

import java.util.LinkedList;
import java.util.Scanner;

public class FindStringConstantMaxLength {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập chuỗi bất kỳ: ");
        String str = input.nextLine();
        LinkedList<Character> listMax = new LinkedList<>();
        LinkedList<Character> list = new LinkedList<>();
        for (int i = 0; i < str.length(); i++) {
            if (list.size() > 1 && str.charAt(i) <= list.getLast() && list.contains(str.charAt(i))) {
                list.clear();
            }
            list.add(str.charAt(i));
            if (list.size() > listMax.size()) {
                listMax.clear();
                listMax.addAll(list);
            }
        }
        for (Character ch: listMax) {
            System.out.print("Chuỗi liên tiếp có độ dài nhất là: "+ch);
        }
    }
}
