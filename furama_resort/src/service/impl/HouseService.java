package service.impl;

import model.House;
import repository.IFacilityRepository;
import repository.impl.HouseRepository;
import service.IFacilityService;

import java.util.Scanner;

public class HouseService implements IFacilityService {
    IFacilityRepository houseRepository = new HouseRepository();
    @Override
    public void addVi() {

    }

    @Override
    public void addHo() {
        Scanner scanner = new Scanner(System.in);

        String regexMaDichVu = "^SVHO-[\\d]{4}$";
        System.out.println("Nhap ma dich vu");
        String maDichVu = scanner.nextLine();
        boolean checkMaDichVu = true;
        checkMaDichVu = maDichVu.matches(regexMaDichVu);
        if (checkMaDichVu == false) {
            boolean flag = true;
            while (flag) {
                System.out.println("Nhap lai ma dich vu...");
                String maDichVuFix = scanner.nextLine();
                if (maDichVuFix.matches(regexMaDichVu)) {
                    flag = false;
                    maDichVu = maDichVuFix;
                }
            }
        }

        String regexTenDichVu = "^[A-Z][ |a-z]{0,}$";
        System.out.println("Nhap ten dich vu");
        String tenDichVu = scanner.nextLine();
        boolean checkTenDichVu = true;
        checkTenDichVu = tenDichVu.matches(regexTenDichVu);
        if (checkTenDichVu == false) {
            boolean flag = true;
            while (flag) {
                System.out.println("Nhap lai ten dich vu...");
                String tenDichVuFix = scanner.nextLine();
                if (tenDichVuFix.matches(regexTenDichVu)) {
                    flag = false;
                    tenDichVu = tenDichVuFix;
                }
            }
        }

        boolean flagDienTichSuDung = true;
        double dienTichSuDung = -1;
        NHAP_DIEN_TICH_SU_DUNG:
        while (flagDienTichSuDung) {
            System.out.println("Nhap dien tich su dung...");
            try {
                dienTichSuDung = Double.parseDouble(scanner.nextLine());
                if (dienTichSuDung > 30) {
                    flagDienTichSuDung = false;
                    dienTichSuDung = dienTichSuDung;
                }
            } catch (NumberFormatException e) {
                continue NHAP_DIEN_TICH_SU_DUNG;
            }
        }

        boolean flagChiPhiThue = true;
        double chiPhiThue = -1;
        NHAP_CHI_PHI_THUE:
        while (flagChiPhiThue) {
            System.out.println("Nhap chi phi thue...");
            try {
                chiPhiThue = Double.parseDouble(scanner.nextLine());
                if (chiPhiThue > 0) {
                    flagChiPhiThue = false;
                    chiPhiThue = chiPhiThue;
                }
            } catch (NumberFormatException e) {
                continue NHAP_CHI_PHI_THUE;
            }
        }

        boolean flagSoLuongNguoiToiDa = true;
        int soLuongNguoiToiDa = -1;
        NHAP_SO_LUONG_NGUOI_TOI_DA:
        while (flagSoLuongNguoiToiDa) {
            System.out.println("Nhap so luong nguoi toi da...");
            try {
                soLuongNguoiToiDa = Integer.parseInt(scanner.nextLine());
                if (soLuongNguoiToiDa > 0 && soLuongNguoiToiDa < 20) {
                    flagSoLuongNguoiToiDa = false;
                    soLuongNguoiToiDa = soLuongNguoiToiDa;
                }
            } catch (NumberFormatException e) {
                continue NHAP_SO_LUONG_NGUOI_TOI_DA;
            }
        }

        String regexKieuThue = "^[A-Z][ |a-z]{0,}$";
        System.out.println("Nhap kieu thue");
        String kieuThue = scanner.nextLine();
        boolean checkKieuThue = true;
        checkKieuThue = kieuThue.matches(regexKieuThue);
        if (checkKieuThue == false) {
            boolean flag = true;
            while (flag) {
                System.out.println("Nhap lai kieu thue...");
                String kieuThueFix = scanner.nextLine();
                if (kieuThueFix.matches(regexKieuThue)) {
                    flag = false;
                    kieuThue = kieuThueFix;
                }
            }
        }

        String regexTieuChuanPhong = "^[A-Z][ |a-z]{0,}$";
        System.out.println("Nhap tieu chuan phong");
        String tieuChuanPhong = scanner.nextLine();
        boolean checkTieuChuanPhong = true;
        checkTieuChuanPhong = tieuChuanPhong.matches(regexTieuChuanPhong);
        if (checkTieuChuanPhong == false) {
            boolean flag = true;
            while (flag) {
                System.out.println("Nhap lai tieu chuan phong...");
                String tieuChuanPhongFix = scanner.nextLine();
                if (tieuChuanPhongFix.matches(regexTieuChuanPhong)) {
                    flag = false;
                    tieuChuanPhong = tieuChuanPhongFix;
                }
            }
        }

        boolean flagSoTang = true;
        int soTang = -1;
        NHAP_SO_TANG:
        while (flagSoTang) {
            System.out.println("Nhap so tang...");
            try {
                soTang = Integer.parseInt(scanner.nextLine());
                if (soTang > 0) {
                    flagSoTang = false;
                    soTang = soTang;
                }
            } catch (NumberFormatException e) {
                continue NHAP_SO_TANG;
            }
        }

        House house = new House(maDichVu,tenDichVu,dienTichSuDung,chiPhiThue,soLuongNguoiToiDa,kieuThue,tieuChuanPhong,soTang);
        houseRepository.addHouse(house);
    }

    @Override
    public void addRo() {

    }
    ////
}
