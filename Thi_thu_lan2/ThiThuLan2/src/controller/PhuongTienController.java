package controller;

import service.IPhuongTienService;
import service.impl.OtoService;
import service.impl.XeMayService;
import service.impl.XeTaiService;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PhuongTienController {
    public void displayMenuChuongTrinh(){

        boolean flagMenuChinh = true;
        MENU_CHINH:
        while (flagMenuChinh) {
            System.out.println("CHUONG TRINH QUAN LI PHUONG TIEN GIAO THONG");
            System.out.println("Chon chuc nang:");
            System.out.println("1. Them moi phuong tien");
            System.out.println("2. Hien thi phuong tien");
            System.out.println("3. Xoa phuong tien");
            System.out.println("4. That");
            System.out.println("Nhap lua chon cua ban....");
            int choose = -1;
            try {
                Scanner scanner = new Scanner(System.in);
                choose = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Chon lai....");
                continue MENU_CHINH;
            }
            switch (choose) {
                case 1:
                    System.out.println("Chuc nang them moi phuong tien");
                    boolean flagThemPhuongTien = true;
                    MENU_THEM_PHUONG_TIEN:
                    while (flagThemPhuongTien) {
                        System.out.println("1. Them xe tai");
                        System.out.println("2. Them oto");
                        System.out.println("3. Them xe may");
                        System.out.println("4. Tro ve");
                        System.out.println("Nhap de chon");
                        int chooseThem = -1;
                        try {
                            Scanner scanner = new Scanner(System.in);
                            chooseThem = scanner.nextInt();
                        } catch (InputMismatchException e) {
                            System.out.println("Chon lai....");
                            continue MENU_THEM_PHUONG_TIEN;
                        }
                        switch (chooseThem) {
                            case 1:
                                System.out.println("Them xe tai");
                                XeTaiService xeTaiService = new XeTaiService();
                                xeTaiService.add();
                                break ;
                            case 2:
                                System.out.println("Them oto");
                                OtoService otoService = new OtoService();
                                otoService.add();
                                break ;
                            case 3:
                                System.out.println("Them xe may");
                                XeMayService xeMayService = new XeMayService();
                                xeMayService.add();
                                break ;
                            case 4:
                                System.out.println("Tro ve xe tai");
                                flagThemPhuongTien = false;
                                break ;
                            default:
                                System.out.println("Moi chon lai");
                                break ;
                        }
                    }
                    System.out.println("---------------");
                    break ;
                case 2:
                    System.out.println("Chuc nang hien thi phuong tien");
                    boolean flagHienPhuongTien = true;
                    MENU_HIEN_PHUONG_TIEN:
                    while (flagHienPhuongTien) {
                        System.out.println("1. Hien thi xe tai");
                        System.out.println("2. Hien thi oto");
                        System.out.println("3. Hien thi xe may");
                        System.out.println("4. Tro ve");
                        System.out.println("Nhap de chon");
                        int chooseHien = -1;
                        try {
                            Scanner scanner = new Scanner(System.in);
                            chooseHien = scanner.nextInt();
                        } catch (InputMismatchException e) {
                            System.out.println("Chon lai....");
                            continue MENU_HIEN_PHUONG_TIEN;
                        }
                        switch (chooseHien) {
                            case 1:
                                System.out.println("Xe tai");
                                XeTaiService xeTaiService = new XeTaiService();
                                xeTaiService.display();
                                break ;
                            case 2:
                                System.out.println("Oto");
                                OtoService otoService = new OtoService();
                                otoService.display();
                                break ;
                            case 3:
                                System.out.println("Xe may");
                                XeMayService xeMayService = new XeMayService();
                                xeMayService.display();
                                break ;
                            case 4:
                                System.out.println("Tro ve");
                                flagHienPhuongTien = false;
                                break ;
                            default:
                                System.out.println("Moi chon lai");
                                break ;
                        }
                    }
                    System.out.println("---------------");
                    break ;
                case 3:
                    System.out.println("Chuc nang xoa phuong tien");
                    boolean flagXoaPhuongTien = true;
                    MENU_XOA_PHUONG_TIEN:
                    while (flagXoaPhuongTien) {
                        System.out.println("1. Xoa xe tai");
                        System.out.println("2. Xoa oto");
                        System.out.println("3. Xoa xe may");
                        System.out.println("4. Tro ve");
                        System.out.println("Nhap de chon");
                        int chooseXoa = -1;
                        try {
                            Scanner scanner = new Scanner(System.in);
                            chooseXoa = scanner.nextInt();
                        } catch (InputMismatchException e) {
                            System.out.println("Chon lai....");
                            continue MENU_XOA_PHUONG_TIEN;
                        }
                        switch (chooseXoa) {
                            case 1:
                                System.out.println("Xe tai");
                                XeTaiService xeTaiService = new XeTaiService();
                                xeTaiService.delete();
                                break ;
                            case 2:
                                System.out.println("Oto");
                                OtoService otoService = new OtoService();
                                otoService.delete();
                                break ;
                            case 3:
                                System.out.println("Xe may");
                                XeMayService xeMayService = new XeMayService();
                                xeMayService.delete();
                                break ;
                            case 4:
                                System.out.println("Tro ve");
                                flagXoaPhuongTien = false;
                                break ;
                            default:
                                System.out.println("Moi chon lai");
                                break ;
                        }
                    }
                    System.out.println("---------------");
                    break ;
                case 4:
                    System.out.println("Thoat");
                    System.out.println("-------------------");
                    flagMenuChinh = false;
                    break ;
                default:
                    System.out.println("Moi chon lai");
                    break ;
            }
        }
    }
}