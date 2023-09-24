package ss14_thuat_toan_sap_xep.exercise.minh_hoa_insertion_sort;

public class InsertionSort {
    public static void sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {1, 5, 6, 8, 9, 9, 7, 2, 3, 8};
        System.out.println("Mảng ban đầu");
        printArray(arr);
        System.out.println("mảng sau khi sắp xếp chèn");
        sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
