package service.impl;

import model.Oto;
import model.XeMay;
import model.XeTai;
import repository.IPhuongTienRepository;
import repository.impl.PhuongTienRepository;
import service.IPhuongTienService;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class PhuongTienService implements IPhuongTienService {
    IPhuongTienRepository phuongTienRepository = new PhuongTienRepository();
    @Override
    public void addOt() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap bien kiem soat");
        String bienKiemSoat = scanner.nextLine();
        System.out.println("Nhap hang san xuat");
        String tenHangSanXuat = scanner.nextLine();

        boolean flagNamSanXuat = true;
        int namSanXuat = -1;
        NAM_SAN_XUAT:
        while (flagNamSanXuat) {
            System.out.println("Nhap nam san xuat");
            Scanner scannerNamSanXuat = new Scanner(System.in);
            try {
                namSanXuat = Integer.parseInt(scannerNamSanXuat.nextLine());
                flagNamSanXuat = false;
            } catch (NumberFormatException e) {
                continue NAM_SAN_XUAT;
            }
        }
        namSanXuat = namSanXuat;



        System.out.println("Nhap chu so huu");
        String chuSoHuu = scanner.nextLine();
        System.out.println("Nhap kieu xe");
        String kieuXe = scanner.nextLine();


        boolean flagSoChoNgoi = true;
        int soChoNgoi = -1;
        SO_CHO_NGOI:
        while (flagSoChoNgoi) {
            System.out.println("Nhap so cho ngoi");
            Scanner scannerSoChoNgoi = new Scanner(System.in);
            try {
                soChoNgoi = Integer.parseInt(scannerSoChoNgoi.nextLine());
                flagSoChoNgoi = false;
            } catch (NumberFormatException e) {
                continue SO_CHO_NGOI;
            }
        }
        soChoNgoi = soChoNgoi;


        Oto oto = new Oto(bienKiemSoat,tenHangSanXuat,namSanXuat,chuSoHuu,soChoNgoi,kieuXe);
        phuongTienRepository.addOto(oto);
    }

    @Override
    public void addXt() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap bien kiem soat");
        String bienKiemSoat = scanner.nextLine();
        System.out.println("Nhap hang san xuat");
        String tenHangSanXuat = scanner.nextLine();

        boolean flagNamSanXuat = true;
        int namSanXuat = -1;
        NAM_SAN_XUAT:
        while (flagNamSanXuat) {
            System.out.println("Nhap nam san xuat");
            Scanner scannerNamSanXuat = new Scanner(System.in);
            try {
                namSanXuat = Integer.parseInt(scannerNamSanXuat.nextLine());
                flagNamSanXuat = false;
            } catch (NumberFormatException e) {
                continue NAM_SAN_XUAT;
            }
        }
        namSanXuat = namSanXuat;



        System.out.println("Nhap chu so huu");
        String chuSoHuu = scanner.nextLine();



        boolean flagTrongTai = true;
        double trongTai = -1;
        TRONG_TAI:
        while (flagTrongTai) {
            System.out.println("Nhap trong tai");
            Scanner scannerTrongTai = new Scanner(System.in);
            try {
                trongTai = Double.parseDouble(scannerTrongTai.nextLine());
                flagTrongTai = false;
            } catch (NumberFormatException e) {
                continue TRONG_TAI;
            }
        }
        trongTai = trongTai;


        XeTai xeTai = new XeTai(bienKiemSoat,tenHangSanXuat,namSanXuat,chuSoHuu,trongTai);
        phuongTienRepository.addXeTai(xeTai);
    }

    @Override
    public void addXm() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap bien kiem soat");
        String bienKiemSoat = scanner.nextLine();
        System.out.println("Nhap hang san xuat");
        String tenHangSanXuat = scanner.nextLine();

        boolean flagNamSanXuat = true;
        int namSanXuat = -1;
        NAM_SAN_XUAT:
        while (flagNamSanXuat) {
            System.out.println("Nhap nam san xuat");
            Scanner scannerNamSanXuat = new Scanner(System.in);
            try {
                namSanXuat = Integer.parseInt(scannerNamSanXuat.nextLine());
                flagNamSanXuat = false;
            } catch (NumberFormatException e) {
                continue NAM_SAN_XUAT;
            }
        }
        namSanXuat = namSanXuat;



        System.out.println("Nhap chu so huu");
        String chuSoHuu = scanner.nextLine();



        boolean flagCongSuat = true;
        int congSuat = -1;
        CONG_SUAT:
        while (flagCongSuat) {
            System.out.println("Nhap cong suat");
            Scanner scannerCongSuat = new Scanner(System.in);
            try {
                congSuat = Integer.parseInt(scannerCongSuat.nextLine());
                flagCongSuat = false;
            } catch (NumberFormatException e) {
                continue CONG_SUAT;
            }
        }
        congSuat = congSuat;


        XeMay xeMay = new XeMay(bienKiemSoat,tenHangSanXuat,namSanXuat,chuSoHuu,congSuat);
        phuongTienRepository.addXeMay(xeMay);
    }

    @Override
    public void displayOt() {
        List<Oto> otos = phuongTienRepository.displayListOto();
        for (int i=0; i<otos.size();i++){
            if (otos.get(i)!=null){
                System.out.println((1+i) + "." + otos.get(i));
            }

        }
    }

    @Override
    public void displayXt() {
        List<XeTai> xeTais = phuongTienRepository.displayListXeTai();
        for (int i=0; i<xeTais.size();i++){
            if (xeTais.get(i)!=null){
                System.out.println((1+i) + "." + xeTais.get(i));
            }

        }
    }

    @Override
    public void displayXm() {
        List<XeMay> xeMays = phuongTienRepository.displayListXemay();
        for (int i=0; i<xeMays.size();i++){
            if (xeMays.get(i)!=null){
                System.out.println((1+i) + "." + xeMays.get(i));
            }

        }
    }

    @Override
    public void delete() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập bien kiem soat cần xoá");
        String deleteBienKiemSoat = scanner.nextLine();
        phuongTienRepository.deletePhuongTienByBienKiemSoat(deleteBienKiemSoat);
    }
}
