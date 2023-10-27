package repository.impl;

import model.TaiKhoanThanhToan;
import model.TaiKhoanTietKiem;
import repository.ITaiKhoanNganHangRepository;
import util.ReadAndWrite;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaiKhoanTietKiemRepository implements ITaiKhoanNganHangRepository {
    private final String PATH_TAI_TIET_KIEM = "D:\\CodeGym\\A0523I1_PhamNgocTan_Module2\\ngoctangit2504-A0523I1_PhamNgocTan_Module2\\Good\\src\\data\\DataTaiKhoanTietKiem";


    @Override
    public void addTaiKhoanTietKiem(TaiKhoanTietKiem taiKhoanTietKiem) {
        List<String> stringList = new ArrayList<>();
        stringList.add(taiKhoanTietKiem.getInfoToCSV());
        ReadAndWrite.writeToCSV(PATH_TAI_TIET_KIEM, stringList, true);
    }

    @Override
    public void addTaiKoanThanhToan(TaiKhoanThanhToan taiKhoanThanhToan) {

    }

    @Override
    public List<TaiKhoanTietKiem> getListTaiKhoanTietKiem() {
        List<TaiKhoanTietKiem> taiKhoanTietKiemList = new ArrayList<>();
        List<String> stringList = ReadAndWrite.readCSVFile(PATH_TAI_TIET_KIEM);
        String[] array = null;
        for (String string : stringList) {
            array = string.split(",");
            TaiKhoanTietKiem taiKhoanTietKiem = new TaiKhoanTietKiem(array[0],array[1],array[2],Double.parseDouble(array[3]),array[4],Double.parseDouble(array[5]),Integer.parseInt(array[6]));
            taiKhoanTietKiemList.add(taiKhoanTietKiem);
        }
        return taiKhoanTietKiemList;
    }

    @Override
    public List<TaiKhoanThanhToan> getListTaiKhoanThanhToan() {
        return null;
    }

    @Override
    public void deleteTaiKhoanTietKiemByMaTaiKhoan(String maTaiKhoan) {
        List<TaiKhoanTietKiem> taiKhoanTietKiemList = getListTaiKhoanTietKiem();
        for (int i = 0; i < taiKhoanTietKiemList.size(); i++) {
            if (taiKhoanTietKiemList.get(i).getMaTaiKhoan().equals(maTaiKhoan)) {
                boolean flag = true;
                while (flag) {
                    System.out.println("Ban muon xoa...(y/n)");
                    Scanner sc = new Scanner(System.in);
                    String chon = sc.nextLine();
                    switch (chon) {
                        case "y":
                            taiKhoanTietKiemList.remove(i);
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
        for (TaiKhoanTietKiem taiKhoanTietKiem : taiKhoanTietKiemList) {
            stringList.add(taiKhoanTietKiem.getInfoToCSV());
        }
        ReadAndWrite.writeToCSV(PATH_TAI_TIET_KIEM, stringList, false);
    }

    @Override
    public void deleteTaiKhoanThanhToanByMaTaiKhoan(String maTaiKhoan) {

    }
}
