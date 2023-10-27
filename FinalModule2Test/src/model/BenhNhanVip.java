package model;

public class BenhNhanVip extends BenhAn {
    private String loaiVip;
    private String thoiHanVip;

    public BenhNhanVip() {
    }

    public BenhNhanVip(int soThuTuBenhAn, String maBenhAn, String maBenhNhan, String tenBenhNhan, String ngayNhapVien, String ngayRaVien, String lyDoNhapVien, String loaiVip, String thoiHanVip) {
        super(soThuTuBenhAn, maBenhAn, maBenhNhan, tenBenhNhan, ngayNhapVien, ngayRaVien, lyDoNhapVien);
        this.loaiVip = loaiVip;
        this.thoiHanVip = thoiHanVip;
    }

    public String getLoaiVip() {
        return loaiVip;
    }

    public void setLoaiVip(String loaiVip) {
        this.loaiVip = loaiVip;
    }

    public String getThoiHanVip() {
        return thoiHanVip;
    }

    public void setThoiHanVip(String thoiHanVip) {
        this.thoiHanVip = thoiHanVip;
    }

    @Override
    public String toString() {
        return "BenhNhanVip{" + super.toString() +
                "loaiVip='" + loaiVip + '\'' +
                ", thoiHanVip='" + thoiHanVip + '\'' +
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
                + getLoaiVip() + ","
                + getThoiHanVip();
    }
}
