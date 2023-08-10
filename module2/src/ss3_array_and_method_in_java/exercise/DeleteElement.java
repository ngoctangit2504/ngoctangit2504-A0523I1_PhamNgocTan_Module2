package ss3_array_and_method_in_java.exercise;

import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arr[] = {1,5,6,8,9};
        System.out.println("Nhập phần tử cần xóa");
        int x = scanner.nextInt();
        int index_del = 0;
        for (int i = 0; i < arr.length; i++) {
            if (x == arr[i]){
                index_del = i;
                System.out.println("X có tồn tại trong mảng tại vị trí "+index_del);
            }
        }
        for (int j = index_del; j < arr.length-1; j++) {
            arr[j] = arr[j+1];
        }
        System.out.println("Mảng sau khi xóa phần tử vừa nhập");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}