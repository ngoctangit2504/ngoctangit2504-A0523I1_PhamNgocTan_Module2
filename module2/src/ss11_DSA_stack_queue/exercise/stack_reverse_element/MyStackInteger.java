package ss11_DSA_stack_queue.exercise.stack_reverse_element;

import java.util.Scanner;
import java.util.Stack;

public class MyStackInteger {
    public static void pushElement(Stack<Integer> stack, int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập phần tử thứ " + (i + 1));
            int value = scanner.nextInt();
            stack.push(value);
        }
        System.out.println("Mảng của chúng ta " + stack);
    }

    public static void reseverToNewStack(Stack<Integer> stack, int n) {
        Stack<Integer> newStack = new Stack<>();
        for (int i = 0; i < n; i++) {
            newStack.push(stack.pop());
        }
        System.out.println("Stack sau khi đảo ngược phần tử: " + newStack);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> number = new Stack<>();
        System.out.println("Nhập số lượng phần tử muốn thêm vào stack");
        int size = scanner.nextInt();

        pushElement(number, size);

        reseverToNewStack(number, size);
    }
}
