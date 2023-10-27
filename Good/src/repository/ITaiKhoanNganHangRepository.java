package repository;

import model.TaiKhoanNganHang;
import model.TaiKhoanThanhToan;
import model.TaiKhoanTietKiem;

import java.util.List;

public interface ITaiKhoanNganHangRepository {
    void addTaiKhoanTietKiem(TaiKhoanTietKiem taiKhoanTietKiem);
    void addTaiKoanThanhToan(TaiKhoanThanhToan taiKhoanThanhToan);


    List<TaiKhoanTietKiem> getListTaiKhoanTietKiem();
    List<TaiKhoanThanhToan> getListTaiKhoanThanhToan();

    void deleteTaiKhoanTietKiemByMaTaiKhoan(String maTaiKhoan);
    void deleteTaiKhoanThanhToanByMaTaiKhoan(String maTaiKhoan);

}
