package ss15_xu_li_exception_and_debug.practice.number_format_exception;

import java.util.Scanner;

public class CalculationExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập giá trị x:");
        int x = scanner.nextInt();
        System.out.println("Nhập giá trị y:");
        int y = scanner.nextInt();
        CalculationExample calc = new CalculationExample();
        calc.caculate(x,y);


    }

    private void caculate(int x, int y) {
        try {
            int a = x + y;
            int b = x - y;
            int c = x * y;
            int d = x / y;
            System.out.println("Tổng x + y = " + a);
            System.out.println("Hiệu x - y = " + b);
            System.out.println("Tích x * y = " + c);
            System.out.println("Thương x / y = " + d);
        } catch (Exception e) {
            System.out.println("Xảy ra ngoại lệ: " + e.getMessage());
        }
    }
}
