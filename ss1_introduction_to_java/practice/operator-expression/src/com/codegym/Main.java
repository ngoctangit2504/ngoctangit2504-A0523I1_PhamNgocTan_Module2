package com.codegym;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        float width;
        float height;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your width: ");;
        width = scanner.nextFloat();

        System.out.println("Enter your height: ");
        height = scanner.nextFloat();

        float area = width * height;
        System.out.println("Area is : "+area);

    }
}