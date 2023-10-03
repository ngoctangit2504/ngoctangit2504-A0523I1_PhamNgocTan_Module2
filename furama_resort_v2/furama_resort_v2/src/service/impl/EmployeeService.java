package service.impl;

import model.Employee;
import repository.IEmployeeRepository;
import repository.impl.EmployeeRepository;
import service.IEmployeeService;

import java.util.Scanner;

public class EmployeeService implements IEmployeeService {
    IEmployeeRepository employeeRepository = new EmployeeRepository();
    @Override
    public void display() {
        System.out.println("display oke");
    }

    @Override
    public void add() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ma nhan vien:");
        int maNhanVien = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhap ho ten:");
        String tenNhanVien = scanner.nextLine();

        System.out.println("Nhap ngay sinh:");
        String ngaySinh = scanner.nextLine();

        System.out.println("Nhap gioi tinh:");
        String gioiTinh = scanner.nextLine();

        System.out.println("Nhap so CMND:");
        int soCMND = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhap so dien thoai:");
        int soDienThoai = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhap email:");
        String email = scanner.nextLine();

        System.out.println("Nhap trinh do:");
        String trinhDo = scanner.nextLine();

        System.out.println("Nhap vi tri:");
        String viTri = scanner.nextLine();

        System.out.println("Nhap luong:");
        double luong = Double.parseDouble(scanner.nextLine());

        Employee employee = new Employee(tenNhanVien,ngaySinh,gioiTinh,soCMND,soDienThoai,email,maNhanVien,trinhDo,viTri,luong);
        employeeRepository.addEmployee(employee);

        System.out.println("add oke");
    }

    @Override
    public void update() {
        System.out.println("update oke");
    }
}
