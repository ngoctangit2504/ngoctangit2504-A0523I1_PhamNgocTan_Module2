package controller;

import service.impl.CustomerService;
import service.impl.EmployeeService;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FuramaResortController {
    public static void displayMainMenu() {
        boolean flag = true;
        MENU_CHINH:
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
            int select = -1;
            try {
                select = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException numberFormatException) {
                System.out.println("Enter false!!!");
                continue MENU_CHINH;
            }
            switch (select) {
                case 1:
                    // menu employee
                    EmployeeService employeeService = new EmployeeService();
                    boolean flag1 = true;
                    EMPLOYEE_MENU:
                    while (flag1) {
                        System.out.println("(1) EMPLOYEE MANAGEMENT");
                        System.out.println("- 1. Display list employees");
                        System.out.println("- 2. Add new employees");
                        System.out.println("- 3. Edit employees");
                        System.out.println("- 4. Return main menu");
                        System.out.println("Enter your select...");
                        Scanner scanner1 = new Scanner(System.in);
                        int select1 = -1;
                        try {
                            select1 = Integer.parseInt(scanner1.nextLine());
                        } catch (NumberFormatException numberFormatException) {
                            System.out.println("Enter false!!!");
                            continue EMPLOYEE_MENU;
                        }
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
                    // menu customer
                    CustomerService customerService = new CustomerService();
                    boolean flag2 = true;
                    CUSTOMER_MENU:
                    while (flag2) {
                        System.out.println("(2) CUSTOMER MANAGEMENT");
                        System.out.println("- 1. Display list customer");
                        System.out.println("- 2. Add new customer");
                        System.out.println("- 3. Edit customer");
                        System.out.println("- 4. Return main menu");
                        System.out.println("Enter your select...");
                        Scanner scanner2 = new Scanner(System.in);
                        int select2 = -1;
                        try {
                            select2 = Integer.parseInt(scanner2.nextLine());
                        } catch (NumberFormatException numberFormatException) {
                            System.out.println("Enter false!!!");
                            continue CUSTOMER_MENU;
                        }
                        switch (select2) {
                            case 1:
                                System.out.println("This is Display customer");
                                customerService.display();
                                break;
                            case 2:
                                System.out.println("This is Add new customer");
                                customerService.add();
                                System.out.println("Add thanh cong !");
                                break;
                            case 3:
                                System.out.println("This is Edit customer");
                                customerService.edit();
                                System.out.println("Edit thanh cong !");
                                break;
                            case 4:
                                System.out.println("Return main menu");
                                flag2 = false;
                                break;
                            default:
                                System.out.println("Enter your select again...");
                                break;
                        }
                    }
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