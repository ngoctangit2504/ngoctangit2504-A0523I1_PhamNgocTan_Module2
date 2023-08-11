package ss3_array_and_method_in_java.exercise;

import java.util.Scanner;

public class CheckMinValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhâp độ dài mảng.");
        int size = scanner.nextInt();

        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("nhập phần tử tại vị trí " + i);
            arr[i] = scanner.nextInt();
        }
        int min = arr[0];
        int index_min = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                index_min = i;
            }
        }
        System.out.println("Giá trị nhỏ nhất trong mảng trên là " + min);
        System.out.println("Nó nằm tại vị trí " + index_min);
    }
}