package ss17_io_binary_file_and_serialization.exercise.product_management.model;

public class Product {
    private int maSanPham;
    private String tenSanPham;
    private String hangSanXuat;
    private double gia;
    private String moTa;

    public Product() {
    }

    public Product(int maSanPham, String tenSanPham, String hangSanXuat, double gia, String moTa) {
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.hangSanXuat = hangSanXuat;
        this.gia = gia;
        this.moTa = moTa;
    }

    public int getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(int maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public String getHangSanXuat() {
        return hangSanXuat;
    }

    public void setHangSanXuat(String hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    @Override
    public String toString() {
        return "Product{" +
                "maSanPham=" + maSanPham +
                ", tenSanPham='" + tenSanPham + '\'' +
                ", hangSanXuat='" + hangSanXuat + '\'' +
                ", gia=" + gia +
                ", moTa='" + moTa + '\'' +
                '}';
    }

    public String getInfoToCSV() {
        return getMaSanPham() + "," +
                getTenSanPham() + "," +
                getHangSanXuat() + "," +
                getGia() + "," +
                getMoTa();
    }
}
