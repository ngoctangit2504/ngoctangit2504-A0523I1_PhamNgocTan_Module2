package service.impl;

import model.House;
import model.Room;
import repository.IFacilityRepository;
import repository.impl.RoomRepository;
import service.IFacilityService;

import java.util.Scanner;

public class RoomService implements IFacilityService {
    IFacilityRepository roomRepository = new RoomRepository();
    @Override
    public void addVi() {

    }

    @Override
    public void addHo() {

    }

    @Override
    public void addRo() {
        Scanner scanner = new Scanner(System.in);

        String regexMaDichVu = "^SVRO-[\\d]{4}$";
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

        System.out.println("Nhap dich vu mien phi di kem");
        String dichVuMienPhiDiKem = scanner.nextLine();

        Room room = new Room(maDichVu,tenDichVu,dienTichSuDung,chiPhiThue,soLuongNguoiToiDa,kieuThue,dichVuMienPhiDiKem);
        roomRepository.addRoom(room);
    }
}
