package ss3_array_and_method_in_java.exercise;

import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arr1[] = new int[1];
        int arr2[] = new int[5];
        int arr3[] = new int[6];

        System.out.println("Nhập phần tử mảng 1");
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("Tại vị trí "+i);
            arr1[i] = scanner.nextInt();
        }
        System.out.println("Nhập phần tử mảng 2");
        for (int i = 0; i < arr2.length; i++) {
            System.out.println("Tại vị trí "+i);
            arr2[i] = scanner.nextInt();
        }
        System.out.println("Nhập phần tử mảng 3");
        for (int i = 0; i < arr3.length; i++) {
            System.out.println("tại vị trí "+i);
            arr3[i] = scanner.nextInt();
        }

        // gộp 2 mảng.
        int arr_g2[] = new int[arr1.length+ arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            arr_g2[i] = arr1[i];
        }
        int index = arr1.length;
        for (int i = 0; i < arr2.length; i++) {
            arr_g2[index] = arr2[i];
            index++;
        }
        index = arr1.length;
        System.out.println("Mảng sau khi gộp 2 mảng.");
        for (int i = 0; i < arr_g2.length; i++) {
            System.out.println(arr_g2[i]);
        }

        // gộp 3 mảng.
        int arr_g3[] = new int[arr1.length + arr2.length + arr3.length];
        for (int i = 0; i < arr1.length; i++) {
            arr_g3[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arr_g3[index] = arr2[i];
            index++;
        }
        int index1 = arr1.length+arr2.length;
        for (int i = 0; i < arr3.length; i++) {
            arr_g3[index1] = arr3[i];
            index1++;
        }
        System.out.println("Mảng sau khi gộp 3 mảng.");
        for (int i = 0; i < arr_g3.length; i++) {
            System.out.println(arr_g3[i]);
        }
    }
}
