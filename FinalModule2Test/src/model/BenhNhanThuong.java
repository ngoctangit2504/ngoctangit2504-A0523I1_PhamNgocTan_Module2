package model;

public class BenhNhanThuong extends BenhAn {
    private double phiNamVien;

    public BenhNhanThuong() {
    }

    public BenhNhanThuong(int soThuTuBenhAn, String maBenhAn, String maBenhNhan, String tenBenhNhan, String ngayNhapVien, String ngayRaVien, String lyDoNhapVien, double phiNamVien) {
        super(soThuTuBenhAn, maBenhAn, maBenhNhan, tenBenhNhan, ngayNhapVien, ngayRaVien, lyDoNhapVien);
        this.phiNamVien = phiNamVien;
    }

    public double getPhiNamVien() {
        return phiNamVien;
    }

    public void setPhiNamVien(double phiNamVien) {
        this.phiNamVien = phiNamVien;
    }

    @Override
    public String toString() {
        return "BenhNhanThuong{" + super.toString() +
                "phiNamVien=" + phiNamVien +
                '}';
    }

    public String getInfoToCSV() {
        return getSoThuTuBenhAn() + ","
                + getMaBenhAn() + ","
                + getMaBenhNhan() + ","
                + getTenBenhNhan() + ","
                + getNgayNhapVien() + ","
                + getNgayRaVien() + ","
                + getLyDoNhapVien() + ","
                + getPhiNamVien();
    }
}
