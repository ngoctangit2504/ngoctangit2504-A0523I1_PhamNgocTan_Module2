package service.impl;

import model.Oto;
import model.XeMay;
import repository.IPhuongTienRepository;
import repository.impl.XeMayRepository;
import service.IPhuongTienService;

import java.util.List;
import java.util.Scanner;

public class XeMayService implements IPhuongTienService {

    IPhuongTienRepository xeMayRepository = new XeMayRepository();

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
        System.out.println("nhap cong suat");
        double congSuat = Double.parseDouble(scanner.nextLine());

        XeMay xeMay = new XeMay(bienKiemSoat,tenHangSanXuat,namSanXuat,chuSoHuu,congSuat);
        xeMayRepository.addXeMay(xeMay);
    }

    @Override
    public void display() {
        List<XeMay> xeMays = xeMayRepository.getListXeMay();
        for (int i=0; i<xeMays.size();i++){
            if (xeMays.get(i)!=null){
                System.out.println((1+i) + "." + xeMays.get(i));
            }
        }
    }

    @Override
    public void delete() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập bien kiem soat phuong tien cần xoá");
        String deleteBienKiemSoat = scanner.nextLine();
        xeMayRepository.deletePhuongTienByBienKiemSoat(deleteBienKiemSoat);
    }
}
