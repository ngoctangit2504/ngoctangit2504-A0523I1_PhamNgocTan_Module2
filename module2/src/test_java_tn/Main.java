package test_java_tn;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] numbers = new int[][]{
                {1, 4, 5, 7},
                {2, 6, 8, 9}
        };

        if (numbers[0][3] == 7) {
            numbers[0][numbers[0].length - 1] = 10;
            for (int i = 0; i < numbers[0].length; i++) {
                System.out.print(numbers[0][i] + ",");
            }
        }
    }
}
