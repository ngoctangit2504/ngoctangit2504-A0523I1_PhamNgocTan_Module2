package ss3_array_and_method_in_java.exercise;

import java.util.Scanner;

public class SumColArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số dòng:");
        int row = scanner.nextInt();
        System.out.println("Nhập số cột:");
        int col = scanner.nextInt();
        int arr[][] = new int[row][col];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Nhập liệu vị trí["+i+"]"+"["+j+"]");
                arr[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Nhập cột mà bạn muốn tính tổng:");
        int sum_col = scanner.nextInt();
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][sum_col];
        }
        System.out.println("Tổng của cột bạn chọn là:"+sum);
    }
}
