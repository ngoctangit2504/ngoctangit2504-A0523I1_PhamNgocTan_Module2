package ss1_introduction_to_java.exercise;

import java.util.Scanner;

public class ReadNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Số cần đọc : ");
        int input = scanner.nextInt();

        if (input <= 10 && input > 0){
            switch (input) {
                case 1: System.out.println("One");break;
                case 2: System.out.println("Two");break;
                case 3: System.out.println("Three");break;
                case 4: System.out.println("Four");break;
                case 5: System.out.println("Five");break;
                case 6: System.out.println("Six");break;
                case 7: System.out.println("Seven");break;
                case 8: System.out.println("Eight");break;
                case 9: System.out.println("Nine");break;
                case 10: System.out.println("Ten");break;
            }
        } else if (input > 10 && input <= 20) {
            switch (input) {
                case 11: System.out.println("Eleven");break;
                case 12: System.out.println("Twelve");break;
                case 13: System.out.println("Thirteen");break;
                case 14: System.out.println("Fourteen");break;
                case 15: System.out.println("Fifteen");break;
                case 16: System.out.println("Sixteen");break;
                case 17: System.out.println("Seventeen");break;
                case 18: System.out.println("Eighteen");break;
                case 19: System.out.println("Nineteen");break;
                case 20: System.out.println("Twenty");break;
            }
        }
    }
}
