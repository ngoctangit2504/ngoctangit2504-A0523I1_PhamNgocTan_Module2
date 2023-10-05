package controller;

import service.impl.EmployeeService;

import java.util.Scanner;

public class FuramaResortController {
    public static void displayMainMenu() {
        boolean flag = true;
        while (flag) {
            System.out.println("*-----MENU-----*");
            System.out.println("1. Employee Management");
            System.out.println("2. Customer Management");
            System.out.println("3. Facility Management");
            System.out.println("4. Booking Management");
            System.out.println("5. Promotion Management");
            System.out.println("6. Exit");
            System.out.println("Enter your select...");
            Scanner scanner = new Scanner(System.in);
            int select = scanner.nextInt();
            switch (select) {
                case 1:
                    EmployeeService employeeService = new EmployeeService();
                    boolean flag1 = true;
                    while (flag1) {
                        System.out.println("(1) EMPLOYEE MANAGEMENT");
                        System.out.println("- 1. Display list employees");
                        System.out.println("- 2. Add new employees");
                        System.out.println("- 3. Edit employees");
                        System.out.println("- 4. Return main menu");
                        System.out.println("Enter your select...");
                        Scanner scanner1 = new Scanner(System.in);
                        int select1 = scanner1.nextInt();
                        switch (select1) {
                            case 1:
                                System.out.println("This is Display employees");
                                employeeService.display();
                                break;
                            case 2:
                                System.out.println("This is Add new employees");
                                employeeService.add();
                                System.out.println("Add oke!");
                                break;
                            case 3:
                                System.out.println("This is Edit employees");
                                employeeService.edit();
                                System.out.println("Edit oke!");
                                break;
                            case 4:
                                System.out.println("Return main menu");
                                flag1 = false;
                                break;
                            default:
                                System.out.println("Enter your select again...");
                                break;
                        }
                    }
                    break;
                case 2:
                    System.out.println("...");
                    break;
                case 3:
                    System.out.println("...");
                    break;
                case 4:
                    System.out.println("...");
                    break;
                case 5:
                    System.out.println("...");
                    break;
                case 6:
                    System.out.println("Is Exit");
                    flag = false;
                    break;
                default:
                    System.out.println("Enter your select again...");
                    break;
            }
        }
    }
}