package ss11_map_and_tree.bai_tap.count_word;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập 1 chuỗi bất kì");
        String str = sc.nextLine();
        String[] arr = str.split(" ");
        System.out.println(Arrays.toString(arr));
        Map<String, Integer> map = new TreeMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        System.out.println(map);
    }
}

