package ss1_introduction_to_java.practice;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner scanner = new  Scanner(System.in);
        System.out.printf("Enter your name:");
        String name = scanner.nextLine();
        System.out.println("Enter your age:");
        int age = scanner.nextInt();
        System.out.printf("Hello :" + name);
        System.out.printf("Your are " + age + " age?");
    }
}
