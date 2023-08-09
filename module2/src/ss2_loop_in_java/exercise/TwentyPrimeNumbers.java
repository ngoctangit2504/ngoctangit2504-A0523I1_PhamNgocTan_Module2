package ss2_loop_in_java.exercise;

import java.util.Scanner;

public class TwentyPrimeNumbers {
    public static void main(String[] args) {
        System.out.println("---Hiển thị số nguyên tố---");
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập số lượng số nguyên tố cần hiển thị:");
        int numbers = sc.nextInt();
        int count = 0;
        int N = 2;
        while (count < numbers) {
            boolean flag = true;
            if (N > 2) {
                for (int i = 2; i < N; i++) {
                    if (N % i == 0) {
                        flag = false;
                    }
                }
                if (flag) {
                    System.out.println(N + ",");
                    count++;
                }
            }
            N++;
        }
    }
}
