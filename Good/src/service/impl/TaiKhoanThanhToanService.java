package service.impl;

import model.TaiKhoanThanhToan;
import model.TaiKhoanTietKiem;
import repository.ITaiKhoanNganHangRepository;
import repository.impl.TaiKhoanThanhToanRepository;
import repository.impl.TaiKhoanTietKiemRepository;
import service.ITaiKhoanNganHangService;

import java.util.List;
import java.util.Scanner;

public class TaiKhoanThanhToanService implements ITaiKhoanNganHangService {
    ITaiKhoanNganHangRepository taiKhoanThanhToanRepository = new TaiKhoanThanhToanRepository();
    @Override
    public void addTaiKhoanTietKiem() {

    }

    @Override
    public void addTaiKhoanThanhToan() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap ma tai khoan...");
        String maTaiKhoan = scanner.nextLine();

        System.out.println("Nhap ten chu tai khoan...");
        String tenChuTaiKhoan = scanner.nextLine();

        System.out.println("Nhap ngay tao tai khoan...");
        String ngayTaoTaiKhoan = scanner.nextLine();


        boolean flagSoThe = true;
        int soThe = -1;
        NHAP_SO_THE:
        while (flagSoThe) {
            System.out.println("Nhap so the...");
            try {
                soThe = Integer.parseInt(scanner.nextLine());
                if (soThe > 0) {
                    flagSoThe = false;
                    soThe = soThe;
                }
            } catch (NumberFormatException e) {
                continue NHAP_SO_THE;
            }
        }


        boolean flagSoTienTrongTaiKhoan = true;
        double soTienTrongTaiKhoan = -1;
        NHAP_SO_TIEN_TRONG_TAI_KHOAN:
        while (flagSoTienTrongTaiKhoan) {
            System.out.println("Nhap so tien trong tai khoan...");
            try {
                soTienTrongTaiKhoan = Double.parseDouble(scanner.nextLine());
                if (soTienTrongTaiKhoan > 0) {
                    flagSoTienTrongTaiKhoan = false;
                    soTienTrongTaiKhoan = soTienTrongTaiKhoan;
                }
            } catch (NumberFormatException e) {
                continue NHAP_SO_TIEN_TRONG_TAI_KHOAN;
            }
        }

        TaiKhoanThanhToan taiKhoanThanhToan = new TaiKhoanThanhToan(maTaiKhoan,tenChuTaiKhoan,ngayTaoTaiKhoan,soThe,soTienTrongTaiKhoan);
        taiKhoanThanhToanRepository.addTaiKoanThanhToan(taiKhoanThanhToan);

    }

    @Override
    public void displayTaiKhoanTietKiem() {

    }

    @Override
    public void displayTaiKhoanThanhToan() {
        List<TaiKhoanThanhToan> taiKhoanThanhToans = taiKhoanThanhToanRepository.getListTaiKhoanThanhToan();
        for (int i = 0; i < taiKhoanThanhToans.size(); i++) {
            if (taiKhoanThanhToans.get(i) != null) {
                System.out.println((1 + i) + "." + taiKhoanThanhToans.get(i));
            }
        }

    }

    @Override
    public void deleteTaiKhoanTietKiem() {

    }

    @Override
    public void deleteTaiKhoanThanhToan() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap ma tai khoan ngan hang muon xoa");
        String deleteMaTaiKhoan = scanner.nextLine();
        taiKhoanThanhToanRepository.deleteTaiKhoanThanhToanByMaTaiKhoan(deleteMaTaiKhoan);
    }
}
