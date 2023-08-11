package ss3_array_and_method_in_java.exercise;

import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng");
        int n = scanner.nextInt();
        System.out.println("Nhập số cần chèn");
        int x = scanner.nextInt();
        System.out.println("Nhập vị trí cần chèn");
        int index = scanner.nextInt();

        int arr[] = new int[n];
        arr[0] = 10;
        arr[1] = 4;
        arr[2] = 6;
        arr[3] = 7;
        arr[4] = 8;

        boolean flag = true;
        int arr_length_1 = arr.length-1;
        if (x <= 1 || index >= arr.length-1){
            System.out.println("Không chèn được phần tử vào mảng");
            flag = false;
        } if (flag) {

        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
