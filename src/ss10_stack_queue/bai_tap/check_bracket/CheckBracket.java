package ss10_stack_queue.bai_tap.check_bracket;

import java.util.Scanner;
import java.util.Stack;

public class CheckBracket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi bất kì: ");
        String str = sc.nextLine();
        Stack<Character> stack = new Stack<>();
        Stack<Character> stack2 = new Stack<>();
        boolean flag = true;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                stack.push(str.charAt(i));
            } else if (str.charAt(i) == ')') {
                stack2.push(str.charAt(i));
            }
            if (stack.size() < stack2.size()) {
                flag = false;
                break;
            }
        }
        if (flag = true && stack.size() == stack2.size()) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
