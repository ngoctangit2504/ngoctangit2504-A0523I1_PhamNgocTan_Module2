package service.impl;

import model.Employee;
import repository.IEmployeeRepository;
import repository.impl.EmployeeRepository;

import java.util.List;
import java.util.Scanner;

public class EmployeeService implements service.IEmployeeService {

    private IEmployeeRepository employeeRepository = new EmployeeRepository();

    @Override
    public void display() {
        List<Employee> employees = employeeRepository.displayListEmployee();
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i) != null) {
                System.out.println((1 + i) + "." + employees.get(i));
            }
        }
    }

    @Override
    public void add() {
        Scanner scanner = new Scanner(System.in);

        String regexMaNhanVien = "^[N][V][-][0-9]{4}$";
        System.out.println("Nhap ma nhan vien...");
        String maNhanVien = scanner.nextLine();
        boolean checkMaNhanVien = true;
        checkMaNhanVien = maNhanVien.matches(regexMaNhanVien);
        if (checkMaNhanVien == false) {
            boolean flag = true;
            while (flag) {
                System.out.println("Nhap lai ma nhan vien...");
                String maNhanVienFix = scanner.nextLine();
                if (maNhanVienFix.matches(regexMaNhanVien)) {
                    flag = false;
                    maNhanVien = maNhanVienFix;
                }
            }
        }

        String regexHoTen = "^([A-Z][a-z]{1,}[ ]{0,}){1,}$";
        System.out.println("Nhap ho ten...");
        String hoTen = scanner.nextLine();
        boolean checkHoTen = true;
        checkHoTen = hoTen.matches(regexHoTen);
        if (checkHoTen == false) {
            boolean flag = true;
            while (flag) {
                System.out.println("Nhap lai ho ten...");
                String hoTenFix = scanner.nextLine();
                if (hoTenFix.matches(regexHoTen)) {
                    flag = false;
                    hoTen = hoTenFix;
                }
            }
        }

        System.out.println("Nhap ngay sinh...");
        String ngaySinh = scanner.nextLine();
        System.out.println("Nhap gioi tinh...");
        String gioitinh = scanner.nextLine();

        String regexSoCMND = "^([0-9]{9}|[0-9]{12})$";
        System.out.println("Nhap so CMND...");
        String soCMND = scanner.nextLine();
        boolean checkSoCMND = true;
        checkSoCMND = soCMND.matches(regexSoCMND);
        if (checkSoCMND == false) {
            boolean flag = true;
            while (flag) {
                System.out.println("Nhap lai so CMND...");
                String soCMNDFix = scanner.nextLine();
                if (soCMNDFix.matches(regexSoCMND)) {
                    flag = false;
                    soCMND = soCMNDFix;
                }
            }
        }

        String regexSoDienThoai = "^[0][0-9]{9}$";
        System.out.println("Nhap so dien thoai...");
        String soDienThoai = scanner.nextLine();
        boolean checkSoDienThoai = true;
        checkSoDienThoai = soDienThoai.matches(regexSoDienThoai);
        if (checkSoDienThoai == false) {
            boolean flag = true;
            while (flag) {
                System.out.println("Nhap lai so dien thoai...");
                String soDienThoaiFix = scanner.nextLine();
                if (soDienThoaiFix.matches(regexSoDienThoai)) {
                    flag = false;
                    soDienThoai = soDienThoaiFix;
                }
            }
        }

        System.out.println("Nhap email...");
        String email = scanner.nextLine();
        System.out.println("Nhap trinh do...");
        String trinhDo = scanner.nextLine();
        System.out.println("Nhap vi tri...");
        String viTri = scanner.nextLine();
        System.out.println("Nhap luong...");
        double luong = Double.parseDouble(scanner.nextLine());

        Employee employee = new Employee(maNhanVien, hoTen, ngaySinh, gioitinh, soCMND, soDienThoai, email, trinhDo, viTri, luong);
        employeeRepository.addEmployee(employee);
    }

    @Override
    public void edit() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ma nhan vien can update");
        String maNhanVien = scanner.nextLine();
        Employee editEmployee = employeeRepository.finByMaNhanVien(maNhanVien);
        if (editEmployee != null) {
            System.out.println("Nhap NEW ho ten");
            String newHoten = scanner.nextLine();
            System.out.println("Nhap NEW ngay sinh");
            String newNgaySinh = scanner.nextLine();
            System.out.println("Nhap NEW gioi tinh");
            String newGioitinh = scanner.nextLine();
            System.out.println("Nhap NEW so CMND");
            String newSoCMND = scanner.nextLine();
            System.out.println("Nhap NEW so dien thoai");
            String newSoDienThoai = scanner.nextLine();
            System.out.println("Nhap NEW email");
            String newEmail = scanner.nextLine();
            System.out.println("Nhap NEW trinh do");
            String newTrinhDo = scanner.nextLine();
            System.out.println("Nhap NEW vi tri");
            String newVitri = scanner.nextLine();
            System.out.println("Nhap NEW luong");
            double newLuong = Double.parseDouble(scanner.nextLine());

            editEmployee.setHoTen(newHoten);
            editEmployee.setNgaySinh(newNgaySinh);
            editEmployee.setGioiTinh(newGioitinh);
            editEmployee.setSoCMND(newSoCMND);
            editEmployee.setSoDienThoai(newSoDienThoai);
            editEmployee.setEmail(newEmail);
            editEmployee.setTrinhDo(newTrinhDo);
            editEmployee.setViTri(newVitri);
            editEmployee.setLuong(newLuong);

            employeeRepository.editEmployee(maNhanVien, editEmployee);
        } else {
            System.out.println("Khong tim thay ma nhan vien !");
        }
    }
}
