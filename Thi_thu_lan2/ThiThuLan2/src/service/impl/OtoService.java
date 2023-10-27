package service.impl;

import model.Oto;
import repository.IPhuongTienRepository;
import repository.impl.OtoRepository;
import service.IPhuongTienService;

import java.util.List;
import java.util.Scanner;

public class OtoService implements IPhuongTienService {

    IPhuongTienRepository otoRepository = new OtoRepository();
    @Override
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
        System.out.println("nhap so cho ngoi");
        int soChoNgoi = Integer.parseInt(scanner.nextLine());
        System.out.println("nhap kieu xe");
        String kieuXe = scanner.nextLine();
        Oto oto = new Oto(bienKiemSoat,tenHangSanXuat,namSanXuat,chuSoHuu,soChoNgoi,kieuXe);
        otoRepository.addOto(oto);
    }

    @Override
    public void display() {
        List<Oto> otos = otoRepository.getListOto();
        for (int i=0; i<otos.size();i++){
            if (otos.get(i)!=null){
                System.out.println((1+i) + "." + otos.get(i));
            }
        }
    }

    @Override
    public void delete() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập bien kiem soat phuong tien cần xoá");
        String deleteBienKiemSoat = scanner.nextLine();
        otoRepository.deletePhuongTienByBienKiemSoat(deleteBienKiemSoat);
    }
}
