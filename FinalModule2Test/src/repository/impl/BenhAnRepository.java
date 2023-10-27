package repository.impl;

import model.BenhAn;
import model.BenhNhanThuong;
import model.BenhNhanVip;
import repository.IBenhAnRepository;
import util.ReadAndWrite;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class BenhAnRepository implements IBenhAnRepository {
    private final String PATH_BENH_AN = "D:\\CodeGym\\A0523I1_PhamNgocTan_Module2\\ngoctangit2504-A0523I1_PhamNgocTan_Module2\\FinalModule2Test\\src\\data\\DataBenhAn.csv";

    @Override
    public void addBenhNhanThuong(BenhNhanThuong benhNhanThuong) {
        List<String> stringList = new ArrayList<>();
        stringList.add(benhNhanThuong.getInfoToCSV());
        ReadAndWrite.writeToCSV(PATH_BENH_AN, stringList, true);
    }

    @Override
    public void addBenhNhanVip(BenhNhanVip benhNhanVip) {
        List<String> stringList = new ArrayList<>();
        stringList.add(benhNhanVip.getInfoToCSV());
        ReadAndWrite.writeToCSV(PATH_BENH_AN, stringList, true);
    }

    @Override
    public List<BenhAn> getListBenhAn() {
        List<BenhAn> benhAnList = new ArrayList<>();
        List<String> stringList = ReadAndWrite.readCSVFile(PATH_BENH_AN);
        String[] array = null;
        for (String string : stringList) {
            array = string.split(",");
            BenhAn benhAn = new BenhAn(Integer.parseInt(array[0]), array[1], array[2], array[3], array[4], array[5], array[6]);
            benhAnList.add(benhAn);
        }
        return benhAnList;
    }

    @Override
    public void deleteBenhAntByMaBenhAn(String maBenhAn) {
        List<BenhAn> benhAnList = getListBenhAn();
        for (int i = 0; i < benhAnList.size(); i++) {
            if (benhAnList.get(i).getMaBenhAn().equals(maBenhAn)) {
                boolean flag = true;
                while (flag) {
                    System.out.println("Ban muon xoa...(y/n)");
                    Scanner sc = new Scanner(System.in);
                    String chon = sc.nextLine();
                    switch (chon) {
                        case "y":
                            benhAnList.remove(i);
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
        for (BenhAn benhAn : benhAnList) {
            stringList.add(benhAn.getInfoToCSV());
        }
        ReadAndWrite.writeToCSV(PATH_BENH_AN, stringList, false);
    }
}