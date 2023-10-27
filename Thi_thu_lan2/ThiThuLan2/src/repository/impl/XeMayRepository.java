package repository.impl;

import model.Oto;
import model.XeMay;
import model.XeTai;
import repository.IPhuongTienRepository;
import util.ReadAndWrite;

import java.util.ArrayList;
import java.util.List;

public class XeMayRepository implements IPhuongTienRepository {

    private final String PATH_XE_MAY = "D:\\CodeGym\\A0523I1_PhamNgocTan_Module2\\ngoctangit2504-A0523I1_PhamNgocTan_Module2\\Thi_thu_lan2\\ThiThuLan2\\src\\data\\DataXeMay.csv";
    @Override
    public void addOto(Oto oto) {

    }

    @Override
    public void addXeTai(XeTai xeTai) {

    }

    @Override
    public void addXeMay(XeMay xeMay) {
        List<String> stringList = new ArrayList<>();
        stringList.add(xeMay.getInfoToCSV());
        ReadAndWrite.writeToCSV(PATH_XE_MAY,stringList,true);
    }

    @Override
    public List<Oto> getListOto() {
        return null;
    }

    @Override
    public List<XeTai> getListXeTai() {
        return null;
    }

    @Override
    public List<XeMay> getListXeMay() {
        List<XeMay> xeMayList = new ArrayList<>();
        // đọc  file ở đây hoặc kết nối DB
        List<String> stringList = ReadAndWrite.readCSVFile(PATH_XE_MAY);
        // chuyển thành list
        String[] array = null;
        for (String string: stringList) {
            array = string.split(",");
            XeMay xeMay = new XeMay(array[0],array[1],Integer.parseInt(array[2]),array[3],Double.parseDouble(array[4]));
            xeMayList.add(xeMay);
        }
        return xeMayList;
    }

    @Override
    public void deletePhuongTienByBienKiemSoat(String bienKiemSoat) {
        List<XeMay> xeMayList = getListXeMay();
        for (int i = 0; i <xeMayList.size() ; i++) {
            if (xeMayList.get(i).getBienKiemSoat().equals( bienKiemSoat)){
                xeMayList.remove(i);
                break;
            }
        }
        List<String> stringList = new ArrayList<>();
        for (XeMay xeMay: xeMayList) {
            stringList.add(xeMay.getInfoToCSV());
        }
        ReadAndWrite.writeToCSV(PATH_XE_MAY,stringList,false);
    }
}
