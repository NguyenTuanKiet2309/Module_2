package algorithms;

import java.util.Set;
import java.util.TreeSet;

public class Mang2Chieu {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 8, 43},
                {9, 4, 11, 7},
                {11, 6, 4, 0},
                {1, 2, 6, 51}
        };
        Set<Integer> set = new TreeSet<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
//                if (checkSoNguyenTo(arr[j])){
//                    set.add(arr[i]);
                }
            }
        }
//    }

    public static boolean checkSoNguyenTo(int number){
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
