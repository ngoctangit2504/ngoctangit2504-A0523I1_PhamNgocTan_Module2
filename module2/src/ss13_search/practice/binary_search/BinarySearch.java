package ss13_search.practice.binary_search;

public class BinarySearch {
    static int[] list = {1,5,6,8,9,15,56,68,99};

    static int binarySearch(int[] list, int key) {
        int low = 0;
        int high = list.length - 1;
        while (high >= low) {
            int mid = (low + high) / 2;
            if (key < list[mid])
                high = mid - 1;
            else if (key == list[mid])
                return mid;
            else
                low = mid + 1;
        }
        return -1; /* Now high < low, key not found */
    }

    public static void main(String[] args) {
        System.out.println(binarySearch(list,8));
    }
}
