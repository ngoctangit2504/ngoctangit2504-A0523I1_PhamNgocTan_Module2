package model;

public class Room extends Facility {
    private String dichVuMienPhiDiKem;

    public Room() {
    }

    public Room(String maDichVu, String tenDichVu, double dienTichSuDung, double chiPhiThue, int soLuongNguoiToiDa, String kieuThue, String dichVuMienPhiDiKem) {
        super(maDichVu, tenDichVu, dienTichSuDung, chiPhiThue, soLuongNguoiToiDa, kieuThue);
        this.dichVuMienPhiDiKem = dichVuMienPhiDiKem;
    }

    public String getDichVuMienPhiDiKem() {
        return dichVuMienPhiDiKem;
    }

    public void setDichVuMienPhiDiKem(String dichVuMienPhiDiKem) {
        this.dichVuMienPhiDiKem = dichVuMienPhiDiKem;
    }

    @Override
    public String toString() {
        return "Room{" + super.toString() +
                "dichVuMienPhiDiKem='" + dichVuMienPhiDiKem + '\'' +
                '}';
    }

    public String getInfoToCSV() {
        return getMaDichVu() + "," +
                getTenDichVu() + "," +
                getDienTichSuDung() + "," +
                getChiPhiThue() + "," +
                getSoLuongNguoiToiDa() + "," +
                getKieuThue() + "," +
                getDichVuMienPhiDiKem();
    }
}
