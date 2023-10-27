package repository.impl;

import model.Oto;
import model.XeMay;
import model.XeTai;
import repository.IPhuongTienRepository;
import util.ReadAndWrite;

import java.util.ArrayList;
import java.util.List;

public class XeTaiRepository implements IPhuongTienRepository {

    private final String PATH_XE_TAI = "D:\\CodeGym\\A0523I1_PhamNgocTan_Module2\\ngoctangit2504-A0523I1_PhamNgocTan_Module2\\Thi_thu_lan2\\ThiThuLan2\\src\\data\\DataXeTai.csv";
    @Override
    public void addOto(Oto oto) {

    }

    @Override
    public void addXeTai(XeTai xeTai) {
        List<String> stringList = new ArrayList<>();
        stringList.add(xeTai.getInfoToCSV());
        ReadAndWrite.writeToCSV(PATH_XE_TAI,stringList,true);
    }

    @Override
    public void addXeMay(XeMay xeMay) {

    }

    @Override
    public List<Oto> getListOto() {
        return null;
    }

    @Override
    public List<XeTai> getListXeTai() {
        List<XeTai> xeTaiList = new ArrayList<>();
        // đọc  file ở đây hoặc kết nối DB
        List<String> stringList = ReadAndWrite.readCSVFile(PATH_XE_TAI);
        // chuyển thành list
        String[] array = null;
        for (String string: stringList) {
            array = string.split(",");
            XeTai xeTai = new XeTai(array[0],array[1],Integer.parseInt(array[2]),array[3],Double.parseDouble(array[4]));
            xeTaiList.add(xeTai);
        }
        return xeTaiList;
    }

    @Override
    public List<XeMay> getListXeMay() {
        return null;
    }

    @Override
    public void deletePhuongTienByBienKiemSoat(String bienKiemSoat) {
        List<XeTai> xeTaiList = getListXeTai();
        for (int i = 0; i <xeTaiList.size() ; i++) {
            if (xeTaiList.get(i).getBienKiemSoat().equals(bienKiemSoat)){
                xeTaiList.remove(i);
                break;
            }
        }
        List<String> stringList = new ArrayList<>();
        for (XeTai xeTai: xeTaiList) {
            stringList.add(xeTai.getInfoToCSV());
        }
        ReadAndWrite.writeToCSV(PATH_XE_TAI,stringList,false);
    }
}
