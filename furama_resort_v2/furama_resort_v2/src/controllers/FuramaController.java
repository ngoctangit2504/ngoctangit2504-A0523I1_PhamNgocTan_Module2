package controllers;

import java.util.Scanner;

public class FuramaController {
    public static void displayMainMenu() {
        boolean runMenuChinh = true;
        while (runMenuChinh) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("*---------Menu---------*");
                System.out.println("1. Employee Management");
                System.out.println("2. Customer Management");
                System.out.println("3. Facility Management");
                System.out.println("4. Booking Management");
                System.out.println("5. Promotion Management");
                System.out.println("6. Exit");
                System.out.println("Enter your choose:");
                int choose = scanner.nextInt();

                switch (choose) {
                    case 1:
                            boolean runMenu1 = true;
                            while (runMenu1) {
                                System.out.println("*-----(1)Employee Management-----*");
                                System.out.println("- 1. Display list employees");
                                System.out.println("- 2. Add new employee");
                                System.out.println("- 3. Edit employee");
                                System.out.println("- 4. Return main menu");
                                System.out.println("Enter your choose");
                                int choose1 = scanner.nextInt();
                                switch (choose1) {
                                    case 1:
                                        System.out.println("1oke");
                                        break;
                                    case 2:
                                        System.out.println("2oke");
                                        break;
                                    case 3:
                                        System.out.println("3oke");
                                        break;
                                    case 4:
                                        System.out.println("4oke");
                                        runMenu1 = false;
                                        break;
                                    default:
                                        System.out.println("Please select again!");
                                        break;
                                }
                            }
                            break;

                    case 2:
                        boolean runMenu2 = true;
                        while (runMenu2) {
                            System.out.println("*-----(2)Customer Management-----");
                            System.out.println("- 1. Display list customers");
                            System.out.println("- 2. Add new customer");
                            System.out.println("- 3. Edit customer");
                            System.out.println("- 4. Return main menu");
                            System.out.println("Enter your choose");
                            int choose2 = scanner.nextInt();
                            switch (choose2) {
                                case 1:
                                    System.out.println("1oke");
                                    break;
                                case 2:
                                    System.out.println("2oke");
                                    break;
                                case 3:
                                    System.out.println("3oke");
                                    break;
                                case 4:
                                    System.out.println("4oke");
                                    runMenu2 = false;
                                    break;
                                default:
                                    System.out.println("Please select again!");
                                    break;
                            }
                        }
                        break;

                    case 3:
                        boolean runMenu3 = true;
                        while (runMenu3) {
                            System.out.println("*-----(3)Facility Management-----*");
                            System.out.println("- 1. Display list facility");
                            System.out.println("- 2. Add new facility");
                            System.out.println("- 3. Display list facility maintenance");
                            System.out.println("- 4. Return main menu");
                            System.out.println("Enter your choose");
                            int choose3 = scanner.nextInt();
                            switch (choose3) {
                                case 1:
                                    System.out.println("1oke");
                                    break;
                                case 2:
                                    System.out.println("2oke");
                                    break;
                                case 3:
                                    System.out.println("3oke");
                                    break;
                                case 4:
                                    System.out.println("4oke");
                                    runMenu3 = false;
                                    break;
                                default:
                                    System.out.println("Please select again!");
                                    break;
                            }
                        }
                        break;


                    case 4:
                        boolean runMenu4 = true;
                        while (runMenu4) {
                            System.out.println("*-----(4)Booking Management-----");
                            System.out.println("- 1. Add new booking");
                            System.out.println("- 2. Display list booking");
                            System.out.println("- 3. Create new contracts");
                            System.out.println("- 4. Display list contracts");
                            System.out.println("- 5. Edit contracts");
                            System.out.println("- 6. Return main menu");
                            System.out.println("Enter your choose");
                            int choose4 = scanner.nextInt();
                            switch (choose4) {
                                case 1:
                                    System.out.println("1oke");
                                    break;
                                case 2:
                                    System.out.println("2oke");
                                    break;
                                case 3:
                                    System.out.println("3oke");
                                    break;
                                case 4:
                                    System.out.println("4oke");
                                    break;
                                case 5:
                                    System.out.println("5oke");
                                    break;
                                case 6:
                                    System.out.println("6oke");
                                    runMenu4 = false;
                                    break;
                                default:
                                    System.out.println("Please select again!");
                                    break;
                            }
                        }
                        break;


                    case 5:
                        boolean runMenu5 = true;
                        while (runMenu5) {
                            System.out.println("*-----(5)Promotion Management-----*");
                            System.out.println("- 1. Display list customers use service");
                            System.out.println("- 2. Display list customers get voucher");
                            System.out.println("- 3. Return main menu");
                            System.out.println("Enter your choose");
                            int choose5 = scanner.nextInt();
                            switch (choose5) {
                                case 1:
                                    System.out.println("1oke");
                                    break;
                                case 2:
                                    System.out.println("2oke");
                                    break;
                                case 3:
                                    System.out.println("3oke");
                                    runMenu5 = false;
                                    break;
                                default:
                                    System.out.println("Please select again!");
                                    break;
                            }
                        }
                        break;

                    case 6:
                        System.out.println("Exit oke!");
                        runMenuChinh = false;
                        break;
                    default:
                        System.out.println("Please select again!");
                        break;
                }


            } catch (Exception e) {
                System.out.println("Yeu cau nhap so!");
            }

        }
    }
}
