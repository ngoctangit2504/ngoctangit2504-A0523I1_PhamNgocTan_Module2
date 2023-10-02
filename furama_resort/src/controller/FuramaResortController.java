package controller;

import java.util.Scanner;

public class FuramaResortController {
    public static void displayMainMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("Menu project FuramaResort");
            System.out.println("1. Employee Management"
                    + "\n 2. Customer Management"
                    + "\n 3. Facility Managenment"
                    + "\n 4. Booking Management"
                    + "\n 5. Promotion Management"
                    + "\n 6. Exit");

            System.out.println("Enter your select :");
            int select = scanner.nextInt();
            switch (select) {
                case 1:
                    System.out.println("1. Display list employees"
                            + "\n 2. Add new employee"
                            + "\n 3. Edit employee"
                            + "\n 4. Return main menu");
                    break;
                case 2:
                    System.out.println("1. Display list customers"
                            + "\n 2. Add new customer"
                            + "\n 3. Edit customer"
                            + "\n 4. Return main menu");
                    break;
                case 3:
                    System.out.println("1. Display list facility"
                            + "\n 2. Add new facility"
                            + "\n 3. Display list facility maintenance"
                            + "\n 4. Return main menu");
                    break;
                case 4:
                    System.out.println("1. Add new booking"
                            + "\n 2. Display list booking"
                            + "\n 3. Create new contracts"
                            + "\n 4. Display list contracts"
                            + "\n 5. Edit contracts"
                            + "\n 6. Return main menu");
                    break;
                case 5:
                    System.out.println("1. Display list customers use service"
                            + "\n 2. Display list customers get voucher"
                            + "\n 3. Return main menu");
                    break;
                case 6:
                    flag = false;
                    break;
                default:
                    System.out.println("Chose not correct!");
                    break;
            }
        } while (flag);
    }
}