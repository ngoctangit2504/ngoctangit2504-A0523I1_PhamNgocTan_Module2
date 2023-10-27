package repository.impl;

import model.TaiKhoanThanhToan;
import model.TaiKhoanTietKiem;
import repository.ITaiKhoanNganHangRepository;
import util.ReadAndWrite;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaiKhoanThanhToanRepository implements ITaiKhoanNganHangRepository {
    private final String PATH_TAI_THANH_TOAN = "D:\\CodeGym\\A0523I1_PhamNgocTan_Module2\\ngoctangit2504-A0523I1_PhamNgocTan_Module2\\Good\\src\\data\\DataTaiKhoanThanhToan";

    @Override
    public void addTaiKhoanTietKiem(TaiKhoanTietKiem taiKhoanTietKiem) {

    }

    @Override
    public void addTaiKoanThanhToan(TaiKhoanThanhToan taiKhoanThanhToan) {
        List<String> stringList = new ArrayList<>();
        stringList.add(taiKhoanThanhToan.getInfoToCSV());
        ReadAndWrite.writeToCSV(PATH_TAI_THANH_TOAN, stringList, true);
    }

    @Override
    public List<TaiKhoanTietKiem> getListTaiKhoanTietKiem() {
        return null;
    }

    @Override
    public List<TaiKhoanThanhToan> getListTaiKhoanThanhToan() {
        List<TaiKhoanThanhToan> taiKhoanThanhToanList = new ArrayList<>();
        List<String> stringList = ReadAndWrite.readCSVFile(PATH_TAI_THANH_TOAN);
        String[] array = null;
        for (String string : stringList) {
            array = string.split(",");
            TaiKhoanThanhToan taiKhoanThanhToan = new TaiKhoanThanhToan(array[0],array[1],array[2],Integer.parseInt(array[3]),Double.parseDouble(array[4]) );
            taiKhoanThanhToanList.add(taiKhoanThanhToan);
        }
        return taiKhoanThanhToanList;
    }

    @Override
    public void deleteTaiKhoanTietKiemByMaTaiKhoan(String maTaiKhoan) {

    }

    @Override
    public void deleteTaiKhoanThanhToanByMaTaiKhoan(String maTaiKhoan) {
        List<TaiKhoanThanhToan> taiKhoanThanhToanList = getListTaiKhoanThanhToan();
        for (int i = 0; i < taiKhoanThanhToanList.size(); i++) {
            if (taiKhoanThanhToanList.get(i).getMaTaiKhoan().equals(maTaiKhoan)) {
                boolean flag = true;
                while (flag) {
                    System.out.println("Ban muon xoa...(y/n)");
                    Scanner sc = new Scanner(System.in);
                    String chon = sc.nextLine();
                    switch (chon) {
                        case "y":
                            taiKhoanThanhToanList.remove(i);
                            flag = false;
                            break;
                        case "n":
                            flag = false;
                            break;
                        default:
                            System.out.println("Chon lai...");
                    }
                }
                break;
            }
        }
        List<String> stringList = new ArrayList<>();
        for (TaiKhoanThanhToan taiKhoanThanhToan : taiKhoanThanhToanList) {
            stringList.add(taiKhoanThanhToan.getInfoToCSV());
        }
        ReadAndWrite.writeToCSV(PATH_TAI_THANH_TOAN, stringList, false);
    }
}
