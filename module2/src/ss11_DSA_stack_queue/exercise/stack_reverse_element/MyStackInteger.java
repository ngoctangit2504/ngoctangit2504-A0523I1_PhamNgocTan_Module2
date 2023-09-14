package ss11_DSA_stack_queue.exercise.stack_reverse_element;

import java.util.Scanner;
import java.util.Stack;

public class MyStackInteger {
    public static void pushElement(Stack<Integer> elemnt) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử muốn thêm vào Stack.");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập phần tử thứ "+(i+1));
            int value = scanner.nextInt();
            elemnt.push(value);
        }
    }

    public static void reseverToNewStack(Stack<Integer> beforeStack) {
        Stack<Integer> newStack = new Stack<>();
        System.out.println(newStack);

        for (int n : beforeStack) {
            newStack.push(beforeStack.pop());
            System.out.println(newStack);
        }
    }



    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        pushElement(stack);
        System.out.println("Stack của chúng ta : "+stack);
        System.out.println(stack.size());
        reseverToNewStack(stack);
    }
}
