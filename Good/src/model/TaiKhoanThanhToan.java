package model;

public class TaiKhoanThanhToan extends TaiKhoanNganHang{
    private int soThe;
    private double soTienTrongTaiKhoan;

    public TaiKhoanThanhToan() {
    }

    public TaiKhoanThanhToan(String maTaiKhoan, String tenChuTaiKHoan, String ngayTaoTaiKHoan, int soThe, double soTienTrongTaiKhoan) {
        super(maTaiKhoan, tenChuTaiKHoan, ngayTaoTaiKHoan);
        this.soThe = soThe;
        this.soTienTrongTaiKhoan = soTienTrongTaiKhoan;
    }

    public int getSoThe() {
        return soThe;
    }

    public void setSoThe(int soThe) {
        this.soThe = soThe;
    }

    public double getSoTienTrongTaiKhoan() {
        return soTienTrongTaiKhoan;
    }

    public void setSoTienTrongTaiKhoan(double soTienTrongTaiKhoan) {
        this.soTienTrongTaiKhoan = soTienTrongTaiKhoan;
    }

    @Override
    public String toString() {
        return "TaiKhoanThanhToan{" + super.toString() +
                "soThe=" + soThe +
                ", soTienTrongTaiKhoan=" + soTienTrongTaiKhoan +
                '}';
    }

    public String getInfoToCSV(){
        return getMaTaiKhoan() +","
                +getTenChuTaiKHoan() +","
                +getNgayTaoTaiKHoan() +","
                +getSoThe()+","
                +getSoTienTrongTaiKhoan();
    }
}
