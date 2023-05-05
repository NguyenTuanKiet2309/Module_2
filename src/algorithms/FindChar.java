package algorithms;

import java.util.*;

public class FindChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập 1 chuỗi bất kì:");
        String str = sc.nextLine();
        String[] arr = str.split("");
        System.out.println(Arrays.toString(arr));
        Set<String> treeSet = new TreeSet<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].equals(arr[j])) {
                    treeSet.add(arr[i]);
                    break;
                }
            }
        }
        System.out.println(treeSet);
    }
}
