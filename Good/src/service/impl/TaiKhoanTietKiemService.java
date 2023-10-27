package service.impl;

import model.TaiKhoanTietKiem;
import repository.ITaiKhoanNganHangRepository;
import repository.impl.TaiKhoanTietKiemRepository;
import service.ITaiKhoanNganHangService;

import java.util.List;
import java.util.Scanner;

public class TaiKhoanTietKiemService implements ITaiKhoanNganHangService {
    ITaiKhoanNganHangRepository taiKhoanTietKiemRepository = new TaiKhoanTietKiemRepository();
    @Override
    public void addTaiKhoanTietKiem() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap ma tai khoan...");
        String maTaiKhoan = scanner.nextLine();

        System.out.println("Nhap ten chu tai khoan...");
        String tenChuTaiKhoan = scanner.nextLine();

        System.out.println("Nhap ngay tao tai khoan...");
        String ngayTaoTaiKhoan = scanner.nextLine();


        boolean flagSoTienGuiTietKiem = true;
        double soTienGuiTietKiem = -1;
        NHAP_SO_TIEN_GUI_TIET_KIEM:
        while (flagSoTienGuiTietKiem) {
            System.out.println("Nhap so tien gui tiet kiem...");
            try {
                soTienGuiTietKiem = Double.parseDouble(scanner.nextLine());
                if (soTienGuiTietKiem > 0) {
                    flagSoTienGuiTietKiem = false;
                    soTienGuiTietKiem = soTienGuiTietKiem;
                }
            } catch (NumberFormatException e) {
                continue NHAP_SO_TIEN_GUI_TIET_KIEM;
            }
        }

        System.out.println("Nhap ngay gui tiet kiem...");
        String ngayGuiTietKiem = scanner.nextLine();

        boolean flagLaiSuat = true;
        double laiSuat = -1;
        NHAP_LAI_SUAT:
        while (flagLaiSuat) {
            System.out.println("Nhap lai suat...");
            try {
                laiSuat = Double.parseDouble(scanner.nextLine());
                if (laiSuat > 0) {
                    flagLaiSuat = false;
                    laiSuat = laiSuat;
                }
            } catch (NumberFormatException e) {
                continue NHAP_LAI_SUAT;
            }
        }

        boolean flagKiHan = true;
        int kiHan = -1;
        NHAP_KI_HAN:
        while (flagKiHan) {
            System.out.println("Nhap ki han...");
            try {
                kiHan = Integer.parseInt(scanner.nextLine());
                if (kiHan > 0) {
                    flagKiHan = false;
                    kiHan = kiHan;
                }
            } catch (NumberFormatException e) {
                continue NHAP_KI_HAN;
            }
        }

        TaiKhoanTietKiem taiKhoanTietKiem = new TaiKhoanTietKiem(maTaiKhoan,tenChuTaiKhoan,ngayTaoTaiKhoan,soTienGuiTietKiem,ngayGuiTietKiem,laiSuat,kiHan);
        taiKhoanTietKiemRepository.addTaiKhoanTietKiem(taiKhoanTietKiem);
    }

    @Override
    public void addTaiKhoanThanhToan() {

    }

    @Override
    public void displayTaiKhoanTietKiem() {
        List<TaiKhoanTietKiem> taiKhoanTietKiems = taiKhoanTietKiemRepository.getListTaiKhoanTietKiem();
        for (int i = 0; i < taiKhoanTietKiems.size(); i++) {
            if (taiKhoanTietKiems.get(i) != null) {
                System.out.println((1 + i) + "." + taiKhoanTietKiems.get(i));
            }
        }
    }

    @Override
    public void displayTaiKhoanThanhToan() {

    }

    @Override
    public void deleteTaiKhoanTietKiem() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap ma tai khoan ngan hang muon xoa");
        String deleteMaTaiKhoan = scanner.nextLine();
        taiKhoanTietKiemRepository.deleteTaiKhoanTietKiemByMaTaiKhoan(deleteMaTaiKhoan);
    }

    @Override
    public void deleteTaiKhoanThanhToan() {

    }
}
