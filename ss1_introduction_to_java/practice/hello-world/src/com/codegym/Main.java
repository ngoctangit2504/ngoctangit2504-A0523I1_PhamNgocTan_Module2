package com.codegym;

import javax.jws.soap.SOAPMessageHandlers;
import java.util.Scanner;

public class Main {
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