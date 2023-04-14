package ss10_stack_queue.bai_tap.string_palindrome;

import java.util.*;

public class CheckPalindrome {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập 1 chuỗi để kiểm tra: ");
        String str = sc.nextLine();
        Stack<String> stack = new Stack<>();
        Queue<String> queue = new ArrayDeque<>();
        String[] arr = str.split("");
        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i].toLowerCase(Locale.ROOT));
            queue.add(arr[i].toLowerCase(Locale.ROOT));
        }
        System.out.println(stack);
        System.out.println(queue);
        int size = stack.size();
        boolean flag = true;
        for (int i = 0; i < size; i++) {
            if (!stack.pop().equals(queue.poll())) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}
