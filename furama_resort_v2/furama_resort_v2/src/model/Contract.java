package model;

public class Contract {
    private int soHopDong;
    private int maBooking;
    private double soTienCocTruoc;
    private double tongTienThanhToan;

    public Contract() {
    }

    public Contract(int soHopDong, int maBooking, double soTienCocTruoc, double tongTienThanhToan) {
        this.soHopDong = soHopDong;
        this.maBooking = maBooking;
        this.soTienCocTruoc = soTienCocTruoc;
        this.tongTienThanhToan = tongTienThanhToan;
    }

    public int getSoHopDong() {
        return soHopDong;
    }

    public void setSoHopDong(int soHopDong) {
        this.soHopDong = soHopDong;
    }

    public int getMaBooking() {
        return maBooking;
    }

    public void setMaBooking(int maBooking) {
        this.maBooking = maBooking;
    }

    public double getSoTienCocTruoc() {
        return soTienCocTruoc;
    }

    public void setSoTienCocTruoc(double soTienCocTruoc) {
        this.soTienCocTruoc = soTienCocTruoc;
    }

    public double getTongTienThanhToan() {
        return tongTienThanhToan;
    }

    public void setTongTienThanhToan(double tongTienThanhToan) {
        this.tongTienThanhToan = tongTienThanhToan;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "soHopDong=" + soHopDong +
                ", maBooking=" + maBooking +
                ", soTienCocTruoc=" + soTienCocTruoc +
                ", tongTienThanhToan=" + tongTienThanhToan +
                '}';
    }
}
