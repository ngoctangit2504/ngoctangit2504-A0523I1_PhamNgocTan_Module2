package ss3_array_and_method_in_java.practice;

import java.util.Scanner;

public class ReseverElement {
    public static void main(String[] args) {
        int l;
        int[] arr;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Enter array length.");
            l = sc.nextInt();
            if (l > 20) {
                System.out.println("Length not oke!");
            }
        }while (l > 20);

        arr = new int[l];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter element at i = "+i+" :");
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+"\t");
        }

        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[l - 1 -i];
            arr[l -1 - i] = temp;
        }

        System.out.printf("\n%-20s%s", "Reverse array: ", "");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "\t");
        }
    }
}
