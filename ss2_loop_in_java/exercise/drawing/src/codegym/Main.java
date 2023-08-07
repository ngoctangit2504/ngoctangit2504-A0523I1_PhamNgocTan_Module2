package codegym;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----In hình chữ nhật-----");
        System.out.println("Nhập chiều rộng");
        int weight = sc.nextInt();
        System.out.println("Nhập chiều dài");
        int height = sc.nextInt();

        for (int i = 0; i < weight ; i++) {
            for (int j = 0; j < height; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }


        System.out.println("-----In hình tam giác vuông-----");
        System.out.println("Nhập chiều cao");
        int height1 = sc.nextInt();
        for (int i = 0; i <= height1; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }


        System.out.println("-----In hình tam giác vuông ngược-----");
        System.out.println("Nhập chiều cao:");
        int height2 = sc.nextInt();
        for (int i = height2; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}