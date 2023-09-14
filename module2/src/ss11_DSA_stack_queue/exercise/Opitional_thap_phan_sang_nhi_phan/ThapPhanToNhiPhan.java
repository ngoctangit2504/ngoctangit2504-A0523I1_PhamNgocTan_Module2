package ss11_DSA_stack_queue.exercise.Opitional_thap_phan_sang_nhi_phan;

import java.util.Scanner;
import java.util.Stack;

public class ThapPhanToNhiPhan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<Integer>();
        System.out.println("Nhập vào số thập phân :");
        int number = scanner.nextInt();

        while (number != 0) {
            int d = number % 2;
            stack.push(d);
            number /= 2;
        }
        System.out.println("Giá trị nhị phân là : ");
        while (!(stack.isEmpty())) {
            System.out.print(stack.pop());
        }
    }
}
