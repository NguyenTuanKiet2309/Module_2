package ss10_stack_queue.bai_tap.change_decimal_to_binary;

import java.util.Scanner;
import java.util.Stack;

public class ChangeDecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số thập phân");
        int number = Integer.parseInt(sc.nextLine());
        Stack<Integer> stack = new Stack<>();
        while (number != 0) {
            int swap = number % 2;
            stack.push(swap);
            number /= 2;
        }
        int size = stack.size();
        for (int i = 0; i < size; i++) {
            System.out.print(stack.pop());
        }
    }
}
