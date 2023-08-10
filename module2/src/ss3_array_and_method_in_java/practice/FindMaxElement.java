package ss3_array_and_method_in_java.practice;

import java.util.Scanner;

public class FindMaxElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        int arr[] = new int[6];

        System.out.println("---------------------------");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhập phẩn tử tại vị trí thứ "+(i+1));
            arr[i] = scanner.nextInt();
        }

        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                index = i;
            }
        }
       System.out.println("Giá trị lớn nhất là : "+max);
        System.out.println("Giá trị lớn nhất nằm ở vị trí:"+index+" trong mảng.");
        System.out.println("-----------------------------------");
    }
}
