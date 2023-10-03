package model;

import java.util.Date;

public class Booking {
    private int maBooking;
    private Date ngayBooking;
    private Date ngayBatDauThue;
    private Date ngayKetThucThue;
    private int maKhachHang;
    private int maDichVu;

    public Booking() {
    }

    public Booking(int maBooking, Date ngayBooking, Date ngayBatDauThue, Date ngayKetThucThue, int maKhachHang, int maDichVu) {
        this.maBooking = maBooking;
        this.ngayBooking = ngayBooking;
        this.ngayBatDauThue = ngayBatDauThue;
        this.ngayKetThucThue = ngayKetThucThue;
        this.maKhachHang = maKhachHang;
        this.maDichVu = maDichVu;
    }

    public int getMaBooking() {
        return maBooking;
    }

    public void setMaBooking(int maBooking) {
        this.maBooking = maBooking;
    }

    public Date getNgayBooking() {
        return ngayBooking;
    }

    public void setNgayBooking(Date ngayBooking) {
        this.ngayBooking = ngayBooking;
    }

    public Date getNgayBatDauThue() {
        return ngayBatDauThue;
    }

    public void setNgayBatDauThue(Date ngayBatDauThue) {
        this.ngayBatDauThue = ngayBatDauThue;
    }

    public Date getNgayKetThucThue() {
        return ngayKetThucThue;
    }

    public void setNgayKetThucThue(Date ngayKetThucThue) {
        this.ngayKetThucThue = ngayKetThucThue;
    }

    public int getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(int maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public int getMaDichVu() {
        return maDichVu;
    }

    public void setMaDichVu(int maDichVu) {
        this.maDichVu = maDichVu;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "maBooking=" + maBooking +
                ", ngayBooking=" + ngayBooking +
                ", ngayBatDauThue=" + ngayBatDauThue +
                ", ngayKetThucThue=" + ngayKetThucThue +
                ", maKhachHang=" + maKhachHang +
                ", maDichVu=" + maDichVu +
                '}';
    }
}
