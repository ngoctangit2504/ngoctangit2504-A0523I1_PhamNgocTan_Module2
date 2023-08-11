package ss3_array_and_method_in_java.exercise;

import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng");
        int n = scanner.nextInt();
        // Thêm phần tử vào mảng gốc
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhập phần tử tại vi trí " + i);
            arr[i] = scanner.nextInt();
        }

        System.out.println("Nhập số cần chèn");
        int x = scanner.nextInt();
        System.out.println("Nhập vị trí cần chèn");
        int index = scanner.nextInt();
        int index_up = index;

        System.out.println("mảng vừa tạo");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("Phần tử chèn là " + x + " nằm tại vị trí " + index);

        // Tạo mảng và dời vị trí các phần tử sau phần tử đã chèn.
        int arr_change[] = new int[n - index];
        for (int i = 0; i < arr_change.length-1; i++) {
            arr_change[i] = arr[index_up++];
        }

        // Đặt các phần tử vào vị trí đúng như yêu cầu.
        int u = 0;
        for (int i = index + 1; i < arr_change.length; i++) {
            arr[i] = arr_change[u];
            u++;
        }
        arr[index] = x;

        // Hiển thị mảng cuối cùng
        System.out.println("Mảng sau khi chèn phần tử :");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}