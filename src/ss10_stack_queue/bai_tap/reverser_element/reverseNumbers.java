package ss10_stack_queue.bai_tap.reverser_element;

import java.util.Arrays;
import java.util.Stack;

public class reverseNumbers {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
        }
        System.out.println("Stack khi chưa chuyển đổi là : " + stack);
        int swap = 0;
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            swap = stack.pop();
            newArr[i] = swap;
        }
        System.out.println("Sau khi chuyển đổi là: " + Arrays.toString(newArr));
    }
}
