package ss17_io_binary_file_and_serialization.exercise.product_management.controller;

import ss17_io_binary_file_and_serialization.exercise.product_management.service.impl.Service;

import java.util.Scanner;

public class Controller {
    public static void displayMenu() {
        Service service = new Service();
        boolean flag = true;
        while (flag) {
            System.out.println("MENU");
            System.out.println("1. hien thi");
            System.out.println("2. them");
            System.out.println("3. tim kiem");
            System.out.println("4. exit");
            System.out.println("Enter your select...");
            Scanner scanner = new Scanner(System.in);
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    System.out.println("Chuc nang hien thi");
                    service.display();
                    break;
                case 2:
                    System.out.println("Chuc nang them");
                    service.add();
                    break;
                case 3:
                    System.out.println("Chuc nang tim kiem");
                    break;
                case 4:
                    System.out.println("Exit");
                    flag = false;
                    break;
                default:
                    System.out.println("Nhap lai...");
                    break;
            }
        }

    }
}
