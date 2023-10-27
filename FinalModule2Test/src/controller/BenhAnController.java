package controller;

import service.IBenhAnService;
import service.impl.BenhAnService;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BenhAnController {
    public void displayMenu() {
        IBenhAnService benhAnService = new BenhAnService();

        boolean flagMenu = true;
        MENU_CHINH:
        while (flagMenu) {
            System.out.println("***** CHUONG TRINH QUAN LI BENH AN *****");
            System.out.println("Chon chuc nang");
            System.out.println("1. Them moi");
            System.out.println("2. Xoa");
            System.out.println("3. Xem danh sach benh an");
            System.out.println("4. Thoat");
            System.out.println("Chon chuc nang......");
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
                    System.out.println("Them benh an");
                    System.out.println("Ban muon them benh nhan nao");
                    boolean flagThemBenhAn = true;
                    MENU_THEM_BENH_AN:
                    while (flagThemBenhAn) {
                        System.out.println("1. Them benh nhan thuong");
                        System.out.println("2. Them benh nhan Vip");
                        System.out.println("3. Tro ve");
                        System.out.println("Nhap de chon");
                        int chooseThem = -1;
                        try {
                            Scanner scannerThem = new Scanner(System.in);
                            chooseThem = scannerThem.nextInt();
                        } catch (InputMismatchException e) {
                            System.out.println("Chon lai....");
                            continue MENU_THEM_BENH_AN;
                        }
                        switch (chooseThem) {
                            case 1:
                                System.out.println("Them benh nhan thuong");
                                benhAnService.addBenhNhanThuong();
                                break;
                            case 2:
                                System.out.println("Them benh nhan vip");
                                benhAnService.addBenhNhanVip();
                                break;
                            case 3:
                                System.out.println("Tro ve");
                                flagThemBenhAn = false;
                                break;
                            default:
                                System.out.println("Moi chon lai");
                                break;
                        }
                    }
                    System.out.println("-----------------------------------------------------");
                    break;
                case 2:
                    System.out.println("Xoa benh an");
                    benhAnService.delete();
                    System.out.println("---------------------------------------------");
                    break;
                case 3:
                    System.out.println("Hien thi danh sach benh an");
                    benhAnService.display();
                    System.out.println("--------------------------------------------------------");
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
