package ss17_io_binary_file_and_serialization.exercise.product_management.model;

public class Product {
    private int mSanPham;
    private String tenSanPham;
    private String hangSanXuat;
    private double gia;
    private String moTa;

    public Product() {
    }

    public Product(int mSanPham, String tenSanPham, String hangSanXuat, double gia, String moTa) {
        this.mSanPham = mSanPham;
        this.tenSanPham = tenSanPham;
        this.hangSanXuat = hangSanXuat;
        this.gia = gia;
        this.moTa = moTa;
    }

    public int getmSanPham() {
        return mSanPham;
    }

    public void setmSanPham(int mSanPham) {
        this.mSanPham = mSanPham;
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
                "mSanPham=" + mSanPham +
                ", tenSanPham='" + tenSanPham + '\'' +
                ", hangSanXuat='" + hangSanXuat + '\'' +
                ", gia=" + gia +
                ", moTa='" + moTa + '\'' +
                '}';
    }
}
