package ss13_search.exercise.search_nhi_phan_de_quy;

import java.util.Scanner;

public class BinarySearch {

    // Khởi tạo mảng
    public static int[] newArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử:");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Nhập các phần tử");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhập phần tử tứ " + (i + 1));
            int input = scanner.nextInt();
            arr[i] = input;
        }
        return arr;
    }


    // Sắp xếp lại mảng nhập vào.
    public static void selectionSort(int[] array) {
        int min;
        for (int i = 0; i < array.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            if (min != i) {
                int temp = array[min];
                array[min] = array[i];
                array[i] = temp;
            }
        }
    }

    // Hàm tìm kiếm
    public static int binarySearch(int[] array, int low, int hight, int value) {
        if (hight >= low) {
            int mid = low + (hight - low) / 2;
            if (array[mid] == value) {
                return mid;
            }
            if (array[mid] > value) {
                return binarySearch(array, low, mid - 1, value);
            }
            return binarySearch(array, low, mid + 1, value);
        }
        return -1;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr1 = newArray();
        selectionSort(arr1);

        int n = arr1.length;
        System.out.println("Nhập phần tử cần tìm kiếm");
        int x = scanner.nextInt();

        int result = binarySearch(arr1, 0, n - 1, x);
        if (result == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("Element found at index " + result);
        }
    }
}
