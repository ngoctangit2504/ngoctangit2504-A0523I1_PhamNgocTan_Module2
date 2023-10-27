package repository;

import model.BenhAn;
import model.BenhNhanThuong;
import model.BenhNhanVip;

import java.util.List;

public interface IBenhAnRepository {
    void addBenhNhanThuong(BenhNhanThuong benhNhanThuong);
    void addBenhNhanVip(BenhNhanVip benhNhanVip);

    List<BenhAn> getListBenhAn();

    void deleteBenhAntByMaBenhAn(String maBenhAn);


//    List<Student> getListStudent();
//    List<Student> searchByName(String searchName);
//    List<Student> sortByClassName();
//    void addStudent(Student student);
//    void edit(int id, Student newStudent);
//    void deleteStudentById(int id);
//    Student findById(int id);
}
