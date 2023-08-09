package ss1_introduction_to_java.exercise;

import java.util.Scanner;

public class CurrencyConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chuyển đổi tiền tệ USD to VNĐ.");
        System.out.println("Nhập số lượng USD:");
        int usd = scanner.nextInt();
        int vnd = usd * 23000;
        System.out.println(usd+" USD = "+vnd+" VNĐ.");
    }
}
