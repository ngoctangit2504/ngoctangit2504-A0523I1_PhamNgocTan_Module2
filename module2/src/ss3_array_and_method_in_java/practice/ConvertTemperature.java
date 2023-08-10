package ss3_array_and_method_in_java.practice;

import java.util.Scanner;

public class ConvertTemperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập để chọn chương trình chuyển đổi.");
        boolean flag = true;
        do {
            System.out.println("Menu.");
            System.out.println(".1 Chuyển từ C sang F.");
            System.out.println(".2 Chuyển từ F sang C.");
            System.out.println(".0 Exit.");
            int input = scanner.nextInt();
            switch (input) {
                case 1:
                    System.out.println("Bạn chọn chuyển từ C sang F");
                    System.out.println("Nhập nhiệt độ C");
                    float temperatureC = scanner.nextFloat();
                    System.out.printf("Nhiệt độ F là :"+ celsiusToFahrenheit(temperatureC)+"\n");
                    break;
                case 2:
                    System.out.println("Bạn chọn cuyển từ F sang C");
                    System.out.println("Nhập nhiệt độ C");
                    float temperatureF = scanner.nextFloat();
                    System.out.printf("Nhiệt độ F là :"+ fahrenheitToCelsius(temperatureF)+"\n");
                    break;
                case 0:
                    System.out.println("Exit");
                    flag = false;
                    break;
                default:
                    System.out.println("Không xác định!");
                    break;
            }
        } while (flag);
    }
    public static double celsiusToFahrenheit (double nhietDo) {
        return  nhietDo / (5.0 / 9) +32;
    }
    public static double fahrenheitToCelsius (double nhietDo) {
        return (5.0 / 9) * (nhietDo - 32);
    }
}
