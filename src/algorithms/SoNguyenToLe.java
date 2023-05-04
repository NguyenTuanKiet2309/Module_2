package algorithms;

import java.util.ArrayList;
import java.util.List;

public class SoNguyenToLe {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            if (kiemTraSoNguyenTo(i)) {
                if (i % 2 != 0 && i % 3 == 0) {
                    list.add(i);
                }
            }
        }
        System.out.println(list);
    }

    public static boolean kiemTraSoNguyenTo(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
