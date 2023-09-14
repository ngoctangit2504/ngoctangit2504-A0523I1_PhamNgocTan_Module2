package ss11_DSA_stack_queue.exercise.Optional_Palindrome_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class PalindromeQueue {
    public static void main(String[] args) {
        System.out.println("Nhập chuỗi cần kiểm tra");
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();

        Queue queue = new LinkedList();
        for (int i = inputString.length()-1; i >= 0 ; i--) {
            queue.add(inputString.charAt(i));
        }

        String reverseString = "";
        while (!queue.isEmpty()) {
            reverseString = reverseString+queue.remove();
        }
        if (inputString.equals(reverseString)) {
            System.out.println("String is Palindrome");
        } else {
            System.out.println("String is not Palindrome !");
        }
    }
}
