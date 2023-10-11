package model;

public class House extends Facility{
    private String tieuChuanPhong;
    private int soTang;

    public House() {
    }

    public House(String maDichVu, String tenDichVu, double dienTichSuDung, double chiPhiThue, int soLuongNguoiToiDa, String kieuThue, String tieuChuanPhong, int soTang) {
        super(maDichVu, tenDichVu, dienTichSuDung, chiPhiThue, soLuongNguoiToiDa, kieuThue);
        this.tieuChuanPhong = tieuChuanPhong;
        this.soTang = soTang;
    }

    public String getTieuChuanPhong() {
        return tieuChuanPhong;
    }

    public void setTieuChuanPhong(String tieuChuanPhong) {
        this.tieuChuanPhong = tieuChuanPhong;
    }

    public int getSoTang() {
        return soTang;
    }

    public void setSoTang(int soTang) {
        this.soTang = soTang;
    }

    @Override
    public String toString() {
        return "House{" + super.toString() +
                "tieuChuanPhong='" + tieuChuanPhong + '\'' +
                ", soTang=" + soTang +
                '}';
    }

    public String getInfoToCSV() {
        return getMaDichVu() + "," +
                getTenDichVu() + "," +
                getDienTichSuDung() + "," +
                getChiPhiThue() + "," +
                getSoLuongNguoiToiDa() + "," +
                getKieuThue() + "," +
                getTieuChuanPhong() + "," +
                getSoTang();
    }
}
