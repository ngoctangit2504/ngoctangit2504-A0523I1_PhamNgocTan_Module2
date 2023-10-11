package controller;

import service.impl.CustomerService;
import service.impl.EmployeeService;
import service.impl.VillaService;

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
                System.out.println("Enter again...");
                continue MENU_CHINH;
            }
            switch (select) {
                case 1:
                    // Menu Employee Management
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
                            System.out.println("Enter again...");
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
                    // Menu Customer Management
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
                            System.out.println("Enter again...");
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
                    // Menu Facility Management
                    boolean flag3 = true;
                    FACILITY_MENU:
                    while (flag3) {
                        System.out.println("(3) Facility MANAGEMENT");
                        System.out.println("- 1. Display list facility");
                        System.out.println("- 2. Add new facility");
                        System.out.println("- 3. Display list facility maintenance");
                        System.out.println("- 4. Return main menu");
                        System.out.println("Enter your select...");
                        Scanner scanner3 = new Scanner(System.in);
                        int select3 = -1;
                        try {
                            select3 = Integer.parseInt(scanner.nextLine());
                        } catch (NumberFormatException e) {
                            System.out.println("Enter false!!!");
                            System.out.println("Enter again...");
                            continue FACILITY_MENU;
                        }
                        switch (select3) {
                            case 1:
                                System.out.println("Display list facility");
                                break;
                            case 2:
                                boolean chooseFacility = true;
                                FACILITY_ADD:
                                while (chooseFacility) {
                                    System.out.println("Choose Add new facility");
                                    System.out.println("1.Add New Villa");
                                    System.out.println("2.Add New House");
                                    System.out.println("3.Add New Room");
                                    System.out.println("4.Back to menu");
                                    System.out.println("Enter your choose ...");
                                    Scanner sc = new Scanner(System.in);
                                    int choose = -1;
                                    try {
                                        choose = Integer.parseInt(sc.nextLine());
                                    } catch (NumberFormatException e) {
                                        System.out.println("Enter false!!!");
                                        System.out.println("Enter again...");
                                        continue FACILITY_ADD;
                                    }
                                    switch (choose) {
                                        case 1:
                                            System.out.println("Add New Villa");
                                            VillaService villaService = new VillaService();
                                            villaService.addVi();
                                            System.out.println("Add Villa thanh cong");
                                            break;
                                        case 2:
                                            System.out.println("Add New House");
                                            break;
                                        case 3:
                                            System.out.println("Add New Room");
                                            break;
                                        case 4:
                                            System.out.println("Back to menu");
                                            chooseFacility = false;
                                            break;
                                        default:
                                            System.out.println("Enter your select again...");
                                            break;
                                    }
                                }
                                break;
                            case 3:
                                System.out.println("Display list facility maintenance");
                                break;
                            case 4:
                                System.out.println("Return main menu");
                                flag3 = false;
                                break;
                            default:
                                System.out.println("Enter your select again...");
                                break;
                        }
                    }
                    break;


                case 4:
                    // Menu Booking Managerment
                    System.out.println("Add new booking");
                    System.out.println("Display list booking");
                    System.out.println("Create new contracts");
                    System.out.println("Display list contracts");
                    System.out.println("Edit contracts");
                    System.out.println("Return main menu");
                    break;

                case 5:
                    // Promotion Management
                    System.out.println("Display list customers use service");
                    System.out.println("Display list customers get voucher");
                    System.out.println("Return main menu");
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