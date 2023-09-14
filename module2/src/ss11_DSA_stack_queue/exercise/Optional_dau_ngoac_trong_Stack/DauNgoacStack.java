package ss11_DSA_stack_queue.exercise.Optional_dau_ngoac_trong_Stack;

import java.util.Scanner;
import java.util.Stack;

public class DauNgoacStack {
    public static boolean kiemTraDauNgoac(String s) {
        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.isEmpty() || stack.pop() != '(') {
                    return false;
                }
            }
        }
        if (stack.isEmpty()) {
            System.out.println("Well");
        } else {
            System.out.println("???");
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi cần kiểm tra :");
        String input = scanner.next();
        System.out.println(kiemTraDauNgoac(input));
    }
}
