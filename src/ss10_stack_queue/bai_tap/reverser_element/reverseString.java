package ss10_stack_queue.bai_tap.reverser_element;

import java.util.Scanner;
import java.util.Stack;

public class reverseString {
    public static void main(String[] args) {
        Stack<String> wStack = new Stack();
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập chuỗi bất kì: ");
        String str = sc.nextLine();
        String[] mWord = str.split("");
        for (int i = mWord.length - 1; i >= 0; i--) {
            wStack.push(mWord[i]);
        }
        System.out.println(wStack);
        String result = String.join("", wStack) + str;
        System.out.println(result);
    }
}
