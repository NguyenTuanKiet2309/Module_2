package algorithms;

import java.util.ArrayList;
import java.util.Arrays;


public class DemSoKyTu {
    public static void main(String[] args) {
        String str = "aabacsdc";
        String arr[] = str.split("");
        System.out.println(Arrays.toString(arr));
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (!arr[i].equals(" ") && !arrayList.contains(arr[i])) {
                int count = 0;
                for (int j = 0; j < arr.length; j++) {
                    if (arr[i].equals(arr[j])) {
                        count++;
                    }
                }
                arrayList.add(arr[i]);
                arrayList.add(String.valueOf(count));
            }
        }
        System.out.println(arrayList);
    }
}
