package repository.impl;

import model.Oto;
import model.XeMay;
import model.XeTai;
import repository.IPhuongTienRepository;
import util.ReadAndWrite;

import java.util.ArrayList;
import java.util.List;

public class OtoRepository implements IPhuongTienRepository {

    private final String PATH_OTO = "D:\\CodeGym\\A0523I1_PhamNgocTan_Module2\\ngoctangit2504-A0523I1_PhamNgocTan_Module2\\Thi_thu_lan2\\ThiThuLan2\\src\\data\\DataOto.csv";

    @Override
    public void addOto(Oto oto) {
        List<String> stringList = new ArrayList<>();
        stringList.add(oto.getInfoToCSV());
        ReadAndWrite.writeToCSV(PATH_OTO,stringList,true);
    }

    @Override
    public void addXeTai(XeTai xeTai) {
    }

    @Override
    public void addXeMay(XeMay xeMay) {
    }

    @Override
    public List<Oto> getListOto() {
        List<Oto> otoList = new ArrayList<>();
        // đọc  file ở đây hoặc kết nối DB
        List<String> stringList = ReadAndWrite.readCSVFile(PATH_OTO);
        // chuyển thành list
        String[] array = null;
        for (String string: stringList) {
            array = string.split(",");
            Oto oto = new Oto(array[0],array[1],Integer.parseInt(array[2]),array[3],Integer.parseInt(array[4]),array[5]);
            otoList.add(oto);
        }
        return otoList;
    }

    @Override
    public List<XeTai> getListXeTai() {
        return null;
    }

    @Override
    public List<XeMay> getListXeMay() {
        return null;
    }

    @Override
    public void deletePhuongTienByBienKiemSoat(String bienKiemSoat) {
        List<Oto> otoList = getListOto();
        for (int i = 0; i <otoList.size() ; i++) {
            if (otoList.get(i).getBienKiemSoat().equals( bienKiemSoat)){
                otoList.remove(i);
                break;
            }
        }
        List<String> stringList = new ArrayList<>();
        for (Oto oto: otoList) {
            stringList.add(oto.getInfoToCSV());
        }
        ReadAndWrite.writeToCSV(PATH_OTO,stringList,false);
    }
}