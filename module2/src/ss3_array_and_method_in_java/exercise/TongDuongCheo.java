package ss3_array_and_method_in_java.exercise;

import java.util.Scanner;

public class TongDuongCheo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập cạnh của ma trận:");
        int size = scanner.nextInt();
        int arr[][] = new int[size][size];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Nhập phần tử ["+i+"]"+"["+j+"]");
                arr[i][j] = scanner.nextInt();
            }
        }

        int sum1 = 0;
        for (int i = 0; i < arr.length; i++) {
            sum1 += arr[i][i];
        }
        int sum2 = 0;
        for (int j = arr.length-1; j >= 0 ; j--) {
            sum2 += arr[j][j];
        }
        System.out.println("Tổng của các số đường chéo chính là:"+sum1+" và "+sum2);
    }
}