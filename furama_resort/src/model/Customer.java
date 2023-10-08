package model;

public class Customer extends Person{
    private int maKhachHang;
    private String loaiKhach;
    private String diaChi;

    public Customer() {
    }

    public Customer(int maKhachHang, String hoTen, String ngaySinh, String gioiTinh, int soCMND, int soDienThoai, String email, String loaiKhach, String diaChi) {
        super(hoTen, ngaySinh, gioiTinh, soCMND, soDienThoai, email);
        this.maKhachHang = maKhachHang;
        this.loaiKhach = loaiKhach;
        this.diaChi = diaChi;
    }

    public int getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(int maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getLoaiKhach() {
        return loaiKhach;
    }

    public void setLoaiKhach(String loaiKhach) {
        this.loaiKhach = loaiKhach;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public String toString() {
        return "Customer{ maKhachHang=" + maKhachHang +
                "," + super.toString() +
                ", loaiKhach='" + loaiKhach + '\'' +
                ", diaChi='" + diaChi + '\'' +
                '}';
    }

    public String getInfoToCSV() {
        return getMaKhachHang() + "," +
                getHoTen() + "," +
                getNgaySinh() + "," +
                getGioiTinh() + "," +
                getSoCMND() + "," +
                getSoDienThoai() + "," +
                getEmail() + "," +
                getLoaiKhach() + "," +
                getDiaChi();
    }
}
