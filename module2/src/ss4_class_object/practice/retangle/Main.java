package ss4_class_object.practice.retangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chiều rộng: ");
        double width = scanner.nextDouble();
        System.out.println("Nhập chiều dài: ");
        double height = scanner.nextDouble();

        Rectangle rectangle = new Rectangle(width,height);
        System.out.println(rectangle.display());
        System.out.println("Diện tích hình chữ nhật "+rectangle.getArea());
        System.out.println("Chu vi hình chữ nhật "+rectangle.getPerimeter());
    }
}