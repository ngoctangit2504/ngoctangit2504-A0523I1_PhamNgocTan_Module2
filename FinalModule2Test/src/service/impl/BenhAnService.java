package service.impl;

import model.BenhAn;
import model.BenhNhanThuong;
import model.BenhNhanVip;
import repository.IBenhAnRepository;
import repository.impl.BenhAnRepository;
import service.IBenhAnService;

import java.util.List;
import java.util.Scanner;

public class BenhAnService implements IBenhAnService {
    IBenhAnRepository benhAnRepository = new BenhAnRepository();

    @Override
    public void addBenhNhanThuong() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so thu tu");
        int soThuTu = Integer.parseInt(scanner.nextLine());

        String regexMaBenhAn = "^[B][A]-[0-9]{4}$";
        System.out.println("Nhap ma benh an...");
        String maBenhAn = scanner.nextLine();
        boolean checkMaBenhAn = true;
        checkMaBenhAn = maBenhAn.matches(regexMaBenhAn);
        if (checkMaBenhAn == false) {
            boolean flag = true;
            while (flag) {
                System.out.println("Nhap lai ma benh an...");
                String maBenhAnFix = scanner.nextLine();
                if (maBenhAnFix.matches(regexMaBenhAn)) {
                    flag = false;
                    maBenhAn = maBenhAnFix;
                }
            }
        }

        String regexMaBenhNhan = "^[B][N]-[0-9]{4}$";
        System.out.println("Nhap ma benh nhan...");
        String maBenhNhan = scanner.nextLine();
        boolean checkMaBenhNhan = true;
        checkMaBenhNhan = maBenhNhan.matches(regexMaBenhNhan);
        if (checkMaBenhNhan == false) {
            boolean flag = true;
            while (flag) {
                System.out.println("Nhap lai ma benh nhan...");
                String maBenhNhanFix = scanner.nextLine();
                if (maBenhNhanFix.matches(regexMaBenhNhan)) {
                    flag = false;
                    maBenhNhan = maBenhNhanFix;
                }
            }
        }

        System.out.println("nhap ten benh nhan");
        String tenBenhNhan = scanner.nextLine();

        String regexNgayNhapVien = "^([0-9]{2})[\\/]([0-9]{2})[\\/]([0-9]{4})$";
        System.out.println("Nhap ngay nhap vien...");
        String ngayNhapVien = scanner.nextLine();
        boolean checkNgayNhapVien = true;
        checkNgayNhapVien = ngayNhapVien.matches(regexNgayNhapVien);
        if (checkNgayNhapVien == false) {
            boolean flag = true;
            while (flag) {
                System.out.println("Nhap lai ngay nhap vien...");
                String ngayNhapVienFix = scanner.nextLine();
                if (ngayNhapVienFix.matches(regexNgayNhapVien)) {
                    flag = false;
                    ngayNhapVien = ngayNhapVienFix;
                }
            }
        }

        String regexNgayRaVien = "^([0-9]{2})[\\/]([0-9]{2})[\\/]([0-9]{4})$";
        System.out.println("Nhap ngay ra vien...");
        String ngayRaVien = scanner.nextLine();
        boolean checkNgayRaVien = true;
        checkNgayRaVien = ngayRaVien.matches(regexNgayRaVien);
        if (checkNgayRaVien == false) {
            boolean flag = true;
            while (flag) {
                System.out.println("Nhap lai ngay ra vien...");
                String ngayRaVienFix = scanner.nextLine();
                if (ngayRaVienFix.matches(regexNgayRaVien)) {
                    flag = false;
                    ngayRaVien = ngayRaVienFix;
                }
            }
        }

        System.out.println("nhap ly do nhap vien");
        String lyDoNhapVien = scanner.nextLine();


        boolean flagPhiNamVien = true;
        double phiNamVien = -1;
        NHAP_PHI_NAM_VIEN:
        while (flagPhiNamVien) {
            System.out.println("Nhap phi nam vien...");
            try {
                phiNamVien = Double.parseDouble(scanner.nextLine());
                if (phiNamVien > 0) {
                    flagPhiNamVien = false;
                    phiNamVien = phiNamVien;
                }
            } catch (NumberFormatException e) {
                continue NHAP_PHI_NAM_VIEN;
            }
        }


        BenhNhanThuong benhNhanThuong = new BenhNhanThuong(soThuTu, maBenhAn, maBenhNhan, tenBenhNhan, ngayNhapVien, ngayRaVien, lyDoNhapVien, phiNamVien);
        benhAnRepository.addBenhNhanThuong(benhNhanThuong);
    }

    @Override
    public void addBenhNhanVip() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so thu tu");
        int soThuTuBenhAn = Integer.parseInt(scanner.nextLine());


        String regexMaBenhAn = "^[B][A]-[0-9]{4}$";
        System.out.println("Nhap ma benh an...");
        String maBenhAn = scanner.nextLine();
        boolean checkMaBenhAn = true;
        checkMaBenhAn = maBenhAn.matches(regexMaBenhAn);
        if (checkMaBenhAn == false) {
            boolean flag = true;
            while (flag) {
                System.out.println("Nhap lai ma benh an...");
                String maBenhAnFix = scanner.nextLine();
                if (maBenhAnFix.matches(regexMaBenhAn)) {
                    flag = false;
                    maBenhAn = maBenhAnFix;
                }
            }
        }


        String regexMaBenhNhan = "^[B][N]-[0-9]{4}$";
        System.out.println("Nhap ma benh nhan...");
        String maBenhNhan = scanner.nextLine();
        boolean checkMaBenhNhan = true;
        checkMaBenhNhan = maBenhNhan.matches(regexMaBenhNhan);
        if (checkMaBenhNhan == false) {
            boolean flag = true;
            while (flag) {
                System.out.println("Nhap lai ma benh nhan...");
                String maBenhNhanFix = scanner.nextLine();
                if (maBenhNhanFix.matches(regexMaBenhNhan)) {
                    flag = false;
                    maBenhNhan = maBenhNhanFix;
                }
            }
        }


        System.out.println("nhap ten benh nhan");
        String tenBenhNhan = scanner.nextLine();


        String regexNgayNhapVien = "^([0-9]{2})[\\/]([0-9]{2})[\\/]([0-9]{4})$";
        System.out.println("Nhap ngay nhap vien...");
        String ngayNhapVien = scanner.nextLine();
        boolean checkNgayNhapVien = true;
        checkNgayNhapVien = ngayNhapVien.matches(regexNgayNhapVien);
        if (checkNgayNhapVien == false) {
            boolean flag = true;
            while (flag) {
                System.out.println("Nhap lai ngay nhap vien...");
                String ngayNhapVienFix = scanner.nextLine();
                if (ngayNhapVienFix.matches(regexNgayNhapVien)) {
                    flag = false;
                    ngayNhapVien = ngayNhapVienFix;
                }
            }
        }


        String regexNgayRaVien = "^([0-9]{2})[\\/]([0-9]{2})[\\/]([0-9]{4})$";
        System.out.println("Nhap ngay ra vien...");
        String ngayRaVien = scanner.nextLine();
        boolean checkNgayRaVien = true;
        checkNgayRaVien = ngayRaVien.matches(regexNgayRaVien);
        if (checkNgayRaVien == false) {
            boolean flag = true;
            while (flag) {
                System.out.println("Nhap lai ngay ra vien...");
                String ngayRaVienFix = scanner.nextLine();
                if (ngayRaVienFix.matches(regexNgayRaVien)) {
                    flag = false;
                    ngayRaVien = ngayRaVienFix;
                }
            }
        }


        System.out.println("nhap ly do nhap vien");
        String lyDoNhapVien = scanner.nextLine();

        System.out.println("nhap loai Vip");
        String loaiVip = scanner.nextLine();

        System.out.println("nhap thoi han vip");
        String thoiHanVip = scanner.nextLine();

        BenhNhanVip benhNhanVip = new BenhNhanVip(soThuTuBenhAn, maBenhAn, maBenhNhan, tenBenhNhan, ngayNhapVien, ngayRaVien, lyDoNhapVien, loaiVip, thoiHanVip);
        benhAnRepository.addBenhNhanVip(benhNhanVip);
    }

    @Override
    public void display() {
        List<BenhAn> benhAns = benhAnRepository.getListBenhAn();
        for (int i = 0; i < benhAns.size(); i++) {
            if (benhAns.get(i) != null) {
                System.out.println((1 + i) + "." + benhAns.get(i));
            }
        }
    }

    @Override
    public void delete() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap ma benh an muon xoa");
        String deleteMaBenhAn = scanner.nextLine();
        benhAnRepository.deleteBenhAntByMaBenhAn(deleteMaBenhAn);
    }
}
