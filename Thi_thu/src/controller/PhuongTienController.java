package controller;

import service.IPhuongTienService;
import service.impl.PhuongTienService;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PhuongTienController {
    public void displayMenu() {
        IPhuongTienService phuongTienService = new PhuongTienService();


        boolean flagMenu = true;
        MENU_CHINH:
        while (flagMenu) {
            System.out.println("CHUONG TRINH QUAN LI PHUONG TIEN GIAO THONG");
            System.out.println("Chon chuc nang");
            System.out.println("1. Them moi phuong tien");
            System.out.println("2. Hien thi phuong tien");
            System.out.println("3. Xoa phuong tien");
            System.out.println("4. Thoat");
            Scanner scanner = new Scanner(System.in);
            int choose = -1;
            try {
               choose = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Thuc hien lai....");
                continue MENU_CHINH;
            }
            switch (choose) {
                case 1:
                    System.out.println("Them moi phuong tien");
                    boolean flagAdd = true;
                    MENU_ADD:
                    while (flagAdd) {
                        System.out.println("Chon phuong tien muon them...");
                        System.out.println("1.O to");
                        System.out.println("2.Xe tai");
                        System.out.println("3.Xe may");
                        Scanner scannerAdd = new Scanner(System.in);
                        int chooseAdd = -1;
                        try {
                            chooseAdd = scannerAdd.nextInt();
                        } catch (InputMismatchException e) {
                            System.out.println("Thuc hien lai....");
                            continue MENU_ADD;
                        }
                        switch (chooseAdd) {
                            case 1:
                                System.out.println("Add oto");
                                phuongTienService.addOt();
                                System.out.println("Add thanh cong");
                                flagAdd = false;
                                break;
                            case 2:
                                System.out.println("Add xe tai");
                                phuongTienService.addXt();
                                flagAdd = false;
                                break ;
                            case 3:
                                System.out.println("Add xe may");
                                phuongTienService.addXm();
                                flagAdd = false;
                                break ;
                        }
                    }

                    break;
                case 2:
                    System.out.println("2. Hien thi phuong tien");
                    boolean flagDisplay = true;
                    MENU_DISPLAY:
                    while (flagDisplay) {
                        System.out.println("Chon phuong tien muon hien thi...");
                        System.out.println("1.O to");
                        System.out.println("2.Xe tai");
                        System.out.println("3.Xe may");
                        Scanner scannerDisplay = new Scanner(System.in);
                        int chooseDisplay = -1;
                        try {
                            chooseDisplay = scannerDisplay.nextInt();
                        } catch (InputMismatchException e) {
                            System.out.println("Thuc hien lai....");
                            continue MENU_DISPLAY;
                        }
                        switch (chooseDisplay) {
                            case 1:
                                System.out.println("Display oto");
                                phuongTienService.displayOt();
                                System.out.println("Display thanh cong");
                                flagDisplay = false;
                                break;
                            case 2:
                                System.out.println("Display xe tai");
                                phuongTienService.displayXt();
                                flagDisplay = false;
                                break ;
                            case 3:
                                System.out.println("Display xe may");
                                phuongTienService.displayXm();
                                flagDisplay = false;
                                break ;
                        }
                    }
                    break;
                case 3:
                    System.out.println("3. Xoa phuong tien");
                    phuongTienService.delete();
                    System.out.println("Xoa thanh cong");
                    break;
                case 4:
                    System.out.println("4. Thoat");
                    flagMenu = false;
                    break;
                default:
                    System.out.println("Yeu cau nhap lai");
                    break;
            }
        }

    }
}
