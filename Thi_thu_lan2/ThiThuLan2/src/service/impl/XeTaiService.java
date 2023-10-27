package service.impl;

import model.Oto;
import model.XeTai;
import repository.IPhuongTienRepository;
import repository.impl.XeTaiRepository;
import service.IPhuongTienService;

import java.util.List;
import java.util.Scanner;

public class XeTaiService implements IPhuongTienService {

    IPhuongTienRepository xeTaiRepository = new XeTaiRepository();

    public void add() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap bien kiem soat");
        String bienKiemSoat = scanner.nextLine();
        System.out.println("nhap ten hang san xuat");
        String tenHangSanXuat = scanner.nextLine();
        System.out.println("nhap nam san xuat");
        int namSanXuat = Integer.parseInt(scanner.nextLine());
        System.out.println("nhap chu so huu");
        String chuSoHuu = scanner.nextLine();
        System.out.println("nhap trong tai");
        double trongTai = Double.parseDouble(scanner.nextLine());

        XeTai xeTai = new XeTai(bienKiemSoat,tenHangSanXuat,namSanXuat,chuSoHuu,trongTai);
        xeTaiRepository.addXeTai(xeTai);
    }

    @Override
    public void display() {
        List<XeTai> xeTais = xeTaiRepository.getListXeTai();
        for (int i=0; i<xeTais.size();i++){
            if (xeTais.get(i)!=null){
                System.out.println((1+i) + "." + xeTais.get(i));
            }
        }
    }

    @Override
    public void delete() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập bien kiem soat phuong tien cần xoá");
        String deleteBienKiemSoat = scanner.nextLine();
        xeTaiRepository.deletePhuongTienByBienKiemSoat(deleteBienKiemSoat);
    }
}
