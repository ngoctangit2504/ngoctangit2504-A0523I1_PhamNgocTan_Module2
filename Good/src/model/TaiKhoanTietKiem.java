package model;

public class TaiKhoanTietKiem extends TaiKhoanNganHang{
    private double soTienGuiTietKiem;
    private String ngayGuiTietKiem;
    private double laiSuat;
    private int kiHan;

    public TaiKhoanTietKiem() {
    }

    public TaiKhoanTietKiem(String maTaiKhoan, String tenChuTaiKHoan, String ngayTaoTaiKHoan, double soTienGuiTietKiem, String ngayGuiTietKiem, double laiSuat, int kiHan) {
        super(maTaiKhoan, tenChuTaiKHoan, ngayTaoTaiKHoan);
        this.soTienGuiTietKiem = soTienGuiTietKiem;
        this.ngayGuiTietKiem = ngayGuiTietKiem;
        this.laiSuat = laiSuat;
        this.kiHan = kiHan;
    }

    public double getSoTienGuiTietKiem() {
        return soTienGuiTietKiem;
    }

    public void setSoTienGuiTietKiem(double soTienGuiTietKiem) {
        this.soTienGuiTietKiem = soTienGuiTietKiem;
    }

    public String getNgayGuiTietKiem() {
        return ngayGuiTietKiem;
    }

    public void setNgayGuiTietKiem(String ngayGuiTietKiem) {
        this.ngayGuiTietKiem = ngayGuiTietKiem;
    }

    public double getLaiSuat() {
        return laiSuat;
    }

    public void setLaiSuat(double laiSuat) {
        this.laiSuat = laiSuat;
    }

    public int getKiHan() {
        return kiHan;
    }

    public void setKiHan(int kiHan) {
        this.kiHan = kiHan;
    }

    @Override
    public String toString() {
        return "TaiKhoanTietKiem{" + super.toString() +
                "soTienGuiTietKiem=" + soTienGuiTietKiem +
                ", ngayGuiTietKiem='" + ngayGuiTietKiem + '\'' +
                ", laiSuat=" + laiSuat +
                ", kiHan=" + kiHan +
                '}';
    }

    public String getInfoToCSV(){
        return getMaTaiKhoan() +","
                +getTenChuTaiKHoan() +","
                +getNgayTaoTaiKHoan() +","
                +getSoTienGuiTietKiem()+","
                +getNgayGuiTietKiem()+","
                +getLaiSuat()+","
                +getKiHan();
    }

}
