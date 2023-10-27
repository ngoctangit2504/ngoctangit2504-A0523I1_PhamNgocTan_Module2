package controller;

import service.ITaiKhoanNganHangService;
import service.impl.TaiKhoanThanhToanService;
import service.impl.TaiKhoanTietKiemService;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TaiKhoanNganHangController {
    public void displayMenu() {
        ITaiKhoanNganHangService taiKhoanTietKiemService = new TaiKhoanTietKiemService();
        ITaiKhoanNganHangService taiKhoanThanhToanService = new TaiKhoanThanhToanService();


        boolean flagMenu = true;
        MENU_CHINH:
        while (flagMenu) {
            System.out.println("***** CHUONG TRINH QUAN LI TAI KHOAN NGAN HANG *****");
            System.out.println("Chon chuc nang");
            System.out.println("1. Them moi");
            System.out.println("2. Xoa");
            System.out.println("3. Xem danh sach tai khoan");
            System.out.println("4. Tim kiem");
            System.out.println("5. Thoat");
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
                    System.out.println("Them tai khoan ngan hang");
                    System.out.println("Ban muon them tai khoan nao");
                    boolean flagThemTaiKhoan = true;
                    MENU_THEM_TAI_KHOAN:
                    while (flagThemTaiKhoan) {
                        System.out.println("1. Them tai khoan tiet kiem");
                        System.out.println("2. Them tai khoan thanh toan");
                        System.out.println("3. Tro ve");
                        System.out.println("Nhap de chon");
                        int chooseThem = -1;
                        try {
                            Scanner scannerThem = new Scanner(System.in);
                            chooseThem = scannerThem.nextInt();
                        } catch (InputMismatchException e) {
                            System.out.println("Chon lai....");
                            continue MENU_THEM_TAI_KHOAN;
                        }
                        switch (chooseThem) {
                            case 1:
                                System.out.println("Them tai khoan  tiet kiem");
                                taiKhoanTietKiemService.addTaiKhoanTietKiem();
                                break;
                            case 2:
                                System.out.println("Them tai khoan thanh toan");
                                taiKhoanThanhToanService.addTaiKhoanThanhToan();
                                break;
                            case 3:
                                System.out.println("Tro ve");
                                flagThemTaiKhoan = false;
                                break;
                            default:
                                System.out.println("Moi chon lai");
                                break;
                        }
                    }
                    System.out.println("-----------------------------------------------------");
                    break;



                case 2:
                    System.out.println("Xoa tai khoan ngan hang");
                    System.out.println("Ban muon xoa tai khoan nao");
                    boolean flagXoaTaiKhoan = true;
                    MENU_XOA_TAI_KHOAN:
                    while (flagXoaTaiKhoan) {
                        System.out.println("1. Xoa tai khoan tiet kiem");
                        System.out.println("2. Xoa tai khoan thanh toan");
                        System.out.println("3. Tro ve");
                        System.out.println("Nhap de chon");
                        int chooseXoa = -1;
                        try {
                            Scanner scannerThem = new Scanner(System.in);
                            chooseXoa = scannerThem.nextInt();
                        } catch (InputMismatchException e) {
                            System.out.println("Chon lai....");
                            continue MENU_XOA_TAI_KHOAN;
                        }
                        switch (chooseXoa) {
                            case 1:
                                System.out.println("Xoa tai khoan  tiet kiem");
                                taiKhoanTietKiemService.deleteTaiKhoanTietKiem();
                                break;
                            case 2:
                                System.out.println("Xoa tai khoan thanh toan");
                                taiKhoanThanhToanService.displayTaiKhoanThanhToan();
                                break;
                            case 3:
                                System.out.println("Tro ve");
                                flagXoaTaiKhoan = false;
                                break;
                            default:
                                System.out.println("Moi chon lai");
                                break;
                        }
                    }
                    System.out.println("-----------------------------------------------------");
                    break;
                case 3:
                    System.out.println("Hien thi tai khoan ngan hang");
                    System.out.println("Ban muon hien thi tai khoan nao");
                    boolean flagHienThiTaiKhoan = true;
                    MENU_HIEN_THI_TAI_KHOAN:
                    while (flagHienThiTaiKhoan) {
                        System.out.println("1. Hien tai khoan tiet kiem");
                        System.out.println("2. Hien tai khoan thanh toan");
                        System.out.println("3. Tro ve");
                        System.out.println("Nhap de chon");
                        int chooseHien = -1;
                        try {
                            Scanner scannerThem = new Scanner(System.in);
                            chooseHien = scannerThem.nextInt();
                        } catch (InputMismatchException e) {
                            System.out.println("Chon lai....");
                            continue MENU_HIEN_THI_TAI_KHOAN;
                        }
                        switch (chooseHien) {
                            case 1:
                                System.out.println("Hien tai khoan  tiet kiem");
                                taiKhoanTietKiemService.displayTaiKhoanTietKiem();
                                break;
                            case 2:
                                System.out.println("Hien tai khoan thanh toan");
                                taiKhoanThanhToanService.displayTaiKhoanThanhToan();
                                break;
                            case 3:
                                System.out.println("Tro ve");
                                flagHienThiTaiKhoan = false;
                                break;
                            default:
                                System.out.println("Moi chon lai");
                                break;
                        }
                    }
                    System.out.println("-----------------------------------------------------");
                    break;
                case 4:
                    System.out.println("4. Tim kiem");
                    System.out.println("cdsc");
                    break;
                case 5:
                    System.out.println("5. Thoat");
                    flagMenu = false;
                default:
                    System.out.println("Yeu cau nhap lai");
                    break;
            }
        }
    }
}
