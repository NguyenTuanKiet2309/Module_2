package algorithms;

import java.util.ArrayList;

public class Fibonacci {
    public static void main(String[] args) {
        int number1 = 0;
        int number2 = 1;
        int number3 = 0;
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(number1);
        arrayList.add(number2);
        for (int i = 0; i < 100; i++) {
            number3 = number1 + number2;
            if (number3 > 100) {
                break;
            }
            arrayList.add(number3);
            number1 = number2;
            number2 = number3;
        }
        System.out.println(arrayList);
    }
}
