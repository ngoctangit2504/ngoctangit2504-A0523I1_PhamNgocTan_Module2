package repository;

import model.Oto;
import model.XeMay;
import model.XeTai;

import java.util.List;

public interface IPhuongTienRepository {
    void addOto(Oto oto);
    void addXeTai(XeTai xeTai);
    void addXeMay(XeMay xeMay);


    List<Oto> displayListOto();
    List<XeTai> displayListXeTai();
    List<XeMay> displayListXemay();


    void deletePhuongTienByBienKiemSoat(String bienKiemSoat);

//    List<Student> searchByName(String searchName);
//
//    List<Student> sortByClassName();
//    void addStudent(Student student);
//    void edit(int id, Student newStudent);
//    void deleteStudentById(int id);
//    Student findById(int id);
}
