package ss3_array_and_method_in_java.practice;

import java.util.Scanner;

public class CountStudent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nập số lượng sinh viên:");
        int size = scanner.nextInt();
        int arr[] = new int[size];

        System.out.println("Nhập điểm số của các sinh viên theo thứ tự");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Điểm của học sinh thứ "+(i+1));
            arr[i] = scanner.nextInt();
        }

        System.out.println("Lớp có "+size+" sinh viên.");
        System.out.println(" Điểm của các sinh viên:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        int pass = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 5) {
                pass += 1;
            }
        }
        System.out.println("Số học sinh đã pass là : "+pass);
    }
}