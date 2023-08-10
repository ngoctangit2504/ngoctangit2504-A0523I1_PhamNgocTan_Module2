package ss3_array_and_method_in_java.practice;

import java.util.Scanner;

public class FindMin {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int arr[] = new int[5];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhập phần tử tại vị trí" +i);
            arr[i] = scanner.nextInt();
        }
        System.out.println("Giá trị nhỏ nhất trong mảng vừa nhập là : "+minValue(arr));
    }
    public static int minValue(int[]arrMenthod){
        int min = arrMenthod[0];
        for (int i = 0; i < arrMenthod.length; i++) {
         if (min == arrMenthod[i]) {
            min = arrMenthod[i];
            }
        }
        return min;
    }
}
