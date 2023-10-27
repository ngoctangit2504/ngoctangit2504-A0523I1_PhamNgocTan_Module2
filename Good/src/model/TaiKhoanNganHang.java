package model;

public abstract class TaiKhoanNganHang {
    private String maTaiKhoan;
    private String tenChuTaiKHoan;
    private String ngayTaoTaiKHoan;

    public TaiKhoanNganHang() {
    }

    public TaiKhoanNganHang(String maTaiKhoan, String tenChuTaiKHoan, String ngayTaoTaiKHoan) {
        this.maTaiKhoan = maTaiKhoan;
        this.tenChuTaiKHoan = tenChuTaiKHoan;
        this.ngayTaoTaiKHoan = ngayTaoTaiKHoan;
    }

    public String getMaTaiKhoan() {
        return maTaiKhoan;
    }

    public void setMaTaiKhoan(String maTaiKhoan) {
        this.maTaiKhoan = maTaiKhoan;
    }

    public String getTenChuTaiKHoan() {
        return tenChuTaiKHoan;
    }

    public void setTenChuTaiKHoan(String tenChuTaiKHoan) {
        this.tenChuTaiKHoan = tenChuTaiKHoan;
    }

    public String getNgayTaoTaiKHoan() {
        return ngayTaoTaiKHoan;
    }

    public void setNgayTaoTaiKHoan(String ngayTaoTaiKHoan) {
        this.ngayTaoTaiKHoan = ngayTaoTaiKHoan;
    }

    @Override
    public String toString() {
        return "maTaiKhoan='" + maTaiKhoan + '\'' +
                ", tenChuTaiKHoan='" + tenChuTaiKHoan + '\'' +
                ", ngayTaoTaiKHoan='" + ngayTaoTaiKHoan + '\'' +
                '}';
    }

    public String getInfoToCSV(){
        return getMaTaiKhoan() +","
                +getTenChuTaiKHoan() +","
                +getNgayTaoTaiKHoan();
    }


}
