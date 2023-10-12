package repository.impl;

import model.Oto;
import model.XeMay;
import model.XeTai;
import repository.IPhuongTienRepository;
import util.ReadAndWrite;

import java.util.ArrayList;
import java.util.List;

public class PhuongTienRepository implements IPhuongTienRepository {
    private final String PATH_OTO = "D:\\CodeGym\\A0523I1_PhamNgocTan_Module2\\ngoctangit2504-A0523I1_PhamNgocTan_Module2\\Thi_thu\\src\\data\\oto.csv";
    private final String PATH_XE_TAI = "D:\\CodeGym\\A0523I1_PhamNgocTan_Module2\\ngoctangit2504-A0523I1_PhamNgocTan_Module2\\Thi_thu\\src\\data\\xeTai.csv";
    private final String PATH_XE_MAY = "D:\\CodeGym\\A0523I1_PhamNgocTan_Module2\\ngoctangit2504-A0523I1_PhamNgocTan_Module2\\Thi_thu\\src\\data\\xeMay.csv";
    @Override
    public void addOto(Oto oto) {
        List<String> stringList = new ArrayList<>();
        stringList.add(oto.getInfoToCSV());
        ReadAndWrite.writeToCSV(PATH_OTO,stringList,true);
    }

    @Override
    public void addXeTai(XeTai xeTai) {
        List<String> stringList = new ArrayList<>();
        stringList.add(xeTai.getInfoToCSV());
        ReadAndWrite.writeToCSV(PATH_XE_TAI,stringList,true);
    }

    @Override
    public void addXeMay(XeMay xeMay) {
        List<String> stringList = new ArrayList<>();
        stringList.add(xeMay.getInfoToCSV());
        ReadAndWrite.writeToCSV(PATH_XE_MAY,stringList,true);
    }

    @Override
    public List<Oto> displayListOto() {
        List<Oto> otoList = new ArrayList<>();
        // đọc  file ở đây hoặc kết nối DB
        List<String> stringList = ReadAndWrite.readCSV(PATH_OTO);
        // chuyển thành list
        String[] array = null;
        for (String string: stringList) {
            array = string.split(",");
            Oto oto = new Oto(array[0],array[1],Integer.parseInt(array[2]),array[3],Integer.parseInt(array[4]),array[5] );
            otoList.add(oto);
        }

        return otoList;
    }

    @Override
    public List<XeTai> displayListXeTai() {
        List<XeTai> xeTaiList = new ArrayList<>();
        // đọc  file ở đây hoặc kết nối DB
        List<String> stringList = ReadAndWrite.readCSV(PATH_XE_TAI);
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
    public List<XeMay> displayListXemay() {
        List<XeMay> xeMayList = new ArrayList<>();
        // đọc  file ở đây hoặc kết nối DB
        List<String> stringList = ReadAndWrite.readCSV(PATH_XE_MAY);
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
        // Oto
        List<Oto> otoList = displayListOto();
        for (int i = 0; i <otoList.size() ; i++) {
            if (otoList.get(i).getBienKiemSoat().equals(bienKiemSoat)){
                otoList.remove(i);
                break;
            }
        }
        List<String> stringListOto = new ArrayList<>();
        for (Oto oto: otoList) {
            stringListOto.add(oto.getInfoToCSV());
        }
        ReadAndWrite.writeToCSV(PATH_OTO,stringListOto,false);


        // Xe tai
        List<XeTai> xeTaiList = displayListXeTai();
        for (int i = 0; i <xeTaiList.size() ; i++) {
            if (xeTaiList.get(i).getBienKiemSoat().equals(bienKiemSoat)){
                xeTaiList.remove(i);
                break;
            }
        }
        List<String> stringListXetai = new ArrayList<>();
        for (XeTai xeTai : xeTaiList) {
            stringListXetai.add(xeTai.getInfoToCSV());
        }
        ReadAndWrite.writeToCSV(PATH_XE_TAI,stringListXetai,false);


        // Xe may
        List<XeMay> xeMayList = displayListXemay();
        for (int i = 0; i <xeMayList.size() ; i++) {
            if (xeMayList.get(i).getBienKiemSoat().equals(bienKiemSoat)){
                xeMayList.remove(i);
                break;
            }
        }
        List<String> stringListXeMay = new ArrayList<>();
        for (XeMay xeMay : xeMayList) {
            stringListXeMay.add(xeMay.getInfoToCSV());
        }
        ReadAndWrite.writeToCSV(PATH_XE_MAY,stringListXeMay,false);
    }
}
