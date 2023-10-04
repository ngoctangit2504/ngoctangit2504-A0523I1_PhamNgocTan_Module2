package model;

public class Employee extends Person{
    private int maNhanVien;
    private String trinhDo;
    private String viTri;
    private double luong;

    public Employee() {
    }

    public Employee( int maNhanVien, String hoTen, String ngaySinh, String gioiTinh, int soCMND, int soDienThoai, String email, String trinhDo, String viTri, double luong) {
        super(hoTen, ngaySinh, gioiTinh, soCMND, soDienThoai, email);
        this.maNhanVien = maNhanVien;
        this.trinhDo = trinhDo;
        this.viTri = viTri;
        this.luong = luong;
    }

    public int getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(int maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getTrinhDo() {
        return trinhDo;
    }

    public void setTrinhDo(String trinhDo) {
        this.trinhDo = trinhDo;
    }

    public String getViTri() {
        return viTri;
    }

    public void setViTri(String viTri) {
        this.viTri = viTri;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    @Override
    public String toString() {
        return "Employee{" + " maNhanVien=" + maNhanVien +
                ","+ super.toString() +
                ", trinhDo='" + trinhDo + '\'' +
                ", viTri='" + viTri + '\'' +
                ", luong=" + luong +
                '}';
    }

    public String getInfoToCSV() {
        return getMaNhanVien() + "," +
                getHoTen()+ "," +
                getNgaySinh()+ "," +
                getGioiTinh()+ "," +
                getSoCMND()+ "," +
                getSoDienThoai()+ "," +
                getEmail()+ "," +
                getTrinhDo()+ "," +
                getViTri()+ "," +
                getLuong();
    }
}
