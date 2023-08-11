package ss3_array_and_method_in_java.exercise;

import java.util.Scanner;

public class SearchMaxValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số dòng:");
        int row = scanner.nextInt();
        System.out.println("Nhập số cột:");
        int col = scanner.nextInt();
        int arr[][] = new int[row][col];
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Nhập phần tử tại vị trí ["+i+"]"+"["+j+"]");
                arr[i][j] = scanner.nextInt();
            }
        }
        int row_index = 0;
        int col_index = 0;
        int max_value = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max_value) {
                    row_index = i;
                    col_index = j;
                    max_value = arr[i][j];
                }
            }
        }
        System.out.println("Giá trị lớn nhất trong mảng là "+max_value);
        System.out.println("Nằm tại vị trí ["+row_index+"]"+"["+col_index+"]");
    }
}